package api.book.domain;


import org.springframework.cglib.core.Local;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

/*
  Package Name : api.book.domain 
  File Name    : PeriodCondition 
  Author       : gangchanghwan 
  Created Date : 2024/04/09 
  Description  : 
 */
public class PeriodCondition implements DiscountCondition {
  private DayOfWeek dayOfWeek;
  private LocalTime startTime;
  private LocalTime endTime;

  public PeriodCondition(DayOfWeek dayOfWeek, LocalTime startTime, LocalTime endTime) {
    this.dayOfWeek = dayOfWeek;
    this.startTime = startTime;
    this.endTime = endTime;
  }

  @Override
  public boolean isSatisfiedBy(Screening screening) {
    return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
           startTime.compareTo(screening.getStartTime().toLocalTime()) <= 0 &&
           endTime.compareTo(screening.getStartTime().toLocalTime()) >= 0;
  }
}
