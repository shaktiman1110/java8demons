package interfacechangeinjava8;

public class Button implements Accessible, Clickable {
	public static void main(String[] args) {
		Button button = new Button();
		button.access();
		button.click();
		button.print();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		Accessible.super.print();
		Clickable.super.print();
	}
}
