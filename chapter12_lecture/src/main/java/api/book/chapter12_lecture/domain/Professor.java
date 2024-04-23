package api.book.chapter12_lecture.domain;


/*
  Package Name : api.book.chapter12_lecture.domain 
  File Name    : Professor 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class Professor {
  private String name;
  private Lecture lecture;

  public Professor(String name, Lecture lecture) {
    this.name = name;
    this.lecture = lecture;
  }

  public String compileStatistics() {
    return String.format("[%s] %s -AVG : %.1f", name, lecture.evaluate(), lecture.average());
  }
}
