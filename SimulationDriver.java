/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimulationDriver {

	public static void main(String[] args) {
		try {
			run();
		}
		catch(Exception e){
			System.out.println("\n\nUnexpected Error.");
		}
		System.out.println("\n\nSystem Terminated.");
	}

	public static void run() throws Exception {
	
		//create an instance of the Generate class
		Generate G = new Generate();
		
		boolean exit = false;
		while(!exit) {
			//generate Students
			int randomInt = new Random().nextInt(20) + 3;//+3 in case random is 0
			ArrayList<Student> participants = new ArrayList<Student>();
			for(int i = 0; i< randomInt; i++) {
				participants.add(new Student(G.randomID(), G.randomName()));
			}
			
			//generate 10 Question List
			ArrayList<Question> theChosenQuestions = new ArrayList<Question>();
			// 5 TF
			for(int i = 0; i< 5; i++) {
				theChosenQuestions.add(new TFquestion(G.randomQuestionTF(), G.randomTFAnswer()));
			}
			// 5 MC
			for(int i = 0; i< 5; i++) {
				theChosenQuestions.add(new MCquestion(G.randomQuestionMC(), G.randomMCAnswer()));
			}
			
			//generate a vote on the chosen questions
			VotingService Vote = new VotingService(participants, theChosenQuestions);
			Vote.runQuiz();
			
			Scanner keyboard = new Scanner(System.in);
			boolean haveValidInput = false;
			while(!haveValidInput) {
				System.out.println("\n\n---------------------------------------------------------"
						+ "\nPlease Enter the Number for One of the Following Actions:"
						+ "\n1) Run Again"
						+ "\n2) Exit");
				int userInput =0;
				try {
					userInput = keyboard.nextInt();
					keyboard.nextLine();//clear the keyboard.
				}
				catch(Exception e) {
					System.out.println("Error. Please Try Again.");
					keyboard.nextLine();//clear the keyboard.
				}
				if(userInput == 1) {
					haveValidInput = true;
				}
				else if(userInput == 2) {
					haveValidInput = true;
					exit = true;
				}
			}
			
		}
		
		
	}
	
}
