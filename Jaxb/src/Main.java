import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;


public class Main {
public static void main(String[] args) throws JAXBException, JSONException, XMLStreamException {
    Path path=Paths.get("D:\\junk\\testIn.txt");
    Course course=new Course();
    course.setCourse(15);
    course.setName("javaaa");
    course.add(new Student(2,"2"));
    course.add(new Student(3,"3"));
    course.add(new Student(4,"4"));
    JAXBContext context=JAXBContext.newInstance(Course.class,Student.class);
    Marshaller marshaller=context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(course, path.toFile());
    Unmarshaller unmarshaller = context.createUnmarshaller();
    Course course2 = (Course) unmarshaller.unmarshal(path.toFile());
   // System.out.println(course2.toString());
 //   JSONObject obj=new JSONObject(course.toString());
    JSONObject obj= new JSONObject();
    MappedNamespaceConvention convension = new MappedNamespaceConvention();
  //  marshaller.mars
    MappedXMLStreamWriter writer=new MappedXMLStreamWriter(convension, new PrintWriter(System.out));
    marshaller.marshal(course,writer);
    MappedXMLStreamReader reader = new MappedXMLStreamReader(obj,convension);
   Course course3= (Course) unmarshaller.unmarshal(reader);
   System.out.println(course3);
}
}
