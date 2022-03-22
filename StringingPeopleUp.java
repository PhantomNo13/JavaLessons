import java.util.Locale;

public class StringingPeopleUp
{
    /*
    Strings are classes NOT objects
    2 types of strings: Immutable and mutable
    Immutable strings are declared when e.g. String s1 = "Blah" or String s1 = new String("Blah")
    1) equals() => Compares string values
    2) ==       => Compares References/Address
    */
    public static void main(String[] args)
    {
        /*
        String s1 = new String("Kabalama"); //=> Created in the constant pool/ therefore no duplicate value so s2 takes same memory reference/address
        String s2 = "Raju";
        System.out.println(s1.concat("Sachin"));
        System.out.println(s2);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.charAt(4));
        String s3 = new String("Ramu"); //=> Created outside the constant pool, therefore duplicate values can happen but different memory reference/address
        String s4 = new String("Ramu");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
        StringBuffer s100 = new StringBuffer();
        s100.append("Makkaualalalalalalal");

        System.out.println(s100.capacity());
        System.out.println(s100);
         */
        String s1 = new String("Sachin");
        StringBuilder s2 = new StringBuilder();
        for (int i = s1.length()-1; i>=0; i--) {
            s2.append(s1.charAt(i));
        }
        System.out.println(s2);
    }
}

