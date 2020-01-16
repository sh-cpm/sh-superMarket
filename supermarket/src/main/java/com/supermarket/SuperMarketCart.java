package com.supermarket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.supermarket.model.Item;

public class SuperMarketCart 
{
	 private static Scanner scan;
    public static void main( String[] args )
    {
        shopping();
    }
    
    public static void shopping() {
    	ArrayList<Item> ItemCart = new ArrayList<Item>();
        Map<Item, Integer> Quantity = new HashMap<Item, Integer>();
        Item item = null;
        String itemName;
        double itemPrice = 0;
        double totalPrice = 0.0;
        double sum = 0.0;
        double disCount = 0.0;
        int itemquantity;
        scan = new Scanner(System.in);
        String keepShopping = "y";
        System.out.println("****Shopping Cart****");
        do {
        	System.out.println("Select Item to Add to your Bag: ");
            itemName = scan.nextLine();
            System.out.print("Enter the quantity: ");
            itemquantity = scan.nextInt();
            if (itemName.equals("Apple") || (itemName.equals("apple"))) {
                itemPrice = 35*itemquantity;
        	} else if (itemName.equals("Banana")
                    || (itemName.equals("banana"))) {
            	itemPrice = 20*itemquantity;
            	
            }else if (itemName.equals("Kiwi")
                    || (itemName.equals("kiwi"))) {
            	if(itemquantity%2!=0) { 
					  System.out.println("Kiwi buy one get one free"); 
					  System.out.print("Enter the quantity: ");
			            itemquantity = scan.nextInt();
			            itemPrice = 80*itemquantity/2; 
				  }
				  else { 
					  itemPrice = 80*itemquantity/2; 
					  }
            }else if (itemName.equals("Orange")
                    || (itemName.equals("orange"))) {
            	if(itemquantity<3) {
            		itemPrice = 30*itemquantity;
            	}
            	else {
            		disCount = 33.33;
            		double s=100-disCount;
            		itemPrice = 30*itemquantity;
            		itemPrice = (s*itemPrice)/100;
            		
            	}
                
            } else {
                itemPrice = 0;
            }
            item = new Item(itemName, itemPrice);
            ItemCart.add(item);
            Quantity.put(item, itemquantity); 
            for (int i = 0; i < ItemCart.size(); i++) {
                Item itm = ItemCart.get(i);
                System.out.println(itm);
            }
            System.out.print("Continue shopping (y/n)? ");
            scan.nextLine();
            keepShopping = scan.nextLine();
        } while (keepShopping.equals("y"));

        for (int i = 0; i < ItemCart.size(); i++) {
            Quantity.put(item, itemquantity);
            Item itm = ItemCart.get(i);
            System.out.println(itm);
            totalPrice =itm.getPrice();
            sum += totalPrice;
            
        }
        System.out.println("The total price is: " + sum);
        System.out.println("Do you wan to proceed to checkout (y/n): ");
        if (scan.nextLine().equals("y")) {
            System.out.println("Thank you for shopping with us!");

        } else {
            shopping();
        }
    	
    }
}
