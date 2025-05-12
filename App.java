import java.util.Scanner;
 
public class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int random = (int) (Math.random() * 100);
        System.out.println("Please Guess a two digit number");
 
        boolean flag = true;
        int count = 0;
 
        while (flag) {
            System.out.print("Guess the number ");
            int guess = scan.nextInt();
 
            if (guess > random) {
                System.out.println("Lower number please");
                count++;
            } else if (guess < random){
                System.out.println("Higher number please");
                count++;
            } else{
                flag = false;
            }
            
        }
 
        System.out.println("Correct! You guessed the number in" + count + " attempt");
    }
}
 