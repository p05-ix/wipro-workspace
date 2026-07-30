// FoundationTest.java
class Foundation {
    private int var1 = 10;     // private
    int var2 = 20;             // default (package-private)
    protected int var3 = 30;   // protected
    public int var4 = 40;      // public
}

public class FoundationTest {
    public static void main(String[] args) {
        Foundation f = new Foundation();

        // System.out.println("var1: " + f.var1); 
        // System.out.println("var2: " + f.var2);
        // System.out.println("var3: " + f.var3); 
        System.out.println("var4: " + f.var4);   
    }
}

