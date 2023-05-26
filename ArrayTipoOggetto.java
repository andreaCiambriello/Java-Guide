public class ArrayTipoOggetto {

    /*
     *      Array di tipo oggetto
     * 
     * Possiamo definire array oltre che di tipo primitivo, anche di tipo oggetto, o meglio reference di una classe
     */
    
    public void usoArrayDiTipoOggetto() {

        // definiamo un array di tipo PersonaV1 di tre elementi, come facevamo ad esempio per gli int: int[] numeri = new int[3]
        PersonaV1[] persone = new PersonaV1[3];

        // creiamo delle istanze della classe PersonaV1, degli oggetti di tipo PersonaV1
        PersonaV1 andrea = new PersonaV1("andrea", "ciambriello", 22, "red");
        PersonaV1 luca = new PersonaV1("luca", "rossi", 25, "green");
        PersonaV1 pippo = new PersonaV1("pippo", "baudo", 28, "blue");

        // inserisco gli oggetti nell'array
        persone[0] = andrea;
        persone[1] = luca;
        persone[2] = pippo;

        // stampiamo l'oggetto alla posizione 0 dell'array grazie al metodo toString della classe PersonaV1
        System.out.println(persone[0]);

        // anche per gli array di tipo oggetto c'è la possibilità di definirli e riempirli direttamente
        PersonaV1[] persone2 = {andrea, luca, pippo};
    }

}
