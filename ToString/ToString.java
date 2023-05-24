package ToString;

import OOP.PersonaV1;

/*
 * toString
 * 
 * In Javascript bastava passare il nome dell'oggetto al console.log per stamparne i campi, in Java se passiamo il nome dell'oggetto al sout,
 * ci viene stampato il riferimento in memoria dell'oggetto.
 * Il metodo toString, fornito da Java, ci risolve questo problema e ci stampa i campi di un oggetto. Tuttavia questo metodo di default ci
 * stampa sempre il riferimento in memoria dell'oggetto, ovvero nome della classe seguito da una @ e da un codice esadecimale, ma siccome
 * è un metodo appartenente alla superclasse Object, che estende qualsiasi classe in Java, ogni classe lo ha e questo ci permette di fare
 * un override del metodo toString, ovvero riscriverne il funzionamento per un nostro bisogno.
 * Vedremo più avanti che come funzionano le superclassi e come si eredita da queste, mentre per l'override per adesso basta sapere che
 * funziona un po' come l'overload ma con delle differenze. In particolare, tramite l'override di un metodo in una sottoclasse possiamo
 * implementare un metodo che è gia definito in una superclasse, quindi ereditarlo senza cambiare nome e signature ma solo implementando un
 * comportamento diverso.
 * Il toString qui lo chiamo nella classe, per salvarlo in un codice diverso dal Main.
 */

public class ToString {
    
    public void usoToString() {
        PersonaV1 andrea = new PersonaV1("andrea", "ciambriello", 22, "red");

        /*
         * Posso chiamare il toString dall'istanza, concatenando il metodo
         * 
            System.out.println(andrea.toString());
         *  
         * Ma funziona anche solo passando il nome dell'oggetto, infatti in questo modo viene richiamato automaticamente
        */ 
        System.out.println(andrea);
        


    }
   


}
