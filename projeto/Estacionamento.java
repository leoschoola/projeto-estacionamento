import java.util.Scanner;

public class Estacionamento {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        //Declarando objetos
        Entrada entrada = new Entrada();
        Ticket ticket = new Ticket();
        TicketMensal ticketMensal = new TicketMensal();
        Saida saida = new Saida();

        System.out.println("Bem vindo ao Estacionamento!");
        System.out.println("");

        System.out.println("Horário de entrada: " + entrada.Horario());
        System.out.println("");

        //Organizando respostas do admin
        int resposta;
        int cadastroClienteMensal;
        String cpfCliente;
        String veiculoClienteMensal;
        String veiculoAvulso;
        String cor;
        String placa;
        String modelo;
        String marca;

        do {
            System.out.println("Selecione a opção: ");
            System.out.println("[1] TICKET AVULSO");
            System.out.println("[2] TICKET MENSAL");
            System.out.println("[3] SAIR");
            resposta = tc.nextInt();

            switch (resposta){
                case 1:
                    System.out.println("TICKET AVULSO");
                    System.out.println("");
                    System.out.println("TIPO DE VEÍCULO: ");
                    veiculoAvulso = tc.next();
                    ticket.setVeiculo(veiculoAvulso);

                    System.out.println("PLACA: ");
                    System.out.println("DEVE SER ESCRITO NESTE PADRAO");
                    System.out.println("XXXNNNN");
                    System.out.println("OU");
                    System.out.println("XXXNXNN");
                    placa = tc.next();
                    ticket.setPlaca(placa);

                    System.out.println("MARCA: ");
                    marca = tc.next();
                    ticket.setMarca(marca);

                    System.out.println("MODELO: ");
                    modelo = tc.next();
                    ticket.setModelo(modelo);

                    System.out.println("COR ");
                    cor = tc.next();
                    ticket.setCor(cor);

                    System.out.println("\n");
                    System.out.println(ticket.toString());
                    break;
                case 2:
                    System.out.println("TICKET MENSAL");
                    System.out.println("");
                    System.out.println("VOCÊ JÁ TEM CADASTRO?");
                    System.out.println("[1] SIM");
                    System.out.println("[2] NÃO");
                    cadastroClienteMensal = tc.nextInt();
                    if (cadastroClienteMensal == 1){
                        System.out.println("Verificando seu cadastro...");
                    } else {
                        tc.nextLine();
                        System.out.println("Digite seu nome completo: ");
                        String nomeCliente = tc.nextLine();
                        ticketMensal.setNome(nomeCliente);

                        System.out.println("Digite seu CPF: ");
                        cpfCliente = tc.nextLine();
                        ticketMensal.setCpf(cpfCliente);

                        System.out.println("TIPO DE VEÍCULO: ");
                        veiculoAvulso = tc.next();
                        ticketMensal.setVeiculo(veiculoAvulso);

                        System.out.println("PLACA: ");
                        System.out.println("DEVE SER ESCRITO NESTE PADRAO");
                        System.out.println("XXXNNNN");
                        System.out.println("OU");
                        System.out.println("XXXNXNN");
                        placa = tc.next();
                        ticketMensal.setPlaca(placa);

                        System.out.println("MARCA: ");
                        marca = tc.next();
                        ticketMensal.setMarca(marca);

                        System.out.println("MODELO: ");
                        modelo = tc.next();
                        ticketMensal.setModelo(modelo);

                        System.out.println("COR ");
                        cor = tc.next();
                        ticketMensal.setCor(cor);

                        System.out.println("\n");
                        System.out.println(ticketMensal.toString());
                    }
                    break;
                case 3:
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
