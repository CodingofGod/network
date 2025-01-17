package sec2;

//Thread(쓰레드) = process(프로세스) = 현재 컴퓨터에서 실행 중인 프로그램(작업)
//발생(NEW) => 실행대기:RUNNABLE 점유(실행:run) => (sleep) 실행대기:RUNNABLE => 종료     //실행대기 점유 실행대기를 반복되다가 종료가된다.
//점유에서 실행대기하는것을  : sleep
//실행대기에서 실행모드로 돌아오는것을 : wake up(run)
public class ThreadExam1 {
	
	public static void firstThread() { //하나의 프로그램 & 하나의 프로세스 
		System.out.println("첫 번째 쓰레드");
	}
	
	public static void secondaryThread() {
		//System.out.println("두 번째 쓰레드");
		//Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) { //0~9 카운트 작업 
			System.out.println(i);
			try {
				Thread.sleep(2000); //ms => us //sleep(실행 -> 실행대기)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) { //new Thread(생성) => Runnable(실행대기)
		Thread thread1 = new Thread(new Runnable() { //러너블이라하는 인터페이스를 활용한다.
			@Override
			public void run() { //run(실행대기 -> 실행으로 바꾸는것)
				firstThread();
			}
		}); //쓰레드 (실행가능한 작업)
		thread1.run();
		thread1.start();
		System.out.println(thread1.getName());
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				secondaryThread();
			}
		});
		thread2.start();
	}
}