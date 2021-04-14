package sample;

public class NurseClass {
    private String visiting_patient;
    private String national_code;
    private String user_name_nurse;
    private String password_nurse;

    public NurseClass(String national_code, String visiting_patient, String user_name_nurse, String password_nurse) {
        this.national_code = national_code;
        this.visiting_patient = visiting_patient;
        this.user_name_nurse = user_name_nurse;
        this.password_nurse = password_nurse;
    }

    public String getVisiting_patient() {
        return visiting_patient;
    }

    public void setVisiting_patient(String visiting_patient) {
        this.visiting_patient = visiting_patient;
    }

    public String getNational_code() {
        return national_code;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public String getUser_name_nurse() {
        return user_name_nurse;
    }

    public void setUser_name_nurse(String user_name_nurse) {
        this.user_name_nurse = user_name_nurse;
    }

    public String getPassword_nurse() {
        return password_nurse;
    }

    public void setPassword_nurse(String password_nurse) {
        this.password_nurse = password_nurse;
    }
}
