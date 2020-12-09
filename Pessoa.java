public abstract class Pessoa{
   
    public String nome;
   
    public int matricula;
    
    public Pessoa(String n, int m){
        this.nome = n;
        this.matricula = m;
    }

    public Pessoa(int m){
        this.matricula = m;
    }
}