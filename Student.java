import java.util.*;

class InnerStudent {

    String name;
    int rollNo;
    float marks;
    int age;

    InnerStudent(String name, int rollNo, float marks, int age) {
        this.rollNo = rollNo;
        this.marks = marks;
        this.age = age;
        this.name = name;
    }

    double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Name = " + name + " rollNo = " + rollNo + " marks = " + marks + " age = " + age
            ;
    }

    class MarkComparator implements Comparator<InnerStudent> {
        @Override
        public int compare(InnerStudent s1, InnerStudent s2) {
            return Double.compare(s1.getMarks(), s2.getMarks());
        }
    }

}

public class Student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<InnerStudent> object = new ArrayList<>();
        object.add(new InnerStudent("neeraj", 24058, 87.5f, 20));
        object.add(new InnerStudent("Abhishek", 24005, 88.4f, 21));
        object.add(new InnerStudent("Priyansh", 24067, 78.3f, 22));
        object.add(new InnerStudent("Manish", 24052, 87.4f, 19));

        Collections.sort(object, (s1, s2) -> Double.compare(s1.marks, s2.marks));
        System.out.println(object);

        sc.close();

    }
}
