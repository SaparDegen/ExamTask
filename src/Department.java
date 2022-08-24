public class Department {
    private String depName;
    private Group[] groups;

    public Department(String depName, Group[] groups) {
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
            this.groups = groups;
        } else {
            System.out.println(this.depName + " Each department must have at least 3 groups taught.");
        }
    }
}
