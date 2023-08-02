import javax.swing.JOptionPane;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmployeeDataInput {
    public static void main(String[] args) {
        String outputFileName = "employee_records.txt";
        StringBuilder employeeData = new StringBuilder();

        while (true) {
            String fullName = JOptionPane.showInputDialog("Enter employee's full name:");
            if (fullName == null || fullName.isEmpty()) {
                break;
            }

            String hourlyRateString = JOptionPane.showInputDialog("Enter hourly rate of pay for " + fullName + ":");
            if (hourlyRateString == null || hourlyRateString.isEmpty()) {
                break;
            }
            double hourlyRate = Double.parseDouble(hourlyRateString);

            String hoursWorkedString = JOptionPane.showInputDialog("Enter total number of hours worked for " + fullName + ":");
            if (hoursWorkedString == null || hoursWorkedString.isEmpty()) {
                break;
            }
            double hoursWorked = Double.parseDouble(hoursWorkedString);

            employeeData.append("\"").append(fullName).append("\" ").append(hourlyRate).append(" ").append(hoursWorked).append("\n");
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFileName))) {
            writer.write(employeeData.toString());
            System.out.println("Data has been written to '" + outputFileName + "'");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    }
