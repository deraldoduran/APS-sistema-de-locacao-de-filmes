package main.java.br.com.locamax.api.pessoa;

public abstract class Pessoa {
    public String nome;
    public int matricula;
    
    public Pessoa(String n, int m){
        this.nome = n;
        this.matricula = m;
    }
    
    public String toString(){
        return
            "nome: " + this.nome + "\n" +
            "matricula: " + this.matricula + "\n";
    }

    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return matricula;
    }
}