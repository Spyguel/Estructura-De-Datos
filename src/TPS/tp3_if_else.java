package TPS;

//*****************************************************************************************************************
//**¡¡ ADVERTENCIA!!: ejecutar el ejercicio 4 de manera aislada porque genera conflictos con los demás ejercicios**
//*****************************************************************************************************************

import java.util.Scanner;

public class tp3_if_else {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        
        //Punto1)
        
        //Ingreso de variables
        int X = 30, Y = 60;
        
        //Condicionales para el número mayor y menor
        if(Y > X){
            System.out.println("Y es mayor que X");
        } else {
            System.out.println("X es mayor que Y");
        }
        //-------------------------------------------
        
        //Punto 2)
        
         //Ingreso de variables
         int num1 = 3, num2 = 6, num3 = 9;
         
         //Condicionales para ordenar los números de mayor a menor
         if(num3 > num2){
             System.out.print(num3 + " ");
             if (num2 > num1) {
                 System.out.print(num2 + " ");
                 if(num1 == num1){
                 System.out.print(num1);}
                 System.out.println("");
             }
         }
        //-------------------------------------------
        
        //Punto 3)
        
        //Ingreso de variables
        int num_x = 0;
        
        //Ingreso de datos
        System.out.print("Inrese un número por favor: ");
        num_x = entrada.nextInt();
        
        //Condicionales para saber de cuantas cifras es ese número
        if(num_x <= 9) {
            System.out.println("El número: " + num_x + " es de 1 cifra.");
        } else if(num_x <= 99){
            System.out.println("El número: " + num_x + " es de 2 cifras.");
        } else if(num_x <= 999){
            System.out.println("El número: " + num_x + " es de 3 cifra.");
        } else if(num_x<= 9999){
            System.out.println("El número: " + num_x + " es de 4 cifra.");
        } else if(num_x <= 99999){
            System.out.println("El número: " + num_x + " es de 5 cifra.");
        } else{
            System.out.println("El número ingresado está fiera del rango");
        }
        //-------------------------------------------
        
        //Punto 4)
        
        //Ingreso de las variables
        String user_default = "Agustin", password_default = "AgUs9dejulio";
        String user1 = "", password1 = "";
        
        //Ingreso de datos
        System.out.print("Ingrese el nombre de usuario por favor: ");
        user1 = entrada.nextLine();
        
        System.out.print("Ingrese su contraseña por favor: ");
        password1 = entrada.nextLine();
        
        // condicionales para el usuario y contraseña
        if(user_default.equals(user1)){
            
            if(password_default.equals(password1)) {
            System.out.println("Los datos ingresados son correctos");
            } else {
                System.out.println("Los datos ingresados son incorrectos");
            }
        } else {
            System.out.println("Los datos ingresados son incorrectos");
        }
        
    }
}
