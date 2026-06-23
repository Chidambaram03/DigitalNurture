public class BuilderPatternTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setOperatingSystem("Windows 11")
                .build();

        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setOperatingSystem("Windows 10")
                .build();

        System.out.println("Gaming PC:");
        System.out.println(gamingPC);

        System.out.println("Office PC:");
        System.out.println(officePC);
    }
}