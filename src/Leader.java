public abstract class Leader {
    private String name;
    private String country;
    private int yearsInPower;

    abstract void giveSpeech();

    Leader(String name, String country, int yearsInPower) {
        this.name = name;
        this.country = country;
        this.yearsInPower = yearsInPower;
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Years in Power: " + yearsInPower);
    }
}
