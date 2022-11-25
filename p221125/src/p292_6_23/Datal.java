package p292_6_23;

class Datal {
	int value;
}

class Data2 {
	int value;

	Data2(int x) {
		value = x;
	}
}

class ConstructorTest {
	public static void main(String[] args) {
		Data1 d1 = new Data1();
		Data d2 = new Data2();
	}
}