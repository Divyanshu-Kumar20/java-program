public class defaultValuesDemo {
    
    int intVar;
    double doubleVar;
    char charVar;
    boolean boolVar;
    String strVar;

    public void show() {
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("String: " + strVar);
    }

    public static void main(String[] args) {
        defaultValuesDemo obj = new defaultValuesDemo();
        obj.show();
    }
}


