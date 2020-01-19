package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(namespace = "http://sasha.rsatu.ru")
public class Administrations {

    @XmlElement(name = "administration")
    private List<Administration> administration;

    @Override
    public String toString() {
        return "Administrations: " + "\n" + administration;
    }
}
