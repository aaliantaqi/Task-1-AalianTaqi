import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DecodeLabs_Java_P1
{
    public static void main(String[] args)
    {
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
        int n = num.nextInt(100) + 1;
        int life = 3;
        int score = 0;
        int i = 0;
        int input;
        System.out.println("You have Total " + life + " Lives");
        do{
            try{
            System.out.print("Enter a Number: ");
            input = sc.nextInt();
            
        if(n == input)
        {
            score++;
            System.out.println("Congrats\nScore = " + score);
        }
        else if (input > n)
        {
            life--;
            System.out.println("----------------------------------");
            System.out.println("HINT: Type Smaller Number");
            System.out.println("----------------------------------\n");
            System.out.println("----------------------------------");
            System.out.println("You have " + life + " Lives Left");
            System.out.println("----------------------------------\n");
        }
        else
        {
            life--;
            System.out.println("----------------------------------");
            System.out.println("HINT: Type Larger Number");
            System.out.println("----------------------------------\n");
            System.out.println("----------------------------------");
            System.out.println("You have " + life + " Lives Left");
            System.out.println("----------------------------------\n");

        }
       
        i++;
        if(life==0)
        {
            System.out.println("----------------------------------");
            System.out.println("Game Over! The number was: " + n);
            System.out.println("----------------------------------");
        }
        if(i==3 || n==input)
        {
            System.out.println("----------------------------------");
            System.out.println("Do you wanna Play Again! | Y/N");
            System.out.println("----------------------------------");
            char ch = sc.next().charAt(0);
            if(ch == 'y' || ch=='Y')
            {
                    i = 0;
                    life = 3;
                    n = num.nextInt(100) + 1;
            }
            else{
                System.out.println("Thank You for Playing!");
                System.out.println("Total Score = " + score);
                break;
            }
        }
             }
            catch(InputMismatchException e)
            {
                System.out.println("Type Numbers Only!");
                sc.nextLine();
            }
            }
            while(i<3);
    }
}