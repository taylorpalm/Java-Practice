import java.util.Scanner;

public class RunnerDemo {

	public static void main(String[] args) {
		
		int inputRunners;
		double time;

		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("How many people ran in this race?");
		inputRunners=keyboard.nextInt();
		
		Runner race= new Runner();
		
		race.setNumberOfRunners(inputRunners);
		
		for(int i=0; i<(inputRunners);i++)
		{
		System.out.println("What was runner #" + (i+1) + "'s time?");
		time=keyboard.nextInt();
			
			race.setRunnerTime(i, time);}

	
		System.out.println(race.winner());

}}
