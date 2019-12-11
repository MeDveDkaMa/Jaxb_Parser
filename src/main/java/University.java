import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class University {
    int id;
    String  FirstName;
    String  LastName;
    int Age;
    String ContactNo;
    String Email;
    String Department;
    String Faculty;
    String Address;
    String City;
    String position;

    public int getId() {
        return id;
    }
    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }
    @XmlElement
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }
    @XmlElement
    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }
    @XmlElement
    public void setAge(int age) {
        Age = age;
    }

    public String getContactNo() {
        return ContactNo;
    }
    @XmlElement
    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getEmail() {
        return Email;
    }
    @XmlElement
    public void setEmail(String email) {
        Email = email;
    }

    public String getDepartment() {
        return Department;
    }
    @XmlElement
    public void setDepartment(String department) {
        Department = department;
    }

    public String getFaculty() {
        return Faculty;
    }
    @XmlElement
    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getAddress() {
        return Address;
    }
    @XmlElement
    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }
    @XmlAttribute
    public void setCity(String city) {
        City = city;
    }

    public String getPosition() {
        return position;
    }
    @XmlAttribute
    public void setPosition(String position) {
        this.position = position;
    }
}

