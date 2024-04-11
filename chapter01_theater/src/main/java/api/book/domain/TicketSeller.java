package api.book.domain;


/*
  Package Name : api.book.object01.domain 
  File Name    : TicketSeller 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class TicketSeller {
  private TicketOffice ticketOffice;

  public TicketSeller(TicketOffice ticketOffice) {
    this.ticketOffice = ticketOffice;
  }

  public TicketOffice getTicketOffice() {
    return ticketOffice;
  }
}
