public class Transaction{
//fields
private int month = 0;
private int day = 0;
private double amount = 0;
private int studentIDNum = 0;

//constructor
public Transaction(int myMonth, int myDay, double myAmount, int myID){
    month = myMonth; day = myDay; amount = myAmount; studentIDNum = myID;
}

//methods

public int getDay(){
    return day;
}

public int getMonth(){
    return month;
}

public double getAmount(){
    return amount;
}

public int getPurchaserID(){
    return studentIDNum;
}

public String toString(){
    return ("("+month+"/"+day+"), Amount: "+amount+" ID: "+studentIDNum);
}
}