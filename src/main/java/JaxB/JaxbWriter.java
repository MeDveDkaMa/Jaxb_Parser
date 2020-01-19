package JaxB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbWriter {
    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(University.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File("./src/main/resources/university.xml");
        University university = (University) unmarshaller.unmarshal(file);
        System.out.println(university);

    }
}
