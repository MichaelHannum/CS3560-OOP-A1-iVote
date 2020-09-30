/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/
public interface QuestionInterface {
	
	//Allows for a question to be reset
	/**
	 * @param requires input or becomes set to null
	 **/
	public void setQuestion(String q);
	
	
	//the question (string)
	/**
	 * @return String of the question
	 **/
	public String getQuestion(); 
	
	
	//returns valid, true answer to the question
	/**
	 * @param requires @Override
	 * @return null if not overridden by child class
	 **/
	public String getAnswer(); 
	
}
