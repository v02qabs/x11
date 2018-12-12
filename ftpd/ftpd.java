
class ftpd
{
	public static void main(String[] args)
	{
		System.out.println("Hello");
		new ftpd();
	}
	public ftpd()
	{
		Runtime r = Runtime.getRuntime();
		try
		{
			r.exec("/data/data/com.termux/files/usr/var/service/ftpd/run");
		}
		catch(Exception error)
		{
			System.out.println("cannot starting...");
		}
	}
}

