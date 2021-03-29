class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        Car car = new Car("AMQ123", new Account("Andres Vino","AMQ123")); //El objeto ya tiene vida
        car.passenger=4;
        System.out.println("Car Licence"+car.license);

        Car car2 = new Car("OAO456",new Account("Susanita Blanca", "OAO456"));
        car2.passenger=3;
        System.out.println("Car Licence"+car2.license);

        car.printDataCar();
        car2.printDataCar();
        
    }
}