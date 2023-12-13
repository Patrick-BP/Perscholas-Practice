package com.perscholas.java_basics;

public class MainClass {


    public static void main(String[] args){

        // Write a program that declares two integer variables, assigns an integer to each, and adds them together. Assign the sum to a variable. Print out the result.

        int a = 4;
        int b = 5;
        int sumOfIntegers = a + b;
        System.out.println("Sum of integers a and b is " + sumOfIntegers);



        // Write a program that declares two double variables, assigns a number to each, and adds them together. Assign the sum to a variable. Print out the result.
        double c , d;
         c = 5.66;
         d = 8;
        double sumOfDoubles = c + d;
        System.out.println("Sum of doubles c and d is " + sumOfDoubles);


        // Write a program that declares an integer variable and a double variable, assigns numbers to each,
        // and adds them together.
        // Assign the sum to a variable. Print out the result. What variable type must the sum be?

        int xx = 3;
        double yy = 4;
        double sumOfIntDouble = xx + yy;
        System.out.println("Sum of Integer and doubles c and d is " + sumOfIntDouble);


        /*
        * Write a program that declares two integer variables, assigns an integer to each,
        * and divides the larger number by the smaller number. Assign the result to a variable.
        * Print out the result.
        * Now change the larger number to a decimal. What happens? What corrections are needed?
        * */

        int t, h;
         t = 4;
         h = 6;
        float div = h / t;
        System.out.println("the division two integers h / t = " + div);
        /* changing the value of h to a decimal will show incompatible types error. to fix that
           we have to cast the new value to int
         */
        h= (int) 6.8;
        div = h / t;
        System.out.println("the division  h / t = " + div);

        /*
        * Write a program that declares two double variables,
        * assigns a number to each, and divides the larger by the smaller number.
        * Assign the result to a variable. Print out the result.
        * Now, cast the result to an integer. Print out the result again.
          */

        double g, k;
        g = 29;
        k = 60;
        double result = k / g;
        System.out.println("division of k by g = " + result);
        //casting the result to integer
        System.out.println("division of k by g = " + (int)result);


        /* Write a program that declares two integer variables,
         x and y, and assigns the number 5 to x and the number 6 to y.
          Declare a variable q and assign y/x to it and print q.
          Now, cast y to a double and assign it to q. Print q again.
        */
        int x, y;
        x = 5;
        y = 6;
        double q = y / x;
        System.out.println(q);
        q = (double) y;
        System.out.println(q);

        // Write a program that declares a named constant and uses it in a calculation. Print the result.
        final double PI = 3.14159265;
        int u = 56;
        double res = PI + u;
        System.out.println(res);

        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
        Assign prices to each product. Create two more variables called subtotal and
        totalSale and complete an “order” for three items of the first product,
        four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal. Create a constant
        called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format
         the results to two decimal places.
        */

        double coffee, cappuccino, espresso;
        coffee = 12.4f;
        cappuccino = 7;
        espresso = 9.5f;

        double subtotal;
        double totalSale;
        final double SALES_TAX = 0.07 ;

        subtotal = ( 3 * coffee ) + (4 * cappuccino) + (2 * espresso );
        System.out.println("subtotal: " + subtotal);
        totalSale = subtotal + (subtotal * SALES_TAX) ;
        System.out.println("the totalSale is : " + totalSale);

    }





}
