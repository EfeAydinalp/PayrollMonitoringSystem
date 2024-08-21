import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class outputWriter {

    public static void output(String name, String surname, String registeration, String positon, int year, Double totalSalary)throws IOException{

        String filePath = registeration + ".txt";

        File output = new File(filePath);
        FileWriter writter = new FileWriter(output,false);
        BufferedWriter Yaz = new BufferedWriter(writter);

        Yaz.write("Name : " + name);
        Yaz.write("\n\nSurname : " + surname);
        Yaz.write("\n\nRegistration Number : " + registeration);
        Yaz.write("\n\nPosition : " + positon);
        Yaz.write("\n\nYear of Start : " + year);
        Yaz.write("\n\nTotal Salary : " + totalSalary +"0 TL");
        Yaz.close();


    }

}
