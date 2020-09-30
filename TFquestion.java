/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/
public class TFquestion extends Question{
	
	private boolean answer;
	
	//CONSTRUCTORS
	public TFquestion() {
		super();
		answer = false;
	}
	public TFquestion(String q, boolean a) {
		super(q); 
		answer = a;
	}
	
	//SETS
	public void setAnswer(boolean a) {
		answer = a;
	}
	//GETS
	
	@Override
	public String getAnswer() {
		return String.valueOf(answer);
	}
	
}
