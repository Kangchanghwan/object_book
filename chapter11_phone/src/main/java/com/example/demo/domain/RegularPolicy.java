package com.example.demo.domain;


import java.time.Duration;

/*
  Package Name : com.example.demo.domain 
  File Name    : RegularPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class RegularPolicy extends BasicRatePolicy{

  private Money amount;
  private Duration seconds;

  public RegularPolicy(Money amount, Duration seconds) {
    this.amount = amount;
    this.seconds = seconds;
  }

  @Override
  protected Money calculateCallFee(Call call) {
    return amount.times(call.getDuration().getSeconds()/ seconds.getSeconds());
  }
}
