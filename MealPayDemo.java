public class MealPayDemo {
    public static void main(String[] args){
        System.out.println("Welcome to the MealPay system!");
        spaceLine();
        System.out.println("Creating a manager...");
        Manager MealPaySystem = new Manager();
        System.out.println("Creating new user accounts...");
        MealPaySystem.addAccount("Timmy Tim Tim");
        MealPaySystem.addAccount("Billy Bob Joe");
        MealPaySystem.addAccount("James Quangledangle III Jr.");
        MealPaySystem.addAccount("Ronald");
        spaceLine();
        System.out.println("Operation successful. Added 4 student accounts");
        System.out.println("Listing students...");
        MealPaySystem.printAllAccounts();
        spaceLine();
        System.out.println("Adding funds to all accounts");
        MealPaySystem.addFunds(0, 2, 23, 20.00);
        MealPaySystem.addFunds(1, 2, 24, 175.00);
        MealPaySystem.addFunds(2, 2, 25 , 35000.00);
        MealPaySystem.addFunds(3, 2, 23, 35.00);
        spaceLine();
        System.out.println("Buying lunch");
        MealPaySystem.chargeLunch(0, 2, 24);
        MealPaySystem.chargeLunch(0, 2, 25);
        MealPaySystem.chargeLunch(0, 2, 26);
        MealPaySystem.chargeLunch(0, 2, 27);
        //
        MealPaySystem.chargeLunch(1, 2, 25);
        MealPaySystem.chargeLunch(1, 2, 26);
        MealPaySystem.chargeLunch(1, 2, 28);
        //
        for(int i = 0; i<5001; i++){
            MealPaySystem.chargeLunch(2, 2, 27); //A friend bet James $2 he couldn't eat 5001 corn dogs
        }
        //
        MealPaySystem.chargeLunch(3, 2, 24);
        MealPaySystem.chargeLunch(3, 2, 25);
        spaceLine();
        System.out.println("Transactions made. Showing transactions per student");
        System.out.println(MealPaySystem.getAccountTransactions(0));
        System.out.println(MealPaySystem.getAccountTransactions(1));
        //System.out.println(MealPaySystem.getAccountTransactions(2)); This will take up the whole terminal
        System.out.println(MealPaySystem.getAccountTransactions(3));
        System.out.println("Displaying students with negative balances: ");
        System.out.println(MealPaySystem.listNegativeBalanceAccts());
        spaceLine();
        System.out.println("Retrieving account with ID 2");
        System.out.println(MealPaySystem.getAccount(2));
        spaceLine();
        System.out.println("Showing all transactions on 2/25");
        System.out.println(MealPaySystem.transactionsByDay(2, 25));
        spaceLine();
        System.out.println("Implementation test complete. Meal Pay System ready.");
        
    }

    private static void spaceLine(){
        System.out.println("--------");
    }
}
