package practice_OOP.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@ToString
@NoArgsConstructor
public class CreditCardAccount extends Account{
    private String cardNumber;
    private LocalDateTime expiredDate;
    private String secretNumber;
    private String accountName;
    public CreditCardAccount(String cardNumber,LocalDateTime expiredDate, String secretNumber,String accountName){
        super(accountName);
        this.cardNumber = cardNumber;
        this.expiredDate = expiredDate;
        this.secretNumber = secretNumber;
    }
}
