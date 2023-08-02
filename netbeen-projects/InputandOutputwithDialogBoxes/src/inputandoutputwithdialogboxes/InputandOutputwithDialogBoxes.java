
package inputandoutputwithdialogboxes;

import javax.swing.JOptionPane;


public class InputandOutputwithDialogBoxes
{

    
    public static void main(String[] args)
    {
        
        // display a message to the user with a dialog box using the JOptionPane class
        JOptionPane.showMessageDialog(null, "Welcome to the world of dialog boxes!");
        
        // display an Input dialog box to the user so the user can type something in
        String nm;
        nm = JOptionPane.showInputDialog("Please enter your name.");
        // display what was typed in the NetBeans Output window.
        System.out.println("The value typed into the dialog box is: " + nm);
        
        // display what was typed into the previous dialog box in new message dialog box
        JOptionPane.showMessageDialog(null, "You typed: " + nm);
        
        // Inputting numbers with a dialog is trickier.  The value typed into the dialog
        // is a String, even though it may look like a number.
        String wordAge;
        wordAge = JOptionPane.showInputDialog("Please enter your age as a whole number.");
        
        // If you want to do arithmetic operations with the value typed in, you must first
        // convert the String into an int or double.  The code below converts the String
        // wordAge into an int using the Integer class and the parseInt() method,
        // and then stores the number into the variable age
        
        int age;
        age = Integer.parseInt(wordAge);
        
        // Now you can do arithmetic with the age variable
        
        int newage;
        newage = age + 10;
        
        JOptionPane.showMessageDialog(null, "In 10 years you will be: " + newage);
        
        // To covert a String into a double, do the following:
        
        String s;
        s = "576.89";  // This is a String and you can't do arithmetic to it
        double d;
        d = Double.parseDouble(s);  // Converts the String s into a double
        System.out.println("This value is a double: " + d);
        
        // See what happens if try the following lines of code.  Uncomment them
        // and try running the program again.  Can you explain this?
        
        //int x;
        //x = Integer.parseInt(s);
        
        
    }
}
