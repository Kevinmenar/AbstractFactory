package beans;

public class Desktop implements Computer {

	private String RAM;
	private String HDD;
	private String CPU;

	public Desktop(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

	@Override
	public void description() {
		System.out.println("El desktop tiene RAM: " + RAM + "HDD: " + HDD + "CPU: " + CPU);
	}

}
