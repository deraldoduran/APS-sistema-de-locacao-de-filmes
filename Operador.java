public class Operador extends Funcionario{


    public Operador (){
        super(n, m, l, s);
    }

    public String toString(){
        return this.super.nome + ":" + this.super.matricula + ":" + this.super.login + ":" this.super.senha;
    }
}