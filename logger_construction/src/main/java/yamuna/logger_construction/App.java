package yamuna.logger_construction;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import yamuna.logger_construction.EstimateConstructionCost;
class App
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(App.class);
		LOGGER.debug("Menu for Material standards : ");
		LOGGER.debug("1->Standard Materials");
		LOGGER.debug("2->Above Standard Materials");
		LOGGER.debug("3->High Standard Materials");
		LOGGER.debug("4->High Standard Materials and fully automated home");
		LOGGER.debug("Enter your choice");
		int choice = sc.nextInt();
		LOGGER.debug("Enter total area of house(square feets)");
		float area=sc.nextFloat();
		EstimateConstructionCost object=new EstimateConstructionCost();
		double result=object.calculateCost(choice,area);
		LOGGER.debug("Total cost : "+result);
	}
}

