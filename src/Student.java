public class Student {
    private String studentName;
    private Group[] groups;

    public Student(String name, Group ... groups) {
        studentName = name;
        setGroups(groups);
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        if (groups.length > 1) {
            for (int i = 0; i < groups.length; i++) {
                for (int j = i + 1; j < groups.length; j++) {
                    if (groups[i].getClassTime() == groups[j].getClassTime()) {
                        System.out.println(groups[i].getClassName() + " = " +groups[j].getClassName() + ": no group can be equal in time with another group.");
                        break;
                    }
                }
            }
            this.groups = groups;
        } else {
            this.groups = groups;
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
