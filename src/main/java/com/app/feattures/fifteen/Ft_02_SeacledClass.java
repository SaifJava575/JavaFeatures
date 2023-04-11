package com.app.feattures.fifteen;

sealed interface Vehicle permits Car, Truck {
	String getRegistrationNumber();
}

record Car(int numberOfSeats, String registrationNumber) implements Vehicle {

	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}
}

record Truck(int loadCapacity, String registrationNumber) implements Vehicle {

	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

}

public class Ft_02_SeacledClass {
	public static void main(String[] args) {
		Car car = new Car(5, "123BSSAJ");
		System.out.println(car);
		System.out.println("Car Registraton Number is::" + car.getRegistrationNumber());
		System.out.println("Car number of seat is::" + car.getNumberOfSeats());

		Vehicle truck = new Truck(2000, "219281NDMNMSD");
		System.out.println(truck);
		System.out.println("Truck Registration number is::" + truck.getRegistrationNumber());
	}
}
