class Shape {
    void red() {
        // super.blue();
        System.out.println("The color is red");
    }

}

class circle extends Shape {
    void blue() {
        super.red();
        System.out.println("The color is blue");
    }

}

public class Nirz {
    public static void main(String[] args) {
        circle s1 = new circle();
       // s1.red();
       s1.blue();

    }
}
