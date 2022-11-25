package p296_6_25;

class Car {
	String color;
	String gearType;
	int door;

	Car() {
		this("white", "auto", 4);		// 1		//3
	}

	Car(String color) {
		this(color, "auto", 4);
	}

	Car(String color, String gearTypr, int door) {  // 2
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

class CarTest2 {
	public static void main(String[] args) {	//4
		Car c1 = new Car();
		Car c2 = new Car("blue");

		System.out.println("c1의 color=" + c1.color + " + c1.gearType =" + c1.gearType + ",door=" + c1.door);
		System.out.println("21의 color=" + c2.color + " + c2.gearType =" + c2.gearType + ",door=" + c2.door);
	}

}
