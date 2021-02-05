package main.java.br.com.locamax.api.pessoa.funcionario;

import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import main.java.br.com.locamax.api.produto.filme.*;
import main.java.br.com.locamax.api.produto.musica.*;
import main.java.br.com.locamax.api.repositorio.*;

public class Gerente extends Funcionario {
    RepoProduct rProduct;
    RepoPerson rPerson;

    public Gerente(String n, int m, String s, RepoProduct rPro, RepoPerson rPer){
        super(n , m, s);
        this.rProduct = rPro;
        this.rPerson = rPer;
    }

    //Produto
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

    public void addCD(String tit, String gen, String aut, int numF, boolean dup, boolean arr, float valD){
        CD c = new CD(String.valueOf(rProduct.getId()), tit, gen, aut, numF, dup, arr, valD);
        rProduct.addProduct(c);
    }

    public void addLP(String tit, String gen, String aut, int numF, boolean rar, float valD){
        LP l = new LP(String.valueOf(rProduct.getId()), tit, gen, aut, numF, rar, valD);
        rProduct.addProduct(l);
    }
    
    public void findProduto(String p){
        rProduct.findProduto(p);
    }

    public void listProduto(){
        rProduct.listProduto();
    }

    //Pessoa
    public void findPerson(int mat){
        try {
            rPerson.findPerson(mat);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Cliente
    public void addCliente(String nome, String end, int idd, char sex){
        Cliente c = new Cliente(nome, rPerson.getId(), end, idd, sex);
        rPerson.addPerson(c);
    }

    public boolean findCliente(int mat){
        try {
            if("Cliente".contentEquals(rPerson.getPerson(mat).getClass().getSimpleName())){
                return true;
            }
            throw new Exception("A matrícula \"" + mat + "\" não pertence a um cliente");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void listCliente(){
        rPerson.listEntity("Cliente");
    }

    //Operador
    public void addOperador(String nome, String senha, RepoPerson rPer, RepoProduct rProd, RepoRent rRent){
        Operador o = new Operador(nome, rPerson.getId(), senha, rPer, rProd, rRent);
        rPerson.addPerson(o);
    }

    public boolean findOperador(int mat){
        try {
            if("Operador".contentEquals(rPerson.getPerson(mat).getClass().getSimpleName())){
                return true;
            }
            throw new Exception("A matrícula \"" + mat + "\" não pertence a um operador");
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public void listOperador(){
        rPerson.listEntity("Operador");
    }
}
