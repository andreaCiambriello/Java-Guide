package Stringhe;
public class Stringhe {
    
    /*
     *  Metodi classe String
     */

    public void usoStringhe() {

        //Come detto nel file dei tipi di dati, le stringhe non sono tipi di dati primitivi ma sono tipi reference, la grande differenza tra
        //dati primitivi e reference è la possibilità di usare dei metodi con questi ultimi

        String nome = "Leonardo";

        //equals: confronta due stringhe, se sono uguali ci restituisce vero o falso, è case sensitive
        boolean risultatoEquals = nome.equals("Leonardo");
        System.out.println(risultatoEquals);                                    //true

        //equalsIgnoreCase: come equals ma case insensitive, minuscole e maiuscole non fanno differenza
        risultatoEquals = nome.equalsIgnoreCase("leoNardo");
        System.out.println(risultatoEquals);                                    //true

        //length: conta i caratteri di una stringa, restituisce un int
        int risultatoLength = nome.length();
        System.out.println(risultatoLength);                                   //8

        //charAt: ci dice che carattere si trova in una specifica posizione, restituisce un char, inizia a contare da 0 come gli array
        char risultatoCharAt = nome.charAt(7);
        System.out.println(risultatoCharAt);                                   //o

        //indexOf: ci dice in quale indice si trova uno specifico carattere, resituisce un int, inizia a contare da 0 come gli array.
        //N.B.: se il carattere ricercato è presente due volte, ci restituisce solo la prima occorrenza
        int risultatoIndexOf = nome.indexOf("a");
        System.out.println(risultatoIndexOf);                                  //4

        //isEmpty: ci dice se una stringa è vuota, restituisce un booleano
        boolean risultatoIsEmpty = nome.isEmpty();
        System.out.println(risultatoIsEmpty);                                  //false

        //toUpperCase: trasforma i caratteri di una stringa in maiuscolo, ci restituisce una stringa
        String risultatoToUpperCase = nome.toUpperCase();
        System.out.println(risultatoToUpperCase);                              //LEONARDO

        //toLowerCase: trasforma i caratteri di una stringa in minuscolo, ci restituisce una stringa
        String risultatoToLowerCase = nome.toLowerCase();
        System.out.println(risultatoToLowerCase);                              //leonardo

        //replace: sostituisce in una stringa uno o piu caratteri a seconda delle occorrenze con altri caratteri indicati da noi, i
        //caratteri sono char quindi in apice singolo, ci restituisce una stringa
        String risultatoReplace = nome.replace('o', 'w');
        System.out.println(risultatoReplace);                                  //Lewnardw
        
        //trim: ci toglie gli spazi vuoti davanti e dietro una stringa, ci restiruisce una stringa
        nome = "  Leonardo  ";
        String risultatoTrim = nome.trim();
        System.out.println(risultatoTrim);                                     //Leonardo
    }

}
