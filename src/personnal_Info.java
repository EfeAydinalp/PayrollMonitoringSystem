public class personnal_Info {

    private String name;
    private String registrationNumber;
    private String position;
    private int startYear;

    public personnal_Info(String name, String registrationNumber, String position, int startYear) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.position = position;
        this.startYear = startYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }
}
