import java.io.*;

class Main
{
	public Main()
	{
		init();
	}
	public static void main(String[] args)
	{
		new Main();
	}
	public void init()
	{
		try
		{
			System.out.println("HELLO");
			File f0 = new File("HELLO.txt");
			f0.createNewFile();
			PrintWriter pw = new PrintWriter(f0);
			pw.write("HELLO");
			pw.close();
		}
		catch(Exception e)
		{
			System.out.println("IOERROR");
		}
		try
		{
			System.out.println("readFile");
			File f = new File("HELLO.txt");
			BuffreredReader br = new BufferedReader(new 
					FileReader(f));
			String line = br.readLine();
			System.out.println("line");
		}
		catch(Exception e)
		{
			System.out.println
				("read error");
		}

	}
}
