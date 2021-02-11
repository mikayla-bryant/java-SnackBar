package javaSnackbar;

/*
Fields: maxId, id, name, quantity, cost, vendingMachineId
Getters: getId, getName, getQuantity, getCost, getVendingMachineId
Setters: setName, setCost, setVendingMachineId
General Methods: addQuantity, buySnack, getTotalCost
 */

public class Snack 
{

    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack (String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int addQuantity(int quantity)
    {
        this.quantity = this.quantity + quantity;
        return this.quantity;
    }

    public int buySnack(int quantity)
    {
        this.quantity = this.quantity - quantity;
        return this.quantity;
    }

    public double getTotalCost(int quantity)
    {
        double totalCost = quantity * cost;
        return totalCost;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

}