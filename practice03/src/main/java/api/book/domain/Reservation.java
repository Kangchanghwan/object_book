package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : Reservation 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class Reservation {
  private Customer customer;
  private Screening screening;
  private Money fee;
  private int audienceCount;

  public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
    this.customer = customer;
    this.screening = screening;
    this.fee = fee;
    this.audienceCount = audienceCount;
  }
}
