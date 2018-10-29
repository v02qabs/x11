import java.io.*;

class OutSt
{
	public OutSt()
	{
	}

	private byte[] b = new byte[1];
	private OutputStream os;
	public void init()
	{
		b[1] = 4;
	}
	public void Gos()
	{
		try
		{

			os = new FileOutputStream("item1.md");
			System.out.println("item1.md to write 0x33 ");
			os.write(33);

			os.close();
		}
		catch(Exception error)
		{
			System.out.println("error");
		}
	}

	public static void main(String[] args)
	{
		OutSt oo = new OutSt();
		oo.Gos();
	}


}

