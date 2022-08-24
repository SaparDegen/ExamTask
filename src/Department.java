public class Department {
    private String depName;
    private Group[] groups;
    private Professor[] professors;

    public Department(String depName, Group ... groups) {
        this.depName = depName;
        setGroup(groups);
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Group[] getGroup() {
        return groups;
    }

    public void setGroup(Group[] groups) {
        if (groups.length >= 3 ) {
            for (int i = 0; i < groups.length; i++) {
                for (int j = i + 1; j < groups.length; j++) {
                    if (groups[i].getClassName().equals(groups[j].getClassName())) {
                        System.out.println(groups[i].getClassName() + " = " +groups[j].getClassName() + ": groups at the department should be different.");
                        break;
                    }
                }
            }
            this.groups = groups;
        } else {
            System.out.println(this.depName + " department error - Each department must have at least 3 groups taught.");
        }
    }

    public Professor[] getProfessors() {
        return professors;
    }

    public void setProfessors(Professor[] professors) {
        if (professors.length >= 2) {
            for (int i = 0; i < professors.length; i++) {
                for (int j = i + 1; j < professors.length; j++) {
                    if (professors[i].getProfName().equals(professors[j].getProfName())) {
                        System.out.println(professors[i].getProfName() + " = " + professors[j].getProfName() + ": Professors at the department should be different.");
                        break;
                    }
                }
            }
            this.professors = professors;
        } else {
            System.out.println(this.depName + " department error - Must be 2 professors per department.");
        }
    }
}
