public class TriangleExercises {
    public static void drawOneAsterisk() {
        System.out.println("*");
    }

    public static void drawHorizontalLine(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.print('\n');
    }

    public static void drawVerticalLine(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("*");
        }
    }

    public static void drawRightTriangle(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
