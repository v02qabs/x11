import java.util.zip.*;

class Zfile
{
	public Zfile(String fname)
	{
		init(fname);
	}
	public static void main(String[] args)
	{
		System.out.println("Hello");
		String fname = args[0];
		new Zfile(fname);
	}
	private ZipFile zf;
	public void init(String fname)
	{
		try
		{

		 	zf = new ZipFile(fname);
			int s = zf.size();
			System.out.println(s);
		}
		catch(Exception error)
		{
			System.out.println("error");
		}
	}
}

