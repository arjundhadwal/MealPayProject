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
        System.out.println("Account "+name+" added");
    }

    public String transactionsByDay(int month, int day){
        String s = "";
        ArrayList<Transaction> tList = Account.getTransactionsByDate(month, day); //reference the file
        for(Transaction t: tList){
        s+=t.toString();
        s+=" by ";
        s+=getAccount(t.getPurchaserID()).getAcctName();
        s+="\n";
        }
        return s;
    }

    public String listNegativeBalanceAccts(){
        String s = "";
        for(Account a: accts){
            if(a.getBalance() < 0){
                s+=a.toString();
                s+= "\n";
            }
            }
            return s;
        }
        public void printAllAccounts(){
            for(Account a: accts){
                System.out.println(a.toString());
            }
        }

        public void chargeLunch(int ID, int month, int day){
            accts.get(ID).buyLunch(month, day);
        }

        public void addFunds(int ID, int month, int day, double myAmount){
            accts.get(ID).makeTransaction(month, day, myAmount);
        }

        public Account getAccount(int ID){
            return accts.get(ID);
        }

        public String getAccountTransactions(int ID){
            String s = " ";
            s+=getAccount(ID).getAcctName();
            s+= " ";
            ArrayList<Transaction> trList = getAccount(ID).getMyTransactions();
            for(Transaction tr:trList){
                s+=tr.toString();
                s+="\n";
            }
            return s;
        }
    }


