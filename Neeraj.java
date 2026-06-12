class Animal {
    void eats() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void barks() {
        System.out.println("The dog barks: woof");
    }
}

class Puppy extends Dog {
    void puppy() {
        System.out.println("The puppy is cute");
    }
}

public class Neeraj {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.barks();
        d1.eats();
        Puppy p1 = new Puppy();
        p1.puppy();
    }
}