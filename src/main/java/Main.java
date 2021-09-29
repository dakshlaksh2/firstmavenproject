
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
 /*  Write a program that declares 2 integer variables,
      assigns an integer to each, and adds them together.
      Assign the sum to a variable. Print out the result.*/
        int x = 10;
        int y = 7;
        int z = x + y;
        System.out.println("The sum of the integers is " + z);

        /* Write a program that declares 2 double variables, assigns a number
         to each, and adds them together. Assign the sum to a variable.
         Print out the result.*/

        double a = 15;
        double b = 25;
        double c = a + b;
        System.out.println("The sum  of the doubles is " + c);

         /*Write a program that declares an integer variable and a double variable,
         assigns numbers to each, and adds them together.
         Assign the sum to a variable. Print out the result.
         What variable type must the sum be?*/
        int xx = 50;
        double yy = 25.5;
        double zz = xx + yy;
        System.out.println("The sum of int and double is " + zz);
        // The sum of an integer and double is always a double
        /* Write a program that declares 2 integer variables, assigns an integer to each,
         and divides the larger number by the smaller number. Assign the result to a variable.
         Print out the result. Now change the larger number to a decimal.
         What happens? What corrections are needed?*/
        int p = 18;
        int qq = 36;
        int r = qq / p;
        System.out.println("The larger number divided by smaller number is " + r);
        qq = (int) 36.5;
        System.out.println("The larger as Decimal number divided by smaller number is " + r);
       /*  Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
         Declare a variable q and assign y/x to it and print q. Now, cast y to a double
         and assign to q. Print q again.*/
        x = 5;
        y = 6;
        int q = y / x;
        System.out.println(q);
        Double d = Double.valueOf(y);
        q = y / x;
        System.out.println(q);
        //Write a program that declares a named constant and uses it in a calculation. Print the result.
        int width = 20;
        int length = 30;
        double area = (width * length) / 2;
        System.out.println("The area of the triangle is " + area);
        /* Write a program where you create 3 variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create 2 more variables called subtotal and totalSale and
        complete an “order” for 3 items of the first product, 4 items of the second product,
       and 2 items of the third product. Add them all together to calculate the subtotal.
       Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
      Be sure to format the results to 2 decimal places*/
        double coffee = 3.99;
        double espresso = 2.99;
        double cappucinno = 4.99;
        double subtotal;
        double totalSale;
        final double SALES_TAX_RATE = 0.06;
        subtotal = ((3 * coffee) + (4 * espresso) + (2 * cappucinno));
        double sales_tax = subtotal * SALES_TAX_RATE;
        totalSale = subtotal + sales_tax;
        System.out.printf("The total sales is " + String.format("%.2f", totalSale));

        /*Write a program that declares an integer a variable x and assigns the value 2
        to it and prints out the binary string version of the number ( Integer.toBinaryString(x) ).*/
        int intToBinary = 2;
        System.out.println(Integer.toBinaryString(intToBinary));
       /* Write a program that declares an integer variable, assigns a number, and uses a postfix
        increment operator to increase the value. Print the value before and after the increment operator.*/
        int postFixInt = 3;
        System.out.println("The value of postFixInt before increment is " + postFixInt);
        postFixInt++;
        System.out.println("The integer value after postfix is " + postFixInt);

        /*Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
        Create another variable sum and assign the value of ++x added to y and print the result.
        Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++)
        and re-run the program. Notice what the value of sum is. The first configuration incremented x
        and then calculated the sum while the second configuration calculated the sum and then incremented x*/
    int x5 =5, y8=8;
    int sum = ++x5+y8;
        System.out.println(sum);
        int sum1 = (x5++)+y8;
        System.out.println(sum1);
        int intRandom =(int)(Math.random()*100);
        System.out.println(intRandom);
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("Europe/Paris"));
        Date date;

        Scanner input =new Scanner (System.in);
        System.out.println("enter a number");
        if(input==null)
        System.out.println("not null");
        input.close();



    }
    }
