
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JTabbedPane;
import javax.swing.JComponent;
import javax.swing.JPanel;




	@SuppressWarnings("serial")
	public class Calendar extends JFrame {
		
		Container container;
				
		public Calendar() {
			setTitle("Calendar");
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
			Toolkit myToolkit = Toolkit.getDefaultToolkit();
			
			Dimension screenDimensions = myToolkit.getScreenSize();
			
			setSize(500, 500);
			
			//container = getContentPane();
			//container.setLayout(new GridLayout(3,3));
			
			JCheckBox cb = new JCheckBox("Are you happy?");
			cb.setSelected(true);
			//container.add(cb); 
			  
			JButton b=new JButton("click");
			JButton c=new JButton("click");
			JButton d=new JButton("click");
			JButton e=new JButton("click");
			JButton f=new JButton("click");
			
			JPanel mon = new JPanel();
			
			mon.add(b);
			mon.add(c);
			mon.add(d);
			mon.add(e);
			JTabbedPane tabbedPane = new JTabbedPane();
			JComponent contentPaneOuter = new JPanel();
			
			JComponent contentPane = new JPanel(new GridLayout());
			//contentPane.add(mon);
			contentPane.add(makeTextPanel("Stage 2"));
			//contentPane.add(makeTextPanel("Stage 3"));
			contentPaneOuter.add(makeTextPanel("TGGg"),BorderLayout.NORTH);
			contentPaneOuter.add(contentPane,BorderLayout.CENTER);
			
			tabbedPane.addTab("Dentist", null, contentPaneOuter,
	                null);
			add(tabbedPane);
			
		}
		
		protected JComponent makeTextPanel(String text) {
	        JPanel panel = new JPanel(false);
	        JLabel filler = new JLabel(text);
	        filler.setHorizontalAlignment(JLabel.CENTER);
	        panel.setLayout(new GridLayout(1, 1));
	        panel.add(filler);
	        return panel;
	    }
		
	public static void main(String[] args) {
		new Calendar();

	}

}
