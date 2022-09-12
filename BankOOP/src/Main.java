public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount(901,  1750.00,"Jim Jones", "jim.jones@email.com" , "416-967-4343");
        account.withdraw(8000);
        account.deposit(19999);
        System.out.println(account.getBalance());
    }
}
