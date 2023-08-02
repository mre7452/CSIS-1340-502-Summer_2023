package exercise.pkg12.output.to.a.file.ethan.pkg230801;

import javax.swing.JOptionPane;
import java.io.IOException;

public class Exercise12OutputToAFileEthan230801
{

    public static void main(String[] args) throws IOException
    {
        
        
        OutputFile outfile;
        outfile = new OutputFile("payroll.txt");
      
        JOptionPane.showMessageDialog(null, "Welcome to the payroll enrolment system.");
        
        
        while (true) 
        {
        String name;
        name = JOptionPane.showInputDialog("Please enter your name.");
        if (name == null)
                break;

        String paidinput;
        paidinput = JOptionPane.showInputDialog("Please enter how much your piad whole number.");
        if (paidinput == null)
                break;
        double paid;
        paid = Double.parseDouble(paidinput);
        

        String hour;
        hour = JOptionPane.showInputDialog("Please enter your hours in a whole number.");
        if (hour == null)
            break;
        double b;
        b = Double.parseDouble(hour);
        
        
        
        outfile.writeString(name);
        
        outfile.writeDouble(paid);
        
        outfile.writeDouble(b);
        
        outfile.writeEOL();
        }
        
        
        outfile.close();
    }

}
