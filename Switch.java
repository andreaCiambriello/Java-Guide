public class Switch {
    
    /*
     * Lo Switch permette l'esecuzione di codice se soddisfatta una particolare caso, funziona come un if, è un altrernativa all'if
     * per scrivere più condizioni in modo più sintetico e compatto
     */

    public void usoSwitch() {

        String nome = "Luca";

        switch(nome) {
            case "Luca":
                System.out.println("Ciao " + nome);
                break;
            case "Pippo":
                System.out.println("Ciao " + nome);
                break;
            case "Anna":
                System.out.println("Ciao " + nome);
                break;
            default:
                System.out.println("Non ti conosco");
        }

    }

}
