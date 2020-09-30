/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/
public class Question implements QuestionInterface{
	//any child needs custom answer data (ie MC, T/f, open ended, free response)
	private String askedQuestion;
	
	
	//CONSTRUCTORS
	public Question() {
		askedQuestion = "Error: Question Was Not Entered.";
	}
	public Question(String q) {
		askedQuestion = q;
	}
	
	//SETS
	public void setQuestion(String q) {
		askedQuestion = q;
	}
	//GETS
	public String getQuestion() {
		return askedQuestion;
	}
	public String getAnswer() {
		return null;
	}
	
	
	
}
