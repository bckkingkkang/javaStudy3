package test.main;
import test.util.Myutil;

public class MainClass09 {
	public static void main(String[] args) {
		
		// 상속받은 BaseUtil 클래스에 정의된 static 메소드도 모두 사용 가능
		Myutil.clear();
		Myutil.send();
		Myutil.light();
	}
}
