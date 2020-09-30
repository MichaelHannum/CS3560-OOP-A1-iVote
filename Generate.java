/***************************************************************
* author: Michael Hannum
* class: CS 3560 OOP
* Assignment 1 - iVoter
* 
****************************************************************/
//Using this class to randomly generate the Strings for: ID, Names, Questions, & Answers


import java.util.Random;

public class Generate {
	
	
//random ID	
	private final String alphabet = "12345674890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public String randomID() {
		
		java.util.Random rand = new java.util.Random();
		
	    StringBuilder builder = new StringBuilder();
	    
	    while(builder.toString().length() == 0) {
	        int length = rand.nextInt(5)+5;
	        for(int i = 0; i < length; i++) {
	            builder.append(alphabet.charAt(rand.nextInt(alphabet.length())));
	        }
	    }
	    return builder.toString();
	}
	
	
//random Name	
	public String randomName() {
		
		String firstNames[] = {"Shawn", "Herbert", "Todd", "Edwin", "Taylor", "Elias", "Bruce", "Brian", "Shane", "Gary", 
				"Russell", "Tony", "Austin", "Megan", "Ruby", "Aaliyah", "Elena", "Carla", "Jean", "Lillie", "Tabitha", "Lisa", 
				"Caroline", "Eva", "Sara", "Hannah", "Rebecca", "Phoebe"};
		
		String lastNames[] = {"Wilson", "Williams", "Miller", "Jones", "Rodriguez", "Brown", "Garcia", "Davis", "Johnson", "Smith", 
				"Thompson", "Anderson", "Martin", "Martinez", "Hernandez", "Jackson", "Harris", "Mitchell", "Nelson", "Lee", 
				"Phillips", "Young", "Perez", "Campbell", "Torres", "Turner", "Clark", "Evans", "Lopez", "Baker" };
		
		return firstNames[new Random().nextInt(firstNames.length)] +" " + lastNames[new Random().nextInt(lastNames.length)] ;
	}
	
//random TF Question
	public String randomQuestionTF() {
		
		String TFQuestions[] = {
				"[T/F] Cyclones spin in a clockwise direction in the southern hemisphere?", 
				"[T/F] Goldfish only have a memory of three seconds?", 
				"[T/F] The capital of Libya is Benghazi?", "[T/F] An octopus has five hearts?", 
				"[T/F] Darth Vader famously says the line 'Luke, I am your father' in The Empire Strikes Back?", 
				"[T/F] Stephen Hawking declined a knighthood from the Queen?", 
				"[T/F] Japan and Russia did not sign a peace treaty after World War Two so are technically still at war?", 
				"[T/F] The mathematical name for the shape of a Pringle is hyperbolic paraboloid?", 
				"[T/F] Donald Duck’s middle name is Fauntelroy?", 
				"[T/F] The Statue of Liberty was a gift from France?", "[T/F] Flying in an aeroplane is statistically safer than driving in a car?", 
				"[T/F] The blue whale, the world's largest animal, has teeth 12 inches long?", 
				"[T/F] The Apgar Score measures body fat?", 
				"[T/F] The main innovation that made cars widely available and affordable was the assembly line?", 
				"[T/F] Run-D.M.C. was the first rap group to go \"gold\" and be nominated for a Grammy?", 
				"[T/F] An obsession with actress Jodi Foster led to the shooting of President Ronald Reagan in 1981?", 
				"[T/F] Corn is the most produced crop in the world?", 
				"[T/F] Fingernails and hair continue to grow after death?", 
				"[T/F] The name \"Wall Street\" stems from the row (\"wall\") of banks that greeted visitors to New York City's financial district in the 1800s?", 
				"[T/F] Vincent van Gogh sold only one painting during his lifetime?" 
				};
		
		return TFQuestions[new Random().nextInt(TFQuestions.length)];
	}
	
	
//Random MC Question
	public String randomQuestionMC() {
		String MCQuestion[] = {
				"How many blue stripes are there on the U.S. flag? [A] 6, [B] 7, [C] 13, [D] 0", 
				"Which one of these characters is not friends with Harry Potter? [A] Ron Weasley, [B] Neville Longbottom, [C] Draco Malfoy, [D] Hermione Granger", 
				"What is the color of Donald Duck’s bowtie? [A] Red, [B] Yellow, [C] Blue, [D] White", 
				"Which animal does not appear in the Chinese zodiac? [A] Dragon, [B] Rabbit, [C] Dog, [D] Hummingbird", 
				"Which country held the 2016 Summer Olympics? [A] China, [B] Ireland, [C] Brazil, [D] Italy", 
				"Which planet is the hottest? [A] Venus, [B] Saturn, [C] Mercury, [D] Mars", 
				"Who was the only U.S. President to resign? [A] Herbert Hoover, [B] Richard Nixon, [C] George W. Bush, [D] Barack Obama", 
				"What does the “D” in “D-Day” stand for? [A] Dooms, [B] Dark, [C] Denmark, [D] Dunkirk", 
				"In which city can you find the Liberty Bell? [A] Washington, D.C, [B] Boston, [C] Philadelphia, [D] New York", 
				"In Pirates of the Caribbean, what was the name of Captain Jack Sparrow’s ship? [A] The Marauder, [B] The Black Pearl, [C] The Monty Python, [D] The Slytherin", 
				"What is the rarest blood type? [A] A, [B] B, [C] AB, [D] O", 
				"Holly Golightly is a character in which film? [A] Breakfast at Tiffanys, [B] Pretty In Pink, [C] Funny Face, [D] Singing In The Rain", 
				"Which U.S. state is known as the sunflower state? [A] Florida, [B] California, [C] Maine, [D] Kansas", 
				"How many bones are there in the human body? [A] 205, [B] 206, [C] 209, [D] 201", 
				"Fe is the chemical symbol for...? [A] Zinc, [B] Fluorine, [C] Iron, [D] Fermium", 
				"How old do you have to be to enter in the hunger games? [A] 12, [B] 11, [C] 10, [D] 15", 
				"What language is the most spoken worldwide? [A] Chinese, [B] Spanish, [C] French, [D] English", 
				"What is Shakespeare’s shortest tragedy? [A] Macbeth, [B] Hamlet, [C] Romeo & Juliet, [D] Othello"
				};
		
		return MCQuestion[new Random().nextInt(MCQuestion.length)];
	}
	

//random MC Answer
	public String randomMCAnswer() {
		
		String MCAnswer[] = {"A", "B", "C", "D"};
		return MCAnswer[new Random().nextInt(MCAnswer.length)];
	}
	
	
//random TF Answer
	public boolean randomTFAnswer() {
		
		boolean TFAnswer[] = {true, false};
		return TFAnswer[new Random().nextInt(TFAnswer.length)];
	}
	
}
