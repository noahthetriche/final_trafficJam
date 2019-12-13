import java.util.Scanner;

public class carDriver
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner (System.in);

        pathGen rng = new pathGen(0);
        roadRage countRage = new roadRage();
        String command = "";

        System.out.println("Your commands are currently: go, no, wait, and yes.");
        System.out.println("Press ENTER to start");
        System.out.println();


        for(int i = 0; i <= 4; i++)
        {
            int goon = rng.generatePaths();
            command = scan.nextLine();

            if(goon == 0)
            {
                for(int count = 3; count >= 0; count--)
                {
                    if(count == 3)
                    {
                        System.out.print("The light is red... what will you do? Wait or go? ");

                        command = scan.nextLine();
                        if(command.equals("go") || command.equals("no"))
                        {
                            System.out.print("You Crashed!");
                            return;
                        }
                    }

                    if(count == 2)
                    {
                        command = "e";

                        System.out.print("Care to wait a little longer? ");

                        command = scan.nextLine();
                        if(command.equals("no") || command.equals("go"))
                        {
                            System.out.print("You Crashed!");
                            return;
                        }
                    }

                    if(count == 1)
                    {
                        command = "e";

                        System.out.print("The light is green! Will you drive??");

                        command = scan.nextLine();
                        if(command.equals("no") || command.equals("wait"))
                        {
                            System.out.print("Well that's just rude. You did this to yourself.");
                        }

                        if(command.equals("go") || command.equals("yes"))
                        {
                            System.out.print("You've been a good driver so far!");
                        }
                    }
                }
            }
            else if(goon == 1)
            {
                System.out.print("null rn1");
            }
            else
            {
                System.out.print("null rn2");
            }
        }





    }

}
