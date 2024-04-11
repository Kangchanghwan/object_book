package com.example.demo.domain;


/*
  Package Name : com.example.demo.domain 
  File Name    : AdditionalRatePolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public abstract class AdditionalRatePolicy implements RatePolicy{

  private RatePolicy next;

  public AdditionalRatePolicy(RatePolicy next) {
    this.next = next;
  }

  @Override
  public Money calculateFee(Phone phone) {
    Money fee = next.calculateFee(phone);
    return afterCalculated(fee);
  }

  protected abstract Money afterCalculated(Money fee);
}
