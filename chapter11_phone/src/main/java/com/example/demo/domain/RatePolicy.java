package com.example.demo.domain;


/*
  Package Name : com.example.demo.domain 
  File Name    : RatePolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public interface RatePolicy {
  Money calculateFee(Phone phone);
}
