package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : DiscountCondition 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public interface DiscountCondition {
  boolean isSatisfiedBy(Screening screening);
}
