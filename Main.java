public class Main {
    public static void main (String[] args) {

        Metodi usoDeiMetodi = new Metodi();

        //stiamo richiamando il metodo faiPasta, in questo caso abbiamo bisogno di una istanza della classe perchè il metodo è definito li
        usoDeiMetodi.preparaPasta();
        //richiamo un altro metodo come sopra e gli passo un valore come parametro
        usoDeiMetodi.preparaQualcosa("pizza");
        //richiamo un altro metodo che prende due int come parametri. La particolarità di questo metodo è che per essere chiamato non ha
        //bisogno di una istanza della classe, ma richiamiamo la classe stessa, per via della keyword static
        Metodi.addizione(2, 3); 

        Metodi.moltiValori(3, 4, 6, 7, 9, 15);    //essendo un varargs, gli posso passare quanti valori preferisco
    }
}