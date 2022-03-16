import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.FlowLayout;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					
					
					// Tao mang JLabel
					JLabel[] arrLabel = new JLabel[10];
					for(int i=0; i<10; i++) {
						arrLabel[i] = new JLabel("A[" + i + "]:");
						arrLabel[i].setLocation(180 * (i + 1)/5  , 100);
						frame.getContentPane().add(arrLabel[i]);
						arrLabel[i].setSize(40,30);
					}
					
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGUI() {
		setTitle("Mo Phong Giai Thuat Sap Xep");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 400);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Thuật toán");
		menuBar.add(mnNewMenu);
		
		ButtonGroup btngroup1 = new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sắp xếp nổi bọt - Bubble sort");
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
		});
		mnNewMenu.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Sắp xếp chọn - Selection sort");
		mnNewMenu.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sắp xếp chèn - Insertion sort");
		mnNewMenu.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Sắp xếp vun đống - Heap sort");
		mnNewMenu.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Sắp xếp nhanh - Quick sort");
		mnNewMenu.add(rdbtnNewRadioButton_4);
		
		// them vao btngroup
		btngroup1.add(rdbtnNewRadioButton);
		btngroup1.add(rdbtnNewRadioButton_1);
		btngroup1.add(rdbtnNewRadioButton_2);
		btngroup1.add(rdbtnNewRadioButton_3);
		btngroup1.add(rdbtnNewRadioButton_4);
		
		
		JMenu mnNewMenu_1 = new JMenu("T\u1EA1o m\u1EA3ng");
		menuBar.add(mnNewMenu_1);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Lấy mảng ngẫu nhiên");
		mnNewMenu_1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Lấy mảng từ tập tin");
		mnNewMenu_1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Tự nhập mảng");
		mnNewMenu_1.add(rdbtnNewRadioButton_6);
		
		JMenu mnNewMenu_2 = new JMenu("Chạy");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Chạy giải thuật ");
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenu mnHngDn = new JMenu("Hướng dẫn ");
		menuBar.add(mnHngDn);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Giải thuật sử dụng: ");
		lblNewLabel.setBounds(202, 37, 124, 14);
		contentPane.add(lblNewLabel);
		
	}
}
