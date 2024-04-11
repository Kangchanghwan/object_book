package com.example.demo.domain;


/*
  Package Name : com.example.demo.domain 
  File Name    : TaxablePolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class TaxablePolicy extends AdditionalRatePolicy{

  private double taxRatio;

  public TaxablePolicy(double taxRatio, RatePolicy next) {
    super(next);
    this.taxRatio = taxRatio;
  }

  @Override
  protected Money afterCalculated(Money fee) {
    return fee.plus(fee.times(taxRatio));
  }
}
