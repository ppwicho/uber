class Car {
    // Variables globales respecto a la clase
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license,Account driver){ //adentro de () van los parametros obligatorios para crear Car son locales no gloabales esas variables
        this.license = license; // this te da acceso a los atributos de la clase.
        this.driver=driver; // Esto es un feedback

    }

    void printDataCar(){
        if(passenger!=null){
            System.out.println("Licence:"+license+" Account.name:"+driver.name+" Passeger:"+passenger+" Account.document:"+driver.document);
        }
    }
    public Integer getPassenger(){
        return passenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger==4){
            this.passenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }


    
}
