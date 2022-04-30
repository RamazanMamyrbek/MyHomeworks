package polymorphizm;

public class Person {
    public String name;
    public String phoneNumber;
    public String address;
    public String emailAddress;

    public Person(){
    }
    public Person(String name, String phoneNumber, String address, String emailAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.emailAddress = emailAddress;
    }


    public void setName(String name){this.name = name;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    public void setAddress(String address){this.address = address;}
    public void setEmailAddress(String emailAddress){this.emailAddress = emailAddress;}

    public String getName(){return name;}
    public String getPhoneNumber(){return phoneNumber;}
    public String getAddress(){return address;}
    public String getEmailAddress(){return emailAddress;}


    @Override
    public String toString(){
        String info = getClass().getName() + ".class  Name: " + getName();
        return info;}

}
