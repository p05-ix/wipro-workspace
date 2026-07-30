interface Test {
    int myFunction(int a, int b, int c);
}

public class LambdaTest {
    public static void main(String[] args) {
        // t1 adds three integers
        Test t1 = (a, b, c) -> a + b + c;

        // t2 multiplies three integers
        Test t2 = (a, b, c) -> a * b * c;

        int sumResult = t1.myFunction(2, 3, 4);
        int productResult = t2.myFunction(2, 3, 4);

        System.out.println("Sum of 2, 3, 4 = " + sumResult);
        System.out.println("Product of 2, 3, 4 = " + productResult);
    }
}

