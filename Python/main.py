from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")

    car = Car("AMS123",Account("Adnres Herrera","AM243"))
    car.passenger="4"
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("fasdf",Account("dfas Herrera","2432"))
    car2.passenger="4"
    print(vars(car2))



