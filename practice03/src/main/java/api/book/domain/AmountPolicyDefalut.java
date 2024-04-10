package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : AmountPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class AmountPolicyDefalut extends DefalutDiscountPolicy {
  private final Money discountAmount;

  public AmountPolicyDefalut(Money discountAmount, DiscountCondition... conditions) {
    super(conditions);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return discountAmount;
  }
}
