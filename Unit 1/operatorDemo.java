public class operatorDemo {
    
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));

        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5;
        System.out.println("c += 5 → " + c);
        c *= 2;
        System.out.println("c *= 2 → " + c);

        int num = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("++num = " + (++num));
        System.out.println("--num = " + (--num));

        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b = " + max);
    }
}


