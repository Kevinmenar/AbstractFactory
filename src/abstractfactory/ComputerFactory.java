package abstractfactory;

import java.util.ArrayList;

import beans.Computer;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory caf) {
		return caf.createComputer();
	}
	
	public static class FactoryMaker {

	    public enum ComputerType {
	      DESKTOP, LAPTOP, SERVER
	    }

	    public static ComputerAbstractFactory makeFactory(ComputerType type, ArrayList<String> array) {
	      switch (type) {
	        case DESKTOP:
	          return new DesktopFactory(array.get(0), array.get(1), array.get(2));
	        case SERVER:
		      return new ServerFactory(array.get(0), array.get(1), array.get(2));
	        default:
	          throw new IllegalArgumentException("KingdomType not supported.");
	      }
	    }
	    
	    public static ComputerAbstractFactory makeFactory(ComputerType type) {
		      switch (type) {
		        case LAPTOP:
		          return new LaptopFactory();
		        default:
		          throw new IllegalArgumentException("KingdomType not supported.");
		      }
		    }
	  }
	
}