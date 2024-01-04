// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        KidUser k1 = new KidUser();
        k1.age = 10;
        k1.bookType = "Kids";
        k1.registerAccount();

        KidUser k2 = new KidUser();
        k2.age = 18;
        k2.bookType = "Fiction";
        k2.registerAccount();


        AdultUser A1 = new AdultUser();
        A1.age = 3;
        A1.bookType = "Kids";
        A1.registerAccount();

        AdultUser A2 = new AdultUser();
        A2.age = 23;
        A2.bookType = "Fiction";
        A2.registerAccount();

    }
}