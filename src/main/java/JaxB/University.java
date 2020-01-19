package JaxB;

import javax.xml.bind.annotation.*;


@XmlRootElement(namespace = "http://sasha.rsatu.ru", name = "University")
public class University {

    @XmlElement(name ="administrations")
    private Administrations administrations;

    @XmlElement(name ="students")
    private Students students;

    @Override
    public String toString() {
        return (administrations + "\n\n" + students);
    };

}


