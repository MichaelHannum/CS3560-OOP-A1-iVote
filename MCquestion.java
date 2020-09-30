/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/
public class MCquestion extends Question {
	
	private String answer;
	
	//CONSTRUCTORS
	public MCquestion() {
		super();
		answer = "Error: Answer Was Not Entered";
	}
	public MCquestion(String q, String a) {
		super(q); 
		answer = a;
	}
	
	//SETS
	public void setAnswer(String a) {
		answer = a;
	}
	//GETS
	
	@Override
	public String getAnswer() {
		return answer;
	}
	
}
