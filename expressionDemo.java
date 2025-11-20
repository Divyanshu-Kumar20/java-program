public class expressionDemo {

    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        int result1 = a + b * c;  
        int result2 = (a + b) * c;
        int result3 = a + b * c - 4 / 2;

        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);

        double result4 = a + b / (double)c;
        System.out.println("Result4 = " + result4);
    }
}


