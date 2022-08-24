public class Main {
    public static void main(String[] args) {

        Professor[] profs = {
                new Professor("John"),
                new Professor("Michael")
        };

        Group[] groups = {
                new Group("M1-10", 9, new Professor[]{profs[0]}),
                new Group("M1-20", 10, new Professor[]{profs[1]}),
                new Group("M1-30", 11, new Professor[]{profs[0]}),
                new Group("M1-40", 12, new Professor[]{profs[1]}),
                new Group("M1-50", 13, new Professor[]{profs[0]}),
                new Group("M1-60", 14, new Professor[]{profs[1]}),
                new Group("M1-70", 15, new Professor[]{profs[0]}),
                new Group("M1-80", 16, new Professor[]{profs[1]}),
                new Group("M1-90", 17, new Professor[]{profs[0]})
        };

        String[] arrRes = new String[profs.length];
        for (int k = 0; k < profs.length; k++) {
            String res1 = "";
            for (int i = 0; i < groups.length; i++) {
                for (int j = 0; j < groups[i].getProfessors().length; j++) {
                    if (profs[k].equals(groups[i].getProfessors()[j])) {
                        res1 += groups[i].getClassTime() + ",";
                    }
                }
            }
            arrRes[k] = res1;
        }

        for (int i = 0; i < arrRes.length; i++) {
            String[] arrR = arrRes[i].split(",");
            for (int j = 0; j < arrR.length; j++) {

            }
        }

        Department dep1 = new Department("Java", new Group[]{groups[0], groups[1], groups[2]});
        Department dep2 = new Department("JavaScript", new Group[]{groups[3], groups[4], groups[5]});
        Department dep3 = new Department("Python", new Group[]{groups[6], groups[7], groups[8]});






/*        for (int i = 0; i < classrooms.length; i++) {
            for (int j = 0; j < profs.length; j++) {

            }
            if ()
        }


        Student student1 = new Student("Student1");
        Student student2 = new Student("Student2");
        Student student3 = new Student("Student3");
        Student student4 = new Student("Student4");
        Student student5 = new Student("Student5");
        Student student6 = new Student("Student6");
        Student student7 = new Student("Student7");
        Student student8 = new Student("Student8");
        Student student9 = new Student("Student9");
        Student student10 = new Student("Student10");*/
    }
}