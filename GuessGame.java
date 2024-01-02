import java.util.Random;
import java.util.Scanner;

class GuessGame
{   
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        String choice="y";
      while(choice.equals("y")|| choice.equals("Y"))
      { 
        Random rand=new Random();
        int num = rand.nextInt(100);
        int guessNum=-1;
        int chances=0;
        while(guessNum != num)
        {   
            chances++;
            System.out.print("Enter the number you guessed :");
            guessNum=sc.nextInt();
            if(guessNum==num)
            {
                System.out.println("GREAT!!! YOU FOUND THE NUMBER...");
                System.out.println("You took "+chances+" tries");
                System.out.print("Would you like to play more [Y/y] :");
                choice=sc.next();
            }
            else if (guessNum>num)
            {
                System.out.println("Your input is greater than the generated number..");
            }
            else
            {
                System.out.println("Your input is lesser than the generated number..");
            }
            
        }
      }
    }    
}