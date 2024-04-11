package api.book.domain;


/*
  Package Name : api.book.object01.domain 
  File Name    : Theater 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class Theater {

  private TicketSeller ticketSeller;

  public Theater(TicketSeller ticketSeller) {
    this.ticketSeller = ticketSeller;
  }

  public void enter(Audience audience) {
    ticketSeller.sellTo(audience);
  }
}
