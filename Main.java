class Students {
    String name;
    int rollNo;
    int dob;
    int marks;
    String section;
}

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students();

        s1.name = "Neeraj";
        s1.rollNo = 24058;
        s1.dob = 25042006;
        s1.marks = 480;
        s1.section = "A";

        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.rollNo);
        System.out.println("DOB: " + s1.dob);
        System.out.println("Marks: " + s1.marks);
        System.out.println("Section: " + s1.section);
    }
}