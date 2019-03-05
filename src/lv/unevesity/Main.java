package lv.unevesity;


public class Main {

    public static void main(String[] args) {
        Sculpture Venera = new Sculpture("Venera Milovsca", 150, "marmur", 156.3, "white", "unknown", "anitiqe");
        Sculpture handMadeSculptere = new Sculpture("My sculpt", 2019, "clay", 150);

        System.out.println("      ");
        System.out.println("      ");

        Sculpture.numberOfAllSculptures = 2;
        System.out.println("Numbers of all Sculptures: " + Sculpture.numberOfAllSculptures);

        System.out.println("      ");

        Sculpture.printStaticNumberOfAllSculptures(3);

        System.out.println("      ");
        System.out.println("      ");

        System.out.println("Name: " + Venera.name);
        System.out.println("Year: " + Venera.year + " year B.C.");
        System.out.println("Material: " + Venera.material);
        System.out.println("Prise: " + Venera.prise + " milions" + " $");
        System.out.println("Color: " + Venera.color);
        System.out.println("Sculptor: " + Venera.getSculptor());
        System.out.println("Style: " + Venera.getStyle());

        System.out.println("      ");
        System.out.println("      ");

        System.out.println("Name: " + handMadeSculptere.name);
        System.out.println("Year: " + handMadeSculptere.year + " year");
        System.out.println("Material: " + handMadeSculptere.material);
        System.out.println("Prise: " + handMadeSculptere.prise + " $");

        System.out.println("      ");
        System.out.println("      ");

        Sculpture.toString("Mis Sara", 256, "unknown", 2250);

        System.out.println("      ");
        System.out.println("      ");

        Sculpture.resetValues("2122", 23123, "ttttt", 213123, "Green");
    }
}
