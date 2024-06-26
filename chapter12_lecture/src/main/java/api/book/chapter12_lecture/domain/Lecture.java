package api.book.chapter12_lecture.domain;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.fasterxml.jackson.databind.type.LogicalType.Collection;

/*
  Package Name : api.book.chapter12_lecture.domain 
  File Name    : Lecture 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class Lecture {

  private int pass;
  private String title;
  private List<Integer> scores = new ArrayList<>();

  public Lecture(int pass, String title, List<Integer> scores) {
    this.pass = pass;
    this.title = title;
    this.scores = scores;
  }

  public double average() {
    return scores.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
  }

  public List<Integer> getScores() {
    return Collections.unmodifiableList(scores);
  }
  public String evaluate() {
    return String.format("Pass:%d Fail:%d", passCount(), failCount());
  }
  private long passCount() {
    return scores.stream().filter(scores -> scores >= pass).count();
  }
  private long failCount() {
    return scores.size() - passCount();
  }
}
