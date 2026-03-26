package mobile;

public class Ltab extends Mobile {
	public Ltab() {super();}
	Ltab(String mobilename, int batterySize, String osType){
		super(mobilename, batterySize, osType);
	}
	@Override
	public void operate(int time) {
		setBatterySize(getBatterySize() - (time*10));
		
	}
	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize() + (time*10));
		
	}
}
