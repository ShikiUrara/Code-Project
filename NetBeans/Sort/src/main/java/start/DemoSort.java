/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package start;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author time0
 */
public class DemoSort extends javax.swing.JFrame {

    /**
     * Creates new form DemoSort
     */
    public DemoSort() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanelMain = new javax.swing.JPanel();
        jLabelCountSwap = new javax.swing.JLabel();
        jLabelAlgo = new javax.swing.JLabel();
        jSpinnerArrLength = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButtonCreateArr = new javax.swing.JButton();
        jButtonRun = new javax.swing.JButton();
        jLabelBestCase = new javax.swing.JLabel();
        jLabelWorstCase = new javax.swing.JLabel();
        jMenuMain = new javax.swing.JMenuBar();
        jMenuAlgo = new javax.swing.JMenu();
        jRadioBubble = new javax.swing.JRadioButtonMenuItem();
        jRadioSelection = new javax.swing.JRadioButtonMenuItem();
        jRadioInsertion = new javax.swing.JRadioButtonMenuItem();
        jRadioHeap = new javax.swing.JRadioButtonMenuItem();
        jRadioQuick = new javax.swing.JRadioButtonMenuItem();
        jMenuRun = new javax.swing.JMenu();
        jMenuItemRun = new javax.swing.JMenuItem();
        jMenuCreateArr = new javax.swing.JMenu();
        jMenuItemRandom = new javax.swing.JMenuItem();
        jMenuItemReadFile = new javax.swing.JMenuItem();
        jMenuGUI = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mô Phỏng Giải Thuật Sắp Xếp");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCountSwap.setText("Số lần hoán đổi");

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCountSwap)
                .addGap(197, 197, 197))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCountSwap)
                .addContainerGap(376, Short.MAX_VALUE))
        );

        jLabelAlgo.setText("Giải thuật sử dụng: Sắp xếp nổi bọt - Bubble sort ");

        jSpinnerArrLength.setModel(new javax.swing.SpinnerNumberModel(5, 5, 15, 1));
        jSpinnerArrLength.setMaximumSize(new java.awt.Dimension(5, 15));
        jSpinnerArrLength.setMinimumSize(new java.awt.Dimension(0, 5));

        jLabel1.setText("Số lượng phần tử mảng");

        jButtonCreateArr.setText("Tạo mảng ngẫu nhiên");
        jButtonCreateArr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCreateArrMousePressed(evt);
            }
        });

        jButtonRun.setText("Sắp xếp");
        jButtonRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRunMouseClicked(evt);
            }
        });

        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n+k)");

        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");

        jMenuAlgo.setText("Giải Thuật");

        buttonGroup.add(jRadioBubble);
        jRadioBubble.setSelected(true);
        jRadioBubble.setText("Sắp xếp nổi bọt - Bubble sort ");
        jRadioBubble.setName("Sắp xếp nổi bọt ( Bubble sort )"); // NOI18N
        jRadioBubble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioBubbleMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioBubble);

        buttonGroup.add(jRadioSelection);
        jRadioSelection.setText("Sắp xếp chọn - Selection sort");
        jRadioSelection.setName("Sắp xếp chọn ( Selection sort )"); // NOI18N
        jRadioSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioSelectionMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioSelection);

        buttonGroup.add(jRadioInsertion);
        jRadioInsertion.setText("Sắp xếp chèn - Insertion sort");
        jRadioInsertion.setName("Sắp xếp chèn - Selection sort"); // NOI18N
        jRadioInsertion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioInsertionMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioInsertion);
        jRadioInsertion.getAccessibleContext().setAccessibleName("Sắp xếp chèn - Selection sort");

        buttonGroup.add(jRadioHeap);
        jRadioHeap.setText("Sắp xếp vun đống - Heap sort");
        jRadioHeap.setName("Sắp xếp vun đống - Heap sort"); // NOI18N
        jRadioHeap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioHeapMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioHeap);

        buttonGroup.add(jRadioQuick);
        jRadioQuick.setText("Sắp xếp nhanh - Quick sort ");
        jRadioQuick.setName("Sắp xếp nhanh ( Quick sort )"); // NOI18N
        jRadioQuick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioQuickMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioQuick);

        jMenuMain.add(jMenuAlgo);

        jMenuRun.setText("Chạy");

        jMenuItemRun.setText("Chạy");
        jMenuRun.add(jMenuItemRun);

        jMenuMain.add(jMenuRun);

        jMenuCreateArr.setText("Tạo mảng");

        jMenuItemRandom.setText("Lấy ngẫu nhiên");
        jMenuCreateArr.add(jMenuItemRandom);

        jMenuItemReadFile.setText("Đọc file");
        jMenuItemReadFile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemReadFileMousePressed(evt);
            }
        });
        jMenuCreateArr.add(jMenuItemReadFile);

        jMenuMain.add(jMenuCreateArr);

        jMenuGUI.setText("Hướng dẫn");
        jMenuGUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuGUIMousePressed(evt);
            }
        });
        jMenuMain.add(jMenuGUI);

        setJMenuBar(jMenuMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlgo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerArrLength, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCreateArr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRun)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWorstCase)
                    .addComponent(jLabelBestCase))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabelAlgo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelBestCase)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerArrLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCreateArr)
                        .addComponent(jButtonRun))
                    .addComponent(jLabelWorstCase))
                .addGap(18, 18, 18)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioSelectionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioSelectionMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioSelection.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n^2)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
    }//GEN-LAST:event_jRadioSelectionMousePressed

    private void jRadioBubbleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioBubbleMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioBubble.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n+k)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
    }//GEN-LAST:event_jRadioBubbleMousePressed

    private void jRadioQuickMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioQuickMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioQuick.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(nLogn)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
    }//GEN-LAST:event_jRadioQuickMousePressed

    private void jRadioInsertionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioInsertionMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioInsertion.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
    }//GEN-LAST:event_jRadioInsertionMousePressed

    private void jButtonCreateArrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCreateArrMousePressed
        createArrayRandom(this);
    }//GEN-LAST:event_jButtonCreateArrMousePressed

    private void jMenuItemReadFileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemReadFileMousePressed
        readFile(this);
    }//GEN-LAST:event_jMenuItemReadFileMousePressed
    private void jButtonRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRunMouseClicked
        if(num==0) {
                jLabelArrEmpty.setLocation(560 , 160);
                jPanelMain.add(jLabelArrEmpty);
                jLabelArrEmpty.setSize(120,50);
                jLabelArrEmpty.setBorder(BorderFactory.createLineBorder(new Color(45, 166, 255), 4));
            return;
        }
        if(jRadioBubble.isSelected()) {
            bubbleSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
            
        }
        if(jRadioSelection.isSelected()) {
           
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioInsertion.isSelected()) {
            
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioHeap.isSelected()) {
            
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioQuick.isSelected()) {
            
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
    }//GEN-LAST:event_jButtonRunMouseClicked

    private void jRadioHeapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioHeapMousePressed
        jLabelAlgo.setText("Giải thuật sử dụng: " + jRadioHeap.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(nLogn)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(nLogn)");
    }//GEN-LAST:event_jRadioHeapMousePressed

    private void jMenuGUIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuGUIMousePressed
        JDialog jDialogGUI = new JDialog();
        jDialogGUI.setTitle("Hướng dẫn sử dụng");
        jDialogGUI.setSize(500, 200);
        jDialogGUI.setLocationRelativeTo(null);
        
        // Tao noi dung
        JTextArea jTextAreaGUI = new JTextArea("Bước 1: Chọn giải thuật\n"
                + "- Trên thanh menu Chọn Giải thuật -> Chọn một giải thuật\n"
                + "Bước 2: Chọn số lượng phần tử của mảng\n"
                + "Theo mặc định số phần tử của mảng là 5\n"
                + "Bước 3: Tạo mảng\n"
                + "- Trên thanh menu Chọn Tạo mảng -> Chọn một cách tạo mảng\n"
                + "Theo mặc định thì sẽ tạo ra mảng ngẫu nhiên\n"
                + "Bước 4: Chạy mô phỏng\n"
                + "Chúc bạn thành công!");
        jTextAreaGUI.setEditable(false);
        jDialogGUI.add(jTextAreaGUI);
        jDialogGUI.setVisible(true);
    }//GEN-LAST:event_jMenuGUIMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DemoSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
