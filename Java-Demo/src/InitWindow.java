import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InitWindow extends Frame{
	
	public InitWindow()
	{
		System.out.println("InitWindow");
		init();
	}
	public void init()
	{
		setBounds(0,0,500,500);
		setVisible(true);
		addWindowListener(new WindowAdapter()
				{
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}});
	}
}
