package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(namespace = "http://sasha.rsatu.ru", name = "University")
public class UniversityTemp {
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




    @XmlElement (namespace="http://sasha.rsatu.ru", name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name="FirstName")
    public String getFirstName() {return FirstName; }
    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name="LastName")
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

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Email")
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Department")
    public String getDepartment() {
        return Department;
    }
    public void setDepartment(String department) {
        Department = department;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Faculty")
    public String getFaculty() {
        return Faculty;
    }
    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "Address")
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru", name = "City")
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "position")
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Job")
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Education")
    public String getEducation() {
        return Education;
    }
    public void setEducation(String education) {
        Education = education;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Assessments")
    public String getAssessments() {
        return Assessments;
    }
    public void setAssessments(String assessments) {
        Assessments = assessments;
    }

    @XmlElement(namespace = "http://sasha.rsatu.ru",name = "Group")
    public String getGroup() {
        return Group;
    }
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


