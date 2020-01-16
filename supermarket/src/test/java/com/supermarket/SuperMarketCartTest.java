package com.supermarket;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Rule;
import org.junit.Test;

import com.supermarket.model.Item;

/**
 * Unit test for simple App.
 */
public class SuperMarketCartTest

{
	@Test
    public void shoppingTest()
    {
    	SuperMarketCart superMarketCart = new SuperMarketCart();
		superMarketCart.shopping();
    	//assertEquals("35", 35*itemquantity);
    	
    }
}
