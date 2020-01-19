package JaxB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxbReader {
    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(University.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        File file = new File("./src/main/resources/university.xml");
        University university = (University) unmarshaller.unmarshal(file);
        System.out.println(university + "\n\n\n");


        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(university, System.out);
        marshaller.marshal(university, new File("./src/main/resources/universityTest.xml"));

    }
}
