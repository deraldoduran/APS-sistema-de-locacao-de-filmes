package main.java.br.com.locamax.api;

import java.util.Scanner;

import main.java.br.com.locamax.api.sistema.Sistema;
import main.java.br.com.locamax.api.pessoa.funcionario.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String op = "";

        Sistema sis = new Sistema();
        sis.addEmployee("gerente", 0, "login", "senha");
        System.out.println(sis.getrEmployee().getFuncionario("login").toString());

        while(!op.contentEquals("03")){
            System.out.println(
                "----------------------------LOCAMAX------------------------\n" + 
                "Bem-vindo, escolha um perfil abaixo:\n" +
                "01 – Gerente\n" +
                "02 – Operador de Sistema\n" +
                "03 – Sair\n" +
                "Digite o número correspondente e tecle <ENTER>"
            );

            op = sc.nextLine();

            //ignorando entradas que comecem com '/' para facilitar inputs em lote
            while(op.subSequence(0, 1).equals("/")){
                op = sc.nextLine();
            }

            try{
                if(op.contentEquals("01")){ //Login Gerente
                    while(sis.getgLogin().getFLogged() == null){
                        System.out.println(
                            "----------------------------LOCAMAX------------------------\n" + 
                            "#Login\n" + 
                            "Digite seu login:_ <ENTER>\n" +
                            "Digite sua senha:_ <ENTER>"
                        );

                        String login = sc.nextLine();
                        String senha = sc.nextLine();
    
                        Funcionario f = sis.getgLogin().login(login, senha, sis.getrEmployee());

                        if(f != null){
                            sis.getgLogin().setFLogged(f);
                        }
                    }

                    System.out.println(
                        "Olá Gerente " + sis.getgLogin().getFLogged().getNome() + "\n" + 
                        "01 – Cadastrar Produto\n" + 
                        "02 – Cadastrar Cliente\n" + 
                        "03 – Cadastrar Operador\n" + 
                        "04 – Listar Produtos\n" + 
                        "05 – Listar Clientes\n" + 
                        "06 – Listar Operadores\n" + 
                        "07 – Procurar Produto\n" + 
                        "08 – Procurar Cliente\n" + 
                        "09 – Procurar Operador\n" +
                        "10 – Sair\n" +
                        "Digite numero correspondente e tecle <ENTER>"
                    );
                } else if (op.contentEquals("02")){ //Login Operador do Sistema
                    System.out.println("await");
                } else if (op.contentEquals("03")){
                    System.out.println("Good Bye!!!");
                    return;
                } else {
                    System.out.println("Digite um valor válido");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        sc.close();
    }
}

// #sugestoes: