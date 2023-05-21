import java.util.ArrayList;

public class ArrayListe {
    
    /*
     * ArrayList
     * 
     * Gli ArrayList sono ridimensionabili, aggiungere e rimuovere elementi e accettano solo reference, che vanno messe tra <> alla destra
     * dell'uguale, a sinistra dopo la chiamata del costruttore non è obbligatorio
     */

    public void usoArrayListe() {

        ArrayList<String> persone = new ArrayList<String>();    //posso omettere <String> o <> a sinistra, lo metto per evitare il warning

        //per inserire un valore va chiamato il metodo add e passato il valore
        persone.add("Luca");
        persone.add("Marco");
        persone.add("Anna");

        //per stampare un valore va chiamato il metodo get e passato l'indice
        System.out.println(persone.get(0));

        //per ottenere la lunghezza dell'arralist va chiamato il metodo size
        for(int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));                 //stampo ogni indice dell'arraylist
        }

        //per modificare un valore va chiamato il metodo set, a cui passo l'indice dell'elemento che voglio modificare e il nuovo valore
        persone.set(0, "Pippo");

        //per rimuovere un valore va chiamato il metodo remove, a cui passo l'indice dell'elemento che voglio rimuovere
        persone.remove(0);

        //per pulire tutto l'arraylist va chiamato il metodo clear
        persone.clear();

        //Come scritto sopra posso passare solo reference
        //ArrayList<int> interi = new ArrayList<int>();       questo mi da errore
        ArrayList<Integer> interi = new ArrayList<Integer>();

        interi.add(1);

        //ArrayList 2d: come per gli array normali, sono ArrayList di ArrayList

        //dichiaro l'ArrayList di ArrayList di stringhe passandogli le reference
        ArrayList<ArrayList<String>> classi = new ArrayList<ArrayList<String>>();

        //dichiaro e aggiungo elementi ai due ArrayList che saranno elementi dell'ArrayList di ArrayList
        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("Luca");
        classe1.add("Marco");

        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("Anna");
        classe2.add("Pippo");

        //aggiungo i due ArrayList all'ArrayList esterno
        classi.add(classe1);
        classi.add(classe2);

        //ciclo per la lunghezza(size) dell'ArrayList esterno, e quindi entro nell'ArrayList
        for(int i = 0; i < classi.size(); i++) {
            System.out.println();
            //ciclo gli ArrayList interni prendone l'indice col get e poi la lunghezza di ognuno
            for(int j = 0; j < classi.get(i).size(); j++) {
                //stampo gli elementi prendendo l'indice degli ArrayList e poi l'indice degli elementi dell'ArrayList
                System.out.println(classi.get(i).get(j) + "  ");
            }
        }
    }

}
