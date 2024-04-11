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
public class NightlyDiscountPhone extends Phone {

  private static final int LATE_NIGHT_HOUR = 22;

  private final Money regularAmount;
  private final Money nightlyAmount;
  private final Duration seconds;
  private List<Call> calls = new ArrayList<>();

  public NightlyDiscountPhone(double taxRate, Money regularAmount, Money nightlyAmount, Duration seconds) {
    super(taxRate);
    this.regularAmount = regularAmount;
    this.nightlyAmount = nightlyAmount;
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
    if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
      return nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
    return regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds());
  }

}
