package api.book.domain;


import java.util.ArrayList;
import java.util.List;

/*
  Package Name : api.book.domain 
  File Name    : Phone 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public abstract class Phone {

  private double taxRate;
  private List<Call> calls = new ArrayList<>();

  public Phone(double taxRate) {
    this.taxRate = taxRate;
  }

  public Money calculateFee() {
    Money totalFee = Money.ZERO;
    for (Call call : calls) {
      totalFee = totalFee.plus(calculateCallFee(call));
    }
    return totalFee.plus(totalFee.times(taxRate));
  }

  protected abstract Money calculateCallFee(Call call);
}
