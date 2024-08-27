import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        try {
            System.out.println("Кайсы фигура? (1 / parallelepiped, 2 / cylinder): ");
            String choice = scan.nextLine().toLowerCase().replace(" ","");

            switch (choice) {
                case "1", "parallelepiped":
                    System.out.print("Узундугун жазыныз: ");
                    double length = getPositiveDouble(scan);
                    System.out.print("Туурасын жазыныз: ");
                    double width = getPositiveDouble(scan);
                    System.out.print("Бийиктигин жазыныз: ");
                    double height = getPositiveDouble(scan);

                    Parallelepiped parallelepiped = new Parallelepiped(length,width,height);
                    parallelepiped.area();
                     parallelepiped.volume();
                    break;

                case "2", "cylinder":
                    System.out.println("Радиусун жазыныз: ");
                    double radius = getPositiveDouble(scan);
                    System.out.println("Бийиктигин жазыныз: ");
                    double heightC = getPositiveDouble(scan);

                    Cylinder cylinder = new Cylinder(radius, heightC);
                     cylinder.area();
                     cylinder.volume();
                    break;

                default:
                    System.out.println("Туура танданыз! (1 / parallelepiped, 2 / cylinder).");
            }
        } catch (InputMismatchException e) {
            System.out.println("Туура эмес жазылыш. (1 / parallelepiped, 2 / cylinder)");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


    private static double getPositiveDouble(Scanner scan) {
        while (true) {
            try {
                double value = scan.nextDouble();
                if (value < 0) {
                    throw new IllegalArgumentException("Терс сан болбошу керек");
                }
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Туура эмес жазылыш! Сан жазыныз.");
                scan.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}