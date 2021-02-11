package javaSnackbar;

public class Customer
{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public double addCash(double cash)
    {
        cashOnHand = cashOnHand + cash;
        return cashOnHand;
    }

    public double buySnack(double totalCost)
    {
        cashOnHand = cashOnHand - totalCost;
        return cashOnHand;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public double getCashOnHand()
    {
        return cashOnHand;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}