package javaSnackbar; // folder name :)


public class VendingMachine // file name - think components in React
{
    // fields (what does it know, usually private)
    private static int maxId = 0; // static = class-level, all vending machines will share the same value
    private int id;
    private String name;

    // methods (what it can do)
    // constructor
    public VendingMachine(String name)
    {   
        maxId++;
        id = maxId;
        this.name = name;
    }

    // check state method
    @Override
    public String toString()
    {
        String rtnStr = "Vending Machine Name: " + name;
        return rtnStr;
    }

    // getter
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    // setter
    public void setName(String name)   // void means we're not returning any data
    {
        this.name = name;
    }
}