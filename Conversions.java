import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Tim Gesell
 * @version 8/21/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Centimeters to Millimeters");
        System.out.println("8. Millimeters to Centimeters");
        System.out.println("9. Kilometers to Miles");
        System.out.println("10. Miles to Kilometers");
       

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Farenheit: ");
            double farenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celcius = (farenheit - 32) * (5.0 / 9.0) ;
            System.out.println(farenheit + " degrees farenheit is " + celcius + " degrees celcius");       
        }
    if (selection == 3)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * 0.3048 ;
            System.out.println(feet + " feet is equal to " + meters + " meters.");       
    }
    if (selection == 4)
        {
            System.out.println("Enter meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / 0.3048 ;
            System.out.println(meters + " meters is equal to " + feet + " feet.");       
    }
    if (selection == 5)
        {
            System.out.println("Enter ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double milliliters = ounces * 29.5735 ;
            System.out.println(ounces + " ounces is equal to " + milliliters + " milliliters.");       
    }
    if (selection == 6)
        {
            System.out.println("Enter milliliters: ");
            double mls = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = mls / 29.5735 ;
            System.out.println(ounces + " ounces is equal to " + mls + " milliliters.");       
    }
    if (selection == 7)
        {
            System.out.println("Enter centimeters: ");
            double centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double mms = centimeters * 10 ;
            System.out.println(centimeters + " centimeters is equal to " + mms + " millimeters.");       
    }
    if (selection == 8)
        {
            System.out.println("Enter millimeters: ");
            double mms = keyboard.nextDouble();
            keyboard.nextLine();
            double cms = mms / 10 ;
            System.out.println(mms + " millimeters is equal to " + cms + " centimeters.");       
    }

}
}
