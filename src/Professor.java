public class Professor {
    private String profName;
    private Group[] groups;

    public Professor(String name, Group ... groups) {
        profName = name;
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
                        System.out.println(groups[i].getClassName() + " = " +groups[j].getClassName() + ": no professor may teach more than one class at the same time.");
                        break;
                    }
                }
            }
            this.groups = groups;
        } else {
            this.groups = groups;
        }
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }
}
