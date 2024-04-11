package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : PercentDiscountPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class PercentDefalutDiscountPolicy extends DefalutDiscountPolicy {
  private final double percent;

  public PercentDefalutDiscountPolicy(double percent, DiscountCondition... conditions) {
    super(conditions);
    this.percent = percent;
  }

  @Override
  protected Money getDiscountAmount(Screening screening) {
    return screening.getMovieFee().times(percent);
  }
}
