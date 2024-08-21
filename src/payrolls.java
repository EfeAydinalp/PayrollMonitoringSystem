import java.io.IOException;
import java.util.List;

public class payrolls {
    private String registration;
    private int week1;
    private int week2;
    private int week3;
    private int week4;


    public payrolls(String registration, int week1, int week2, int week3, int week4) {
        this.registration = registration;
        this.week1 = week1;
        this.week2 = week2;
        this.week3 = week3;
        this.week4 = week4;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getWeek1() {
        return week1;
    }

    public void setWeek1(int week1) {
        this.week1 = week1;
    }

    public int getWeek2() {
        return week2;
    }

    public void setWeek2(int week2) {
        this.week2 = week2;
    }

    public int getWeek3() {
        return week3;
    }

    public void setWeek3(int week3) {
        this.week3 = week3;
    }

    public int getWeek4() {
        return week4;
    }

    public void setWeek4(int week4) {
        this.week4 = week4;
    }

//-------------------------------------------------

    public static void monitorPayroll(List<payrolls> payrollList, List<personnal_Info> personnalList) throws IOException {

        double baseSalary = 2600.00;

        for (int i = 0; i < payrollList.size(); i++) {

            double totalSalary = 0.00;
            double severancePay = (2023 - personnalList.get(i).getStartYear()) * 20 * 0.8;


            for (int j = 0; j < personnalList.size(); j++) {

                if (payrollList.get(i).getRegistration().equals(personnalList.get(j).getRegistrationNumber())) {

                    if (personnalList.get(j).getPosition().equals("FACULTY_MEMBER")) {

                        int counter = 0;
                        int norm = 0;  //fazladan çalışma YAPILMAYAN haftaları tutar.
                        double ssBenefits = (baseSalary * (1.35));


                        if (48 >= payrollList.get(i).getWeek1()) {
                            counter += (payrollList.get(i).getWeek1()) - 40;
                            norm += 1;
                        }

                        if (48 >= payrollList.get(i).getWeek2()) {
                            counter += (payrollList.get(i).getWeek2()) - 40;
                            norm += 1;
                        }

                        if (48 >= payrollList.get(i).getWeek3()) {
                            counter += (payrollList.get(i).getWeek3()) - 40;
                            norm += 1;
                        }

                        if (48 >= payrollList.get(i).getWeek4()) {
                            counter += (payrollList.get(i).getWeek4()) - 40;
                            norm += 1;
                        }

                        double addCourseFee = (counter * 20) + ((4 - norm) * 8 * 20);

                        totalSalary += (baseSalary + ssBenefits + addCourseFee + severancePay);


                        outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                personnalList.get(j).getName().split(" ")[1],
                                personnalList.get(j).getRegistrationNumber(),
                                personnalList.get(j).getPosition(),
                                personnalList.get(j).getStartYear(),
                                totalSalary);
                    }

                    if (personnalList.get(j).getPosition().equals("RESEARCH_ASSISTANT")) {

                        double ssBenefits = (baseSalary * (1.05));

                        totalSalary = ssBenefits + baseSalary + severancePay;

                        outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                personnalList.get(j).getName().split(" ")[1],
                                personnalList.get(j).getRegistrationNumber(),
                                personnalList.get(j).getPosition(),
                                personnalList.get(j).getStartYear(),
                                totalSalary);

                    }

                    if (personnalList.get(j).getPosition().equals("OFFICER")) {

                        double ssBenefits = (baseSalary * (0.65));

                        int counter = 0;
                        int norm = 0;  //fazladan çalışma YAPILMAYAN haftaları tutar.


                        if (50 >= payrollList.get(i).getWeek1()) {
                            counter += (payrollList.get(i).getWeek1()) - 40;
                            norm += 1;
                        }

                        if (50 >= payrollList.get(i).getWeek2()) {
                            counter += (payrollList.get(i).getWeek2()) - 40;
                            norm += 1;
                        }

                        if (50 >= payrollList.get(i).getWeek3()) {
                            counter += (payrollList.get(i).getWeek3()) - 40;
                            norm += 1;
                        }

                        if (50 >= payrollList.get(i).getWeek4()) {
                            counter += (payrollList.get(i).getWeek4()) - 40;
                            norm += 1;
                        }

                        double overWorkSalary = (counter * 20) + ((4 - norm) * 10 * 20);

                        totalSalary += (baseSalary + ssBenefits + overWorkSalary + severancePay);

                        outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                personnalList.get(j).getName().split(" ")[1],
                                personnalList.get(j).getRegistrationNumber(),
                                personnalList.get(j).getPosition(),
                                personnalList.get(j).getStartYear(),
                                totalSalary);

                    }

                    if (personnalList.get(j).getPosition().equals("CHIEF")) {

                        double dayOfWork = 5 * 4 * 125;
                        int counter = 0;
                        int norm = 0;  //fazladan çalışma YAPILMAYAN haftaları tutar.


                        if (48 >= payrollList.get(i).getWeek1()) {
                            counter += (payrollList.get(i).getWeek1()) - 40;
                            norm += 1;
                        }

                        if (48 >= payrollList.get(i).getWeek2()) {
                            counter += (payrollList.get(i).getWeek2()) - 40;
                            norm += 1;
                        }

                        if (48 >= payrollList.get(i).getWeek3()) {
                            counter += (payrollList.get(i).getWeek3()) - 40;
                            norm += 1;
                        }

                        if (48 >= payrollList.get(i).getWeek4()) {
                            counter += (payrollList.get(i).getWeek4()) - 40;
                            norm += 1;
                        }

                        double overWorkSalary = (counter * 15) + ((4 - norm) * 8 * 15);

                        totalSalary += (dayOfWork + overWorkSalary + severancePay);

                        outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                personnalList.get(j).getName().split(" ")[1],
                                personnalList.get(j).getRegistrationNumber(),
                                personnalList.get(j).getPosition(),
                                personnalList.get(j).getStartYear(),
                                totalSalary);

                    }

                    if (personnalList.get(j).getPosition().equals("WORKER")) {

                        double dayOfWork = 5 * 4 * 105;
                        int counter = 0;
                        int norm = 0;  //fazladan çalışma YAPILMAYAN haftaları tutar.


                        if (50 >= payrollList.get(i).getWeek1()) {
                            counter += (payrollList.get(i).getWeek1()) - 40;
                            norm += 1;
                        }

                        if (50 >= payrollList.get(i).getWeek2()) {
                            counter += (payrollList.get(i).getWeek2()) - 40;
                            norm += 1;
                        }

                        if (50 >= payrollList.get(i).getWeek3()) {
                            counter += (payrollList.get(i).getWeek3()) - 40;
                            norm += 1;
                        }

                        if (50 >= payrollList.get(i).getWeek4()) {
                            counter += (payrollList.get(i).getWeek4()) - 40;
                            norm += 1;
                        }

                        double overWorkSalary = (counter * 11) + ((4 - norm) * 10 * 11);

                        totalSalary += (dayOfWork + overWorkSalary + severancePay);

                        outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                personnalList.get(j).getName().split(" ")[1],
                                personnalList.get(j).getRegistrationNumber(),
                                personnalList.get(j).getPosition(),
                                personnalList.get(j).getStartYear(),
                                totalSalary);
                    }

