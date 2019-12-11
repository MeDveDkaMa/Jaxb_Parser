import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbWriter {
    public static void main(String[] args) throws JAXBException {

        University university = new University();
        university.setAddress("Rybinsk");
        university.setAge(45);
        university.setLastName("biruilev");
        university.setFirstName("Alexander");
        university.setCity("Rybinsk");
        university.setPosition("Rector");
        JAXBContext context = JAXBContext.newInstance(University.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.marshal(university, new File("/home/alexander/IdeaProjects/JaxbParser/src/main/resources/universityTest.xml"));
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(university, System.out);
    }
}
