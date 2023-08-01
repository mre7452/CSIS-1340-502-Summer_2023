
package keybord.java.ethan.pkg230727;

public class KeybordJavaEthan230727
{

    public static void main(String[] args)
    {
        String name;
        Keyboard k;

        k = new Keyboard();
        System.out.println("Enter your full name here: ");
        name = k.readLine();
        System.out.println("Hello " + name);
    }

}
