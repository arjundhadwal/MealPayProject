import java.util.*;
public class Manager {
    //fields
    private static ArrayList<Account> accts;
    //constructors
    public Manager(){
        accts = new ArrayList<Account>();
    }
    //methods

    public void addAccount(String name){
        Account a = new Account(name);
        accts.add(a);
        System.out.println("Account added");
    }
    public String transactionsByDay(int month, int day){
        String s = "";
        for(Account a: accts){
            s += a.getAcctName();
            for(Transaction tr: a.getMyTransactions()){
                s += tr.toString();
                s += "\n";
            }
            s += "\n";
        }
        return s;
    }

    public String listNegativeBalanceAccts(){
        String s = "";
        for(Account a: accts){
            if(a.getBalance() < 0){
                s+=a.getAcctName();
                s+= " ";
            }
            }
            return s;
        }
    }

