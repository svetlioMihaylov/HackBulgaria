import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
private int studentId;
private String name;
public Student(){
    name=new String();
}
public Student(int pId,String pName){
    this.name=pName;
    this.studentId=pId;
}
public Student(Student pStudent){
    this(pStudent.studentId,pStudent.name);
}

@Override
public  String toString(){
    return studentId + ":" + name+System.lineSeparator();
}
}
