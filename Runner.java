
import java.util.ArrayList;

public class Runner {
	
	//fields 
	
	private double [] runner;
	private double time;
	private int runnerNumber;
	private int numOfRunners;
	
	public Runner()
	{}

	public void setNumberOfRunners(int num)
	{numOfRunners=num;
	 runner= new double[numOfRunners];}
	
	
	public void setRunnerTime(int runNum, double t)
	{runnerNumber=runNum;
	time=t;
	
	runner[runnerNumber]=time;}
	
	
	
	public int winner()
	{int win=0;
	String winnerString="";
	 
		for(int i=1; i<runner.length; i++)
		{
		  if(runner[i]>runner[win])
		     {win=i;}
		  
		}


		return (win+1);

	}}

