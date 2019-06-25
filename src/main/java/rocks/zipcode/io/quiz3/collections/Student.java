package rocks.zipcode.io.quiz3.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    List<Lab> labs;

    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs =labs;
    }

    public Lab getLab(String labName) {
        return labs.get(labs.indexOf(labName));
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        getLab(labName).setStatus(labStatus);
    }

    public void forkLab(Lab lab) {
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).labStatus;
    }
}
