public class Student extends People {

    private Teacher Tutor;

    public Student(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Student{" +
                "Tutor=" + Tutor +
                ", Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }

    public void setTutor(Teacher tutor) {
        if (this.Tutor != null) {
            throw new IllegalStateException("Student already have tutor" + this.Tutor);

        } else {
            this.Tutor = tutor;
        }


    }
}
