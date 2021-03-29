from car import Car
if __name__ == "__main__":
    print("Hola mundo")
    car = Car()
    car.license="AMS123"
    car.driver="Andres Herrera"
    car.passenger="4"
    print(vars(car))

    car2 = Car()
    car2.license="OLS456"
    car2.driver="Sunanita HBolseada"
    car2.passenger="4"
    print(vars(car2))

    

