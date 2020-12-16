package main.java.br.com.locamax.api.locacao;

import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
// import main.java.br.com.locamax.api.pessoa.cliente.Cliente;

public class Locacao {
    int matricula;
    String codigoProd;
    Date dataSaida;
    Date dataEntregaPrevista;
    Date dataDevolucao;

    public Locacao (String cod, int mat, Date ds, Date dep){
        this.matricula = mat;
        this.codigoProd = cod;
        this.dataSaida = ds;
        this.dataEntregaPrevista = dep;
    }
    
    public void fazerLocacao(int mat, String cod, Date ds, Date dep){
        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        System.out.println("Data atual sem formatação: " + data);
        //Formata a data
        DateFormat formataData = DateFormat.getDateInstance();
        System.out.println("Data atual com formatação: "+ formataData.format(data));
        //Formata Hora
        DateFormat hora = DateFormat.getTimeInstance();
        System.out.println("Hora formatada: "+hora.format(data));
        //Formata Data e Hora
        DateFormat dtHora = DateFormat.getDateTimeInstance();
        System.out.println(dtHora.format(data));
    }
    
    public double calcularDiaria(Date dd){ return 0; }
}