import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        readFromFile rf= new readFromFile();
        //monitoring.txt
        String[][] monitoring =rf.readFile(args[1]);

        List<payrolls> payrollList = new ArrayList<>();

        for(int i = 0 ; i < monitoring.length;i++){

            payrollList.add(new payrolls(monitoring[i][0],Integer.parseInt(monitoring[i][1]),Integer.parseInt(monitoring[i][2]),Integer.parseInt(monitoring[i][3]),Integer.parseInt(monitoring[i][4])));


        }



//-------------------------------------------------------
        readFromFile rf2= new readFromFile();
        //personnel.txt
        String[][] personnel =rf2.readFile(args[0]);

        List<personnal_Info> personnalList = new ArrayList<>();

        for(int x = 0 ; x < personnel.length;x++){

            personnalList.add(new personnal_Info(personnel[x][0],personnel[x][1],personnel[x][2],Integer.parseInt(personnel[x][3])));

        }

    payrolls.monitorPayroll(payrollList,personnalList);


    }

}