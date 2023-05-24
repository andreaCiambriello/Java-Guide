package OOP;

/*
 * OOP: Object Oriented Programing    
 * La programmazione ad oggetti è un approccio alla programmazione che segue la logica di astrarre tutto in modelli, oggetti.
 * Secondo questo logica bisogna suddividere tutto in oggetti, andiamo a ricreare delle entità, come se fossero oggetti della vita
 * reale, con delle caratteristiche, uno stato e delle azioni
 *        
 *  In questo esempio creiamo la classe Persona, che crea oggetti di tipo Persona, ovvero trasportiamo delle persone reali come oggetti.
 *  Questa classe però crea sempre lo stesso oggetto in quanto i campi sono fissi e non si usa un costruttore.
 */

public class Persona {
    
    // campi della classe: rappresentano le caratteristiche, lo stato di un oggetto creato a partire da questa classe
    // in questo caso sono gia valorizzati, la classe ha dei campi con valori gia impostati. La keyword public rende un campo accessibile 
    //dall'esterno a tutti le altre classi
    public String nome = "Luca";
    public String cognome = "Rossi";
    public int eta = 25;
    public String colorePreferito = "Blu";


    // metodi della classe: sono le azioni compiute dalla classe. La keyword public rende un metodo accessibile dall'esterno a tutti le altre
    // classi
    public void saluta() {
        System.out.println("Ciao sono " + nome);
    }

    public void cammina() {
        System.out.println("Sto camminando...");
    }

}
