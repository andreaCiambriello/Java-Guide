public class Main {
    public static void main (String[] args) {

        //Overloads dei metodi: stesso nome, signature diverse

        int risultatoIntInt = Overloads.addizione(3, 5);                   //addizione tra due int
        double risultatoDoubleDouble = Overloads.addizione(3.4, 5.5);      //addizione tra due double
        int risultatoIntIntInt = Overloads.addizione(3, 5, 7);           //addizione tra tre int
        double risultatoIntDouble = Overloads.addizione(3, 5.5);           //addizione tra un int e un double
       
        System.out.println(risultatoIntInt);
        System.out.println(risultatoDoubleDouble);
        System.out.println(risultatoIntIntInt);
        System.out.println(risultatoIntDouble);
    }
}