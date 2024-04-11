package com.example.demo.domain;


/*
  Package Name : com.example.demo.domain 
  File Name    : RateDiscountablePolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class RateDiscountablePolicy extends AdditionalRatePolicy{
  private Money discountAmount;

  public RateDiscountablePolicy(RatePolicy next, Money discountAmount) {
    super(next);
    this.discountAmount = discountAmount;
  }

  @Override
  protected Money afterCalculated(Money fee) {
    return fee.minus(discountAmount);
  }
}
