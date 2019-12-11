import generated.BreakfastMenuType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class JaxbReader {
    public static void main(String[] args) throws JAXBException {

        Consumer consumer = new Consumer();

        consumer.setAge(3);
        consumer.setId(2);
        consumer.setName("Max");
        System.out.println(consumer.getAge());

        BreakfastMenuType breakfastMenuType = new BreakfastMenuType();
        JAXBContext context = JAXBContext.newInstance(BreakfastMenuType.class);
        Marshaller marshaller = context.createMarshaller();

        //marshaller.marshal(context , new File("/home/alexander/IdeaProjects/JaxbParser/src/main/resources/myxmlfromclass.xml"));
        marshaller.marshal(context , new File("/home/alexander/IdeaProjects/JaxbParser/src/main/resources/university.xml"));


    }
}
