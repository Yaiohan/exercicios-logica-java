import java.util.Scanner;
public class VerificadorMultiplo4Ou7 {

    public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

System.out.println(" Meu programinha :3.");
System.out.println(" Informe um número: " );

int numero = sc.nextInt();

if ( numero % 4 == 0 || numero % 7 == 0 ){

System.out.println(" Número misterioso 0.0! ");

} else {

System.out.println("Número comum :)!");

}
    }

}
