package sample;

import java.io.Serializable;
import java.util.Random;

public class Accountants {

    private String national_code;
    private String password;
    private String first_name_and_last_name;
    private String age;
    private String gender;
    private String description_of_the_disease;
    private String records_of_specific_diseases;

    public Accountants(String national_code , String first_name_and_last_name , String age , String gender , String description_of_the_disease , String records_of_specific_diseases) {
        this.national_code = national_code;
        this.first_name_and_last_name = first_name_and_last_name;
        this.age = age;
        this.gender = gender;
        this.description_of_the_disease = description_of_the_disease;
        this.records_of_specific_diseases = records_of_specific_diseases;
    }

    public String getNational_code() {
        return national_code;
    }

    public void setNational_code(String national_code) {
        this.national_code = national_code;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name_and_last_name() {
        return first_name_and_last_name;
    }

    public void setFirst_name_and_last_name(String first_name_and_last_name) {
        this.first_name_and_last_name = first_name_and_last_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription_of_the_disease() {
        return description_of_the_disease;
    }

    public void setDescription_of_the_disease(String description_of_the_disease) {
        this.description_of_the_disease = description_of_the_disease;
    }

    public String getRecords_of_specific_diseases() {
        return records_of_specific_diseases;
    }

    public void setRecords_of_specific_diseases(String records_of_specific_diseases) {
        this.records_of_specific_diseases = records_of_specific_diseases;
    }
    public static char[] RandomPassword (int length) {
        String loverCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String combinedChars = loverCaseLetters + numbers;

        Random random = new Random();
        char[] password = new char[length];

        for (int i = 0 ; i < length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }

    public static Serializable RandDoctor () {
        String num = "123";
        Random rand = new Random();
        char n;
        n = num.charAt(rand.nextInt(num.length()));
        if (n == '1')
            return "111111";

        else if (n == '2')
            return "222222";

        else
            return "333333";
    }

    public static Serializable RandNurse () {
        String num = "456";
        Random rand = new Random();
        char n;
        n = num.charAt(rand.nextInt(num.length()));
        if (n == '4')
            return "444444";

        else if (n == '5')
            return "555555";

        else
            return "666666";
    }
}
