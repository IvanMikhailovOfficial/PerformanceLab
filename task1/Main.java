package performanceLab.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(pathfinding(5, 4));
    }

    public static String pathfinding(int n, int m) {
        StringBuilder path = new StringBuilder();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        int current = 0;

        do {
            path.append(arr[current]);
            current = (current + m - 1) % n;
        } while (current != 0);
        System.out.println();
        return path.toString();
    }
}