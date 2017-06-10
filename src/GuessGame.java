
public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		//creating 3 players and assigning them variables
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		//Variables to hold guesses
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		//Creating place to hold if answers are right or wrong
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		//Generating target number
		int targetNumber = (int)(Math.random()*10);
		
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		//Call each players guess number
		p1.guess();
		p2.guess();
		p3.guess();
		
		guessp1 = p1.number;
		System.out.println("Player one guessed " + guessp1);
		
		guessp2 = p2.number;
		System.out.println("Player two guessed " + guessp2);
		
		guessp3 = p3.number;
		System.out.println("Player three guessed " + guessp3);
		
		// if player’s guess matches targetNumber set variable to true
		 if (guessp1 == targetNumber) { p1isRight = true;}
		 if (guessp2 == targetNumber) { p2isRight = true;}
		 if (guessp3 == targetNumber) { p3isRight = true;}
		 
		// if player one OR player two OR player three is correct (|| operator means OR)	
		 
		 if (p1isRight || p2isRight || p3isRight) {
		 System.out.println("We have a winner!");
		 System.out.println("Player one got it right? " + p1isRight);
		 System.out.println("Player two got it right? " + p2isRight);
		 System.out.println("Player three got it right? " + p3isRight);
		 System.out.println("Game is over");
		
		 break; // game over, break out of loop	
		 }
		 
		 else {
		 
			 // stay in loop and keep playing nobody guessed correctly
		 System.out.println("Players will have to try again.");
		 }
		 } // end loop // end method
		} // end class
