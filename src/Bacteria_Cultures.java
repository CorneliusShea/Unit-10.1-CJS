import java.util.Scanner;

public class Bacteria_Cultures {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many hours will the bacteria breed?");
        int numHours = input.nextInt();


        System.out.println(colonySize(numHours));

    }

    public static int colonySize(int hours)
    {
        if(hours == 0)
            return 7;

        int numBac = hours + (hours*4);

        return (colonySize(hours - 1) * 4) + colonySize(hours - 1);
    }
}
