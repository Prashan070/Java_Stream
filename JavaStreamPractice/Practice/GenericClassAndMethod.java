package JavaStreamPractice.Practice;

class GenClass<K> {
    K val;

    public GenClass(K val) {
        this.val = val;
    }

    public K getVal() {
        return val;
    }

    public void setVal(K val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "GenClass{" +
                "val=" + val +
                '}';
    }

    //the method is static, it cannot use class-level generics (like K in GenClass<K>).
    K display() {
        return val;
    }
}


public class GenericClassAndMethod {
    public static void main(String[] args) {

        GenClass<String> s1 = new GenClass<>("Prashan");
        GenClass<Integer> s2 = new GenClass<>(1);


    }
}
