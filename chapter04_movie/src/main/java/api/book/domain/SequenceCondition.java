package api.book.domain;


/*
  Package Name : api.book.domain 
  File Name    : SequenceCondition 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class SequenceCondition implements DiscountCondition {
  private final int sequence;

  public SequenceCondition(int sequence) {
    this.sequence = sequence;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.isSequence(this.sequence);
  }
}
