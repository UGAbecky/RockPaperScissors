import java.util.Scanner; 
public class RockPaperScissors {
	public static void main(String[] args) {
		
		//declare variables 
		String userMove = "";
		String computerMove = "";
		int userScore =0; 
		int computerScore = 0; 
		int pointsToWin = 0; 
		

		//prompt the use how many points it takes to win 
		Scanner user = new Scanner(System.in);
		System.out.println("Points to win");
		pointsToWin = user.nextInt();


		/*introducing a while loop because i want the game to continue as long as 
		 * either the user score or the computer score is under the points needed to win
		 */
		while (computerScore != pointsToWin && userScore != pointsToWin){
			//prompts the user to enter in their move
			System.out.println("Rock, paper, or scissors?");
			userMove = user.next();

			//import computers move 
			computerMove = ComputerOpponent.getMove(); //import computer's move from other java file 


			//all the scenarios of winning against the computer 
			if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("scissors")) {
				userScore = userScore + 1;
				System.out.println("The computer chose scissors, so you win! " + "(" + userScore + "-" + computerScore + ")");
				}
			
				else if(userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) {
					userScore = userScore + 1; 
					System.out.println("The computer chose rock, so you win! " +  "(" + userScore + "-" + computerScore + ")");
				}
				else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("paper")){
					userScore = userScore + 1; 
					System.out.println("The computer chose paper, so you win! " + "(" + userScore + "-" + computerScore + ")"); 
				}
			//tie situations 
				else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("scissors")) {
					System.out.println("The computer chose Scissors, so it's a tie." + "(" + userScore + "-" + computerScore + ")");
				}
				else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("paper")) {
					System.out.println("The computer chose paper, so it's a tie." + "(" + userScore + "-" + computerScore + ")");
				}
				else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("rock")) {
					System.out.println("The computer chose rock, so it's a tie." + "(" + userScore + "-" + computerScore + ")");
				}
				//all the scenarios of losing against the computer
				else if (userMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) {
					computerScore = computerScore + 1; 
					System.out.println("The computer chose paper, so you lose! " + "(" + computerScore + "-" + userScore + ")");
				}
				else if (userMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors")) {
					computerScore = computerScore + 1; 
					System.out.println("The computer chose scissors, so you lose! " + "(" + computerScore + "-" + userScore + ")");
				}
				else if (userMove.equalsIgnoreCase("scissors") && computerMove.equalsIgnoreCase("rock")) {
					computerScore = computerScore + 1; 
					System.out.println("The computer chose rock, so you lose! " + "(" + computerScore + "-" + userScore + ")");	
				}


			else { //if user inputs an invalid input, program tells user to enter a valid input
				System.out.println("please choose 'rock', 'paper', or 'scissors'!");  
			}
		}

		

		//printing out end score and congratulations message or losing message
		if (userScore == pointsToWin) {
			System.out.println("Congratulations! You won!");
		}
		else if  (userScore == computerScore) {
			System.out.println("it's a tie" + "(" + userScore + "-" + computerScore + ")");
		}
			else {
			System.out.println("Sorry, you lost. Better luck next time!");
		}

		//close program 
		user.close(); 

	
	}
}
