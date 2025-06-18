package Day2;

public class Bike {
    //TODO bike entity ko barema chahine data k k ho?
    // bike ko nam, model, engine number, baneko date, color
    String bike_name;
    int bike_model;
    double engine_number;
    String manufactured_date;
    String color;
    //entity ko data lai variables haru use garera rakhinxa

    //TODO bike ko behaviour k k represent garne??
    //press brake, release brake, accelarate, turn on side light
    public void pressBrake(){
        System.out.println("Rokkidai xha");
    }

    public void releaseBrake(){
        System.out.println("daudidai xha");
    }

    public static void main(String[] args) {
        String bike_name = "Something";
        Bike bike1 = new Bike();
        System.out.println(bike1.bike_name);
        System.out.println(bike_name);
        bike1.pressBrake();
    }
}
