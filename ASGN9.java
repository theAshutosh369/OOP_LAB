// Factory design pattern

package oopl_or_oopc;

import java.util.Scanner;

abstract class Car
{
    public Car(CarType model)
    {
        this.model = model;
        construct();
        arrangeParts();
    }
    private void arrangeParts()
    {
        System.out.println("front and rear suspensions installed");
        System.out.println("gas tanks installed");
        System.out.println("steering box components installed");
        System.out.println("braking system installed");
        System.out.println("the car body and components are cleaned and painted");
        System.out.println("----------the Car is ready----------------------");
    }
    protected abstract void construct();
    private CarType model = null;
    public CarType getModel()
    {
        return model;
    }
    public void setModel(CarType model)
    {
        this.model = model;
    }
}


class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        switch (model)
        {
            case SMALL:
                car = new SmallCar();
                break;

            case SEDAN:
                car = new SedanCar();
                break;

            case LUXURY:
                car = new LuxuryCar();
                break;

            default:
                System.out.println("enter valid model name");
                break;

        }
        return car;
    }
    public static void alvida()
    {
        System.out.println("the program ended !!");
    }
}
enum CarType {
    SMALL, SEDAN, LUXURY
}
class LuxuryCar extends Car {
    LuxuryCar()
    {
        super(CarType.LUXURY);
    }

    @Override
    protected void construct() {
        System.out.println("-------Building luxury car--------");
        System.out.println("chassis is created");
        System.out.println("----------------------------------");
        System.out.println("gear lock : added ");
        System.out.println("rear view camera : added ");
        System.out.println("TPMS : added ");
        System.out.println("----------------------------------");
    }

}

class SedanCar extends Car {
    SedanCar() {
        super(CarType.SEDAN);
    }

    @Override
    protected void construct() {
        System.out.println("-------Building Sedan car--------");
        System.out.println("chassis is created");
        System.out.println("----------------------------------");
        System.out.println("gear lock : added ");
        System.out.println("rear view camera : added ");
        System.out.println("TPMS : added ");
        System.out.println("----------------------------------");
    }

}

class SmallCar extends Car {
    SmallCar() {
        super(CarType.SMALL);
    }

    @Override
    protected void construct() {
        System.out.println("-------Building Small car--------");
        System.out.println("chassis is created");
        System.out.println("----------------------------------");
        System.out.println("gear lock : added ");
        System.out.println("rear view camera : added ");
        System.out.println("TPMS : added ");
        System.out.println("----------------------------------");
    }

}

public class ASGN9
{
    public static void main(String[] args)
    {

        int choice =0;
        Scanner s = new Scanner(System.in);
        while(choice!=4) {
            System.out.println("---------------------------------");
            System.out.println("1. Small car \n2. Sedan car \n3. Luxury car \n4. exit ");
            System.out.print("which type of car do you want to build ? : ");
            choice = s.nextInt();
            switch (choice)
            {
                case 1 :
                    System.out.println(CarFactory.buildCar(CarType.SMALL));
                    System.out.println("---------------------------------");
                    break;
                case 2 :
                    System.out.println(CarFactory.buildCar(CarType.SEDAN));
                    System.out.println("---------------------------------");
                    break;
                case 3 :
                    System.out.println(CarFactory.buildCar(CarType.LUXURY));
                    System.out.println("---------------------------------");
                    break;
                case 4 :
                    CarFactory.alvida();
                    break;
            }
            String ch;
            System.out.print("Do you want to build more cars ? :");
            ch = s.next();
            if(ch.equalsIgnoreCase("yes"))
            {
                choice=0;
            }
            else{
                choice=4;
                CarFactory.alvida();
            }


        }
    }
}


