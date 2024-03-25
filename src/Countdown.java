import java.util.Scanner;
public class Countdown {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = input.nextInt();

        System.out.println(countDown(number));

    }

    public static String countDown(int num)
    {

        if(num < 0)
            return " Blastoff!";


        return " " + num + countDown(num-2);
    }

}
