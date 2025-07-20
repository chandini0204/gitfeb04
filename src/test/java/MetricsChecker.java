import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MetricsChecker {
    public static void main(String[] args) {
        // Define metrics file
        String metricsFile = "metrics.txt";

        // Define thresholds
        double responseTimeThreshold = 500.0;
        double errorRateThreshold = 0.1;
        double throughputThreshold = 50.0;

        try {
            // Read metrics from file
            File file = new File(metricsFile);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    String metric = parts[0].trim();
                    double value = Double.parseDouble(parts[1].trim());

                    // Check metrics against thresholds
                    if (metric.equals("responseTime")) {
                        if (value > responseTimeThreshold) {
                            System.out.println("Response time exceeded threshold: " + value + " > " + responseTimeThreshold);
                            System.exit(1); // Fail the build
                        }
                    } else if (metric.equals("errorRate")) {
                        if (value > errorRateThreshold) {
                            System.out.println("Error rate exceeded threshold: " + value + " > " + errorRateThreshold);
                            System.exit(1); // Fail the build
                        }
                    } else if (metric.equals("throughput")) {
                        if (value < throughputThreshold) {
                            System.out.println("Throughput below threshold: " + value + " < " + throughputThreshold);
                            System.exit(1); // Fail the build
                        }
                      }
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Metrics file not found: " + metricsFile);
            System.exit(1); // Fail the build
        }
    }
}
