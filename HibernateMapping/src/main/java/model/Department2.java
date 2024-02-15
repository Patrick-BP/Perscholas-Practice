package model;

import jakarta.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "Department")
public class Department2 implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deptId;
    private String deptName;

    public Department2(int deptId, String deptName) {
        super();
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @OneToMany(targetEntity = Teacher2.class, cascade = {CascadeType.ALL})
    private List<Teacher2> teacherList;

    public List<Teacher2> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher2> teacherList) {
        this.teacherList = teacherList;
    }

    public Department2() {
    }

    public Department2(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}