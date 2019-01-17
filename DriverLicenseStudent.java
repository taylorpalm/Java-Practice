import java.util.Scanner;

public class DriverLicenseStudent {
	
	public static void main(String[]args) {
		
		String answer;
	
	//Create new driver's license exam object
		
		driversLicenseExam student= new driversLicenseExam();
		
			Scanner keyboard= new Scanner(System.in);
		
		System.out.println("This exam has 20 questions.\n");
		
	//Loop- Ask Questions on Exam
		
		for(int i=0; i<student.getArrayLength(); i++)
		{System.out.println("Question: " + (i+1));
		answer=keyboard.nextLine();
	
	//Invalid input
		
		while(!answer.matches("a|A|b|B|c|C|d|D"))
			{System.out.println("That is not a valid answer, choose a, b, c, or d:");
			answer=keyboard.nextLine();}
		
		student.getAnswer(i, answer);
		
		}
	
	//Grade the exam

		student.grade();
		

}
}