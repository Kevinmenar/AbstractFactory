package entry;

import java.util.ArrayList;

import abstractfactory.ComputerFactory;
import beans.Computer;

public class App {

	public static void main(String[] args) {
		
		ArrayList<String> desktopInfo = new ArrayList(); // Posible JSON o Objeto
		ArrayList<String> serverInfo = new ArrayList();
		
		desktopInfo.add("16 GB");
		desktopInfo.add("1 TB");
		desktopInfo.add("3.5 GHz");
		
		serverInfo.add("64 GB");
		serverInfo.add("5 TB");
		serverInfo.add("4.2 GHz");
		
		Computer desktop = ComputerFactory.createComputer(ComputerFactory.FactoryMaker.makeFactory(ComputerFactory.FactoryMaker.ComputerType.DESKTOP, desktopInfo));
		
		Computer server = ComputerFactory.createComputer(ComputerFactory.FactoryMaker.makeFactory(ComputerFactory.FactoryMaker.ComputerType.SERVER, serverInfo));
		
		Computer laptop = ComputerFactory.createComputer(ComputerFactory.FactoryMaker.makeFactory(ComputerFactory.FactoryMaker.ComputerType.LAPTOP));
		
		desktop.description();
		server.description();
		laptop.description();
	}

}
