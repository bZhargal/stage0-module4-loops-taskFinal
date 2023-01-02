package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int bottom = cathetusLength * 2 - 1;
        int spaceCount = bottom/2;
        int symbolCount = 1;
        int symbolValue = 1;

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= symbolCount/2; j++) {
                System.out.print(symbolValue);
                symbolValue--;
            }
            symbolValue++;
            for (int j = symbolCount / 2 + 1; j < symbolCount; j++) {
                ++symbolValue;
                System.out.print(symbolValue);
            }
            spaceCount--;
            symbolCount += 2;
            symbolValue++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(6);
    }
}
