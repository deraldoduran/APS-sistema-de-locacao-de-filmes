package main.java.br.com.locamax.api.shell;

import java.util.Scanner;

public class Shell {
    Scanner sc;
    String op;

    public Shell(){
       this.sc = new Scanner(System.in);
       this.op = "";
    }

    public String nextLine(){
        op = sc.nextLine();
        //ignorando entradas que comecem com '/' para facilitar inputs em lote
        while(op.subSequence(0, 1).equals("/")){
            op = sc.nextLine();
        }
        return op;
    }

    public void close(){
        this.sc.close();
    }
}