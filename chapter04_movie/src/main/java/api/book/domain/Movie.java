package api.book.domain;


import java.time.Duration;

/*
  Package Name : api.book.domain 
  File Name    : Movie 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class Movie {
  private String title;
  private Duration runningTime;
  private Money fee;
  private DefalutDiscountPolicy defalutDiscountPolicy;

  public Movie(String title, Duration runningTime, Money fee, DefalutDiscountPolicy defalutDiscountPolicy) {
    this.title = title;
    this.runningTime = runningTime;
    this.fee = fee;
    this.defalutDiscountPolicy = defalutDiscountPolicy;
  }

  public Money getFee() {
    return fee;
  }

  public Money calculateMovieFee(Screening screening) {
    return fee.minus(defalutDiscountPolicy.calculateDiscountAmount(screening));
  }
}
