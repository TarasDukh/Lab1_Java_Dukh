package lv.unevesity;

public class Sculpture {
    public static int numberOfAllSculptures;
    public String name;
    public int year;
    public String material;
    protected double prise;
    protected String color;
    private String sculptor;
    private String style;


    public Sculpture() {
    }

    public Sculpture(String name, int year, String material, double prise) {
        this.name = name;
        this.year = year;
        this.material = material;
        this.prise = prise;
    }


    public Sculpture(String name, int year, String material, double prise, String color, String sculptor, String style) {
        this.name = name;
        this.year = year;
        this.material = material;
        this.prise = prise;
        this.color = color;
        this.sculptor = sculptor;
        this.style = style;
    }

    public static void toString(String name, int year, String material, double prise) {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year + " year");
        System.out.println("Material: " + material);
        System.out.println("Prise: " + prise + " $");
    }

    public static void printStaticNumberOfAllSculptures(int numberOfAllSculptures) {
        System.out.println("Numbers of all Sculptures: " + numberOfAllSculptures);
    }

    public static void resetValues(String name, int year, String material, double prise, String color) {
        name = "???????";
        year = 0000;
        material = "~~~~~~";
        prise = 0000;
        color = "raibow";

        System.out.println("Defult name: " + name);
        System.out.println("Defult year: " + year + " year B.C.");
        System.out.println("Defult material: " + material);
        System.out.println("Defult prise: " + prise + " milions" + " $");
        System.out.println("Defult color: " + color);
    }

    public String getSculptor() {
        return sculptor;
    }

    public void setSculptor(String sculptor) {
        this.sculptor = sculptor;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}

