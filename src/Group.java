public class Group {
    private String groupName;
    private Professor[] professors;
    private Student[] students;
    private int classTime;


    public Group(String name, int classTime, Professor[] professors) {
        this.groupName = name;
        this.classTime = classTime;
        setProfessors(professors);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getClassTime() {
        return classTime;
    }

    public void setClassTime(int classTime) {
        this.classTime = classTime;
    }

    public String getClassName() {
        return groupName;
    }

    public void setClassName(String className) {
        this.groupName = className;
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        if (professors.length >= 1) {
            this.professors = professors;
        } else {
            System.out.println(this.groupName + " Each group must be taught by at least one professor.");
        }
    }
}
