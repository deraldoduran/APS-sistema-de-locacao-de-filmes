package main.java.br.com.locamax.api;

import main.java.br.com.locamax.api.shell.Shell;
import main.java.br.com.locamax.api.sistema.Sistema;
import main.java.br.com.locamax.api.login.GerenciadorDeLogin;
import main.java.br.com.locamax.api.pessoa.funcionario.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Shell substitui "new Scanner(System.in)"
        Shell sc =  new Shell();

        // O valor true torna o shell automático com o arquivo input.txt
        sc.setAuto(true);

        String op = "";

        Sistema sis = new Sistema();
        GerenciadorDeLogin gLogin = new GerenciadorDeLogin(sis.getrPerson());

        sis.addGerente("(Ger) Vito", "senha", sis.getrProduct(), sis.getrPerson());

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
                    while(!gLogin.testLogged()){
                        System.out.println(
                            "----------------------------LOCAMAX------------------------\n" + 
                            "#Login (Gerente)\n" + 
                            "Digite seu login e pressione <ENTER>"
                        );
                        String login = sc.nextLine(); // login

                        System.out.println("Digite sua senha e pressione <ENTER>");
                        String senha = sc.nextLine();
    
                        gLogin.login("Gerente", login, senha);
                    }

                    Gerente g = (Gerente)gLogin.getFLogged();

                    while(gLogin.testLogged()){
                        System.out.println(
                            "#Olá Gerente " + gLogin.getFLogged().getNome() + "\n" + 
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
                                System.out.println("Digite o valor da locação por dia e pressione <ENTER>");
                                float valD = Float.parseFloat(sc.nextLine());
                                g.addBluRay(tit, gen, ano, dur, idi, arr, valD);
                            } else if(op.contentEquals("02")){ //Cadastrar DVD
                                System.out.println("#Cadastrar DVD");
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
                                System.out.println("Digite o valor da locação por dia e pressione <ENTER>");
                                float valD = Float.parseFloat(sc.nextLine());
                                g.addDVD(tit, gen, ano, dur, arr, valD);
                            } else if(op.contentEquals("03")){ //Cadastrar VHS
                                System.out.println("#Cadastrar VHS");
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
                                System.out.println("Digite o valor da locação por dia e pressione <ENTER>");
                                float valD = Float.parseFloat(sc.nextLine());
                                g.addVHS(tit, gen, ano, dur, cor, valD);
                            } else if (op.contentEquals("04")){
                                System.out.println("#Cadastrar CD");
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o(s) autor(es) e pressione <ENTER>");
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
                                System.out.println("Digite o valor da locação por dia e pressione <ENTER>");
                                float valD = Float.parseFloat(sc.nextLine());
                                g.addCD(tit, gen, aut, numF, dup, arr, valD);
                            } else if (op.contentEquals("05")){
                                System.out.println("#Cadastrar LP");
                                System.out.println("Digite o título e pressione <ENTER>");
                                String tit = sc.nextLine();
                                System.out.println("Digite o gênero e pressione <ENTER>");
                                String gen = sc.nextLine();
                                System.out.println("Digite o(s) autor(es) e pressione <ENTER>");
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
                                System.out.println("Digite o valor da locação por dia e pressione <ENTER>");
                                float valD = Float.parseFloat(sc.nextLine());
                                g.addLP(tit, gen, aut, numF, rar, valD);
                            }
                        } else if(op.contentEquals("02")){ //Cadastrar Cliente
                            System.out.println("#Cadastrar Cliente: ");
                            System.out.println("Digite o nome do cliente e pressione <ENTER>");
                            String nome = sc.nextLine();
                            System.out.println("Digite o endereço do cliente e pressione <ENTER>");
                            String end = sc.nextLine();
                            System.out.println("Digite a idade do cliente e pressione <ENTER>");
                            Integer ida = Integer.parseInt(sc.nextLine());
                            System.out.println("Digite 'm' ou 'f' para o sexo do cliente e pressione <ENTER>");
                            char sex = sc.nextLine().charAt(0);
                            while(sex != 'm' && sex != 'f'){
                                System.out.println("Digite 'm' ou 'f' para o sexo do cliente e pressione <ENTER>");
                                sex = sc.nextLine().charAt(0);
                            }
                            g.addCliente(nome, end, ida, sex);
                        } else if(op.contentEquals("03")){ //Cadastrar Operador
                            System.out.println("#Cadastrar Operador: ");
                            System.out.println("Digite o nome do Operador e pressione <ENTER>");
                            String nome = sc.nextLine();
                            System.out.println("Digite a senha do Operador e pressione <ENTER>");
                            String senha = sc.nextLine();
                            g.addOperador(nome, senha, sis.getrPerson(), sis.getrProduct(), sis.getrRent());
                        } else if(op.contentEquals("04")){ //Listar produtos
                            System.out.println("#Lista de Produtos: ");
                            g.listProduto();
                        } else if(op.contentEquals("05")){ //Listar clientes
                            System.out.println("#Lista de Clientes: ");
                            g.listCliente();
                        } else if(op.contentEquals("06")){ //Listar operadores
                            System.out.println("#Lista de Operadores: ");
                            g.listOperador();
                        } else if(op.contentEquals("07")){ //Procurar produto
                            System.out.println(
                                "#Procurar Produto: " +
                                "Digite o código do Produto e pressione <ENTER>"
                            );
                            String cod = sc.nextLine();
                            g.findProduto(cod);
                        } else if(op.contentEquals("08")){ //Procurar cliente
                            System.out.println(
                                "#Procurar Cliente: " + "\n" +
                                "Digite a matrícula do Cliente e pressione <ENTER>"
                            );
                            int mat = Integer.parseInt(sc.nextLine());
                            g.findCliente(mat);
                        } else if(op.contentEquals("09")){ //Procurar operador
                            System.out.println(
                                "#Procurar Operador: " + "\n" +
                                "Digite a matrícula do Operador e pressione <ENTER>"
                            );
                            int mat = Integer.parseInt(sc.nextLine());
                            g.findOperador(mat);
                        } else if (op.contentEquals("10")){
                            gLogin.logout();
                        }
                    }
                } else if (op.contentEquals("02")){ //Login Operador do Sistema
                    while(!gLogin.testLogged()){
                        System.out.println(
                            "----------------------------LOCAMAX------------------------\n" + 
                            "#Login (Operador)\n" + 
                            "Digite seu login e pressione <ENTER>"
                        );
                        String login = sc.nextLine();

                        System.out.println("Digite sua senha e pressione <ENTER>");
                        String senha = sc.nextLine();
    
                        gLogin.login("Operador", login, senha);
                    }

                    Operador o = (Operador)gLogin.getFLogged();

                    while(gLogin.testLogged()){
                        System.out.println(
                            "#Olá Operador " + gLogin.getFLogged().getNome() + "\n" + 
                            "01 – Fazer locação\n" +
                            "02 – Dar baixa em locação\n" +
                            "03 – Excluir locação\n" +
                            "04 – Procurar Produto\n" +
                            "05 – Procurar Cliente\n" +
                            "06 – Logout\n" +
                            "Digite o numero correspondente e tecle <ENTER>"
                        );

                        op = sc.nextLine();

                        if(op.contentEquals("01")){ //Fazer locação
                            System.out.println(
                                "#Fazer Locação" + "\n" +
                                "Digite a matrícula do Cliente e pressione <ENTER>"
                            );
                            Integer mat = Integer.parseInt(sc.nextLine());
                            System.out.println("Digite o código do produto e pressione <ENTER>");
                            String cod = sc.nextLine();
                            System.out.println("Digite por quantos dias será locado e pressione <ENTER>");
                            Integer dias = Integer.parseInt(sc.nextLine());
                            o.fazerLocacao(mat, cod, dias);
                        } else if(op.contentEquals("02")){ //Dar baixa em locação
                            System.out.println(
                                "#Dar baixa em Locação" + "\n" +
                                "Digite a matrícula do cliente e pressione <ENTER>"
                            );
                            int mat = Integer.parseInt(sc.nextLine());
                            System.out.println("Digite o código do produto e pressione <ENTER>");
                            String cod = sc.nextLine();
                            o.fecharLocacao(mat, cod);
                            op = "";
                            while(!op.contentEquals("sim") && !op.contentEquals("nao")){
                                System.out.println("Finalizar baixa? digite 'sim' ou 'não'");
                                op = sc.nextLine();
                                if(op.contentEquals("sim"))
                                    o.remLocacao(mat, cod);                             
                            }
                        } else if(op.contentEquals("03")){ //Excluir locação
                            System.out.println(
                                "#Excluir 'Locação" + "\n" +
                                "Digite a matrícula do cliente e pressione <ENTER>"
                            );
                            int mat = Integer.parseInt(sc.nextLine());
                            System.out.println("Digite o código do produto e pressione <ENTER>");
                            String cod = sc.nextLine();
                            o.remLocacao(mat, cod);
                        } else if(op.contentEquals("04")){ //Procurar Produto
                            System.out.println(
                                "#Procurar Produto: " + "\n" + 
                                "Digite o código do Produto e pressione <ENTER>"
                            );
                            String cod = sc.nextLine();
                            o.findProduto(cod);
                        } else if(op.contentEquals("05")){ //Procurar Cliente
                            System.out.println(
                                "#Procurar Cliente: " + "\n" +
                                "Digite a matrícula do Cliente e pressione <ENTER>"
                            );
                            int mat = Integer.parseInt(sc.nextLine());
                            o.findCliente(mat);
                        } else if (op.contentEquals("06")){ //Logout
                            gLogin.logout();
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

// #melhorias: criar controladores com menus específicos e controle de acesso.
// Assim me livro do problema de ser linear o while.
// [!] Após usuário tentar logar numa categoria que nao pertence, fica preso