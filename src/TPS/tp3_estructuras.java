//**************************************************************************
//***!!ADVERTENCIA¡¡, se recomienda ejecutar cada punto de manera aislada***
//**************************************************************************

package TPS;
import java.util.Scanner;
public class tp3_estructuras {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        //Punto 1)
        
        //Declarando variables
        int X = 0;
        
        //Ingreso de datos
        System.out.println("Ingrese un número por favor: ");
        X = entrada.nextInt();
        
        //Condicionales para saber si el número es par o impar
        if(X % 2 == 0){
            System.out.println(X + " es un número par");
        } else{
            System.out.println(X + " es un número impar");
        }
        
        
        //Punto 2)
        //Ingreso de variables
        int Y = 0;
        
        //Ingreso de datos
        System.out.println("Ingrese un número por favor: ");
        Y = entrada.nextInt();
        
        //Condicionales para saber si múltiplo de 10 o no
        if(Y % 10 == 0){
            System.out.println(Y + " es mútiplo de 10");
        } else{
            System.out.println(Y + " no es mútiplo de 10r");
        }
        
        //Punto 3)
        
        //Declarando variables
        int letra ;
        
        //Ingreso de datos
        System.out.print("Ingrese una letra por favor: ");
        letra = entrada.next().charAt(1);
        
        //Condicionales para saber si es una letra mayúscula o no
        if(Character.isUpperCase(letra)){
            System.out.println(letra + " es mayúscula.");
        } else {
            System.out.println("No es mayúscula.");
        }
        
        //Punto 4)
        
        //Declarando variables
        int num1;
        int  num2;
        
        //Ingreso de datos
        System.out.print("Ingrese el prumer número por favor: ");
        num1 = entrada.nextInt();
        
        System.out.println("");
        
        System.out.print("Ingrese el segundo número por favor: ");
        num2 = entrada.nextInt();
        
        //procesos para sacar la última cifra de un número
        
        int div1 = num1 % 10;
        int div2 = num2 % 10;
        
        //Condicionales para comparar las dós ultimas cifras y saber si son o no iguales
        if(div1 == div2) {
            System.out.println("las últimas cifras de " + num1 + " y " + num2 + " son iguales");
        } else {
            System.out.println("las últimas cifras de " + num1 + " y " + num2 + " no son iguales");
        }
         
        //Punto 5)
        
        //Declarando variables
        int multiplo_3;
        int multiplo_5;
        
        //Ingreso de datos
        System.out.print("Ingrese aquí el primer número para saber si es mútiplo de 3 por favor: ");
        multiplo_3 = entrada.nextInt();
        
        System.out.println("");
        
        System.out.print("Ingrese aquí el segundo número para saber si es mútiplo de 5 por favor: ");
        multiplo_5 = entrada.nextInt();
        
        //Condicionales para saber si son o no múltiplos
        if(multiplo_3 % 3 == 0){
            System.out.println(multiplo_3 + " si es multiplo de 3.");
        } else {
            System.out.println(multiplo_3 + " no es multiplo de 3");
        } 
        if( multiplo_5 % 5 == 0) {
            System.out.println(multiplo_5 + " es multiplo de 5");
        } else {
            System.out.println(multiplo_5 + " no es multiplo de 5");
        }
        
        //Punto 6)
        
        //Declarando variables
        char comp_num;
        
        //Ingreso de datos
        System.out.print("Ingrese un carácter");
        comp_num = entrada.next().charAt(0);
        
        //Condicionales para saber si es o no un dígito
        if(Character.isDigit(comp_num)) {
            System.out.println(comp_num + " es un dígito");
        } else{
            System.out.println("Error!!, no es un dígito");
        }
        
        //Punto 7)
        
        //Declarando variables
        int dividendo = 0;
        int divisor = 0;
        int tot_div = 0;
        
        //Inreso de datos
        System.out.print("Ingrese el dividendo: ");
        dividendo = entrada.nextInt();
        
        System.out.println(" ");
        
        System.out.print("Ingrese el divisor por favor: ");
        divisor = entrada.nextInt();
        
        //Condicionales para el divisor
        if(divisor >0){
            tot_div = dividendo / divisor;
            System.out.println("El resultado de la división es: " + tot_div + ".");
        } else{
            System.out.println("Error!!, no se puede dividir por 0.");
        }
        
    }
    
}
