public class Gerente extends Funcionario{

        public Cliente cliente;
        public Produto produtoQualquer;
        public Operador operador;

    public Gerente(){
        super(n, m, l, s);
    }

    public void adicionaCliente(String cli){
        this.cliente = cli;
    }

    public void adicionarProdutoQualquer(String p){
        this.produtoQualquer = p;
    }

    public void adicionarOperador(String op){
        this.operador = op;
    }
}