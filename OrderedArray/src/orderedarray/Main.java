package orderedarray;

public class Main {
    public static void main(String[] args) {
        OrderedArray oa = new OrderedArray(6);
        oa.insert((long) 45.45);
        oa.insert((long) 56.6);
        oa.insert((long) 56.6);
        oa.insert((long) 10.45);
        oa.insert(100);
        oa.insert(2000);
        oa.insert(2000);
        oa.display();
        oa.delete((long) 45);
        oa.display();
        oa.delete((long) 56);
        oa.display();
        oa.delete((long) 2000);
        oa.display();
        oa.insert(44);
        oa.display();
        System.out.println("2000 can be found in the location : " + oa.find(100));
    }
}
