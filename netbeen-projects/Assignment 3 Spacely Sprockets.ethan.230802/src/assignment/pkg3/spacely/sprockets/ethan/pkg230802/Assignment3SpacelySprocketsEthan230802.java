package assignment.pkg3.spacely.sprockets.ethan.pkg230802;

public class Assignment3SpacelySprocketsEthan230802
{

    public static void main(String[] args)
    {
        int inv;
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;
        int total5 = 0;
        int quantity = 0;

        InputFile sprokets;
        sprokets = new InputFile("sprocketorders.txt");
        while (!sprokets.eof())
        {
            inv = sprokets.readInt();
            quantity = sprokets.readInt();

            switch (inv)
            {
                case 1:
                    total1 = total1 + quantity;
                    break;
                case 2:
                    total2 = total2 + quantity;
                    break;
                case 3:
                    total3 = total3 + quantity;
                    break;

                case 4:
                    total4 = total4 + quantity;
                    break;

                case 5:
                    total5 = total5 + quantity;
                    break;

                default:
                    System.out.println("Bad sprocket number");
            }
        }
        System.out.println("______________________________________________________________________________________________________");

        System.out.println(" ____  ____   __    ___  ____  __    _  _    ____  ____  ____   __    ___  __ _  ____  ____  ____ ");
        System.out.println("/ ___)(  _ \\ / _\\  / __)(  __)(  )  ( \\/ )  / ___)(  _ \\(  _ \\ /  \\  / __)(  / )(  __)(_  _)/ ___)");
        System.out.println("\\___ \\ ) __//    \\( (__  ) _) / (_/\\ )  /   \\___ \\ ) __/ )   /(  O )( (__  )  (  ) _)   )(  \\___ \\");
        System.out.println("(____/(__)  \\_/\\_/ \\___)(____)\\____/(__/    (____/(__)  (__\\_) \\__/  \\___)(__\\_)(____) (__) (____/");
        System.out.println("______________________________________________________________________________________________________");
        System.out.println(" Invitory      Orders");
        System.out.println(" 1             " + total1);

        System.out.println(" 2             " + total2);

        System.out.println(" 3             " + total3);

        System.out.println(" 4             " + total4);

        System.out.println(" 5             " + total5);
        System.out.println("");
        System.out.println("Report by George Jetson ;)");
        //are you team spaces or team tabs?

    }

}
