package api.book.chapter12_lecture.domain;


import java.util.List;
import java.util.stream.Collectors;

/*
  Package Name : api.book.chapter12_lecture.domain 
  File Name    : GradeLecture 
  Author       : gangchanghwan 
  Created Date : 2024/04/11 
  Description  : 
 */
public class GradeLecture extends Lecture {
  private List<Grade> grades;

  public GradeLecture(int pass, String title, List<Integer> scores, List<Grade> grades) {
    super(pass, title, scores);
    this.grades = grades;
  }

  @Override
  public String evaluate() {
    return super.evaluate() + "," + gradesStatics();
  }

  private String gradesStatics() {
    return grades.stream()
        .map(this::format)
        .collect(Collectors.joining());
  }

  private String format(Grade grade) {
    return String.format("%s:%d", grade.getName(), gradeCount(grade));
  }

  private long gradeCount(Grade grade) {
    return getScores().stream().filter(grade::include).count();
  }

}
