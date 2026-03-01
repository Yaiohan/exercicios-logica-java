import java.util.Scanner;

public class RepeticaoAteZero {
    
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println(" Insira um número: ");

int numero = sc.nextInt();


while ( numero != 0 ) {

System.out.println(" Número informado:" + numero);
System.out.println(" Insira outro número ou 0 para encerrar:");
numero = sc.nextInt();
}

System.out.println(" Programa encerrado!");

}

}
