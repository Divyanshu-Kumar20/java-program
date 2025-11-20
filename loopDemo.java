class loopDemo {
    public static void main(String[] args) {

        System.out.println("=== while loop ===");
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("\n=== do–while loop ===");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);

        System.out.println("\n=== for loop ===");
        for (int a = 1; a <= 5; a++) {
            System.out.println(a);
        }

        System.out.println("\nEven numbers 1–10:");
        for (int num = 1; num <= 10; num++) {
            if (num % 2 == 0) System.out.print(num + " ");
        }

        System.out.println("\n\nReverse counting:");
        for (int n = 5; n >= 1; n--) {
            System.out.println(n);
        }

        System.out.println("\nPattern:");
        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= 3; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
