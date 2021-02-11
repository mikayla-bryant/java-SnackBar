package javaSnackbar; // Folder Name

/*
To compile: javac folderName/*.java
To create jar file: Navigate to src folder and type "jar cvfe folderName.jar folderName.Main folderName/*.class"
To run file: java -jar folderName.jar
 */

public class Main 
{
    private static void workWithData()
    {
        System.out.println("Welcome to the Vending Machine App!");
        System.out.println();

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());


        s4.buySnack(3);
        c1.buySnack(s4.getTotalCost(3));

        System.out.println(c1.getName() + " cash on hand " + "$" + c1.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
        System.out.println();

        s3.buySnack(1);
        c1.buySnack(s3.getTotalCost(1));

        System.out.println(c1.getName() + " cash on hand " + "$" + c1.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();
        
        s4.buySnack(2);
        c2.buySnack(s4.getTotalCost(2));

        System.out.println(c2.getName() + " cash on hand " + "$" + c2.getCashOnHand());
        System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());
        System.out.println();

        c1.addCash(10.00);

        System.out.println(c1.getName() + " cash on hand " + "$" + c1.getCashOnHand());
        System.out.println();

        s2.buySnack(1);
        c1.buySnack(s2.getTotalCost(1));

        System.out.println(c1.getName() + " cash on hand " + "$" + c1.getCashOnHand());
        System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());
        System.out.println();
        
        s3.addQuantity(12);
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();

        s3.buySnack(3);
        c2.buySnack(s3.getTotalCost(3));

        System.out.println(c2.getName() + " cash on hand " + "$" + c2.getCashOnHand());
        System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
        System.out.println();

        
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}
