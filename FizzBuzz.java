package fizzbuzz;
/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class FizzBuzz {

    public static void main(String[] args) {
         // Itera del 1 al 100 
for(int i = 1; i <= 100; i++){
    // Verifica si es multiplo de 3
boolean multiplodeTres = i % 3 == 0;
// Verifica si es multiplo de 5
boolean multiplodeCinco = i % 5 == 0;

if(multiplodeTres && multiplodeCinco){
    // Múltiplo de 3 y 5 a la vez
    System.out.println("FizzBuzz");
}else
    if(multiplodeTres){
        //Multiplo de 3
        System.out.println("Fizz");
    } else
        if(multiplodeCinco){
            //Multiplo de cinco
            System.out.println("Buzz");
        }else{
            //Sigue imprimiendo los numeros hasta llegar al limite siguiendo las condiciones de FizzBuzz
            System.out.println(i);
        }
    } System.out.println("Fin del Prgrama :)");     
    }
    
}
