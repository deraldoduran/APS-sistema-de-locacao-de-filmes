package main.java.br.com.locamax.api.pessoa.funcionario;

import java.util.ArrayList;

import main.java.br.com.locamax.api.pessoa.Pessoa;
import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import main.java.br.com.locamax.api.produto.Produto;
import main.java.br.com.locamax.api.locacao.Locacao;
import main.java.br.com.locamax.api.repositorio.RepoPerson;
import main.java.br.com.locamax.api.repositorio.RepoProduct;
import main.java.br.com.locamax.api.repositorio.RepoRent;

public class Operador extends Funcionario {
    RepoPerson rPerson;
    RepoProduct rProd;
    RepoRent rRent;

    public Operador (String nome, int mat, String senha, RepoPerson rPer, RepoProduct rProd, RepoRent rRent){
        super(nome, mat, senha);
        this.rPerson = rPer;
        this.rProd = rProd;
        this.rRent = rRent;
    }

    public void findCliente(int mat){
        try {
            Pessoa p = rPerson.getPerson(mat);
            if("Cliente".contentEquals(p.getClass().getSimpleName())){
                System.out.println(((Cliente)p).toString());
                return;
            }
            throw new Exception("A matrícula \"" + mat + "\" não pertence a um cliente");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void findProduto(String cod){
        rProd.findProduto(cod);
    }

    public void fazerLocacao(int mat, String cod, int dias){
        Locacao l = new Locacao(mat, cod);
        l.setDataEntregaPrevista(dias);
        System.out.println(
            "cliente: " + rPerson.getPerson(mat).getNome() + "\n" + 
            "produto: " + rProd.getProduct(cod).getTitulo()
        );
        rRent.addRent(l);

        Cliente c = (Cliente)rPerson.getPerson(mat);
        if(c != null){
            int id = rRent.getId() - 1;
            c.getLocacoes().add(id);
        }
        rProd.getProduct(cod).setLocado(true);
    }

    public void fecharLocacao(int mat, String cod){ //calcula débitos
        Cliente c = (Cliente)rPerson.getPerson(mat);
        Produto p = rProd.getProduct(cod);
        
        for(Integer id : c.getLocacoes()){
            String codProd = rRent.getRent(id).getCodigoProd();
            if((codProd).contentEquals(cod)){
                Locacao l = rRent.getRent(id);
                l.setDataDevolucao();
                double multa = l.calcularMulta(p.getValDiaria());
                double valDiarias = l.calcularDiarias(p.getValDiaria());
                
                System.out.println(
                    "Valor a ser pago em diáras: " + valDiarias + "\n" +
                    "Valor a ser pago em multas: " + multa + "\n" +
                    "Total: " + (multa + valDiarias) + "\n"
                );
            }
        }
    }

    public void remLocacao(int mat, String cod){
        Cliente c = (Cliente)rPerson.getPerson(mat);
        for(Integer id : c.getLocacoes()){
            String codProd = rRent.getRent(id).getCodigoProd();
            if((codProd).contentEquals(cod)){
                rRent.remRent(id);
                c.getLocacoes().remove(id);
                rProd.getProduct(cod).setLocado(false);
                listLocacoesCliente(mat);
            }
        }
    }

    public void listLocacoesCliente(int mat){
        ArrayList<Integer> locacoes = ((Cliente)rPerson.getPerson(mat)).getLocacoes();
        if(!locacoes.isEmpty()){
            System.out.println("\n" + "#Locações em andamento");
            for(int id : locacoes)
                rRent.findRent(id);
        }
    }

    public String toString(){
        return
            "nome: " + this.nome + "\n" +
            "matrícula: " + this.matricula + "\n" +
            "login: " + this.login + "\n";
            // "senha: " + this.senha + "\n";
    }
}