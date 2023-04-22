package ADT_Fraction;

class ADTFraction { 
    private int n; //numerator 
    private int d; //denomenator 
    
    public ADTFraction() {//default constructor 
        this.n = 0;
        this.d = 1;
    } 
    
    public ADTFraction(int a, int b) {//parameter constructor 
        if (b != 0) {
            this.n = a; // a is neumerator
            this.d = b; // b is denominator
        } else {
            this.n = 0;
            this.d = 1;
            System.out.println("Denominator can not be 0. And default value assigned");
        }
    } 
    
    public void set(int a, int b) {//set numerator and denomenator 
        if (b != 0) {
            this.n = a;
            this.d = b;
        } else {
            System.out.println("Denominator can not be 0. Values didn't set.");
        }
    }
    
    public ADTFraction plus(ADTFraction x) {//add two fractions 
        if (this.d == x.d) {
            return new ADTFraction(this.n + x.n, this.d);
        }
        return new ADTFraction((this.d * x.n) + (this.n * x.d), this.d * x.d);
    }
    
    public ADTFraction times(int a) {//multiply fraction by a number 
        return new ADTFraction(this.n * a, this.d);
    } 
    
    public ADTFraction times(ADTFraction x) {//multiply two fractions 
        return new ADTFraction(this.n * x.n, this.d * x.d);
    } 
    
    public ADTFraction reciprocal() {//reciprocal of a fraction 
        return new ADTFraction(this.d, this.n);
    } 
    
    public float value() {//numerical value of a fraction 
        return (float)this.n / this.d;
    } 
    
    public void display() {//display the fraction in the format n/d 
        System.out.println("Fraction : " + this.n + " / " + this.d); 
    } 
    
    public void refine() {//set the instance to its minimum fraction
     //fill the body
     //For instance, if this fraction is 12/30, change it to 2/5.
    } 
}
