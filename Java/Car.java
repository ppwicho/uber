class Car {
    // Variables globales respecto a la clase
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license,Account driver){ //adentro de () van los parametros obligatorios para crear Car son locales no gloabales esas variables
        this.license = license; // this te da acceso a los atributos de la clase.
        this.driver=driver;

    }

    void printDataCar(){
        System.out.println("Licence:"+license+"Account.name"+driver.name+"passeger"+passenger+"Account.document"+driver.document);
    }
}
