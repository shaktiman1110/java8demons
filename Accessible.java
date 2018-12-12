package interfacechangeinjava8;
public interface Accessible {

	default public void access(){
		System.out.println("access");
	}

	default public void print(){
		System.out.println("accessible");
	}
}