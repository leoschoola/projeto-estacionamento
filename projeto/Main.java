import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        //Criando lista de clientes
        ArrayList<TicketMensal> clientes = new ArrayList<>();

        //Declarando objetos
        Entrada entrada = new Entrada();
        Ticket ticket = new Ticket();
        Saida saida = new Saida();

        System.out.println("Bem vindo ao Estacionamento!");
        System.out.println("");

        System.out.println("Horário de entrada: " + entrada.Horario());
        System.out.println("");

        //Organizando respostas do admin
        int resposta;
        int cadastroClienteMensal;

        //Iniciando código
        do {
            System.out.println("Selecione a opção: ");
            System.out.println("[1] TICKET AVULSO");
            System.out.println("[2] TICKET MENSAL");
            System.out.println("[3] SAIR");
            resposta = tc.nextInt();

            switch (resposta){ 
                case 1: //Se ticket for avulso
                    System.out.println("TICKET AVULSO");
                    System.out.println("");
                    System.out.println("TIPO DE VEÍCULO: ");
                    System.out.println("CARRO OU MOTO? ");
                    String veiculoCliente = tc.next();
                    ticket.setVeiculo(veiculoCliente);

                    System.out.println("PLACA: ");
                    System.out.println("DEVE SER ESCRITO NESTE PADRAO");
                    System.out.println("XXXNNNN");
                    System.out.println("OU");
                    System.out.println("XXXNXNN");
                    String placa = tc.next();
                    ticket.setPlaca(placa);

                    System.out.println("MARCA: ");
                    String marca = tc.next();
                    ticket.setMarca(marca);

                    System.out.println("MODELO: ");
                    String modelo = tc.next();
                    ticket.setModelo(modelo);

                    System.out.println("COR: ");
                    String cor = tc.next();
                    ticket.setCor(cor);

                    System.out.println("\n");
                    System.out.println(ticket.toString());
                    break;
                case 2: //Se ticket for mensal
                    System.out.println("TICKET MENSAL");
                    System.out.println("");
                    System.out.println("[1] CRIAR CADASTRO");
                    System.out.println("[2] JÁ POSSUO CADASTRO");
                    cadastroClienteMensal = tc.nextInt();
                    if (cadastroClienteMensal == 1){
                        tc.nextLine();

                        TicketMensal novoCadastro = new TicketMensal();

                        System.out.println("Digite seu nome completo: ");
                        String nomeCliente = tc.nextLine();
                        novoCadastro.setNome(nomeCliente);

                        System.out.println("Digite seu CPF: ");
                        String cpfCliente = tc.nextLine();
                        novoCadastro.setCpf(cpfCliente);

                        System.out.println("TIPO DE VEÍCULO: ");
                        System.out.println("CARRO OU MOTO? ");
                        veiculoCliente = tc.next();
                        novoCadastro.setVeiculo(veiculoCliente);

                        System.out.println("PLACA: ");
                        System.out.println("DEVE SER ESCRITO NESTE PADRAO");
                        System.out.println("XXXNNNN");
                        System.out.println("OU");
                        System.out.println("XXXNXNN");
                        placa = tc.next();
                        novoCadastro.setPlaca(placa);

                        System.out.println("MARCA: ");
                        marca = tc.next();
                        novoCadastro.setMarca(marca);

                        System.out.println("MODELO: ");
                        modelo = tc.next();
                        novoCadastro.setModelo(modelo);

                        System.out.println("COR: ");
                        cor = tc.next();
                        novoCadastro.setCor(cor);

                        clientes.add(novoCadastro); //Adicionando os clientes a lista de clientes cadastrados

                        System.out.println("\n Cadastro realizado com sucesso!");

                    } else {
                        System.out.println("Verificando seu cadastro...");
                        System.out.println("\n Clientes Cadastrados: ");
                        for (TicketMensal clientela : clientes){
                            System.out.println(clientela.toString());
                        }
                    }
                    break;
                case 3: //Registrando horário de saída
                    System.out.println("Horario de saída: " + saida.Horario());
                    System.out.println("Finalizando atendimento.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
            System.out.println("");
        } while (resposta != 3);
        tc.close();

        
    }   
}