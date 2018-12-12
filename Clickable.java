package interfacechangeinjava8;
public interface Clickable {
	default public void click() {
		System.out.println("Click");
	}
	
	default public void print(){
		System.out.println("Clickable");
	}
}