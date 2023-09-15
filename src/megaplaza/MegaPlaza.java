/*Ejercicio 4: En MegaPlaza se
hace un 20% de descuento a los
clientes cuya compra supere los
$300. ¿Cuál será la cantidad que
pagará una persona por su
compra?*/
package megaplaza;

import java.util.Scanner;

public class MegaPlaza {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int desc = 300;
        double porcentaje = 0.20,compra, compraD;
        System.out.println("Digite el monto de la compra");
        compra = teclado.nextDouble();
        
        if (compra >= desc) {
        compraD = compra * porcentaje; 
        compra = compra - compraD;
            System.out.println("El total a pagar es: "+ compra);
        }
        else {
            System.out.println("El total a pagar es: "+compra);
        }
    }
    
}
