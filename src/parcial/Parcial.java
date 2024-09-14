
package parcial;

import java.util.Scanner;


public class Parcial {

    
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);
     
      
        //declaramos variables primero para no enredarnos
        
        int resultado_Multi = 0;
        int numero1_Multi;
        int numero2_Multi;
        int dividendo_divi;
        int divisor_divi; //cuando me refiero a denomina (denominador) hago referencia al segundo numero por el cual se va a dividir)
        int coci = 0;  //coci, es decir el cociente
        
        
        //capturamos los numeros para la division utilizando el Scanner, aunque tambien se puede utilzar el JOption Pane

        System.out.println("Ingrese el dividendo para realizar la pertinente division: ");
        
        dividendo_divi = entrada.nextInt();
        
        System.out.print("Ingrese el divisor para realizar la pertinente division: ");
        
        divisor_divi = entrada.nextInt();

        
        
        //iniciamos con el proceso de la division
        
        int residuo = dividendo_divi;
        while (residuo >= divisor_divi) {
            residuo -= divisor_divi;
            coci++;
        }
        
        System.out.println("El resultado de la division es: " + coci);
        
        if (residuo == 0) {    //usamos el condicional if para lo que es el cociente
            
            System.out.println("La division es matematicamente exacta :) ");
        } else {
            System.out.println("Lamentable y tristemente la division no es exacta :( . Por lo tanto el residuo es: " + residuo);
        }
        
        
        // en esta parte profesor se desarrollora el apartado de la multiplicación
        System.out.print("Por favor ingresa el 1 numero para proceder a la multiplicacion: atte Juan :)  ");
        numero1_Multi = entrada.nextInt();
        System.out.print("Por favor ingresa el 2 numero para proceder a la multiplicacion: atte Juan :)  ");
        numero2_Multi = entrada.nextInt();
        
       
       
        for (int i = 0; i < numero2_Multi; i++) {
            resultado_Multi += numero1_Multi;
        }
        System.out.println("El resultado de la multiplicacion es: " + resultado_Multi + " (Gracias por utilizar mi programa) :) ");

    }
}

