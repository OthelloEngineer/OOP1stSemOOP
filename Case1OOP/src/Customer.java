public class Customer {
    private String ID;
    private int age;
    private String name;
    private String phoneNumber;

    public Customer (String ID, int age, String name){
        this.ID = ID;
        this.age = age;
        this.name = name;
    }

    public String getID() {return ID;}

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name.split(" ")[0];
    }

    public void setName(String name) {
        this.name = name;
    }
}