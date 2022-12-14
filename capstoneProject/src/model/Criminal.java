package model;

public class Criminal {
    
    private String fName;
    private String lName;
    private String address;
    private String type_of_crime;
    private String date_of_crime;
    private String punishment_period;

    public Criminal(String fName, String lName, String address, String type_of_crime, String date_of_crime, String punishment_period) {
        this.fName = fName;
        this.lName = lName;
        this.address = address;
        this.type_of_crime = type_of_crime;
        this.date_of_crime = date_of_crime;
        this.punishment_period = punishment_period;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAddress() {
        return address;
    }

    public String getType_of_crime() {
        return type_of_crime;
    }

    public String getDate_of_crime() {
        return date_of_crime;
    }

    public String getPunishment_period() {
        return punishment_period;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setType_of_crime(String type_of_crime) {
        this.type_of_crime = type_of_crime;
    }

    public void setDate_of_crime(String date_of_crime) {
        this.date_of_crime = date_of_crime;
    }

    public void setPunishment_period(String punishment_period) {
        this.punishment_period = punishment_period;
    }

    @Override
    public String toString() {
        return "Criminal{" + "fName=" + fName + ", lName=" + lName + ", address=" + address + ", type_of_crime=" + type_of_crime + ", date_of_crime=" + date_of_crime + ", punishment_period=" + punishment_period + '}';
    }
}
