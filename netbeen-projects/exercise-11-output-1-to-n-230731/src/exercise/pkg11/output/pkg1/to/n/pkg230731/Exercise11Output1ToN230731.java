
package exercise.pkg11.output.pkg1.to.n.pkg230731;

import exercise.pkg12.output.to.a.file.ethan.pkg230801.Keyboard;


public class Exercise11Output1ToN230731
{


    public static void main(String[] args)
    {
        Keyboard k;
        k = new Keyboard();
        int x;
        int n;
        n = 1;
        x=k.readInt();
        
        
        
        
        if(x <= 0)
        {
            System.out.println("please enter a posstive whole number!!!: ");
        }
        else if(x > 0)
        {
        
         while (n < x) 
             {
             System.out.println("Loop number: " + n);
              n++; // Increment count by 1 in each iteration
             }
             System.out.println("your number is: " +x +" ,The count is: " +n);
             }
        
    }
    
}
