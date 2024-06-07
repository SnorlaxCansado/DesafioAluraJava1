import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nomeCliente = "Arthos Stark";
        String tipoConta = "Corrente";
        double saldoConta = 2500.00;
        boolean executarPrograma = true;
        Scanner scanner = new Scanner(System.in);

        while (executarPrograma) {
            String textoMenu = """
                ***********************
                Dados do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo: R$ %.2f
                ***********************
                
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """.formatted(nomeCliente, tipoConta, saldoConta);
            System.out.println(textoMenu);
            int opcaoMenu = scanner.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Seu saldo atual é de R$ " + saldoConta);
                    break;
                case 2:
                    System.out.print("Informe o valor a receber: ");
                    saldoConta += scanner.nextDouble();
                    break;
                case 3:
                    System.out.print("Informe o valor a transferir: ");
                    saldoConta -= scanner.nextDouble();
                    break;
                case 4:
                    executarPrograma = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}