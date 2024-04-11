package api.book.domain;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

/*
  Package Name : api.book.domain 
  File Name    : Phone 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class RegularPhone extends Phone {
  private Money amount;
  private Duration seconds;
  private List<Call> calls = new ArrayList<>();

  public RegularPhone(double texRate, Money amount, Duration seconds) {
    super(texRate);
    this.amount = amount;
    this.seconds = seconds;
  }

  public void call(Call call) {
    this.calls.add(call);
  }

  public List<Call> getCalls() {
    return calls;
  }

  public Duration getSeconds() {
    return seconds;
  }

  @Override
  protected Money calculateCallFee(Call call) {
    return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
  }

  public Money getAmount() {
    return amount;
  }
}
