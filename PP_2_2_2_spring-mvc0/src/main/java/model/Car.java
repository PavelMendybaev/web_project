package model;

public class Car {
    private long id;
    private String model;
    private byte age ;

    public Car(long id, String model, byte age) {
        this.id = id;
        this.model = model;
        this.age = age;
    }

    public Car(){}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return model +"  " + age;
    }

}
