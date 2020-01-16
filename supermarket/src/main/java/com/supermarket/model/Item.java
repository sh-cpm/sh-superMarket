package com.supermarket.model;

public class Item {
	
	private int Itemid;
	private String name;
    private double price;
    
    public Item(int itemid) {
        super();
        Itemid = itemid;
    }
    
    // -------------------------------------------------------
    //  Create a new item with the given attributes.
    // -------------------------------------------------------
    public Item (String itemName, double itemPrice)
    {
        name = itemName;
        price = itemPrice;
    }
    public Item(String itemName, int itemPrice, String size) {
        // TODO Auto-generated constructor stub
    }
    
    public double getPrice()
    {
        return price;
    }
    // -------------------------------------------------
    //   Returns the name of the item
    // -------------------------------------------------
    public String getName()
    {
        return name;
    }
    /**
     * @return the itemid
     */
    public int getItemid() {
        return Itemid;
    }
    /**
     * @param itemid the itemid to set
     */
    public void setItemid(int itemid) {
        Itemid = itemid;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString ()
    {

        return (name + "\t" + price +  "\t");
    }


}