package com.example.demo.domain;


/*
  Package Name : com.example.demo.domain 
  File Name    : BasicRatePolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public abstract class BasicRatePolicy implements RatePolicy {
  @Override
  public Money calculateFee(Phone phone) {
    Money result = Money.ZERO;
    for (Call call : phone.getCalls()) {
      result.plus(calculateCallFee(call));
    }
    return result;
  }

  protected abstract Money calculateCallFee(Call call);
}
