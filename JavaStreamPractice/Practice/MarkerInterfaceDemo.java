package JavaStreamPractice.Practice;


interface demo {

}

class Animals implements demo {
    void display() {
        System.out.println("For validation purpose");
    }
}

public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Animals dog = new Animals();

            if(dog instanceof demo){
                System.out.println("/////continue");
            }else {
                throw  new RuntimeException("NOt valid access");
            }
    }
}

//serilation
//closeable
//remote
