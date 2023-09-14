import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
		Scanner cb = new Scanner(System.in);
        
        int agencia;
		String conta, nomeCliente;
		double saldo;
		
		System.out.println("Digite o número da agencia: ");
		agencia = cb.nextInt();
		
		System.out.println("Digite o número da conta: ");
		conta = cb.next();
		
		System.out.println("Digite o nome do cliente: ");
		nomeCliente = cb.next();
		
		System.out.println("Digite seu Saldo: ");
		saldo = cb.nextDouble();
		
		System.out.println("Olá " + nomeCliente +
				", obrigado por criar uma conta em nosso banco,\nsua agência é "
				+ agencia + " conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque.");
		
		cb.close();
    }
}
