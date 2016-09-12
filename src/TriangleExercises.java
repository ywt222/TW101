public class TriangleExercises {
    public void drawOneAsterisk() {
        System.out.println("*");
    }

    public void drawHorizontalLine(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.print('\n');
    }

    public void drawVerticalLine(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
