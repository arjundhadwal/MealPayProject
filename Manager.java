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

    
}
