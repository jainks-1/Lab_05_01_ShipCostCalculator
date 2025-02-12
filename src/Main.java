// Kaden Jain
// Computer Programming 1 - Spring 2025
/* An application program where the user enters the price of an
item and the program computes shipping costs. If the item price is
$100 or more, then shipping is free otherwise it is 2% of the price.
The program should output the shipping cost and the total price.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // declare variables
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        double shippingCost = 0;
        double SHIPPING_FEE = 0.02;
        double totalPrice = 0;
        String trash = "";

        // input validation if/else
        System.out.println("Please enter the cost of your item: ");
        if (in.hasNextDouble()) {
            itemCost = in.nextDouble();
            in.nextLine();

            // determine shipping cost if/else
            if (itemCost < 100){
                totalPrice = itemCost;

                System.out.println("The cost of your item is: $" + itemCost);
                System.out.println("Item is less than $100, your shipping fee is: $" + shippingCost);
                System.out.println("The total cost of your purchase is: $" + totalPrice);
            }
            else {
                shippingCost = itemCost * SHIPPING_FEE;
                totalPrice = itemCost + shippingCost;

                System.out.println("The cost of your item is: $" + itemCost);
                System.out.println("Item is more than $100, your shipping fee is: $" + shippingCost);
                System.out.println("The total cost of your purchase is: $" + totalPrice);
            }

        }
        else {
            trash = in.nextLine();
            System.out.println("You entered the wrong input: " + trash);
            System.out.println("Please run the program again");
            System.exit( 0);
        }

    }
}