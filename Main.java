public class Main {
    public static void main (String[] args) {

        /*  
         *       I TIPI DI DATO IN JAVA 
         *
         *       Si dividono in dati primitivi e reference
         */

        /* 
         *       I primitivi
         * 
         *       Sono forniti da Java, iniziano con minuscola e danno solo la possibilità di memorizzare i dati
        */

        /*       Booleani       */

        boolean isOn = true;      //true o false, occupa 1 bit

        /*       Numerici       */

        byte a = 3;               //tutti i numeri compresi tra -128 e 127, occupa 1 byte
        short b = 4;              //tutti i numeri tra -32768 e 32767, occupa 2 bytes
        int c = 10;               //tutti i numeri tra -2 miliardi e 2 miliardi, occupa 4 bytes
        long d = 20l;             //tutti i numeri tra -9 quintilioni e 9 quintilioni, occupa 8 bytes, vuole la l o L
        float e = 3.5f;           //tutti i numeri con massimo 6-7 decimali, occupa 4 bytes, vuole la f
        double f = 7.95;          //tutti i numeri con massimo 15 decimali, occupa 8 bytes

        /*       Carattere      */

        char g = 'c';             //singola lettera, caratteri ASCII, numero, occupa 2 bytes, vuole il singolo apice

        /*  
        *       Le reference 
        *       Le reference sono anche fornite da Java, come String, ma le possiamo creare noi, iniziano con maiuscola e hanno metodi e 
        *       attributi che danno la possibilità di fare operazioni più complesse
         */

        /*      Carattere       */

        /*      Anche se reference è quasi considerata al pari di un dato primitivo per il suo utilizzo massiccio */
        String stringa = "ciao";  //sequenza di caratteri
        System.out.println();

        Input input = new Input();
        input.getInput();

        ClasseMath classeMath = new ClasseMath();
        classeMath.usoMath();

        Condizioni condizioni = new Condizioni();
        condizioni.condizioni();
        
        Switch switcho =  new Switch();
        switcho.usoSwitch();

        Cicli cicli = new Cicli();
        cicli.usoCicli();
    }
}