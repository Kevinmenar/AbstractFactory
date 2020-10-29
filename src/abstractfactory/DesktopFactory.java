package abstractfactory;

import beans.Computer;
import beans.Desktop;

public class DesktopFactory implements ComputerAbstractFactory {
	
	private String RAM;
	private String HDD;
	private String CPU;

	public DesktopFactory(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Desktop(this.RAM, this.HDD, this.CPU);
	}
}