
package pila;

import javax.swing.JOptionPane;

public class Pilas {


    public static void main(String[] args) {
        
        
        PilaChar pila = new PilaChar(5);

        String cadena = JOptionPane.showInputDialog(null, "Ingrese una cadena (e para terminar):");
        
        if (cadena == null || cadena.isEmpty()) {
            System.out.println("No se ingresó ninguna cadena.");
            return;
        }
        
         for (int i = 0; i < cadena.length(); i++) { //Aqui vamos recorriendo la cadena caracter por caracter
            char caracter = cadena.charAt(i);

            if (caracter == '(' || caracter == '{' || caracter == '[' || caracter == '<') { //solo nos interesan los parentesis, si encontramos uno de apertura lo guardamos en una pila
                pila.push(caracter);
            } else if (caracter == ')' || caracter == '}' || caracter == ']' || caracter == '>') { //si es uno de cierre debemos verificar si la pila tiene un parentesis de apertura para poder compararlo
                if (pila.pilaVacia()) { //Si la pila se encuentra vacia significa que no hay un caracter de apertura previo, asi que se concluye que no está equilibrada
                    System.out.println("No está equilibrada");
                    return; //salimos del for
                }

                char tope = pila.verTope();  //Para poder comparar los caracteres
               
                if ((caracter == ')' && tope == '(') || (caracter == '}' && tope == '{') || (caracter == ']' && tope == '[') || (caracter == '>' && tope == '<')) { //si el parentesis de apertura que está en la pila(tope) coincide con el de cierre vaciamos la pila para la siguiente comparacion
                    pila.pop(); 
                } else {
                    System.out.println("No está equilibrada"); //sino significaria que no está equilibrada
                    return; 
                }
            }
        }

       
        if (pila.pilaVacia()) { // si llegamos al final del bucle y la pila está vacia significa que todas las comparaciones fueron coincidentes
            System.out.println("Está equilibrada");
        } else {
            System.out.println("No está equilibrada"); //caso contrario significa que no hubo coincidencia por lo cual no esta equilibreada
        }
        
        
        
        /*
        Unidos no mezclados Se tienen 2 pilas con elementos ordenados de mayor a
        menor, se desea pasar todos los elementos a una tercera pila en la que los
        elementos sigan manteniendo el orden de mayor a menor.
        */
//        Pila uno = new Pila(4);
//        uno.push(10);
//        uno.push(7);
//        uno.push(6);
//        uno.push(1);
//        Pila dos = new Pila(8); 
//        dos.push(12);
//        dos.push(10);
//        dos.push(9);
//        dos.push(8);
//        Pila tres = new Pila(4);
//     
//        System.out.println("Pila 1:");
//        uno.mostrarPila();
//        System.out.println("Pila 2:");
//        dos.mostrarPila();
//        System.out.println("Pila 3:");
//        tres.mostrarPila();
//        System.out.println("------------------");        
//
//        //primero paso toda la pila uno a pila tres
//        while (!uno.pilaVacia()){
//            tres.push(uno.verTope());
//            uno.pop();
//        }
//        System.out.println("Pila 1:");
//        uno.mostrarPila();
//        System.out.println("Pila 2:");
//        dos.mostrarPila();
//        System.out.println("Pila 3:");
//        tres.mostrarPila();
//        System.out.println("------------------");
//        //paso toda la pila dos, a pila uno
//        while (!dos.pilaVacia()){
//            uno.push(dos.verTope());
//            dos.pop();
//        }
//        System.out.println("Pila 1:");
//        uno.mostrarPila();
//        System.out.println("Pila 2:");
//        dos.mostrarPila();
//        System.out.println("Pila 3:");
//        tres.mostrarPila();
//        System.out.println("------------------");                
//        
//        while (!uno.pilaVacia() && !tres.pilaVacia()){
//            if (uno.verTope()>tres.verTope()){
//                dos.push(uno.verTope());
//                uno.pop();
//                System.out.println("Pila 1:");
//                uno.mostrarPila();
//                System.out.println("Pila 2:");
//                dos.mostrarPila();
//                System.out.println("Pila 3:");
//                tres.mostrarPila();
//                System.out.println("------------------");                
//                
//            } else if (uno.verTope() == tres.verTope()) {
//                dos.push(uno.verTope());  
//                uno.pop();
//                dos.push(tres.verTope());
//                tres.pop();
//                System.out.println("Pila 1:");
//                uno.mostrarPila();
//                System.out.println("Pila 2:");
//                dos.mostrarPila();
//                System.out.println("Pila 3:");
//                tres.mostrarPila();
//                System.out.println("------------------");                
//
//            } else {
//                dos.push(tres.verTope());
//                tres.pop();
//                System.out.println("Pila 1:");
//                uno.mostrarPila();
//                System.out.println("Pila 2:");
//                dos.mostrarPila();
//                System.out.println("Pila 3:");
//                tres.mostrarPila();
//                System.out.println("------------------");                
//
//            }
//        }
//        if (!uno.pilaVacia()){
//            while (!uno.pilaVacia()){
//                dos.push(uno.verTope());
//                uno.pop();
//            }
//        }else if (!tres.pilaVacia()){    
//            while (!tres.pilaVacia()){
//                dos.push(tres.verTope());
//                tres.pop();
//                System.out.println("Estoy");
//            }      
//        }
//
//        System.out.println("Pila 1:");
//        uno.mostrarPila();
//        System.out.println("Pila 2:");
//        dos.mostrarPila();
//        System.out.println("Pila 3:");
//        tres.mostrarPila();
//        System.out.println("------------------");   
        

//        while (!uno.pilaVacia()){
//        
//        }
        
        
        
        
        
        
        /*
        Pilas ordenadas
        Se desea tener una pila con sus elementos siempre ordenados, de menor a
        mayor. Para hacerlo antes de colocar un elemento debe verificar que cumple
        esta condición, en caso que no la cumpla tiene que mover elementos a otra
        pila hasta encontrar la posición correcta y volver a colocar los elementos
        retirados, solo puede usar una pila auxiliar.
        */
        
//        Pila principal = new Pila(5);
//        Pila secundaria = new Pila(5); 
//
//        int ultimoPrincipal=0; 
//        int ultimoSecundaria=0;
//        while (true) {
//            String numero = JOptionPane.showInputDialog(null, "Ingrese un número (e):");
//            if (numero == null || numero.equalsIgnoreCase("e")) {
//                break;
//            }
//            int num = Integer.parseInt(numero); 
//            //si es menor que el ultimo de la pila
//            if (num<ultimoPrincipal){
//                while (num<ultimoPrincipal){
//                    //tengo que empezar a sacar de la pila principal, los numeros que son mayores
//                    //al ingresdo, y colocarlos en la pila secundaria
//                    secundaria.push(principal.verTope());
//                    ultimoSecundaria = secundaria.verTope();
//                    principal.pop();
//                    ultimoPrincipal = principal.verTope();
//                    System.out.println("Estoy");
//                }   
//                principal.push(num);
//                while (!secundaria.pilaVacia()){
//                    //Vuelvo todos los elementos que lleve a la pila secundaria
//                    principal.push(secundaria.verTope());
//                    secundaria.pop();
//                    System.out.println("Entré a este while");
//                }   
//                ultimoPrincipal = principal.verTope();
//                ultimoSecundaria = secundaria.verTope();
//                principal.mostrarPila();
//                secundaria.mostrarPila();
//            }else{
//                principal.push(num);
//                ultimoPrincipal = principal.verTope();
//                principal.mostrarPila();
//                secundaria.mostrarPila();
//            }
//  
//        }
    }
}    

