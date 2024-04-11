package com.example.demo.domain;


import java.time.Duration;
import java.time.LocalDateTime;

/*
  Package Name : api.book.domain 
  File Name    : Call 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class Call {
  private LocalDateTime from;
  private LocalDateTime to;

  public Call(LocalDateTime from, LocalDateTime to) {
    this.from = from;
    this.to = to;
  }

  public Duration getDuration() {
    return Duration.between(from, to);
  }

  public LocalDateTime getFrom() {
    return from;
  }
}
