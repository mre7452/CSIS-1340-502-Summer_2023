package exercise.pkg13.input.from.a.file.ethan.pkg230802;

public class Exercise13InputFromAFileEthan230802
{

    public static void main(String[] args)
    {
        String name;
        Double paid;
        Double hour;
        Double gdp;
        Double ot;
        Double othours;

        InputFile payroll;
        payroll = new InputFile("payroll.txt");
        while (!payroll.eof())
        {
            name = payroll.readString();
            paid = payroll.readDouble();
            hour = payroll.readDouble();
            if (hour > 40)
            {
                gdp = paid * 40;
                othours = hour - 40;
                ot = paid * 1.50 * othours;
                gdp = gdp + ot;
                System.out.println("pay: " + name + " $" + gdp+" (Overtime)");

            } else
            {
                gdp = paid * hour;
             System.out.println("pay: " + name + " $" + gdp);
            }

        }
    }

}
