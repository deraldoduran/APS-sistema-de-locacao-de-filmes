package main.java.br.com.locamax.api.locacao;

import main.java.br.com.locamax.api.produto.Produto;
import main.java.br.com.locamax.api.pessoa.cliente.Cliente;
import java.util.Date;

public class Locacao extends Produto {
    Date dataSaida;
    Date dataEntregaPrevista;
    Date dataDevolucao;

    public Locacao(String c, String t, String g, Date ds, Date ep, Date dd){
        super(c, t, g);
        this.dataSaida = ds;
        this.dataEntregaPrevista = ep;
        this.dataDevolucao = dd;
    }
    
    public void fazerLocacao(int m, String c, Date ds, Date ep, Date dd){
        Cliente cli = new Cliente(m);
            cli.matricula = m;
            super.codigo = c;
            this.dataSaida = ds;
            this.dataEntregaPrevista = ep;
            this.dataDevolucao = dd;
    }

    @Override
    public double calcularDiaria(){
        return 0;
    }
}
