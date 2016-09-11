public class Main {
    public static void main(String[] args) {
        TriangleExercises triangleExercises = new TriangleExercises();
        triangleExercises.drawOneAsterisk();
        triangleExercises.drawHorizontalLine(8);
        triangleExercises.drawVerticalLine(3);
        triangleExercises.drawRightTriangle(3);

        DiamondExercises diamondExercises = new DiamondExercises();
        diamondExercises.drawIsoscelesTriangle(3);
        diamondExercises.drawDiamond(3);
        diamondExercises.drawDiamondWithName(3);
    }
}
