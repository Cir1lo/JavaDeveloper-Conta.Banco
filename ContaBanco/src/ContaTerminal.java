import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int Numero;
        String Agencia;
        String nomeCliente;
        double Saldo;

        //Metodos 
        System.out.println("Digite o numero da Agencia!");
        Numero = input.nextInt();
        System.out.println("Qual a agencia?");
        Agencia = input.next();
        System.out.println("Nome do Cliente");
        Saldo = input.nextDouble();

        //Retorno
        System.out.println("Ola"++", obrigado por criar uma conta em nosso banco, sua agencia e "+Agencia+", conta [Numero] e seu saldo [Saldo] já está disponível para saque");

    }
}
