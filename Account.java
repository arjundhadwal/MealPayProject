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

    //methods

    public void makePurchase(int myMonth, int myDay, double myAmount){
        Transaction t = new Transaction(myMonth, myDay, myAmount, thisID);
        transactions.add(t);
        balance += myAmount;
    }

    public String toString(){
        return ("Name : "+name+" Balance: "+balance+" ID Number: "+thisID);
    }

    public static void listAllTransactions(){
        System.out.println("Listing all transactions");
        for(int i = 0; i<transactions.size(); i++){
            System.out.println(transactions.get(i).toString());
        }
    }

    public ArrayList<Transaction> getTransactionList(){
        return transactions;
    }
    
}
