import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws InterruptedException  {

      String[] Moves ={"Rock ","Paper","Scissors"};
      String userMove = null;
      int attempts =3;
      int win =0,lose=0,tie=0;
     

      Scanner sc = new Scanner(System.in);
    
      while(true)
      {
        System.out.println("Do you want to play this game YES /NO");
        String play = sc.nextLine();

        if(play.equalsIgnoreCase("No")){
            System.out.println("GOODBYE ");
            sc.close();
            return;
        }
        else if(play.equalsIgnoreCase("YES")){
            System.out.println("LETS PLAY GAME! YOU HAVE"+attempts+"attempts");
            break;
        }
        else{
            System.out.println("Invalid input");
        }

      }
      System.out.println("choose your move" +" "+"Rock "+" "+"Paper "+" "+"Scissors");

      for(int round =1; round<=attempts;round++){

      
          userMove = sc.nextLine();
          if (!userMove.equalsIgnoreCase("Rock") &&
          !userMove.equalsIgnoreCase("Paper") &&
          !userMove.equalsIgnoreCase("Scissors")) {
          System.out.println("Invalid move! Please enter Rock, Paper, or Scissors.");
          round--;
          continue;
      }
      




         String ComputerMoves = Moves[new Random().nextInt(Moves.length)];

         System.out.println("YOU CHOSE " + userMove);
         System.out.println("COMPUTER CHOSE " + ComputerMoves);

         if (userMove.equalsIgnoreCase(ComputerMoves)) {
            System.out.println("It's a tie!");
            tie++;
        } 
        else if (
                (userMove.equalsIgnoreCase("Rock") && ComputerMoves.equals("Scissors")) ||
                (userMove.equalsIgnoreCase("Paper") && ComputerMoves.equals("Rock")) ||
                (userMove.equalsIgnoreCase("Scissors") && ComputerMoves.equals("Paper"))
        ) {
            System.out.println("You win! 🎉");
            win++;
        } 
        else {
            System.out.println("You lose! 😢");
            lose++;
        }
        System.out.println("Attempts left: " + (attempts - round));
    }
    System.out.println("\nGame Over! Here are your final results:");
    System.out.println("Wins: " + win);
    System.out.println("Losses: " + lose);
    System.out.println("Ties: " + tie);
    System.out.println("Thanks for playing! 🎮");
        sc.close();
    }

    

      


        

        
    }

   
    

