package pila;

public class PilaChar {

    private char[] datos;
    private int tope;
    private int tam;

    public PilaChar(int i) {
        this.tam = i;
        this.datos = new char[tam];
        this.tope = -1;
    }

    public boolean push(char ingreso) {
        if (!pilaLlena()) {
            tope++;
            datos[tope] = ingreso;
            return true;
        } else {
            return false;
        }
    }

    public char pop() {
        if (!pilaVacia()) {
            tope--;
            return datos[tope + 1];
        } else {
            return '\0';
        }
    }

    public boolean pilaVacia() {
        return this.tope == -1;
    }

    public boolean pilaLlena() {
        return this.tam - 1 == this.tope;
    }

    public char verTope() {
        if (!pilaVacia()) {
            return datos[tope];
        } else {
            return '\0';
        }
    }

    public int getTope() {
        return tope;
    }

    
     public void mostrarPila() {
        Pila paux = new Pila(tam);
        while (!pilaVacia()) {
            System.out.print(verTope()+" ");
            paux.push(this.pop());
        }
        System.out.println("");
        while (!paux.pilaVacia()) {            
            push((char) paux.pop());
        }
    }

    
    public void invertirSimple(){
        Pila PilaAux1 = new Pila(tam);
        Pila PilaAux2 = new Pila(tam);
        
        while(!pilaVacia()){
            PilaAux1.push(pop());
        }
        
        while(!PilaAux1.pilaVacia()){
            PilaAux2.push(PilaAux1.pop());
        }
        
        while(!PilaAux2.pilaVacia()){
            push((char) PilaAux2.pop());
        }
        
        mostrarPila();
    }
    
    
}
    

