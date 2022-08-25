import java.time.LocalTime;

public class Group {
    private String groupName;
    private LocalTime classTime;


    public Group(String name, LocalTime classTime) {
        this.groupName = name;
        this.classTime = classTime;
    }

    public LocalTime getClassTime() {
        return classTime;
    }

    public void setClassTime(LocalTime classTime) {
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
