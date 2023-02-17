//2. Вывести все простые числа от 1 до 1000

package Java_Tasks.Tasks1;

public class task2 {
    public static void main(String[] args) {
        onethousandsimpledigits(0, 1000);
    }
    public static void onethousandsimpledigits(int x, int y) {
        int counter = 0;
        while (counter < y) {
            if (simple(x)) {
                System.out.println("i = " + x);
                counter++;
            }
            x++;
        }
    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
