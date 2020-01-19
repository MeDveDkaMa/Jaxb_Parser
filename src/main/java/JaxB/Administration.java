package JaxB;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://sasha.rsatu.ru")
    public class Administration
    {

        @XmlElement(name = "Address")
        private Address address;

        int id;
        String FirstName;
        String LastName;
        String ContactNo;
        String Email;
        String Department;
        String Faculty;

        @XmlElement(namespace = "http://sasha.rsatu.ru", name = "id")
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }

        @XmlElement(namespace = "http://sasha.rsatu.ru", name = "FirstName")
        public String getFirstName() {
            return FirstName;
        }
        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        @XmlElement(namespace = "http://sasha.rsatu.ru", name = "LastName")
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


        @Override
        public String toString() {
            return  "\n id=" + id +
                    ", FirstName='" + FirstName + '\'' +
                    ", LastName='" + LastName + '\'' +
                    ", ContactNo='" + ContactNo + '\'' +
                    ", Email='" + Email + '\'' +
                    ", Department='" + Department + '\'' +
                    ", Faculty='" + Faculty + '\'' +
                    ", Faculty='" + address + '\'' +
                    '}';
        }
    }



