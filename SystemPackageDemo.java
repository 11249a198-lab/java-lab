import java.io.*;
import java.util.*;
public class SystemPackageDemo {
    public static void main(String[] args)
            throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("DBMS");
        subjects.add("NLP");
        System.out.println("Name:" + name);
        System.out.println("Subjects:" + subjects);
        File file = new File("student.txt");
        FileWriter fw = new FileWriter(file);
        fw.write(name + " " + subjects);
        fw.close();
        System.out.println("Data written to file successfully.");
        sc.close();
    }
}
