package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import main.java.br.com.locamax.api.produto.filme.*;
import main.java.br.com.locamax.api.produto.musica.*;
import main.java.br.com.locamax.api.repositorio.RepoPerson;
import main.java.br.com.locamax.api.repositorio.RepoProduct;

public class Gerente extends Funcionario {
    RepoProduct rProduct;
    RepoPerson rPerson;

    public Gerente(String n, int m, String s, RepoProduct rPro, RepoPerson rPer){
        super(n , m, s);
        this.rProduct = rPro;
        this.rPerson = rPer;
    }

    public void addBluRay(String tit, String gen, int ano, int dur, String idi, Boolean arr, float valD){
        BluRay b = new BluRay(String.valueOf(rProduct.getId()), tit, gen, ano, dur, idi, arr, valD);
        rProduct.addProduct(b);
    }

    public void addDVD(String tit, String gen, int ano, int dur, boolean arr, float valD){
        DVD d = new DVD(String.valueOf(rProduct.getId()), tit, gen, ano, dur, arr, valD);
        rProduct.addProduct(d);
    }

    public void addVHS(String tit, String gen, int ano, int dur, boolean cor , float valD){
        VHS v = new VHS(String.valueOf(rProduct.getId()), tit, gen, ano, dur, cor, valD);
        rProduct.addProduct(v);
    }

    public void addCD(String tit, String gen, String aut, int numF, Boolean dup, Boolean arr, float valD){
        CD c = new CD(String.valueOf(rProduct.getId()), tit, gen, aut, numF, dup, arr, valD);
        rProduct.addProduct(c);
    }

    public void addLP(String tit, String gen, String aut, int numF, Boolean rar, float valD){
        LP l = new LP(String.valueOf(rProduct.getId()), tit, gen, aut, numF, rar, valD);
        rProduct.addProduct(l);
    }
    
    public void findProduto(String p){
        rProduct.findProduto(p);
    }

    public void listProduto(){
        rProduct.listProduto();
    }

    public boolean findPerson(int mat){
        try {
            return rPerson.findPerson(mat);
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public boolean findClient(int mat){
        try {
            if("Cliente".contentEquals(rPerson.getPerson(mat).getNome())){
                return true;
            }
            throw new Exception("A matrícula \"" + mat + "\" não pertence a um cliente");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void addCliente(String nome, String end, int idd, char sex){
        Cliente c = new Cliente(nome, rPerson.getId(), end, idd, sex);
        rPerson.addPerson(c);
    }

    public void addOperador(String nome, String sen){
        Operador op = new Operador(nome, rPerson.getId(), sen);
        rPerson.addPerson(op);
    }
    
    /* public void addOperador(String n, int m, String l, String s){
        this.sis.operador.add(new Operador(n,m,l,s));
    }

    public void addCliente(String n, int m, String en, int id, char se ){
        this.sis.cliente.add(new Cliente(n, m, en, id, se));
    }

    public void listClientes(){
        for(int i=0; i<cliente.size(); i++)
            System.out.println(cliente.toString());
    }

    public void listProdutos(){
        for(int i=0; i<produtoQualquer.size(); i++)
            System.out.println(produtoQualquer.toString());
    }

    public void listOperador(){
        for(int i=0; i<operador.size(); i++)
            System.out.println(operador.toString());
    }

    public void listClientePorMatricula (int m){
        for(int i = 0; i< cliente.size(); i++){
            if(cliente.get(i).matricula == m){
                //cliente.get(i).
                System.out.println(cliente.get(i).nome);
            }
        }
    }

    public void procurarProdutoPorString.valueOf(rProduct.getId())igo( String c){
        for(int i = 0; i< produtoQualquer.size(); i++){
            if(produtoQualquer.get(i).String.valueOf(rProduct.getId())igo.equals(c) ){
                System.out.println(produtoQualquer.get(i).titulo);
            }
        }
    }

    public void procurarOperadoresPorMatricula(int m){
        for(int i = 0; i< operador.size(); i++){
            if(operador.get(i).matricula == m){
                System.out.println(operador.get(i).nome);
            }
        }
    } */
}