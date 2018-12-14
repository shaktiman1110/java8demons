package creatingThread;

public class LamdaExpressionDemoForRunnableInterface {

	public static void main(String[] args) {
		Thread threadUsingImperativeWay = new Thread(new ThreadUsingRunnable());
		threadUsingImperativeWay.start();

		Thread threadUsinganonymousClass = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thread has been created using anonymousClass class");
			}
		});

		threadUsinganonymousClass.start();

		Thread threadUsingLambda = new Thread(
				() -> System.out.println("Thread has been created using lambda expression"));

		threadUsingLambda.start();
	}
}
