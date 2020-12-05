public class Cliente extends Pessoa{
 public String endereco;
 public int idade;
 public char sexo;

    public Cliente(String n, int m, String en, int id, char se){
        super(n, m);
        this.endereco = en;
        this.idade = id;
        this.sexo = se;
    }
}