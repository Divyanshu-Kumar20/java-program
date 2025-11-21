public class StringDemo {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println("s1 == s2 : " + (s1 == s2));
        System.out.println("s1 == s3 : " + (s1 == s3));
        System.out.println("s1.equals(s3) : " + s1.equals(s3));

        String original = "Java";
        System.out.println("Original: " + original);

        String modified = original.concat(" Programming");
        System.out.println("Modified: " + modified);

        System.out.println("Still Original: " + original);

        String name = "Christ University";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Substring: " + name.substring(0,6));
    }
}
