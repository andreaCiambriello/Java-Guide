public class Metodi {
    /*
     *  I METODI
     *  
     */

    public void usoMetodi() {          //questo è un metodo, lo abbiamo usato fino a questo punto per portare le varie classi nel Main

    }

    /* 
     * I metodi altro non sono che funzioni, blocchi di codice riutilizzabile e che vengono richiamati quando ci servono
     * Di base si dichiarano indicando il tipo di ritorno, ovvero il risultato che esce dal metodo, oppure void, ovvero non restituiscono
     * niente, seguito dal nome del metodo e dalle parentesi in cui vanno gli eventuali parametri. Si possono anteporre anche altre keyword
     * che vedremo più avanti
     */ 

    void preparaPasta() {                     //questo metodo non restituisce nulla, ma stampa una stringa, non ha parametri
        System.out.println("Sto cucinando la pasta");
    }

    void preparaQualcosa(String cibo) {            //questo metodo non restituisce nulla, ma stampa una stringa, ha un parametro stringa
        System.out.println("Sto cucinando " + cibo);
    }
    
    static int addizione(int a, int b) {      //prende due int, essendo static appartiene alla classe e non ad una sua istanza
        int c = a + b;
        return c;                             //restituisce un int
    }

    /*
     * Questo metodo, prende il nome di Varargs che sta per Variable Arguments, ovvero non ha un numero fisso di parametri, ma ne prende
     * tanti quanti gliene vengono forniti, infatti la scrittura ... crea un riferimento ad un array che gestisce questi parametri.
     * In questo caso abbiamo un numero di parametri variabili di tipo int
     */
    static void moltiValori(int... a) {
        System.out.println("Questo metodo ha attualmente " + a.length + " parametri");
        System.out.println("Questi valori sono: ");
        for(int el: a) {
            System.out.println(el);
        }
    }

}