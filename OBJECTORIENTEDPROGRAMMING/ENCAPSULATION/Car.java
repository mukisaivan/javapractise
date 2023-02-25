package OBJECTORIENTEDPROGRAMMING.ENCAPSULATION;

public class Car {
    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.setMake(make);     // this is to change the make method in the main class

        this.model = model;
        this.setModel(model);  //its purpsoe is to change the attributes

        this.year = year;
        this.setYear(year);
    }

    //to make these accessible in other classes,


    public String getmake() {
        return make;
    }
    
    public String getmodel() {
        return model;
    }

    public int getyear() {
        return year;
    }


    //to change thesse attributes in the main class;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }


    //TO COPY ATTRIBUTES OF ONE CAR TO ANOTHER CAR X

    public void copy(Car x) {
        this.setMake(x.getmake());
        this.setModel(x.getmodel());
        this.setYear(x.getyear());
    }
}
