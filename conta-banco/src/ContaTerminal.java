public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Importando a classe Scanner
        java.util.Scanner terminal = new java.util.Scanner(System.in);

        System.out.println("Por favor, digite o número da conta:");
        int numeroConta = terminal.nextInt();
        terminal.nextLine(); // limpa o buffer para evitar problemas com o próximo next()

        System.out.println("Por favor, digite o número da agência:");
        String numeroAgencia = terminal.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = terminal.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = terminal.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, numeroAgencia, numeroConta, saldoConta);
        terminal.close();
    }
}
