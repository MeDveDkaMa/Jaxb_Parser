package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(namespace = "http://sasha.rsatu.ru")
public class Students {

    @XmlElement(name = "student")
    private List<Student> student;

    @Override
    public String toString() {
        return student +"";
    }
}
