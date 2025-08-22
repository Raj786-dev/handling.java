import java.io.FileWriter;
import java.io.IOException;

public class ReportGenerator {
    public static void main(String[] args) {
        // Sample data
        String[] students = {"Raj", "Aman", "Priya", "Simran"};
        int[] marks = {85, 92, 78, 90};

        // Generate TXT Report
        try (FileWriter txtWriter = new FileWriter("report.txt")) {
            txtWriter.write("----- Student Report (TXT) -----\n");
            for (int i = 0; i < students.length; i++) {
                txtWriter.write("Name: " + students[i] + ", Marks: " + marks[i] + "\n");
            }
            System.out.println("✅ TXT Report Generated");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Generate CSV Report
        try (FileWriter csvWriter = new FileWriter("report.csv")) {
            csvWriter.write("Name,Marks\n");
            for (int i = 0; i < students.length; i++) {
                csvWriter.write(students[i] + "," + marks[i] + "\n");
            }
            System.out.println("✅ CSV Report Generated");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Generate HTML Report
        try (FileWriter htmlWriter = new FileWriter("report.html")) {
            htmlWriter.write("<html><head><title>Student Report</title></head><body>");
            htmlWriter.write("<h2>Student Report (HTML)</h2>");
            htmlWriter.write("<table border='1' cellpadding='5'><tr><th>Name</th><th>Marks</th></tr>");
            for (int i = 0; i < students.length; i++) {
                htmlWriter.write("<tr><td>" + students[i] + "</td><td>" + marks[i] + "</td></tr>");
            }
            htmlWriter.write("</table></body></html>");
            System.out.println("✅ HTML Report Generated");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