                    if (personnalList.get(j).getPosition().equals("PARTTIME_EMPLOYEE")) {

                        int counter = 0;
                        int norm = 0;  //fazladan çalışma YAPILMAYAN haftaları tutar.

                        if (20 >= payrollList.get(i).getWeek1() && payrollList.get(i).getWeek1() >= 10) {
                            counter += (payrollList.get(i).getWeek1());
                        }
                        if (payrollList.get(i).getWeek1() > 20) {
                            counter += 20;
                        }

                        if (20 >= payrollList.get(i).getWeek2() && payrollList.get(i).getWeek2() >= 10) {
                            counter += (payrollList.get(i).getWeek2());
                        }
                        if (payrollList.get(i).getWeek2() > 20) {
                            counter += 20;
                        }
                        if (20 >= payrollList.get(i).getWeek3() && payrollList.get(i).getWeek3() >= 10) {
                            counter += (payrollList.get(i).getWeek3());
                        }
                        if (payrollList.get(i).getWeek3() > 20) {
                            counter += 20;
                        }
                        if (20 >= payrollList.get(i).getWeek4() && payrollList.get(i).getWeek4() >= 10) {
                            counter += (payrollList.get(i).getWeek4());

                        }
                        if (payrollList.get(i).getWeek4() > 20) {
                            counter += 20;

                        }
                            double hourOfWork = counter * 18;

                            totalSalary = hourOfWork + severancePay;

                            outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                    personnalList.get(j).getName().split(" ")[1],
                                    personnalList.get(j).getRegistrationNumber(),
                                    personnalList.get(j).getPosition(),
                                    personnalList.get(j).getStartYear(),
                                    totalSalary);


                        }

                        if (personnalList.get(j).getPosition().equals("SECURITY")) {

                            double transMoney = 24 * 5;
                            double foodMoney = 24 * 10;

                            double hourOfWork = (payrollList.get(i).getWeek1() +
                                    payrollList.get(i).getWeek2() +
                                    payrollList.get(i).getWeek3() +
                                    payrollList.get(i).getWeek4()) * 10;

                            totalSalary = hourOfWork + severancePay + transMoney + foodMoney;

                            outputWriter.output(personnalList.get(j).getName().split(" ")[0],
                                    personnalList.get(j).getName().split(" ")[1],
                                    personnalList.get(j).getRegistrationNumber(),
                                    personnalList.get(j).getPosition(),
                                    personnalList.get(j).getStartYear(),
                                    totalSalary);
                        }


                    }

                }
            }
        }

    }
