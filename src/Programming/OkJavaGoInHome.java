package Programming;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHome {
	public static void main(String[] args) {
		String address = "JAVA APT 103";
		// 엘리베이터 호출
		Elevator myElevator = new Elevator(address);
		myElevator.callForUp(1);
		
		// 보안 해제
		Security mySecurity = new Security(address);
		mySecurity.off();
		
		// 거실 불 켜기
		Lighting hallLamp = new Lighting(address + " / hall");
		hallLamp.on();
	}
}

