package sample;

public class DoctorClass {
    private String diagnosis;
    private String surgery;
    private String national_code;
    private String user_name_doctor;
    private String password_doctor;

    public DoctorClass(String diagnosis ,String surgery , String national_code , String user_name_doctor , String password_doctor) {
        this.diagnosis = diagnosis;
        this.surgery = surgery;
        this.national_code = national_code;
        this.user_name_doctor = user_name_doctor;
        this.password_doctor = password_doctor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSurgery() {
        return surgery;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    public String getNational_code() {
        return national_code;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public String getUser_name_doctor() {
        return user_name_doctor;
    }

    public void setUser_name_doctor(String user_name_doctor) {
        this.user_name_doctor = user_name_doctor;
    }

    public String getPassword_doctor() {
        return password_doctor;
    }

    public void setPassword_doctor(String password_doctor) {
        this.password_doctor = password_doctor;
    }
}
