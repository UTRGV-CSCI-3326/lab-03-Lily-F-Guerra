public class BankAccount{
    public static void main(String[] args){
        float account = (float) 2175.37;
        account -= 302.50;
        account += 50.03;
        account /= 2;
        account += 20.00;
        account -= 1;
        account *= 2;
        account += 1;

       System.out.println("Bob's final account balance is " + String.format("%.2f", account));
    }
}
