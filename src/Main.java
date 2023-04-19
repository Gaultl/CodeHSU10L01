import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(SumOfNumbers(10));
        RecursiveCountdown(10);
        int[] array = {2, 4, 8, 11, 7};
        System.out.println(sumArray(array));
    }

    public static void RecursiveCountdown(int n){
        if(n == 1){
            System.out.println(1);
        } else {
            System.out.println(n);
            RecursiveCountdown(n - 1);
        }

    }

    public static int SumOfNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + SumOfNumbers(n - 1);
    }

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int sumArray(int[] array){
            if(array.length == 1){
                return array[array.length - 1];
            }
            int[] nextArray = Arrays.copyOf(array, array.length - 1);
            return array[array.length - 1] + sumArray(nextArray);
    }
}