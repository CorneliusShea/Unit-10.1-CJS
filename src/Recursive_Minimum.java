import java.util.ArrayList;
import java.util.Scanner;

public class Recursive_Minimum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a number (-1 to exit): ");
            int num = input.nextInt();

            if(num == -1)
            {
                break;
            }

            numbers.add(num);
        }

        System.out.println(findMinimum(numbers, numbers.size()));


    }

    public static int findMinimum(ArrayList<Integer> arr, int length)
    {
        if(arr.size() - 1 == 0)
            return arr.get(0);

        if(arr.size()-1 > arr.size()-2)
        {
            arr.remove(arr.size()-1);
        }
        else
        {
            arr.remove(arr.size()-2);
        }

        return findMinimum(arr, length);
    }
}
