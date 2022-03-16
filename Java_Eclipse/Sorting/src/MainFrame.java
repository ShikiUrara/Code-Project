import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame {

	public static void main(String[] args) {
		
		// chay
		createAndShowGUI();
	}
	
	private static void createAndShowGUI() {
		
		// frame chinh
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(new BorderLayout());
		
		// Tao font 
		Font font = new Font(Font.MONOSPACED, Font.PLAIN, 24);
		
		// Label
		JLabel label  = new JLabel(" What the hell");
		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		// Button
		JButton button = new JButton("Click");
		frame.getContentPane().add(button, BorderLayout.SOUTH);
		
		
		// Tao menu
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu AlMenu = new JMenu("Thuat toan");
		JMenu CreateArrMenu = new JMenu("Tao mang");
		JMenu RunMenu = new JMenu("Chay");
		JMenu GuiMenu = new JMenu("Huong dan");
		
		JMenuItem QuickMenuItem = new JMenuItem("Quick sort");
		JMenuItem InsertionMenuItem = new JMenuItem("Insertion sort");
		JMenuItem HeapMenuItem = new JMenuItem("Heap sort");
		JMenuItem BubbleMenuItem = new JMenuItem("Bubble sort");
		JMenuItem SelectionMenuItem = new JMenuItem("Selection sort");
		
		JMenuItem RandomMenuItem = new JMenuItem("Ngau nhiem");
		JMenuItem NhapMenuItem = new JMenuItem("Tu nhap");
		JMenuItem FileMenuItem = new JMenuItem("Doc tu tap tin");

		JMenuItem RunMenuItem = new JMenuItem("Chay thuat toan");
		JMenuItem StopMenuItem = new JMenuItem("Dung thuat toan");
		
		
		// Su kien Lua chon JMenuItem
		
		
		
		// Them JMenuItem vao JMenu
		AlMenu.add(QuickMenuItem);
		AlMenu.add(InsertionMenuItem);
		AlMenu.add(HeapMenuItem);
		AlMenu.add(BubbleMenuItem);
		AlMenu.add(SelectionMenuItem);
		
		CreateArrMenu.add(RandomMenuItem);
		CreateArrMenu.add(NhapMenuItem);
		CreateArrMenu.add(FileMenuItem);
		
		RunMenu.add(RunMenuItem);
		RunMenu.add(StopMenuItem);
		
		// Them JMenu vao JMenuBar
		menuBar.add(AlMenu);
		menuBar.add(CreateArrMenu);
		menuBar.add(RunMenu);
		menuBar.add(GuiMenu);
		
		// Them JMenuBar vao JFrame chinh
		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
		
		// font
		AlMenu.setFont(null);
		
		// End code
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(1289, 720);
		frame.setTitle("Demo Sorting");
		frame.setLocationRelativeTo(null);
	}

}
