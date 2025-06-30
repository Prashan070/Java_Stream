package JavaStreamPractice.Practice;

public class CopyConstuctor {
    String name;
    int number;

    public CopyConstuctor(String name, int number) {
        this.name = name;
        this.number = number;
    }

    CopyConstuctor(CopyConstuctor obj1) {
        this.name = obj1.name;
        this.number = obj1.number;
    }

    @Override
    public String toString() {
        return "CopyConstuctor{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        CopyConstuctor cp = new CopyConstuctor("Prashan", 123);
        CopyConstuctor cp1 = new CopyConstuctor("Shrey", 456);
        CopyConstuctor cp2 = new CopyConstuctor(cp1);
        cp2.setName("Batman");
        System.out.println(cp);
        System.out.println(cp1);
        System.out.println(cp2);
    }
}

