import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {
    public static void main(String[] args) throws JAXBException {
        File file = new File("/home/alexander/IdeaProjects/JaxbParser/src/main/resources/universityTest.xml");
        JAXBContext context = JAXBContext.newInstance(University.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        University university = (University) unmarshaller.unmarshal(file);
        System.out.println(university.Address);
        System.out.println(university.Age);
        System.out.println(university.City);
    }
}
