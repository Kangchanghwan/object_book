package api.book.domain;


import java.util.ArrayList;
import java.util.List;

/*
  Package Name : api.book.object01.domain 
  File Name    : TicketOffice 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class TicketOffice {
  private Long amount;
  private List<Ticket> tickets = new ArrayList<>();

  public TicketOffice(Long amount, List<Ticket> tickets) {
    this.amount = amount;
    this.tickets.addAll(tickets);
  }

  private Ticket getTicket() {
    if (tickets.isEmpty()) {
      return null;
    }
    return tickets.removeFirst();
  }
  public void sellTicketTo(Audience audience) {
    this.plusAmount(audience.buy(getTicket()));
  }

  private void minusAmount(Long amount) {
    this.amount -= amount;
  }

  private void plusAmount(Long amount) {
    this.amount += amount;
  }
}
