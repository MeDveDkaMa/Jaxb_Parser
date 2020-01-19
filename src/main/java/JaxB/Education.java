package JaxB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://sasha.rsatu.ru")
public class Education {

    String Assessments;
    String Group;
    String Department;
    String Faculty;

    @XmlElement(name = "Assessments")
    public String getAssessments() {
        return Assessments;
    }

    public void setAssessments(String assessments) {
        Assessments = assessments;
    }
    @XmlElement(name = "Group")
    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }
    @XmlElement(name = "Department")
    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
    @XmlElement(name = "Faculty")
    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    @Override
    public String toString() {
        return "Education{" +
                "Assessments='" + Assessments + '\'' +
                ", Group='" + Group + '\'' +
                ", Department='" + Department + '\'' +
                ", Faculty='" + Faculty + '\'' +
                '}';
    }
}
