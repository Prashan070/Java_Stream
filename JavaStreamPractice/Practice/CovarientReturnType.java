package JavaStreamPractice.Practice;


class Animal {

}

class Dog extends Animal {

}

class Parent {
    Animal display() {
        return new Animal();
    }
}

class child extends Parent {
    @Override
    Dog display() {
        return new Dog();
    }
}


public class CovarientReturnType {
    public static void main(String[] args) {

    }
}
