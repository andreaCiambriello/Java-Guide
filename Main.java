import OOP.Persona;

public class Main {
    public static void main (String[] args) {

        //OOP: Object Oriented Programing
        /*
         * La programmazione ad oggetti è un approccio alla programmazione che segue la logica di astrarre tutto in modelli, oggetti.
         * Secondo questo logica bisogna suddividere tutto in oggetti, andiamo a ricreare delle entità, come se fossero oggetti della vita
         * reale, con delle caratteristiche, uno stato e delle azioni
         */

        /*
         * Per creare un oggetto di tipo persona bisogna dichiarare e istanziare come facevamo per i primitivi, o meglio per la reference
         * String. Osservando la scrittura sotto, a sinistra abbiamo la reference Persona seguita dal nome dell'oggetto, come facevamo per
         * String o per i primitivi. A destra invece abbiamo la keyword new seguita di nuovo da Persona, con questa scrittura stiamo
         * chiamando il costruttore, ovvero il metodo che crea l'oggetto, lo stampino. Qui il costruttore è quello di default noArgs
         */
        Persona persona = new Persona();

        System.out.println(persona.nome);      //posso accedere al valore perchè public

        persona.saluta();                      //posso accedere al metodo perchè public
        
    }
}