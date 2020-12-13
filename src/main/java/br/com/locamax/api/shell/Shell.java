package main.java.br.com.locamax.api.shell;

import java.util.Scanner;

public class Shell {
    Scanner sc = new Scanner(System.in);

    public String shell(String op){
        //ignorando entradas que comecem com '/' para facilitar inputs em lote
        while(op.subSequence(0, 1).equals("/")){
            op = this.sc.nextLine();
        }
        return op;
    }
}