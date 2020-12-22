package main.java.br.com.locamax.api.shell;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Shell {
    BufferedReader buff;
    Scanner sc;
    String op;
    boolean auto = false;

    public Shell() throws IOException {
       this.buff = new BufferedReader(new FileReader("src/main/java/br/com/locamax/api/shell/input.txt"));
       this.sc = new Scanner(System.in);
       this.op = "";
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public String nextLine() throws IOException {
        if (auto) {
            op = buff.readLine();
            if (op != null) { // evita exceção quando arquivo chega ao fim
                while(op.subSequence(0, 1).equals("/")) //verifica se a linha é comentário
                    op = buff.readLine();
                System.out.println(op);
                return op;
            } else {
                auto = false; //torna manual quando arquivo lê a última linha
                buff.close();
            }
        }

        op = sc.nextLine();
        return op;
    }

    public void close(){
        this.sc.close();
    }
}