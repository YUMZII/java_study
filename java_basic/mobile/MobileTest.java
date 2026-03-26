package mobile;

abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile() {}
	public Mobile(String mobileName, int batterySize, String osType){
		this.mobileName=mobileName;
		this.batterySize=batterySize;
		this.osType=osType;
	}
	
	public abstract void operate(int time);
	public abstract void charge(int time);
	
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
}

public class MobileTest {
	public static void main(String args[]) {
		Mobile l = new Ltab("Ltab",500,"ABC-01");
		Mobile o = new Otab("Otab",1000,"XYZ-20");
		
		printTitle();
		printMobile(l);
		printMobile(o);
		
		System.out.print("[10분 충전]\n");
		printTitle();
		l.operate(10);
		o.operate(10);
		printMobile(l);
		printMobile(o);
		
		System.out.print("[5분 충전]\n");
		printTitle();
		l.operate(5);
		o.operate(5);
		printMobile(l);
		printMobile(o);
		
	}
	public static void printMobile(Mobile mobile) {
		System.out.printf("%5s %15s %20s \n", mobile.getMobileName(), mobile.getBatterySize(),mobile.getOsType() );
		
	}
	public static void printTitle() {
		System.out.printf("%5s %15s %20s", "Mobile","Battery","OS"+"\n");
		System.out.printf("-------------------------------------------------------"+ "\n");
		
	}
}
