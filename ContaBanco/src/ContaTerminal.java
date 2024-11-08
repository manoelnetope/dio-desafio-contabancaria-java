import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Criando o scanner para capturar as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();  // Lê a agência
        
        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();  // Lê o número da conta
        
        scanner.nextLine();  // Consumir a quebra de linha deixada pelo nextInt()
        
        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.nextLine();  // Lê o nome do cliente
        
        System.out.println("Por favor, digite o saldo da conta!");
        double saldo = scanner.nextDouble();  // Lê o saldo da conta
        
        // Exibindo a mensagem com os dados fornecidos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                           " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}
