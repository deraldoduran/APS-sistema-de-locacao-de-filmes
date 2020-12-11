package main;

//import pessoa.funcionario.Gerente;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String op = "";

        //Gerente g = new Gerente();

        while(op != "e"){
            System.out.println(
                "----------------------------LOCAMAX------------------------\n"
            );

            op = sc.nextLine();

            //ignorando entradas que comecem com '/' para facilitar inputs em lote
            while(op.subSequence(0, 1).equals("/")){
                op = sc.nextLine();
            }

            try{
                if(op.contentEquals("01")){
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}

// #sugestoes: