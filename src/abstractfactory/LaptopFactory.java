package abstractfactory;

import beans.Computer;
import beans.Laptop;

public class LaptopFactory implements ComputerAbstractFactory {

	@Override
	public Computer createComputer() {
		return new Laptop();
	}

}