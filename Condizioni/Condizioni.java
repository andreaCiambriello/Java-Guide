package Condizioni;
public class Condizioni {
    
    public void condizioni(){

        boolean isOnline = true;
        String nome = "Luca";
        int x = 3;


        // if - else
        if(isOnline) {
            System.out.println("è online");
        }
         else {
            System.out.println("non è online");
        }

        // if - else if - else
        if(nome == "Luca") {
            System.out.println("è Luca");
        } else if(nome == "Pippo") {
            System.out.println("è Pippo");
        } else {
            System.out.println("non è ne Luca ne Pippo");
        }

        // if annidati
        if(x < 10) {
            System.out.println("è minore di 10");
            if(x % 2 == 0) {
                System.out.println("è pari");
            } else {
                System.out.println("è dispari");
            }
        } else {
            System.out.println("non è minore di 10");
        }

        // operatore ternario, un if - else compatto
        String saluto = 3 < 10 ? "ciao" : "buongiorno";
        System.out.println(saluto);


    }

}
