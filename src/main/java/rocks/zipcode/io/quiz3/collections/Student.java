package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    String labName;
    LabStatus labStatus;

    public Student() {
        this(null);
    }

    public Student(Map<Lab, LabStatus> map) {

    }

    public Lab getLab(String labName) {

        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName=labName;
        this.labStatus =labStatus;
    }


    public void forkLab(Lab lab) {

        System.out.println( "Student{" +
                "labName='" + labName + '\'' +
                ", labStatus=" + labStatus +
                '}');
    }



    public LabStatus getLabStatus(String labName) {

        throw new UnsupportedOperationException("Method not yet implemented");
    }
}
