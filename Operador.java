public class Operador extends Funcionario{


    public Operador (){
        super(n, m, l, s);
    }

    public String toString(){
        return this.nome + ":" + this.matricula + ":" + this.login + ":" + this.senha;
    }
}