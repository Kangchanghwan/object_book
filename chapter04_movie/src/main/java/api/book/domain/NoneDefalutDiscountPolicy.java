package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : NoneDiscountPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class NoneDefalutDiscountPolicy implements DiscountPolicy {


  @Override
  public Money calculateDiscountAmount(Screening screening) {
    return Money.ZERO;
  }
}
