class MyData {
	int data = 3;
	synchronized void abc() {}
	synchronized void bcd() {}
	void cde() {
		synchronized (this) {
		}
	}
	void def() {
		synchronized (this) {}
	}
	void efg() {
		synchronized (this) {}
	}
	void plusData() {
		
//		int temp = data;
//		try {
//			Thread.sleep(2000);
//		}catch(InterruptedException e) {}
//		data = temp + 1;
//		System.out.println(data);
	}
}
public class Test {
	public static void main(String[] args) {
		MyData myData = new MyData();
		
		// 첫 번째 Thread
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				myData.plusData();
			}
		});
		t1.start();
	

		
	Thread t2 = new Thread(new Runnable() {
		public void run() {
			myData.plusData();
		}
	});
	t2.start();
	

}
	}
