package com.example.demo.domain;


import java.util.ArrayList;
import java.util.List;

/*
  Package Name : api.book.domain 
  File Name    : Phone 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class Phone {

  private RatePolicy ratePolicy;
  private List<Call> calls = new ArrayList<>();

  public Money calculateFee() {
    return ratePolicy.calculateFee(this);
  }

  public List<Call> getCalls() {
    return calls;
  }

}
