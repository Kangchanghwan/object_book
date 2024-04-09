package api.book.practice01.domain;

import api.book.domain.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;


/*
  Package Name : api.book.object01.domain 
  File Name    : TheaterTest01 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
class TheaterTest01 {

  @Test
  void 티켓구매_플로우_테스트() {
    var bag = new Bag(10000L, new Invitation(LocalDateTime.now()));
    Audience audience = new Audience(bag);

    var ticketOffice = new TicketOffice(
        0L,
        List.of(new Ticket(100L), new Ticket(100L)));
    var ticketSeller = new TicketSeller(ticketOffice);
    var theater = new Theater(ticketSeller);

    theater.enter(audience);

    Assertions.assertTrue(audience.getBag().hasTicket());
  }

}