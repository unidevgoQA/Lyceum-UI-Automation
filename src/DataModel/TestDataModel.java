package DataModel;

public class TestDataModel {
    public String getLastName;
    private  String FirstName;
    private String email;
    private String subject;
    private String message;
    private String password;
    private String LastName;
    private String Age;
    private String Number;
    private String City;
    private String Facebook;
    private String Discord;
    private String Hear_about_lyceum;
    private String Yourself;
    private String reffered;
    private  String file;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPassword(String password) {
        this.password = password.trim();
    }

    public String getPassword() {
        return password;
    }
    public String getLastName(){return LastName;}
    public void setLastName(String LastName){this.LastName = LastName;}
    public String getAge(){return Age;}
    public void setAge(String Age){this.Age = Age;}
    public String getNumber(){return Number;}

    public void setNumber(String number) {
        Number = number;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String facebook) {
        Facebook = facebook;
    }
    public String getDiscord() {
        return Discord;
    }

    public void setDiscord(String discord) {
        Discord = Discord;
    }

    public String getHear_about_lyceum() {
        return Hear_about_lyceum;
    }
    public void setHear_about_lyceum(String hear_about_lyceum){
        Hear_about_lyceum = Hear_about_lyceum;
    }
    public String getYourself(){
        return Yourself;
    }

    public void setYourself(String yourself) {
        Yourself = yourself;
    }

    public String getreffered() {return reffered;}

    public void setReffered(String reffered) {
        this.reffered = reffered;
    }

    public String getfile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
