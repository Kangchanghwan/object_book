package api.book.domain;


/*
  Package Name : api.book.object01.domain 
  File Name    : Audience 
  Author       : gangchanghwan 
  Created Date : 2024/04/08 
  Description  : 
 */
public class Audience {
  private Bag bag;

  public Audience(Bag bag) {
    this.bag = bag;
  }

  public Bag getBag() {
    return bag;
  }
}
