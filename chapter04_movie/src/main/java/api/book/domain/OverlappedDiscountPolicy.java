package api.book.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
  Package Name : api.book.domain
  File Name    : OverlappedDiscountPolicy
  Author       : gangchanghwan
  Created Date : 2024/04/10
  Description  :
 */
public class OverlappedDiscountPolicy implements DiscountPolicy {

  private List<DiscountPolicy> policies = new ArrayList<>();

  public OverlappedDiscountPolicy(DiscountPolicy ...policies) {
    this.policies = Arrays.asList(policies);
  }

  @Override
  public Money calculateDiscountAmount(Screening screening) {
    return policies.stream()
        .map(it -> it.calculateDiscountAmount(screening))
        .reduce(Money.ZERO, Money::plus);
  }
}
