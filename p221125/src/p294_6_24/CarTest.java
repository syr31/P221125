package p294_6_24;

class CarTest {
	String color;
	String gearType;
	int door;

	CarTest() {
	}

	CarTest(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}

class Car {
	public static void main(String[] args) {
		CarTest c1 = new CarTest();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;

		CarTest c2 = new CarTest("white", "auto", 4);
		System.out.println("c1의 color=" + c1.color + ",gearType=" + c1.gearType + ",door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ",gearType=" + c2.gearType + ",door=" + c2.door);
	}

}
