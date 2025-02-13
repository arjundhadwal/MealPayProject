import java.util.*;
public class Account {
    private String name = "";
    private int thisID = 0;
    private static int idNumber = 0;
    private double balance = 0;
    private static ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    //constructors
    public Account(String myName){
        thisID = idNumber;
        idNumber++;
        name = myName;
        balance = 0;
    }

    public void makePurchase(int myMonth, int myDay, double myAmount){
        Transaction t = new Transaction(myMonth, myDay, myAmount, thisID);
        transactions.add(t);
    }
    
}
