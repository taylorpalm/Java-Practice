
public class driversLicenseExam {
	

	private String [] answers= {"b", "d", "a", "a", "c", 
								"a", "b", "a", "c", "d",
								"b", "c", "d", "a", "d",
								"c", "c", "b", "d", "a"};
	private String [] studentAnswers= new String [20];
	private int correct=0;
	
	public driversLicenseExam()
	{}
	
//Get Answers and create student answers array
	
	public void getAnswer(int num, String letter)
	{
	studentAnswers[num]=letter;
	}

//Get Array length
	
	public int getArrayLength()
		{return answers.length;}
	
//Grade the exam	
	
	public void grade()
	{for(int i=0; i<answers.length; i++)
		{if(answers[i].equalsIgnoreCase(studentAnswers[i]))
		{correct+=1;}}
	
	//Print # correct
	
	System.out.println("You got " + correct + " questions correct.\n");
	
	//If 15 or more correct- student passed
	
		if(correct>=15)
			{System.out.println("Congratulations! You passed.");
			}
		else
			System.out.println("You have failed this exam.");}
		
		}
	
	
	



/*
Driver’s License Exam

The local driver’s license office has asked you to write a program 
that grades the written portion of the driver’s license exam. 
The exam has 20 multiple-choice questions. Here are the correct answers:

1. B	6. A	11. B	16. C
2. D	7. B	12. C	17. C
3. A	8. A	13. D	18. B
4. A	9. C	14. A	19. D
5. C	10. D	15. D	20. A
A student must correctly answer 15 of the 20 questions to pass the exam.

Write a class named DriverExam that holds the correct answers to the exam 
in an array field. The class should also have an array field that holds 
the student’s answers. The class should have the following methods:

passed. Returns true if the student passed the exam, or false if the student failed
totalCorrect. Returns the total number of correctly answered questions
totalIncorrect. Returns the total number of incorrectly answered questions
questionsMissed: An int array containing the question numbers that the student 
missed. Demonstrate the class in a complete program that asks the user to 
enter a student’s answers, then displays the results returned from the 
DriverExam class’s methods.

Input Validation: Only accept the letters A, B, C, or D as answers.


*/