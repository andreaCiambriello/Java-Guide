package Cicli;
public class Cicli {
    
    /*
     * I cicli permettono di ripetere più volte del codice
     * Si dividono in: while - do while - for
     */

    public void usoCicli() {

        /*
         * ciclo while, si inizializza un contatore fuori da ciclo, si pone la condizione soddisfatta la quale si esegue il blocco di codice,
         * si incrementa il contatore
         */
        int i = 0;
        while(i < 5) {
            System.out.println(i);
            i++;
        }

        /*
         * ciclo do while, si esegue il blocco di codice, si incrementa il contatore, si verifica la condizione soddisfatta la quale si
         * esegue di nuovo il blocco di codice. Ovviamente il primo passo è sempre l'inizializzazione del contatore, qui usiamo quello sopra,
         * la particolarità di questo ciclo è che viene eseguito almeno uno volta perchè la condizione viene verificata dopo
         */
        do {
            System.out.println(i);
            i++;
        } while(i <5);

        /*
         * ciclo for, si inizializza un contatore, si pone la condizione soddisfatta la quale si esegue il blocco di codice, si incrementa
         * il contatore. In pratica è un ciclo while ma compatto, senza le parti sparse ovunque ma posizionate tra parentesi, tuttavia il
         * while si può anche usare per altri tipi di condizioni più generiche di ripetizioni base
         */
        for(i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //for annidati, utili per le matrici e gli array 2d
        for(int a = 0; a < 5; a++) {
            System.out.println("riga " + a);
            for(int b = 0; b < 5; b++) {
                System.out.println("colonna " + b);
            }
        }

        /* 
         * for each, anche se non è proprio collegabile ad un for, ma è un Iterator(poi vedremo), funziona allo stesso modo, itera l'array
         * creando provvisoriamente variabili che prendeno il valore dell'elemento corrente(numero), si usa con gli array
         */
        int[] numeri = {10, 20, 30, 40, 50};
        for(int numero: numeri) {
            System.out.println(numero);
        }

        /*
         * La keyword break viene usata quando si vuole bloccare in un punto specifico il ciclo, si chiama salto incondizionato, perchè 
         * appunto non prevede condizione, in questo caso j arriva a 4, si entra nell'if e il ciclo viene interrotto prima che sia la sua
         * condizione a farlo fermare
         */
        for(int j = 0; j < 5; j++) {
            if(j == 4) {
                break;
            }
            System.out.println(j);
        }

        /*
         * La keyword continue viene usata quando si vuole saltare in un punto specifico il ciclo, in modo tale da saltare e passare ad una
         * iterazione successiva del ciclo in modo condizionato, in questo caso k arriva a 4, si entra nell'if e il ciclo salta l'iterazione
         * di k = 4 e passa direttamente all'iterazione di k = 5 
         */
        for(int k = 0; k < 5; k++){
            if(k == 4) {
                continue;
            }
            System.out.println(k);
        }

    }

}
