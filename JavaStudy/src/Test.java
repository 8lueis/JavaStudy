class MyData{
	// synchronized method
	synchronized void abc() {
		for(int i=0; i<3; i++) {
			System.out.println(i + "sec");
			try {Thread.sleep(1000);}catch(InterruptedException e){}
		}
	}
	// synchronized method
	synchronized void bcd() {
		for(int i=0; i<3; i++) {
			System.out.println(i + "초");
			try {Thread.sleep(1000);}catch(InterruptedException e){}
		}
	}
	// synchronized block 
	void cde() {
		synchronized (new Object()) {
			for(int i=0; i<3; i++) {
				System.out.println(i + "번째");
				try {Thread.sleep(1000);}catch(InterruptedException e){}
			}
		}
	}
}
public class Test {
	public static void main(String[] args) {
		MyData myData = new MyData();
		// Thread1 실행
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();
		// Thread2 실행
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();
		// Thread3 실행
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
	}
}
