package api.book.domain;


import java.math.BigDecimal;

/*
  Package Name : api.book.domain 
  File Name    : Money 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class Money {

  private final BigDecimal amount;

  Money(BigDecimal amount) {
    this.amount = amount;
  }

  public static final Money ZERO = Money.wons(0L);

  public static Money wons(long amount) {
    return new Money(BigDecimal.valueOf(amount));
  }

  public Money plus(Money amount) {
    return new Money(this.amount.add(amount.amount));
  }

  public Money minus(Money amount) {
    return new Money(this.amount.subtract(amount.amount));
  }

  public Money times(double percent) {
    return new Money(this.amount.multiply(
        BigDecimal.valueOf(percent)
    ));
  }

  public boolean isLessThan(Money other) {
    return amount.compareTo(other.amount) < 0;
  }

  public boolean isGreaterThanOrEquals(Money other) {
    return amount.compareTo(other.amount) >= 0;
  }
}
