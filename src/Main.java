import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Group[] groups = {
                new Group("M1-10", 9),
                new Group("M1-20", 10),
                new Group("M1-30", 11),
                new Group("M1-40", 12),
                new Group("M1-50", 9),
                new Group("M1-60", 10),
                new Group("M1-70", 11),
                new Group("M1-80", 12),
                new Group("M1-90", 13)
        };

        Student[] students = {
                new Student("Student1", groups[0], groups[1]),
                new Student("Student2", groups[1], groups[2]),
                new Student("Student3", groups[2], groups[3]),
                new Student("Student4", groups[3], groups[4]),
                new Student("Student5", groups[4], groups[5]),
                new Student("Student6", groups[5], groups[6]),
                new Student("Student7", groups[6], groups[7]),
                new Student("Student8", groups[8], groups[0]),
                new Student("Student9", groups[1], groups[2]),
                new Student("Student10", groups[3], groups[4])
        };

        Professor[] profs = {
                new Professor("John", groups[0], groups[1], groups[3], groups[2]),
                new Professor("Michael", groups[4], groups[5], groups[7], groups[8]),
                new Professor("Barbara", groups[6], groups[7], groups[8]),
        };

        Department[] departs = {
                new Department("Java", groups[1], groups[2], groups[3]),
                new Department("JavaScript", groups[3], groups[4], groups[5]),
                new Department("Python", groups[6], groups[7], groups[8])
        };

        departs[0].setProfessors(new Professor[]{profs[0], profs[1]});
        departs[1].setProfessors(new Professor[]{profs[2], profs[0]});
        departs[2].setProfessors(new Professor[]{profs[1], profs[2]});

        int bb;
        for (int i = 0; i < groups.length; i++) {
            bb = 0;
            one:
            for (int j = 0; j < profs.length; j++) {
                for (int k = 0; k < profs[j].getGroups().length; k++) {
                    if (groups[i].getClassName().equals(profs[j].getGroups()[k].getClassName())) {
                        bb = 1;
                        break one;
                    }
                }
            }
            if (bb == 0) {
                System.out.println(groups[i].getClassName() + " Each group must be taught by at least one professor.");
            }
        }
        
        System.out.println(Arrays.toString(profs));
        System.out.println(Arrays.toString(students));
    }
}
