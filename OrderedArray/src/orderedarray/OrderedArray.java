package orderedarray;

public class OrderedArray {
    private long[] a; // ref to array a
    private int nElements; //number of data items
    
    public OrderedArray(int max) {
        this.a = new long[max];
        this.nElements = 0;
    }
    
    public int size() { // return max size of the array
        return this.a.length;
    }
    
    public int find(long searchKey) {
        if (this.nElements == this.a.length) {
            System.out.println("Array is empty.");
            return -1;
        }
        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] == searchKey) {
                return i;
            }
        }
        System.out.println("Value is not in the array.");
        return -1;
    }
    
    public void insert(long value) { // put element into arrray
        // handle is the ordered array is full
        if (this.nElements == this.size()) {
            System.out.println("Array is full.");
            return;
        }
        // if the array is not full
        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] > value) {
                for (int j = this.nElements; j > i; j--) {
                    this.a[j] = this.a[j-1];
                }
                this.a[i] = value;
                this.nElements++;
                System.out.println("Value inserted...");
                return;
            }
        }
        // To add the value to the end of the array
        this.a[this.nElements] = value;
        this.nElements++;
        System.out.println("Value inserted to the end"); 
    }
    
    // have new conseptes than noDup array ==> must
    public boolean delete(long value) {
        // if array is empty
        if (this.nElements == 0) {
            System.out.println("Array is empty. Nothing to delete...");
            return false;
        }
        boolean status = false;
        for (int i = 0; i < this.nElements; i++) {
            if (this.a[i] == value) {
                for (int j = i; j < this.nElements - 1; j++) {
                    this.a[j] = this.a[j + 1]; 
                }
                this.nElements--;
                System.out.println("Value deleted...");
                i--; // to check another duplicate value to delete
                status = true;
            }
        }
        System.out.println("Value not found for deletion.");
        return status;
    }
    
    public void display() { // display array contents
        if (this.nElements == 0) {
            System.out.println("The array is empty");
            return;
        }
        for (int i = 0; i < this.nElements; i++) {
            System.out.print(this.a[i] + " ");
        }
        System.out.println();
    }

}
