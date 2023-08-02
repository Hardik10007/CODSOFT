package Atminterface;
import java.util.HashMap;
import java.util.Map;

public class Atmoperation implements Atmoperationsinter {
    ATM atm = new ATM();
    Map<Double,String> stmt= new HashMap<>();

    @Override
    public void viewbalance() {
        System.out.println("Available balance is :"+atm.getBalance());
    }

    @Override
    public void withdraw(double withdrawamount) {
        if (withdrawamount == atm.getBalance() || withdrawamount < atm.getBalance()) {
            stmt.put(withdrawamount,"Amount Withdrawn");
            atm.setBalance(atm.getBalance() - withdrawamount);
            System.out.println("collect the cash:"+ withdrawamount);
            viewbalance();
        }
        else {
            System.out.println("invalid amount/Insufficient balance");
        }
    }
    @Override
    public void deposit(double depositamount) {
        stmt.put(depositamount,"deposited Amount");
        System.out.println(depositamount+"deposited Sucessfully");
        atm.setBalance(atm.getBalance()+depositamount);
        viewbalance();
    }

    @Override
    public void viewstatement() {
        for (Map.Entry<Double,String> m:stmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        viewbalance();
    }
}
