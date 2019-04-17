public class Account {

    void withdraw(int amount){}

    boolean checkBalance(int amount){

        if(amount > 10000){
            throw new IllegalArgumentException("Allowed limit is exceed");

        }
        return  true;

    }
}
