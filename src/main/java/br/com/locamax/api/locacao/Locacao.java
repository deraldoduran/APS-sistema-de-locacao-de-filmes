package main.java.br.com.locamax.api.locacao;

import java.util.Calendar;
import java.util.Date;

public class Locacao {
    int matricula;
    String codigoProd;
    Date dataSaida;
    Date dataEntregaPrevista;
    Date dataDevolucao;

    public Locacao (int mat, String cod){
        this.matricula = mat;
        this.codigoProd = cod;
        this.dataSaida = Calendar.getInstance().getTime();
        this.dataEntregaPrevista = null;
    }

    public String toString() {
        return
            "matrícula do cliente: " + matricula + "\n" + 
            "código do produto: " + codigoProd + "\n" + 
            "data de saída: " + dataSaida + "\n" + 
            "entrega prevista: " + dataEntregaPrevista + "\n" + 
            "data de devolução: " + dataDevolucao + "\n";
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCodigoProd() {
        return codigoProd;
    }
    
    public Date getDataSaida() {
        return dataSaida;
    }

    public Date getDataEntregaPrevista() {
        return dataEntregaPrevista;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    
    public void setDataEntregaPrevista(int dias) {
        Calendar newDate = Calendar.getInstance();
        newDate.add(Calendar.DAY_OF_MONTH, 10);
        this.dataEntregaPrevista = newDate.getTime();
    }

    public void setDataDevolucao() {
        this.dataDevolucao = Calendar.getInstance().getTime();
    }
    
    public double calcularMulta(double valDiaria){
        Calendar devolucao = Calendar.getInstance();
        devolucao.setTime(getDataDevolucao());
        
        Calendar dataPrevista = Calendar.getInstance();
        dataPrevista.setTime(getDataSaida());

        devolucao.add(Calendar.DATE, - dataPrevista.get(Calendar.DAY_OF_MONTH));
        int dif = devolucao.get(Calendar.DAY_OF_MONTH);

        return (dif < 0) ? valDiaria : (dif * valDiaria) * 0.1;
    }

    public double calcularDiarias(double valDiaria){
        Calendar devolucao = Calendar.getInstance();
        devolucao.setTime(getDataDevolucao());
        
        Calendar saida = Calendar.getInstance();
        saida.setTime(getDataSaida());

        devolucao.add(Calendar.DATE, - saida.get(Calendar.DAY_OF_MONTH));
        int dif = devolucao.get(Calendar.DAY_OF_MONTH);

        return valDiaria * dif;
    }
}