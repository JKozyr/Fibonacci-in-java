class fibonaci {
    void PrintingFibonaci() {
        System.out.println("Ciąg Fibonaciego");
        int first_Number = 0;
        System.out.println(first_Number);
        int second_Number = 1;
        System.out.println(second_Number);
        int result = first_Number + second_Number;
        for (int i = 0; i < 20; i++) {
            System.out.println(result);
            first_Number = second_Number;
            second_Number = result;
            result = first_Number + second_Number;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        fibonaci fibonaci1 = new fibonaci();
        fibonaci1.PrintingFibonaci();
        }
    }
