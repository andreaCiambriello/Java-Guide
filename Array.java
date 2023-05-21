public class Array {
        /*
         *      Array
         */
    public void usoArray(){

        //Possiamo dichiarare un array in diversi modi

        //Primo modo: indicando una dimensione fissa all'array
        int[] numeri = new int[3];                       //dichiaro un array di 3 elementi
        
        numeri[0] = 10;                                  //inizializzo i valori dell'array indicando gli indici
        numeri[1] = 20;
        numeri[2] = 30;

        System.out.println(numeri[0]);                   //stampo il valore dell'array alla posizione 0

        //Secondo modo: inizializzando l'array gia con in valori
        int[] numeri2 = {10, 20, 30};

        //per sapere lunghezza dell'array, quanti elementi ci sono, da non confondere con gli indici
        System.out.println(numeri.length);             //3, mentre l'indice maggiore sarà 2, (0, 1, 2)

        //esempio, vogliamo stampare il valore nell'ultimo indice
        //System.out.println(numeri[numeri.length]);     questo ci darà errore, perchè l'array non ha l'indice 3(lunghezza) ma arriva a 2 
        System.out.println(numeri[numeri.length-1]);     //questo ci darà il valore nell'ultimo indice
    
        //iteriamo lungo l'array: una volta per riempirlo e una volta per stampare

        int[] numeri3 = new int[4];                       //creo un array di interi vuoto di 4 elementi
        for(int i = 0; i < numeri3.length-1; i++) {
            numeri3[i] = i + 2;                           //lo riempo col ciclo for, pos[0] = 2, pos[1] = 3, pos[2] = 4, pos[3] = 5
        }
        for(int i = 0; i < numeri3.length-1; i++) {
            System.out.println(numeri[i]);                //leggo i valori nei diversi indici ciclando tramite un for
        }

        //la stessa cosa si fa con for each
        for(int numero : numeri) {                       //prendo ogni valore(numero) dell'array(numeri)
            System.out.println(numero);                  // e lo stampo
        }

        //in questi esempi abbiamo usato array di tipo int, ovviamente si possono dichiarare anche si altri tipi
    }

}
