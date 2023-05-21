public class Array2d {
    
    public void usoArray2d() {

        /*
         *  Array 2d
         * 
         *  Sono array di array
         */

        //Si può dichiarare un array 2d in due modi
        //Primo modo: due coppie di parentesi, una per l'array più esterno e un'altra per quello interno
        String[][] classi = new String[3][3];    //un array di tre array, ognuno dei quali ha tre elementi
        
        classi[0][0] = "Luca";                   //nella prima parentesi va l'indice dell'array esterno 
        classi[0][1] = "Mario";                  //nella seconda parentesi va l'indice dell'array interno
        classi[0][2] = "Pippo";

        classi[1][0] = "Anna";
        classi[1][1] = "Marco";
        classi[1][2] = "Fede";

        classi[2][0] = "Laura";
        classi[2][1] = "Paolo";
        classi[2][2] = "Andrea";

        System.out.println(classi[0][1]);       //stampa

        /*
         * Stampiamo le classi con gli studenti come se fosse una tabella del genere:
         *
         *                 |  colonna(studente) 0  |  colonna(studente) 1  |  colonna(studente) 2
         * -------------------------------------------------------------------------------------------------
         * riga(classe) 0  |         Luca          |        Mario          |         Pippo
         * riga(classe) 1  |         Anna          |        Marco          |         Fede
         * riga(classe) 2  |         Laura         |        Paolo          |         Andrea
         * 
         */

        for(int classe = 0; classe < classi.length; classe++) {
            System.out.println();
            for(int studente = 0; studente < classi[classe].length; studente++) {
                System.out.print(classi[classe][studente] + "  ");
            }
        }

        //Secondo modo: inserendo direttamente i valori
        String[][] classi2 = {
            {"Luca", "Mario", "Pippo"},
            {"Anna", "Marco", "Fede"},
            {"Laura", "Paolo", "Andrea"},
        };
        
        //stampiamo ma questa volta con un for each
        for(String[] classe: classi2) {
            System.out.println();
            for(String studente: classe){
                System.out.print(studente + "  ");
            }
        }

    }

}
