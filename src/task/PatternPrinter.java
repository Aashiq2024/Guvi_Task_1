package task;

public class PatternPrinter {
    public static void main(String[] args) {
        int k = 5;

        for (int i = 1; i <= k; i++) { 
            for (int j = 5; j >= 1; j--) { 
                if (j > i) {
                    System.out.print(j); 
                } else {
                    System.out.print(i); 
                }
            }
            System.out.println(); 
        }
    }
}
