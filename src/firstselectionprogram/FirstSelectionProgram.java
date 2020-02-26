/*
 * Feb. 24, 2020
 * First Selection Program
 * Erika Graham
 */

package firstselectionprogram;

//@author ergra0573

import java.util.Scanner;


public class FirstSelectionProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        
        //variables
        double moneySpent = 0.0;
        final double TAXTEN = 0.10;
        final double TAXTWEN = 0.20;
        final double TAXTHRD = 0.30;
        final double TAXFOUR = 0.40;
        double moneySaved = 0.0;
        double moneyActSpent = 0.0;
        
        //prompt to the user
        System.out.println("Please enter the amount spent: ");
        moneySpent = Input.nextDouble();
        
        //if statements
        if ((moneySpent >= 0.01)&&(moneySpent <= 40.00))
        {
            moneySaved = moneySpent * TAXTEN;
            //rounding
            moneySaved = moneySaved * 100;
            moneySaved = Math.round(moneySaved);
            moneySaved = moneySaved / 100;

            moneyActSpent = moneySpent - moneySaved;
            //rounding
            moneyActSpent = moneyActSpent * 100;
            moneyActSpent = Math.round(moneyActSpent);
            moneyActSpent = moneyActSpent / 100;
            //output
            System.out.println("You spent: $"+moneySpent);
            System.out.println("You are saving: 10%");
            System.out.println("You are saving: "+ moneySaved);
            System.out.println("Your total is: "+moneyActSpent);
        }
        else if ((moneySpent >= 40.01)&&(moneySpent <= 80.00))
        {
            moneySaved = moneySpent * TAXTWEN;
            //rounding
            moneySaved = moneySaved * 100;
            moneySaved = Math.round(moneySaved);
            moneySaved = moneySaved / 100;
            
            moneyActSpent = moneySpent - moneySaved;
            //rounding
            moneyActSpent = moneyActSpent * 100;
            moneyActSpent = Math.round(moneyActSpent);
            moneyActSpent = moneyActSpent / 100;
            //output
            System.out.println("You spent: $"+moneySpent);
            System.out.println("You are saving: 20%");
            System.out.println("You are saving: "+ moneySaved);
            System.out.println("Your total is: "+moneyActSpent);
        }
        else if ((moneySpent >= 80.01)&&(moneySpent <= 120.00))
        {
            moneySaved = moneySpent * TAXTHRD;
            //rounding
            moneySaved = moneySaved * 100;
            moneySaved = Math.round(moneySaved);
            moneySaved = moneySaved / 100;
            
            moneyActSpent = moneySpent - moneySaved;
            //rounding
            moneyActSpent = moneyActSpent * 100;
            moneyActSpent = Math.round(moneyActSpent);
            moneyActSpent = moneyActSpent / 100;
            //output
            System.out.println("You spent: $"+moneySpent);
            System.out.println("You are saving: 30%");
            System.out.println("You are saving: "+ moneySaved);
            System.out.println("Your total is: "+moneyActSpent);
        }
        else if (moneySpent >= 120.01)
        {
            moneySaved = moneySpent * TAXFOUR;
            //rounding
            moneySaved = moneySaved * 100;
            moneySaved = Math.round(moneySaved);
            moneySaved = moneySaved / 100;
            
            moneyActSpent = moneySpent - moneySaved;
            //rounding
            moneyActSpent = moneyActSpent * 100;
            moneyActSpent = Math.round(moneyActSpent);
            moneyActSpent = moneyActSpent / 100;
            //output
            System.out.println("You spent: $"+moneySpent);
            System.out.println("You are saving: 40%");
            System.out.println("You are saving: "+ moneySaved);
            System.out.println("Your total is: "+moneyActSpent);
        }
        
    }
    
}
