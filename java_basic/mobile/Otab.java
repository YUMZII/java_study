package mobile;

public class Otab extends Mobile{
	public Otab() {super();}
	Otab(String mobilename, int batterySize, String osType){
		super(mobilename, batterySize, osType);
	}
	@Override
	public void operate(int time) {
		setBatterySize(getBatterySize() - (time*12));
		
	}
	@Override
	public void charge(int time) {
		setBatterySize(getBatterySize() + (time*8));
	}
}
