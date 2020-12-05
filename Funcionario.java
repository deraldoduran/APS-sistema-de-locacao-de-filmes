public abstract class Funcionario extends Pessoa{
    public String login;
    public String senha;

    public Funcionario(String n, int m, String l, int s){
        super(n, m);
        this.login = l;
        this.senha = s;
    }
}