package epam_hometask.logger_interest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
import epam_hometask.logger_interest.CompoundInterest;
import epam_hometask.logger_interest.SimpleInterest;
public class App
{
	public static void main(String[] args)
	{
		int choiceOfContinuation=0;
		do {
		Scanner sc=new Scanner(System.in);
		final Logger LOGGER = LogManager.getLogger(App.class);
		LOGGER.debug("Enter 0 if you want to calculate Simple Interest and 1 if you want to calculate Compound Interest");
		int choice=sc.nextInt();
		float principle=0,time=0,rateOfInterest=0;
		if(choice==0 || choice==1)
		{
			LOGGER.debug("Enter Principle");
			 principle=sc.nextFloat();
			 LOGGER.debug("Enter Time Period(in years)");
			 time=sc.nextFloat();
			 LOGGER.debug("Enter Rate Of Interest");
			 rateOfInterest=sc.nextFloat();
			
		}
		if(choice==0)
		{
			SimpleInterest simpleInterestObject=new SimpleInterest();
			float simpleInterestResult=simpleInterestObject.simpleInterestCalculator(principle,time,rateOfInterest);

			LOGGER.debug("Result of simple interest is : "+simpleInterestResult);
		}
		if(choice==1)
		{
			CompoundInterest compoundInterestObject=new CompoundInterest();
			double compoundInterestResult=compoundInterestObject.compoundInterestCalculator(principle,time,rateOfInterest);

			LOGGER.debug("Result of compound interest is : "+compoundInterestResult);
		}
		LOGGER.debug("Enter 1 to conitnue and 0 to exit");
		 choiceOfContinuation =sc.nextInt();
	}while(choiceOfContinuation==1);
	}
}

