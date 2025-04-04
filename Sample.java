import java.util.List;

public class Sample {
    String type;
    String make;
    String model;
    Integer capacity;

    public Sample(String type, String make, String model, Integer capacity) {
        this.type = type;
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public static void main(String[] args) {
        List<Sample> cars = List.of(
                new Sample("Sedan", "Toyota", "Camry", 5),
                new Sample("Sedan", "Honda", "Accord", 5),
                new Sample("Hatchback", "Volkswagen", "Polo", 5),
                new Sample("Hatchback", "Ford", "Fiesta", 5),
                new Sample("SUV", "Jeep", "Wrangler", 5)
        );


        List<Sample> result = cars.stream().filter(car -> car.type.equals("Sedan")).toList();


        List<String> result2 = cars.stream().map(car -> car.make.toUpperCase()).toList();


        System.out.println(result2);


    }
}
