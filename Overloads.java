public class Overloads {
    
    /*
     *  OVERLOAD DEI METODI
     */

    /*
     * In Java è possibile scrivere più metodi con lo stesso nome, ma che hanno delle piccole differenze di signature, parametri di tipo 
     * diverso o numero diverso di parametri. In questo modo i metodi anche se hanno lo stesso nome, non sono lo stesso metodo e lavorano
     * con i dati in modi del tutto indipendenti tra di loro, questo ci consente, in modo fittizzio, di avere più versioni di un metodo, da
     * utilizzare a seconda delle diverse necessità
     */

    static int addizione(int a, int b) {             //stesso nome, 2 parametri, tipo int
        int risultato = a + b;
        return risultato;
    }

    static int addizione(int a, int b, int c) {      //stesso nome, 3 parametri, tipo int
        int risultato = a + b + c;
        return risultato;
    }

    static double addizione(double a, double b) {    //stesso nome, 2 parametri, tipo double
        double risultato = a + b;
        return risultato;
    }

    static double addizione(int a, double b) {    //stesso nome, 2 parametri, tipo int e tipo double
        double risultato = a + b;
        return risultato;
    }

}
