public class Fibonacci {

    public static void main(String[] args) {
        int number = 2584;

        boolean belongs = belongsToFibonacci(number);

        if (belongs) {
            System.out.println("The number " + number + " belongs to the Fibonacci sequence.");
        } else {
            System.out.println("The number " + number + " does not belong to the Fibonacci sequence.");
        }
    }
    public static boolean belongsToFibonacci(int number){
        int a = 0, b = 1;

        if(number < 0){
            return false;
        }

        while (b < number){
            int next = a + b;
            a = b;
            b = next;
        }
        return b == number;
    }
}
