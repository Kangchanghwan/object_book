package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : AmountPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class AmountPolicy extends DiscountPolicy {
  private final Money discountAmount;

  public AmountPolicy(Money discountAmount, DiscountCondition... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