//                new DemoSort().setVisible(true);
                DemoSort main = new DemoSort();
                main.setVisible(true);
                main.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonCreateArr;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAlgo;
    private javax.swing.JLabel jLabelBestCase;
    private javax.swing.JLabel jLabelCountSwap;
    private javax.swing.JLabel jLabelWorstCase;
    private javax.swing.JMenu jMenuAlgo;
    private javax.swing.JMenu jMenuCreateArr;
    private javax.swing.JMenu jMenuGUI;
    private javax.swing.JMenuItem jMenuItemRandom;
    private javax.swing.JMenuItem jMenuItemReadFile;
    private javax.swing.JMenuItem jMenuItemRun;
    private javax.swing.JMenuBar jMenuMain;
    private javax.swing.JMenu jMenuRun;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JRadioButtonMenuItem jRadioBubble;
    private javax.swing.JRadioButtonMenuItem jRadioHeap;
    private javax.swing.JRadioButtonMenuItem jRadioInsertion;
    private javax.swing.JRadioButtonMenuItem jRadioQuick;
    private javax.swing.JRadioButtonMenuItem jRadioSelection;
    private javax.swing.JSpinner jSpinnerArrLength;
    // End of variables declaration//GEN-END:variables
    private static JLabel[] arrLabel;
    private static int arrValue[];
    private static int num = 0;
    private static JLabel jLabelArrEmpty = new JLabel("Chưa tạo mảng", JLabel.CENTER);
    private static Thread[] threads = new Thread[1000];
    private static int time = 120;
    private static int countThread = -1;
    private static int countSwap = 0;
    
    // Hand code
    public static void createArrayRandom(DemoSort a) {
        deleteArray(a);
        Random random = new Random();
        try {
            a.jSpinnerArrLength.commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(DemoSort.class.getName()).log(Level.SEVERE, null, ex);
        }
        num = ( Integer ) a.jSpinnerArrLength.getValue();
        arrLabel = new JLabel[num];
        arrValue = new int[num];
        for(int i=0; i<num; i++) {
            // Them gia tri vao nhan
            int rd = random.nextInt(100);
            arrLabel[i] = new JLabel("" + rd, JLabel.CENTER);
            if (i == 0)
                    arrLabel[i].setLocation(((int) ((18 - num) * 0.5) * 65) + 80, 160);
            else
                    arrLabel[i].setLocation(arrLabel[i-1].getX() + 70, 160);
            a.jPanelMain.add(arrLabel[i]);
            arrLabel[i].setSize(50, 50);
            arrLabel[i].setBorder(BorderFactory.createLineBorder(new Color(45, 166, 255) , 4));
            
            // Them gia tri vao mang sap xep
            arrValue[i]= rd;
//            System.out.println(arrValue[i]);
        }
        a.jPanelMain.setVisible(true);
    }
    public static void deleteArray(DemoSort a) {
        countSwap = 0;
        stopThread();
        jLabelArrEmpty.setVisible(false);
        a.jPanelMain.remove(jLabelArrEmpty);
        for(int i=0; i<num; i++) {
            arrLabel[i].setVisible(false);
            a.jPanelMain.remove(arrLabel[i]);
        }
    }
    public static void readFile(DemoSort a) {
        deleteArray(a);
        File file = new File("C:\\Users\\time0\\OneDrive\\Desktop\\Web\\NetBeans\\Sort\\src\\main\\java\\start\\array.txt");
        try {
            Scanner scanner = new Scanner(file);
            int i=0;
            num = scanner.nextInt();
            arrLabel = new JLabel[num];
            arrValue = new int[num];
            while(scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                arrValue[i] = temp;
                arrLabel[i] = new JLabel("" + temp, JLabel.CENTER);
                if (i == 0)
                    arrLabel[i].setLocation(((int) ((18 - num) * 0.5) * 65) + 80, 160);
                else
                    arrLabel[i].setLocation(arrLabel[i-1].getX() + 70, 160);
                a.jPanelMain.add(arrLabel[i]);
                arrLabel[i].setSize(50,50);
                arrLabel[i].setBorder(BorderFactory.createLineBorder(new Color(45, 166, 255), 4));
                i++;
            }
//            System.out.println(num);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DemoSort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Phuong thuc sap xep 
    public void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if ( (Integer) arr[j] > (Integer) arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = ( Integer ) arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    Swap(arrLabel[j], arrLabel[j+1]);
                }
    }
    // In mang test
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    // Phuong thuc hoan doi
    	public void Swap(JLabel lb1, JLabel lb2) {
		int x1 = lb1.getX();
		int x2 = lb2.getX();
		countThread ++;
                countSwap ++;
		
		int temp = countThread;
		threads[temp] = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	try {
		    		if (temp != 0) {
			    		threads[temp-1].join();
			    	}
			        while (lb1.getY() > 100) {
			        	lb1.setLocation(lb1.getX(), lb1.getY() - 10);
			        	lb2.setLocation(lb2.getX(), lb2.getY() + 10);
			        	Thread.sleep(time);
			        }
			        while (lb1.getX() < x2) {
			        	lb1.setLocation(lb1.getX() + 10, lb1.getY());
			        	lb2.setLocation(lb2.getX() - 10, lb2.getY());
			        	Thread.sleep(time);
			        }
			        while (lb1.getY() < 140) {
			        	lb1.setLocation(lb1.getX(), lb1.getY() + 10);
			        	lb2.setLocation(lb2.getX(), lb2.getY() - 10);
			        	Thread.sleep(time);
			        }
			        String txtLb1 = lb1.getText();
			        lb1.setText(lb2.getText());
			        lb2.setText(txtLb1);
			        lb1.setLocation(x1, 160);
		        	lb2.setLocation(x2, 160);
		    	} catch (Exception e) {
		    	}
		    }
		});
		threads[temp].start();
	}
        
        // Dung cac luong
        public static void stopThread() {
            for( int i = 0; i <= countThread; i++) {
                threads[i].interrupt();
            }
            countThread = -1;
        }
        
}
