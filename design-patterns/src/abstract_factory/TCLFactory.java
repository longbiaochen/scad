package abstract_factory;

public class TCLFactory implements EFactory
{
	public Television produceTelevision()
	{
		System.out.println("正在生产TCL电视...");
		return new TCLTelevision();
	}
	
	public AirConditioner produceAirConditioner()
	{
		System.out.println("正在生产TCL空调...");
		return new TCLAirConditioner();
	}
}