package api.book.domain;


/*
  Package Name : api.book.object01.domain 
  File Name    : Bag 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class Bag {
  private Long amount;
  private final Invitation invitation;
  private Ticket ticket;

  public Bag(Long amount) {
    this.amount = amount;
    this.invitation = null;
  }

  public Bag(Long amount, Invitation invitation) {
    this.amount = amount;
    this.invitation = invitation;
  }

  public Long hold(Ticket ticket){
    if(hasInvitation()){
      this.setTicket(ticket);
      return 0L;
    } else {
      this.setTicket(ticket);
      this.minusAmount(ticket.getFee());
      return ticket.getFee();
    }
  }

  public boolean hasInvitation() {
    return invitation != null;
  }
  public boolean hasTicket() {
    return ticket != null;
  }
  public void setTicket(Ticket ticket) {
    this.ticket = ticket;
  }
  public void minusAmount(Long amount) {
    this.amount -= amount;
  }
  public void plusAmount(Long amount) {
    this.amount += amount;
  }
}
