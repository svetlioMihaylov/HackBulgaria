import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Course {
private List<Student> enrolledStudents;
private int course;
private String courseName;
public Course(){
    enrolledStudents=new ArrayList<>();
    courseName=new String();
}
public void add(Student pStudent){
    enrolledStudents.add(pStudent);
}
public void setName(String pName){
    this.courseName=pName;
}
public void setCourse(int pCourse){
    this.course=pCourse;
}
@Override
public String toString(){
    StringBuilder builder=new StringBuilder();
    for(Student s:enrolledStudents){
        builder.append(s.toString());
    }
    return courseName+"  "+ course+ builder;
}
}
