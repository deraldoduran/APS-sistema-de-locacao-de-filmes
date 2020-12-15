package main.java.br.com.locamax.api;

import main.java.br.com.locamax.api.shell.Shell;
import main.java.br.com.locamax.api.sistema.Sistema;
// import main.java.br.com.locamax.api.pessoa.funcionario.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Shell substitui "new Scanner(System.in)"
        Shell sc =  new Shell();

        // ative a linha abaixo para deixar o shell automático com o arquivo input.txt
        // sc.setAuto(true);

        String op = "";

        Sistema sis = new Sistema();
        sis.addGerente("gerente", 0, "login", "senha");

        while(!op.contentEquals("03")){
            System.out.println(
                "----------------------------LOCAMAX------------------------\n" + 
                "#Bem-vindo, escolha um perfil abaixo:\n" +
                "01 – Gerente\n" +
                "02 – Operador de Sistema\n" +
                "03 – Sair\n" +
                "Digite o número correspondente e tecle <ENTER>"
            );

            op = sc.nextLine();

            try{
                if(op.contentEquals("01")){ //Login Gerente
                    while(!sis.getgLogin().testLogged()){
                        System.out.println(
                            "----------------------------LOCAMAX------------------------\n" + 
                            "#Login (Gerente)\n" + 
                            "Digite seu login e pressione <ENTER>"
                        );
                        String login = sc.nextLine();

                        System.out.println("Digite sua senha e pressione <ENTER>");
                        String senha = sc.nextLine();
    
                        sis.getgLogin().login("Gerente", login, senha, sis.getrEmployee());
                    }

                    while(sis.getgLogin().testLogged()){
                        System.out.println(
                            "#Olá Gerente " + sis.getgLogin().getFLogged().getNome() + "\n" + 
                            "01 – Cadastrar Produto\n" + 
                            "02 – Cadastrar Cliente\n" + 
                            "03 – Cadastrar Operador\n" +
                            "04 – Listar Produtos\n" + 
                            "05 – Listar Clientes\n" + 
                            "06 – Listar Operadores\n" + 
                            "07 – Procurar Produto\n" + 
                            "08 – Procurar Cliente\n" + 
                            "09 – Procurar Operador\n" +
                            "10 – Logout\n" +
                            "Digite o numero correspondente e tecle <ENTER>"
                        );
                        
                        op = sc.nextLine();
                        
                        if(op.contentEquals("01")){ //Cadastrar produto
                            System.out.println(
                                "#Cadastrar Produto\n" + 
                                "Filme\n" +
                                "    01 - Bluray\n" +
                                "    02 - DVD\n" +
                                "    03 - VHS\n" +
                                "Música\n" +
                                "    04 - CD\n" +
                                "    05 - LP\n" +
                                "Digite numero correspondente e tecle <ENTER>"
                            );

                            op = sc.nextLine();

                            if(op.contentEquals("01")){ //Cadastrar Bluray
                                System.out.println("#Cadastrar Bluray");
                                System.out.println("Digite o código e pressione <ENTER>");
                                String cod = sc.nextLine();
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o ano e pressione <ENTER>");
                                int ano = Integer.parseInt(sc.nextLine());
                                System.out.println("Digite a duracao em minutos e pressione <ENTER>");
                                int dur = Integer.parseInt(sc.nextLine());
                                System.out.println("Digite os idiomas e pressione <ENTER>");
                                String idi = sc.nextLine();
                                boolean arr = false;
                                while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                    System.out.println("O disco está arranhado? digite 'sim' ou 'nao' e pressione <ENTER>");
                                    op = sc.nextLine();
                                    if(op.contentEquals("sim"))
                                        arr = true;                             
                                }
                                sis.addBluRay(cod, tit, gen, ano, dur, idi, arr);
                            } else if(op.contentEquals("02")){ //Cadastrar DVD
                                System.out.println("#Cadastrar DVD");
                                System.out.println("Digite o código e pressione <ENTER>");
                                String cod = sc.nextLine();
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o ano e pressione <ENTER>");
                                int ano = Integer.parseInt(sc.nextLine());
                                System.out.println("Digite a duracao em minutos e pressione <ENTER>");
                                int dur = Integer.parseInt(sc.nextLine());
                                boolean arr = false;
                                while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                    System.out.println("O disco está arranhado? digite 'sim' ou 'nao' e pressione <ENTER>");
                                    op = sc.nextLine();
                                    if(op.contentEquals("sim"))
                                        arr = true;                             
                                }
                                sis.addDVD(cod, tit, gen, ano, dur, arr);
                            } else if(op.contentEquals("03")){ //Cadastrar VHS
                                System.out.println("#Cadastrar VHS");
                                System.out.println("Digite o código e pressione <ENTER>");
                                String cod = sc.nextLine();
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o ano e pressione <ENTER>");
                                int ano = Integer.parseInt(sc.nextLine());
                                System.out.println("Digite a duracao em minutos e pressione <ENTER>");
                                int dur = Integer.parseInt(sc.nextLine());
                                boolean cor = false;
                                while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                    System.out.println("O VHS é em cores? digite 'sim' ou 'nao' e pressione <ENTER>");
                                    op = sc.nextLine();
                                    if(op.contentEquals("sim"))
                                        cor = true;                             
                                }
                                sis.addVHS(cod, tit, gen, ano, dur, cor);
                            } else if (op.contentEquals("04")){
                                System.out.println("#Cadastrar CD");
                                System.out.println("Digite o código e pressione <ENTER>");
                                String cod = sc.nextLine();
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o autor(es) e pressione <ENTER>");
                                String aut = sc.nextLine();
                                System.out.println("Digite o número de faixas e pressione <ENTER>");
                                Integer numF = Integer.parseInt(sc.nextLine());
                                Boolean dup = false;
                                while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                    System.out.println("O CD é duplo? digite 'sim' ou 'nao' e pressione <ENTER>");
                                    op = sc.nextLine();
                                    if(op.contentEquals("sim"))
                                        dup = true;                             
                                }
                                Boolean arr = false;
                                op = "";
                                while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                    System.out.println("O CD está arranhado? digite 'sim' ou 'nao' e pressione <ENTER>");
                                    op = sc.nextLine();
                                    if(op.contentEquals("sim"))
                                        arr = true;                             
                                }
                                sis.addCD(cod, tit, gen, aut, numF, dup, arr);
                            } else if (op.contentEquals("05")){
                                System.out.println("#Cadastrar LP");
                                System.out.println("Digite o código e pressione <ENTER>");
                                String cod = sc.nextLine();
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o autor(es) e pressione <ENTER>");
                                String aut = sc.nextLine();
                                System.out.println("Digite o número de faixas e pressione <ENTER>");
                                Integer numF = Integer.parseInt(sc.nextLine());
                                Boolean rar = false;
                                while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                    System.out.println("O LP é raro? digite 'sim' ou 'nao' e pressione <ENTER>");
                                    op = sc.nextLine();
                                    if(op.contentEquals("sim"))
                                        rar = true;                             
                                }
                                sis.addLP(cod, tit, gen, aut, numF, rar);
                            }
                        } else if(op.contentEquals("02")){ //Cadastrar Cliente

                        } else if(op.contentEquals("03")){ //Cadastrar Operador
                        } else if(op.contentEquals("04")){ //Listar produtos
                        } else if(op.contentEquals("05")){ //Listar clientes
                        } else if(op.contentEquals("06")){ //Lsitar operadores
                        } else if(op.contentEquals("07")){ //Procurar produto
                        } else if(op.contentEquals("08")){ //Procurar cliente
                        } else if(op.contentEquals("09")){ //Procurar operador
                        } else if (op.contentEquals("10")){
                            sis.getgLogin().logout();
                        }
                    }
                } else if (op.contentEquals("02")){ //Login Operador do Sistema
                    while(!sis.getgLogin().testLogged()){
                        System.out.println(
                            "----------------------------LOCAMAX------------------------\n" + 
                            "#Login (Operador)\n" + 
                            "Digite seu login e pressione <ENTER>"
                        );
                        String login = sc.nextLine();

                        System.out.println("Digite sua senha e pressione <ENTER>");
                        String senha = sc.nextLine();
    
                        sis.getgLogin().login("Operador", login, senha, sis.getrEmployee());
                    }

                    while(sis.getgLogin().testLogged()){
                        System.out.println(
                            "#Olá Operador " + sis.getgLogin().getFLogged().getNome() + "\n" + 
                            "01 – Fazer locação\n" +
                            "02 – Dar baixa em locação\n" +
                            "03 – Excluir locação\n" +
                            "04 – Procurar Produto\n" +
                            "05 – Procurar Cliente\n" +
                            "06 – Logout\n" +
                            "Digite o numero correspondente e tecle <ENTER>"
                        );
                        if(op.contentEquals("01")){ //Fazer locação
                        } else if(op.contentEquals("02")){ //Dar baixa em locação
                        } else if(op.contentEquals("03")){ //Excluir locação
                        } else if(op.contentEquals("04")){ //Procurar Produto
                        } else if(op.contentEquals("05")){ //Procurar Cliente
                        } else if (op.contentEquals("06")){ //Logout
                            sis.getgLogin().logout();
                        }
                    }
                } else if (op.contentEquals("03")){ //Sair
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

// #melhorias: validar se aquele login é do tipo que pede acesso. pe. no menu gerente se é gerente;