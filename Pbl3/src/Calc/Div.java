package Calc;

public class Div extends Calculator {

	int a, b;

	@Override
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	int calculate() {
		return a / b;
	}

}
