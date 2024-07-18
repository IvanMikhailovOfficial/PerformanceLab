package performanceLab.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//package task2;
public class Main {

    public static void main(String[] args) {
        double xCenter, yCenter;
        int radius;
        try (BufferedReader reader = new BufferedReader(new FileReader("src/performanceLab/task2/file1"))) {
            String[] circleCenters = reader.readLine().trim().split(" ");
            xCenter = Double.parseDouble(circleCenters[0]);
            yCenter = Double.parseDouble(circleCenters[1]);
            radius = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        List<Double> coords = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/performanceLab/task2/file2"))) {
            while (reader.ready()) {
                String[] points = reader.readLine().trim().split(" ");
                if (points.length > 0) {
                    coords.add(Double.parseDouble(points[0]));
                    coords.add(Double.parseDouble(points[1]));
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        for (int i = 0; i < coords.size(); i += 2) {
            double xScale = coords.get(i), yScale = coords.get(i + 1);
            double result = Math.pow(Math.pow(xScale - xCenter, 2) + Math.pow(yScale - yCenter, 2), 0.5);
            if (result == radius) {
                System.out.print(0 + " ");
            } else if (result < radius) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
    }
}