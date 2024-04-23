package api.book.chapter12_lecture.domain;


/*
  Package Name : api.book.chapter12_lecture.domain 
  File Name    : Grade 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class Grade {
  private String name;
  private int upper,lower;

  public Grade(String name, int upper, int lower) {
    this.name = name;
    this.upper = upper;
    this.lower = lower;
  }

  public String getName() {
    return name;
  }
  public boolean isName(String name) {
    return this.name.equals(name);
  }
  public boolean include(int score) {
    return score >= lower && score <= upper;
  }
}
