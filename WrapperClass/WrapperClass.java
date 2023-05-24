package WrapperClass;
public class WrapperClass {
    
    /*
     * Wrapper Class
     * 
     * Le wrapper class ci permettono di utilizzare i tipi primitivi come reference e quindi ci offrono la possibilità di chiamare metodi
     * con i tipi primitivi, sono più lente rispetto ai primitivi base.
     * Nella pratica sono scritte e si comportano diversamente, sono reference con metodi, ma vengono trattate da java come se fossero dati 
     * primitivi impacchettati in reference e il valore ultimo viene spacchettato restituendoci un dato primitivo.
     * Queste sono:
     * boolean --> Boolean
     * char --> Character
     * int --> Integer
     * double --> Double
     */

    public void usoWrapperClass() {
        
        //primitivi con le relative wrapper class
        boolean veroPrimitivo = true;
        Boolean veroReference = true;

        char caratterePrimitivo = 'a';
        Character carattereReference = 'a';

        int interoPrimitivo = 3;
        Integer interoReference = 3;

        double doublePrimitivo = 2.5;
        Double doubleReference = 2.5;

        //verifichiamo che siano lo stesso tipo di dato anche se uno primitivo e l'altro reference
        if(veroPrimitivo == veroReference) {
            System.out.println("boolean è lo stesso tipo di Boolean");
        }

        if(caratterePrimitivo == carattereReference) {
            System.out.println("char è lo stesso tipo di Character");
        }

        if(interoPrimitivo == interoReference) {
            System.out.println("int è lo stesso tipo di Integer");
        }

        if(doublePrimitivo == doubleReference) {
            System.out.println("double è lo stesso tipo di Double");
        }

        //applico lo stesso metodo ad un reference Character e gli passo prima un primitivo e poi una reference
        Character risultato = carattereReference.toUpperCase(caratterePrimitivo);   //gli passo un char
        Character risultato1 = carattereReference.toUpperCase(carattereReference);  //gli passo un Character
        System.out.println(risultato);                                              //da a char diventa A char
        System.out.println(risultato1);                                             //da a Character diventa A Character

    }
}
