package factory_method;

public class FakeTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("海尔电视机工厂生产海尔电视机。");
    	return new FakeTV();
    }
}