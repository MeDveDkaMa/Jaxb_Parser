package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "http://sasha.rsatu.ru", name = "University")
public class Temp {

    int id;
    String FirstName;
    String LastName;
    String ContactNo;
    String Email;
    String Department;
    String Faculty;
    String Address;
    String City;
    String position;
    String job;
    String Education;
    String Assessments;
    String Group;




    public int getId() {
        return id;
    }
    @XmlElement(namespace="http://sasha.rsatu.ru", name = "id")
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name="FirstName")
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name="LastName")
    public void setLastName(String lastName) {
        LastName = lastName;
    }


    public String getContactNo() {
        return ContactNo;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "ContactNo")
    public void setContactNo(String contactNo) {
        ContactNo = contactNo;
    }

    public String getEmail() {
        return Email;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Email")
    public void setEmail(String email) {
        Email = email;
    }

    public String getDepartment() {
        return Department;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Department")
    public void setDepartment(String department) {
        Department = department;
    }

    public String getFaculty() {
        return Faculty;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Faculty")
    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public String getAddress() {
        return Address;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Address")
    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "City")
    public void setCity(String city) {
        City = city;
    }

    public String getPosition() {
        return position;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "position")
    public void setPosition(String position) {
        this.position = position;
    }

    public String getJob() {
        return job;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Job")
    public void setJob(String job) {
        this.job = job;
    }

    public String getEducation() {
        return Education;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Education")
    public void setEducation(String education) {
        Education = education;
    }

    public String getAssessments() {
        return Assessments;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "position")
    public void setAssessments(String assessments) {
        Assessments = assessments;
    }

    public String getGroup() {
        return Group;
    }
    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Group")
    public void setGroup(String group) {
        Group = group;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ContactNo='" + ContactNo + '\'' +
                ", Email='" + Email + '\'' +
                ", Department='" + Department + '\'' +
                ", Faculty='" + Faculty + '\'' +
                ", Address='" + Address + '\'' +
                ", City='" + City + '\'' +
                ", position='" + position + '\'' +
                ", job='" + job + '\'' +
                ", Education='" + Education + '\'' +
                ", Assessments='" + Assessments + '\'' +
                ", Group='" + Group + '\'' +
                '}';
    }
}
