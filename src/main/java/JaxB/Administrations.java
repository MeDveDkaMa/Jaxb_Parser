package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://sasha.rsatu.ru")
public class Administrations {

    @XmlElement(name = "administration")
    private Administration administration;

    @Override
    public String toString() {
        return "Administration{" + administration;
    }
}
