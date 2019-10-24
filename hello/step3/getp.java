public class getp
{
	public static void main(String[] args)
	{
		new getp().init();
	}
	public void init()
	{

		String str = System.getProperty("java.library.path");
		System.out.println(str);
	}
}

