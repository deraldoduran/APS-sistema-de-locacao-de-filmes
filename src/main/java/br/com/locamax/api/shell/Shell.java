package main.java.br.com.locamax.api.shell;

import java.util.Scanner;

public class Shell {
    Scanner sc = new Scanner(System.in);
    String op = "";

    public String getOp() {
        return op;
    }

    public String scan(){
        //ignorando entradas que comecem com '/' para facilitar inputs em lote
        while(op.subSequence(0, 1).equals("/")){
            this.op = this.sc.nextLine();
        }
        return op;
    }
}