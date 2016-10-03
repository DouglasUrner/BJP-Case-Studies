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
        drawCone();
        drawV();
        System.out.println("");
    }

    private static void drawX() {
        drawV();
        drawCone();
        System.out.println("");
    }

    private static void drawRocket() {
        drawCone();
        drawBox();
        System.out.println("|United|");
        System.out.println("|States|");
        drawBox();
        drawCone();
        System.out.println("");
    }

    private static void drawCone() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    private static void drawV() {
        System.out.println(" \\    /");
        System.out.println("  \\  /");
        System.out.println("   \\/");
    }

    private static void drawBox() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
}
