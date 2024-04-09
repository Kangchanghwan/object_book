package api.book.domain;


import java.time.LocalDateTime;

/*
  Package Name : api.book.object01.domain 
  File Name    : Invitation 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class Invitation {
  private LocalDateTime when;

  public Invitation(LocalDateTime when) {
    this.when = when;
  }
}
