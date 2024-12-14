import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student a = new Student("Kirill", "Nikolaev");
        Teacher b = new Teacher("Pavel", "Panilov", new ArrayList<>());
        b.addCourse("Computer Science");
        Teacher d = new Teacher("Artem", "Nikolaev", new ArrayList<>());
        d.addCourse("Computer Science");
        a.setTutor(b);


        List<People> p = new ArrayList<>();
        p.add(a);
        p.add(b);

        for (People pp: p) {
            System.out.println(pp);
        }

    }
}

