package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://sasha.rsatu.ru")
public class Student {

    int id;
    String FirstName;
    String LastName;
    String ContactNo;
    String Email;
    String Job;

    @XmlElement(name = "Education")
    private Education education;

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Firstname")
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Lastname")
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "ContactNo")
    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Job")
    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Email")
    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ContactNo='" + ContactNo + '\'' +
                ", Email='" + Email + '\'' +
                ", Job='" + Job + '\'' +
                ", Job='" + education + '\'' +
                '}';
    }
}
