package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int spaceCount = cathetusLength - 1;
        int symbolCount = 1;
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < symbolCount; j++) {
                System.out.print("*");
            }
            spaceCount--;
            symbolCount++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
