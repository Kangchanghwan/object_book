package api.book.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  Package Name : api.book.domain 
  File Name    : DiscountPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public abstract class DiscountPolicy {
  private List<DiscountCondition> conditions = new ArrayList<>();

  public DiscountPolicy(DiscountCondition... conditions) {
    this.conditions = Arrays.asList(conditions);
  }

  public Money calculateDiscountAmount(Screening screening) {
    return conditions.stream()
        .filter(condition -> condition.isSatisfiedBy(screening))
        .map(condition -> getDiscountAmount(screening))
        .reduce(Money.ZERO, Money::plus);
  }

  abstract protected Money getDiscountAmount(Screening screening);
}
