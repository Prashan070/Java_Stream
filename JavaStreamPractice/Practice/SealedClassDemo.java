package JavaStreamPractice.Practice;

sealed class Ani permits A ,B,D{

}


final  class A extends Ani{

}

 non-sealed class B  extends Ani{

}

sealed class D extends Ani permits E{

}

final class E extends D{

}

public class SealedClassDemo {
    public static void main(String[] args) {

    }
}

//it take control over which class will extend it
//it done by useing permit and seal keyword
//to make a class seal..
// sub class will be eiter final class must be final