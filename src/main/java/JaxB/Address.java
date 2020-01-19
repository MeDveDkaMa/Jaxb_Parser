package JaxB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://sasha.rsatu.ru")
public class Address {

    String City;
    String position;

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "City")
    public String getCity() {return City; }
    public void setCity(String city) {City = city; }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "position")
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

