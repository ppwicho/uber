class Main{
    public static void main(String[] args) {
        System.out.println("hola mundo");
        UberX uberX = new UberX("AMQ123", new Account("Andres Vino","AMQ123"),"Chevrolet","Sonic"); //El objeto ya tiene vida
        //uberX.passenger=3;
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("VAN123",new Account("name", "document"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
        //System.out.println("Car Licence"+car.license);

       // Car car2 = new Car("OAO456",new Account("Susanita Blanca", "OAO456"));
        //car2.passenger=3;
        //System.out.println("Car Licence"+car2.license);

        
        //car2.printDataCar();
        
    }
}