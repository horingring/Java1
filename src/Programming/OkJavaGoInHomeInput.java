package Programming;

import javax.swing.*;

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {
	public static void main(String[] args) {
		String address = JOptionPane.showInputDialog("주소를 입력해 주세요.");
		String bright = JOptionPane.showInputDialog("무드등 밝기를 입력해 주세요.");
		// 엘리베이터 호출
		Elevator myElevator = new Elevator(address);
		myElevator.callForUp(1);
		
		// 보안 해제
		Security mySecurity = new Security(address);
		mySecurity.off();
		
		// 거실 불 켜기
		Lighting hallLamp = new Lighting(address + " / hall");
		hallLamp.on();
		
		// 무드등 켜기
		DimmingLights moodLamp = new DimmingLights(address + " / moodLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
	}
}

