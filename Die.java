import java.util.concurrent.ThreadLocalRandom;

public class Die {
	
	public Die()
	{}
	
	public static int roll()
	{ int roll = ThreadLocalRandom.current().nextInt(1, 7);

	
	return roll;}
	
}
