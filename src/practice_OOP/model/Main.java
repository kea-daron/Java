package practice_OOP.model;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount("KEA Daron");
        savingAccount.deposit(50.6);
        savingAccount.withdraw(13);
        savingAccount.showBalance();
        Account creditCardAccount = new CreditCardAccount("527-998-098-440-8225",
                LocalDateTime.of(2025,1,1,1,1),
                "001","koko");
        creditCardAccount.deposit(456.001);
        creditCardAccount.withdraw(1);
        creditCardAccount.showBalance();
    }
}
