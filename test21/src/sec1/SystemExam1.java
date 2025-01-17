package sec1;

public class SystemExam1 {
	public static void main(String[] args) {
		//만약, 자바 공급자의 정보를 출력한다면,
		String vendor = System.getProperty("java.vendor");
		System.out.println("자바 공급자의 정보 : "+vendor);
		
		//현재 자바 설치 버전(java.version) 출력
		String javaVersion = System.getProperty("java.version");
		System.out.println("현재 자바 설치 버전 : " + javaVersion);
		//자바 클래스 경로 출력(java.class.path) 출력
		String classPath = System.getProperty("java.class.path");
		System.out.println("자바 클래스 경로 : " + classPath);
		//운영체제 이름 (os.name) 출력
		String osName = System.getProperty("os.name");
		System.out.println("운영체제 이름 : " + osName);
		//사용자 계정(user.name) 출력
		String userName = System.getProperty("user.name");
		System.out.println("사용자 계정 : " + userName);
		//현재 디렉토리(user.dir) 출력
		String userDir = System.getProperty("user.dir");
		System.out.println("현재 디렉토리 : " + userDir);
	}
}
