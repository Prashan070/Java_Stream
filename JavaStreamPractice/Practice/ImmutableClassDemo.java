package JavaStreamPractice.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Zebra {
    String ZebraName;

    public String getZebraName() {
        return ZebraName;
    }

    public void setZebraName(String zebraName) {
        ZebraName = zebraName;
    }

    public Zebra(String zebraName) {
        ZebraName = zebraName;
    }

    @Override
    public String toString() {
        return "Zebra{" +
                "ZebraName='" + ZebraName + '\'' +
                '}';
    }
}


final class ImmuClass {

    private final int Number;
    private final List<Integer> list;
    private final Zebra zebra;

    public ImmuClass(int number, List<Integer> list, Zebra zebra) {
        Number = number;
      //  this.list = list;
        this.list= new ArrayList<>(list);
        this.zebra = new Zebra(zebra.getZebraName());
    }

    public int getNumber() {
        return Number;
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }

    public Zebra getZebra() {
        return new Zebra(zebra.getZebraName());
    }
}


public class ImmutableClassDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);

        ImmuClass i1 = new ImmuClass(100, list, new Zebra("ZOZO"));

        System.out.println(i1.getNumber());
        System.out.println(i1.getList());
        System.out.println(i1.getZebra());

    }
}
