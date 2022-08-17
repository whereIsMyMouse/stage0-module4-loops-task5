package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int i = 1; i <= height; i++) {
            if (i <= (height + 1) / 2) {
                System.out.println(" ".repeat(i - 1) + "8".repeat(height - 2 * (i - 1)) + " ".repeat(i - 1));
            } else {
                System.out.println(" ".repeat(height - i) + "8".repeat(2*i - height) + " ".repeat(height - i));
            }
        }
    }
}



