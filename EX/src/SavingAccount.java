public class SavingAccount {

    void withdraw(int amount){
        try {
            new Account().checkBalance(amount);
            System.out.println("Withdrawal is success");
        }catch (IllegalArgumentException ie){
            throw new RuntimeException("Withdraw fail",ie);//msg,throwable object
        }
    }

}
