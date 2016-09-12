public class DiamondExercises {
    public void drawIsoscelesTriangle(int count) {
        drawUpper(count);
    }

    public void drawDiamond(int count) {
        drawUpper(count);
        drawDown(count);
    }

    public void drawDiamondWithName(int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = count - i - 1; j > 0; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
        System.out.println("Bill");
        drawDown(count);
    }

    private void drawUpper(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = count - i - 1; j > 0; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j <= 2 * i; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }

    private void drawDown(int count) {
        for (int i = count - 1; i > 0; i--) {
            for (int j = i; j < count; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.print('\n');
        }
    }
}
