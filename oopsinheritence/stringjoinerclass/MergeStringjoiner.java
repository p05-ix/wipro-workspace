// MergeStringJoiners.java
import java.util.StringJoiner;

public class MergeStringjoiner {
    public static void main(String[] args) {
        // First StringJoiner with hyphen separator
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi").add("Mumbai").add("Chennai");

        // Second StringJoiner with hyphen separator
        StringJoiner s2 = new StringJoiner("-");
        s2.add("NewYork").add("London").add("Paris");

        // Case i: s1 merged to s2
        StringJoiner merged1 = new StringJoiner("-");
        merged1.merge(s1);
        merged1.merge(s2);
        System.out.println("s1 merged to s2 → " + merged1.toString());

        // Case ii: s2 merged to s1
        StringJoiner merged2 = new StringJoiner("-");
        merged2.merge(s2);
        merged2.merge(s1);
        System.out.println("s2 merged to s1 → " + merged2.toString());
    }
}
