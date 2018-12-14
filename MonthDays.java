
public class MonthDays {

private int month, days, year;
private String stringMonth;

public MonthDays()
{}

public void setMonth(String smonth)
{stringMonth=smonth;

	if(stringMonth.equalsIgnoreCase("January"))
		{month=1;}

	else if(stringMonth.equalsIgnoreCase("February"))
		{month=2;}

	else if(stringMonth.equalsIgnoreCase("March"))
		{month=3;}

	else if(stringMonth.equalsIgnoreCase("April"))
		{month=4;}

	else if(stringMonth.equalsIgnoreCase("May"))
		{month=5;}
	
	else if(stringMonth.equalsIgnoreCase("June"))
		{month=6;}
	
	else if(stringMonth.equalsIgnoreCase("July"))
		{month=7;}
	
	else if(stringMonth.equalsIgnoreCase("August"))
		{month=8;}
	
	else if(stringMonth.equalsIgnoreCase("September"))
		{month=9;}
	
	else if(stringMonth.equalsIgnoreCase("October"))
		{month=10;}
	
	else if(stringMonth.equalsIgnoreCase("November"))
		{month=11;}
	
	else if(stringMonth.equalsIgnoreCase("December"))
		{month=7;}
	
	else
		{month=-1;}
	
}

public int getMonthNumber()
	{return month;}

public void setYear(int y)
	{year=y;}

public String getMonth()
{return stringMonth;}


public int getMonthDays()
{
	if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{days=31;}
	
	else if(month==4||month==6||month==9||month==11)
		{days=30;}
	
	else if(month==2)
		{
		
		if(((year%100)==0 && (year%400)==0) || ((year%100)>0 && (year%4)==0))
			{days=29;}
		
		else
			days=28;
		}


	return days;
}
	
}
