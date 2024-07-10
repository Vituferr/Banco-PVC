import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Banco Pra Você.");

        System.out.println("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o cpf: ");
        String cpf = scanner.nextLine();

        cliente cliente = new cliente(nome, cpf);

        System.out.println("Digite a conta bancária");
        String numeroConta = scanner.nextLine();

        contaBancaria conta = new contaBancaria(numeroConta, cliente);

        int opcao = 0;
        do {
            System.out.println("Selecione uma das opções abaixo");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar o saldo");
            System.out.println("4 - Verificar informações da Vconta");
            System.out.println("5 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a ser retirado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Seu saldo é de R$ " + conta.getSaldo());
                    break;
                case 4:
                    conta.exibirInfos();
                    break;
                case 5:
                    System.out.println("Saindo, até a próxima.");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");
            }
        }while (opcao != 5);
        scanner.close();
    }
}