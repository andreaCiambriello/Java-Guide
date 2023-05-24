package Input;
import java.util.Scanner;

public class Input {
    
    /*
     *      Prendere valori in input
     */

    public void getInput() {                            //uso un metodo altrimenti non mi fa compilare la classe, poi li spiego
        Scanner scanner = new Scanner(System.in);       //creo un istanza Scanner, con la reference Scanner

        System.out.println("Quale è il tuo nome?");
        String name = scanner.nextLine();               //utilizzo l'istanza e un suo metodo che prende il valore stringa e fa una nuova riga

        System.out.println("Quanti anni hai?");
        int age = scanner.nextInt();                    //utilizzo l'istanza e un suo metodo che prende il valore int non fa una nuova riga
        scanner.nextLine();

        System.out.println("Dove vivi?");             //utilizzo l'istanza e un suo metodo che prende il valore stringa e fa una nuova riga
        String city = scanner.nextLine();
        System.out.println("Ciao " + name + ", hai " + age + ", vivi a " + city);

    }
    
}
