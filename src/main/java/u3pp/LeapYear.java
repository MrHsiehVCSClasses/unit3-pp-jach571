package u3pp;

/**
 * The code determines what years are leap years by testing the following constraints.
 * Every year between 1582 and now that is exactly divisible by four is a leap year.
   - Years that are evenly divisble by 100 are not leap years unless they are evenly divisible by 400
   - - Example: 1700, 1800, and 1900 are not leap years
   - - Example: 1600 and 2000 are leap years
 * 
 * @author Jacob Cho
 *
 */

public class LeapYear {
	public static boolean isLeapYear(int year) {
	//Checks if the year is after 1582
		if(year < 1582){
			return false; 
	//Checks if the year is exactly divisible by 4, evenly divisible by 100, or evenly divisible by 400
	//If the year is evenly divisible by 100, it is not a leap year unless it is also divisible by 400
		} else if(year >= 1582 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			return true;
	//If none of the conditions are met, then the function returns false since the year is a leap year
		} else{
			return false;
		}
	}
}