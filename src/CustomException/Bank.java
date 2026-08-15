package CustomException;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException (String message){
        super(message);
    }
}

class BankAccount{
    double balance=1000;
    void withDraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance for this withdrawal");
        }
        balance-=amount;
        System.out.println("Withdrawal successful, new balance:"+balance);
    }
}
public class  Bank {
    static void main(String[] args) {
        BankAccount account=new BankAccount();
        try{
            account.withDraw(1500);
        }catch(InsufficientBalanceException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
