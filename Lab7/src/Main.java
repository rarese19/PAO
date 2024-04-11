public class Main {
    public static void functie() {
        functie();
    }

    public static void main(String[] args) {
        while (true) {
            functie();
        }
    }
}