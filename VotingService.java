/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/

import java.util.ArrayList;

public class VotingService {

	private ArrayList<Student> participants;
	private ArrayList<Question> theChosenQuestions;
	
	
	
		//CONSTRUCTORS
		public VotingService() {
			
		}
		public VotingService(ArrayList<Student> p, ArrayList<Question> q) {
			participants = p;
			theChosenQuestions = q;
		}
		
		
		
		
		public void runQuiz() {
			//create an instance of the Generate class for randomized answers
			Generate G = new Generate();
			
			int qN = 0; // qN = questionNumber
			//loop thru the questions 
			while (!theChosenQuestions.isEmpty()) {
				
				//ask the question
				System.out.println("\n\nQuestion " + (qN+1) +":");
				System.out.println(theChosenQuestions.get(0).getQuestion() + "\n");
				int T = 0;
				int F = 0;
				
				int A = 0;
				int B = 0;
				int C = 0;
				int D = 0;

				for(Student x : participants) {
					
					//check question type
					if(theChosenQuestions.get(0) instanceof TFquestion) {
						
						//generate random student answer
						boolean ans = G.randomTFAnswer();
						
						//add answer to question total
						if(ans == true) {
							T++;
						}
						else {
							F++;
						}
						
						System.out.println(x.getName() +"(" +x.getID()+")" + " : " + String.valueOf(ans) );
						
					}
					
					
					else if(theChosenQuestions.get(0) instanceof MCquestion) {
						
						//generate random student answer
						String ans = G.randomMCAnswer();
						
						//add answer to question total
						if(ans.toLowerCase().equals("a")) {
							A++;
						}
						else if(ans.toLowerCase().equals("b")) {
							B++;
						}
						else if(ans.toLowerCase().equals("c")) {
							C++;
						}
						else {
							D++;
						}
						
						System.out.println(x.getName() +"(" +x.getID()+")" + " : " + ans.toUpperCase() );
						
					}
					else {
						//should never run
						System.out.println("Error: Question Object in VotingService Does Not Exist");
					}
					
					
				
				}//end student loop for specific question number
				

					//state correct answer
					System.out.println("\nCorrect Answer: " + theChosenQuestions.get(0).getAnswer());
		
				
					//how people voted
					if(theChosenQuestions.get(0) instanceof TFquestion) {
						System.out.println("Totals: True: " + T +" | False: " + F);
					}
					else if(theChosenQuestions.get(0) instanceof MCquestion) {
						System.out.println("Totals: [A]: " +A +" | [B]: "+B +" | [C]: " +C +" | [D]: " +D );
					}
					else {
						//should never run
						System.out.println("Error: Question Object in VotingService Does Not Exist");
					}
					
				//remove the question
				theChosenQuestions.remove(0);
				//+1 the question Number
				qN++;
			
			}//end while loop
		
		}//end run quiz
}
