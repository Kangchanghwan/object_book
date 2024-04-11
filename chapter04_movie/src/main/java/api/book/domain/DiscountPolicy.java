package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : DiscountPolicy 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public interface DiscountPolicy {
  Money calculateDiscountAmount(Screening screening);
}
