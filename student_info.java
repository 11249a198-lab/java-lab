class Student {
    int regNo;
    int rollNo;
    String name;
    Subject[] subjects;

    Student(int regNo, int rollNo, String name, Subject[] subjects) {
        this.regNo = regNo;
        this.rollNo = rollNo;
        this.name = name;
        this.subjects = subjects;
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Registration No : " + regNo);
        System.out.println("Roll No         : " + rollNo);
        System.out.println("Name            : " + name);
        System.out.println("\nSubjects"); 
        System.out.println("Subject\t\tCredit\tMarks");

        for (Subject s : subjects) {
            System.out.println(s.subjectName + "\t\t" + s.credit + "\t" + s.marks);
        }
    }
}
