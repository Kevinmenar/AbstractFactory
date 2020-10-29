package beans;

public class Laptop implements Computer {
	
	static final String RAM = "8 GB";
	static final String HDD = "500 GB";
	static final String CPU = "2.6 GHz";

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHDD() {
		return HDD;
	}

	@Override
	public String getCPU() {
		return CPU;
	}
	
	@Override
	public void description() {
		System.out.println("Laptop tiene RAM: " + RAM + "HDD: " + HDD + "CPU: " + CPU);
	}

}