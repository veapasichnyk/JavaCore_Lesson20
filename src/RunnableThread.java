import java.util.Scanner;

public class RunnableThread implements Runnable{

    @Override
    public void run ( ) {
        Scanner scanner = new Scanner( System.in);
        System.out.println("Enter number of numbers of the Fibonacci sequence ");
        int numberOfNumbers = scanner.nextInt();
        int[] f = new int [numberOfNumbers];
        f[0] = 1;
        f[1] = 1;
        for ( int i = 2; i < numberOfNumbers; ++i ) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for( int i = numberOfNumbers-1; i >= 0; i-- ){
            System.out.print( "Runnable: " + f[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
