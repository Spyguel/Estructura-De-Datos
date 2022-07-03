
package TPS;
import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        
        		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		int cont_S = 0;
		int cont_F = 0;
		int cont_A = 0;
		
		System.out.print("Ingrese el total de personas para solicitar el plan por favor: ");
		int P = entrada.nextInt();
		System.out.println("");
		
		while (cont < P) {
			cont = cont + 1;
			System.out.print("Ingrese su edad por favor:");
			int E = entrada.nextInt();
			System.out.println("");
			System.out.print("Ingrese 1 si es de San Miguel, 2 si es de Famaillá y 3 si es de Aberdi: ");
			int L = entrada.nextInt();
			System.out.println("");
			if(E >=18 && E<= 30) {
                            switch (L) {
                                case 1 -> cont_S = cont_S + 1;
                                case 2 -> cont_F = cont_F + 1;
                                case 3 -> cont_A = cont_A + 1;
                                default -> System.out.println("No cumple los requisitos.");
                            }
			} else {
				System.out.println("No cumple los requisitos. Está fuera del rango de edad.");
			}
		}
		
		System.out.println("");
		System.out.println("El total de participantes aceptados de San Miguel son: " + cont_S + " los de Famaillá son: " + cont_F + " y los de Alberdi son: " + cont_A);
    }
    
}
