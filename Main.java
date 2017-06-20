import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Main
{
    public static void main(String args[]) throws IOException
    {               
        Scanner input = new Scanner(System.in); 
        ArrayList<University> uniList = new ArrayList<University>();

        int cont = 1;
        int UniSize = 0;
        while (cont == 1){
            System.out.println("Enter the ranking for the University");
            int ranking = input.nextInt();
            System.out.println("Enter the university name");
            input.nextLine();
            String name = input.nextLine();
            System.out.println("Enter the country");
            String country = input.nextLine();

            //Declaration − A variable declaration with a variable name with an object type.
            //Instantiation − The 'new' keyword is used to create the object.
            //Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
            University uni = new University(ranking, name, country);

            uniList.add(uni);           //adds the uni object to the arrayList

            System.out.println("Do you want to add another?  Enter 1 to continue");
            cont = input.nextInt();
            
            UniSize = uniList.size(); 
        }

        for (int i = 0; i < UniSize; i++)
        {

            FileWriter fw = new FileWriter ("U:\\Computer Science\\coursework thing 2\\sample.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write(uniList.get(i).toString());
            bw.close();  

        }
        for(University x : uniList) {    //example of enhanced for loop
            System.out.println(x);

        }
    }
}
