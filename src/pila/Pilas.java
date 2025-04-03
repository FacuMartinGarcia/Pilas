
package pila;

import javax.swing.JOptionPane;

public class Pilas {


    public static void main(String[] args) {


//        p1.push(1);
//        p1.push(2);
//        p1.push(3);
//        p1.push(4);
//        p1.mostrarPila();
//                
//        for (int i = 0; i < 4; i++) {
//            p2.push(p1.verTope());
//            p1.pop();
//        }

        /*
        Pilas ordenadas
        Se desea tener una pila con sus elementos siempre ordenados, de menor a
        mayor. Para hacerlo antes de colocar un elemento debe verificar que cumple
        esta condición, en caso que no la cumpla tiene que mover elementos a otra
        pila hasta encontrar la posición correcta y volver a colocar los elementos
        retirados, solo puede usar una pila auxiliar.
        */
        
        Pila p1 = new Pila(5);
        Pila p2 = new Pila(5); 

        int ultimo=0; 
        int ultimoMayores=0;
        
        while (true) {

            String numero = JOptionPane.showInputDialog(null, "Ingrese un número (e):");
            
            
            if (numero == null || numero.equalsIgnoreCase("e")) {
                break;
           
            }
            
            int num = Integer.parseInt(numero); 

            //si es menor que el ultimo de la pila

            for (int i = p1.verTope; i = 0; i--) {
                
            }


            
            if (num>ultimo) {
                p1.push(num); 
            }else{
                
                
                
                //si es mayor que el utlimo de la pila, pero menor al ultimo de los mayores
                if (num>ultimoMayores){
                    p1.push(ultimoMayores);
                    p2.pop();
                }else{    
                    p2.push(num);
                }        
            }

        ultimo = p1.verTope();
        if (p2.getTope() != -1){
            ultimoMayores = p2.getTope();
        }
        System.out.println("Ultimo " + ultimo);
        System.out.println("Ultimo mayores" + ultimoMayores);


                
        }
        
        p1.mostrarPila();
        //p2.mostrarPila();

    }
    
    
}
