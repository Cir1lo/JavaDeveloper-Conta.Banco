import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Numero=0;
        String Agencia="";
        String nomeCliente="";
        double Saldo=0;

        //Metodos 
        
        System.out.println("Nome do Cliente");
        nomeCliente = input.next();
        System.out.println("Digite o numero da conta: ");
        Numero = input.nextInt();
        System.out.println("Qual a agencia?");
        Agencia = input.next();
        System.out.println("Qual o seu saldo?");
        Saldo = input.nextDouble();

        //Retorno
        System.out.println("\nOla"+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia e "+Agencia+", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque\n");
        
    }
}
