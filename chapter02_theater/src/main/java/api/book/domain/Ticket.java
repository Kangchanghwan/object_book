package api.book.domain;


/*
  Package Name : api.book.object01.domain 
  File Name    : Ticket 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class Ticket {
  private Long fee;

  public Ticket(Long fee) {
    this.fee = fee;
  }

  public Long getFee() {
    return fee;
  }
}
