/**
 * DrawFigures1 - Starting point for BJP Case Study 1.5: DrawFigures.
 *
 * Created by dlu on 02.10.2016.
 */
public class DrawFigures1 {
    public static void main(String[] args) {
        drawDiamond();
        drawX();
        drawRocket();
    }

    private static void drawDiamond() {

        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");

        System.out.println("");
    }

    private static void drawX() {

        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");

        System.out.println("");
    }

    private static void drawRocket() {

        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }
}
