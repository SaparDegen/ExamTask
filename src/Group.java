public class Group {
    private String groupName;
    private int classTime;


    public Group(String name, int classTime) {
        this.groupName = name;
        this.classTime = classTime;
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
    
    @Override
    public String toString() {
        return "{groupName='" + groupName + "', classTime=" + classTime + "}";
    }
}
