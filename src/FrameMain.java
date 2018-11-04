import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameMain extends Frame
{
	public FrameMain()
	{
		System.out.println("MainFrame...");
		init();
	}
	public void init()
	{
		System.out.println("init");
		setBounds(0,0,600,600);
		setTitle("Main");
		addWindowListener(new WindowAdapter()
				{
			
				@Override
				public void windowClosing(WindowEvent e)
				{
					System.exit(0);
				}
				});
		setVisible(true);
		
	}
}
