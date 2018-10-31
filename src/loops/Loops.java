/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loops;

import java.util.Scanner;

/**
 *
 * @author nilei4218
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);

        int num;
        String name;       

        // Get the user’s name

        System.out.println("Please enter your name:");
        name = keyedInput.nextLine();

        // Get the number of time you want it to display

        System.out.println("Please enter a number:");
        num = keyedInput.nextInt();               

        System.out.println("----------------");       

        // Print out the user’s name, num times,

        for (int i = 1; i <= num; i = i + 1)

        {
            System.out.println(name);
        }   
    }

}
