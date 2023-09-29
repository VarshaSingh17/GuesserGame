import java.util.*;

class Guesser
{
      int SecretNum;

      int guessingNumber()
        {
        SecretNum=2;
         System.out.println("--- Guesser have a Secret Number! Kindly guess the number between 1 to 10 --- ");
         return SecretNum;
        }
      
}
class Player
{
    int guessNum;

     int guessNumber;

        int Player1Number() 
        {
        Scanner s1=new Scanner(System.in);
        System.out.println("Player 1! guess the Number:-");
        int Player1=s1.nextInt();
        return Player1;
        }

        int Player2Number() 
        { 
        Scanner s2=new Scanner(System.in);
        System.out.println("Player 2! guess the Number:-");
        int Player2=s2.nextInt();
        return Player2;
        }

        int Player3Number() 
        {
        Scanner s3=new Scanner(System.in);
        System.out.println("Player 3! guess the Number:-");
        int Player3=s3.nextInt();
        return Player3;
        }

        int Player4Number() 
        {
        Scanner s4=new Scanner(System.in);
        System.out.println("Player 4! guess the Number:-");
        int Player4=s4.nextInt();
        return Player4;
        }
    
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNumber();
    }

    void collectNumFromPlayers() 
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        Player p4=new Player();
        numFromPlayer1=p1.Player1Number();
        numFromPlayer2=p2.Player2Number();
        numFromPlayer3=p3.Player3Number();
        numFromPlayer4=p4.Player4Number();
    }
    void hint()
    {
        Scanner s4=new Scanner(System.in);
        String Userinput;
        System.out.println("   ");
        System.out.println("                ***   Do you want a Hint?   ***");
        System.out.println("                         Enter Yes/No");
        Userinput=s4.nextLine().toLowerCase();
        if(Userinput.equals("yes"))
        {
            System.out.println("The Hint is:- ** Mahatama Gandhi's Birthday Date **");
            System.out.println(" ");
        }
        else if(Userinput.equals("no"))
        {
            System.out.println("  ");
        }
        else
        {
                System.out.println("Invalid input");
                return;
        }
        while(!Userinput.equals("yes")&& !Userinput.equals("no"));
    }
    
   void compare()
        {
            if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("  ***Congratulations! Player 1, Player 2, Player 3 and Player 4 won the game***");
            System.out.println("-----------------------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
          {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("   ***Congratulations! Player 1, Player 2 and Player 3 won the game***");
            System.out.println("---------------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("---------------------------------------------------------------------------");
            System.out.println("   ***Congratulations! Player 1, Player2 and Player 4 won the game***");
            System.out.println("---------------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("   ***Congratulations! Player 1, Player 3 Player 4 won the game***    ");
            System.out.println("----------------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("   ***Congratulations! Player 2, Player 3 and Player 4 won the game***");
            System.out.println("----------------------------------------------------------------------------");
          }


           else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer2)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("    ***Congratulations! Player 1 and Player 2 won the game***");
            System.out.println("--------------------------------------------------------------------");
            
          }
          else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer3)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("   ***Congratulations! Player 1 and Player 3 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("   ***Congratulations! Player 2 and Player 3 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer1 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("    ***Congratulations! Player 1 and Player 4 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("    ***Congratulations! Player 2 and Player 4 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("    ***Congratulations! Player 3 and Player 4 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }

          else if(numFromGuesser==numFromPlayer1)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("         ***Congratulations! Player 1 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer2)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("         ***Congratulations! Player 2 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          else if(numFromGuesser==numFromPlayer3)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("         ***Congratulations! Player 3 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
           else if(numFromGuesser==numFromPlayer4)
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("         ***Congratulations! Player 4 won the game***");
            System.out.println("--------------------------------------------------------------------");
          }
          
          else 
          {
            System.out.println("--------------------------------------------------------------------");
            System.out.println("              -Game Lost! Please try again.......-");
            System.out.println("--------------------------------------------------------------------");
          }

        }

        void tryAgain()
        {
            Scanner s5=new Scanner(System.in);
            String  UserTry;
            System.out.println("     -------Want to Try again?--------");
            System.out.println("            1. YES");
            System.out.println("            2. NO");
            System.out.println("            3. EXIT");
            UserTry=s5.nextLine().toLowerCase();

            if(UserTry.equals("1"))
            {
              Umpire u=new Umpire();
                u.collectNumFromGuesser();
                u.hint();
                u.collectNumFromPlayers();
                u.compare();
                u.tryAgain();
            }
            else if(UserTry.equals("2"))
            {
              System.out.println("              *** Thank you for Playing ***");
            }
           else if(UserTry.equals("3"))
            {
            System.out.println("              *** Game Exited...Thank you for Playing ***");
            }  
        }
}

public class Game
{
    public static void main(String[] args)
     {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("              ***    Guesser Game Started  -by VARSHA SINGH  ***");
        System.out.println("--------------------------------------------------------------------------------");
        Umpire u=new Umpire();
        
        u.collectNumFromGuesser();
        u.hint();
        u.collectNumFromPlayers();
        u.compare();
        u.tryAgain();
     }
}
