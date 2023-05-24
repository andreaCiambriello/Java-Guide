import OOP.PersonaV1;

public class Main {
    public static void main (String[] args) {

        /*
         * Per creare un oggetto di tipo persona bisogna dichiarare e istanziare come facevamo per i primitivi, o meglio per la reference
         * String. Osservando la scrittura sotto, a sinistra abbiamo la reference Persona seguita dal nome dell'oggetto, come facevamo per
         * String o per i primitivi. A destra invece abbiamo la keyword new seguita di nuovo da Persona, con questa scrittura stiamo
         * chiamando il costruttore, ovvero il metodo che crea l'oggetto, lo stampino. Qui il costruttore è quello di default noArgs
         */
        
        PersonaV1 andrea = new PersonaV1("Andrea", "Ciambriello", 22, "red");
        PersonaV1 luca = new PersonaV1("Luca", "Rossi", 27, "blu");

        System.out.println(andrea.nome);      //posso accedere al valore perchè public
        System.out.println(luca.cognome);

        andrea.saluta();                      //posso accedere al metodo perchè public
        luca.saluta();;
    }
}