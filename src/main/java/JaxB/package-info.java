@XmlSchema(
        namespace = "http://sasha.rsatu.ru",
        elementFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix="sas", namespaceURI="http://sasha.rsatu.ru")
        }
)

package JaxB;
import javax.xml.bind.annotation.*;