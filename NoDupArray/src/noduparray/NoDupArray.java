package noduparray;

public class NoDupArray {
    private long[] a;//ref to array a
    private int nEliments;//number of data items
    
    public NoDupArray(int max) {//constructor
        this.a = new long[max];
        this.nEliments = 0;
    }
    public boolean find(long SearchKey) {//find specified value
        for (int i = 0; i < this.nEliments; i++) {
            if (a[i] == SearchKey) {
                return true;
            }
        }
        return false;
    }
    
    public void insert(long value) {//put element into array
        if (a.length == this.nEliments) {
            System.out.println("The array is full. Insertion terminated.");
            return;
        }
        if (find(value)) {
            System.out.println("Value duplicated. Insertion terminated.");
            return;
        }
        this.a[this.nEliments] = value;
        this.nEliments++;
        System.out.println("Value Inserted.");
    }
    
    public boolean delete(long value) {//delete the element if it found
        if (this.nEliments == 0) {
            System.out.println("Array is empty. Nothig to delete...");
            return false;
        }
        if (find(value)) {
           for (int i = 0; i < this.nEliments; i++) {
               if (a[i] == value) {
                   for (int j = i; j < this.nEliments - 1; j++) {
                       a[j] = a[j+1];
                   }
                   this.nEliments--;
                   System.out.println("Value Deleted.");
                   return true;
               }
           }
        }
        System.out.println("Value not found for deletion.");
        return false;
    }
    
    public void display() {//display array contents
        for (int i = 0; i < this.nEliments; i++) {
            System.out.print(this.a[i] + " ");
        }
        System.out.println();
    } 
    
}
