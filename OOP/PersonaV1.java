package OOP;

    /*
     * In questo esempio vediamo come usare il costruttore per istanziare oggetti diversi di tipo PersonaV1, e non oggetti fissi come in
     * Persona. Di default qualsiasi classe ha un costruttore implicito noArgs, inoltre essendo un metodo si può fare l'overload e quindi
     * possiamo avere più costruttori nella stessa classe e in fase di creazione di un oggetto, in base ai parametri che passiamo al
     * costruttore, Java saprà quale utilizzare per creare l'oggetto
     */

    public class PersonaV1 {

        // campi della classe: li definiamo ma non li valorizziamo in questa fase
        public String nome;
        public String cognome;
        public int eta;
        public String colorePreferito;

        /*
         * Dichiaro un metodo costruttore fullArgs, ovvero con i parametri pari ai campi della classe.
         * Al metodo costruttore diamo dei parametri, che altro non sono che variabili, che passiamo al costruttore in fase di dichiarazione
         * dell'oggetto, il costruttore prende i riferimenti delle variabili e li assegna ai campi della classe, valorizzando cosi l'oggetto.
         * 
         * N.B. i nomi dei parametri non devono essere per forza uguali ai nomi dei campi, ma è buona norma usare gli stessi nomi a patto che
         * non si creino ambiguità.
         * Vediamo qui un esempio:
         * come primo inserimento ho il parametro firstname, il cui riferimento va inserito nel campo nome della classe, siccome hanno nomi
         * diversi non si creano ambiguità, firstname è il parametro che passo al metodo e nome è il campo.
         * Invece per gli altri inserimento utilizzo lo stesso nome sia per il parametro che per il campo, tramite l'utilizzo della keyword
         * this, la quale crea un riferimento all'oggetto che stiamo creando, si lega all'oggetto ed è come se dicesse "questo campo 
         * dell'oggetto prende il valore del parametro", infatti this altro non contiene che il riferimento in memoria dell'oggetto. Quindi
         * quando andiamo a creare istanze diverse della stessa classe, ogni istanza ha il suo this, che contiene il suo riferimento.
         * In altre parole diciamo "campo della classe di questo oggetto = parametro"
         */
        public PersonaV1(String firstname, String cognome, int eta, String colorePreferito) {
            nome = firstname;
            this.cognome = cognome;
            this.eta = eta;
            this.colorePreferito = colorePreferito;
        }

        public void saluta() {
            System.out.println("Ciao sono " + nome);
        }

        public void cammina() {
            System.out.println("Sto camminando...");
        }

        // faccio un override del metodo toString implementato dalla superclasse Object, l'annotazione @Override si può omettere
        public String toString() {
            String str = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colorePreferito;
            return str;
        }
}
