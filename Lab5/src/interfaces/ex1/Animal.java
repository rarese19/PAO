package interfaces.ex1;

public interface Animal {

    int noOfLegs = 4; //Constanta, este public static, camel case

    String getName(); //Este public(implicit) abstract, metodele abstracre se termina in ;, nu au body

    void eat(); //Este public abstract

    default void printNoOfLegs() {
        System.out.println("I have " + noOfLegs + " legs");
    } //Este doar public, nu trb neaparat implementata

    static void makeNoise() {
        System.out.println("I can make noises!");
    } // Metode default


}
