public class Sample5 {
    public static void main(String[] args) {
        char ch1 = 's';  // you can change values
        char ch2 = 'e';

        if (ch1 < ch2) {
            System.out.println(ch1 + "," + ch2);
        } else if (ch1 > ch2) {
            System.out.println(ch2 + "," + ch1);
        } else {
            System.out.println("Both characters are the same: " + ch1);
        }
    }
}

