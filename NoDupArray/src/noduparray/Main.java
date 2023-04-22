package noduparray;

public class Main {
    public static void main(String[] args) {
        NoDupArray nda = new NoDupArray(5);
        nda.insert((long) 50);
        nda.insert((long) 4.45);
        nda.insert((long) 45.5);
        nda.insert((long) 4.67);
        nda.insert((long) 34.4);
        nda.insert((long) 1.234);
        nda.insert((long) 2.23);
        System.out.println(nda.delete((long) 50));
        nda.display();
    }
}
