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
        jPanel1 = new javax.swing.JPanel();
        jLabelAlgo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSpinnerArrLength = new javax.swing.JSpinner();
        jButtonCreateArr = new javax.swing.JButton();
        jButtonRun = new javax.swing.JButton();
        jLabelBestCase = new javax.swing.JLabel();
        jLabelWorstCase = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
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
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setForeground(java.awt.Color.white);
        setName("frameMain"); // NOI18N
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(204, 255, 204)));
        jPanelMain.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabelCountSwap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
                .addContainerGap(389, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 204, 204)));

        jLabelAlgo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabelAlgo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelAlgo.setText("Giải thuật sử dụng: Sắp xếp nổi bọt - Bubble sort ");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Số lượng phần tử mảng");

        jSpinnerArrLength.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jSpinnerArrLength.setModel(new javax.swing.SpinnerNumberModel(5, 5, 15, 1));
        jSpinnerArrLength.setMaximumSize(new java.awt.Dimension(5, 15));
        jSpinnerArrLength.setMinimumSize(new java.awt.Dimension(0, 5));

        jButtonCreateArr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonCreateArr.setText("Tạo mảng ngẫu nhiên");
        jButtonCreateArr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCreateArr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCreateArrMousePressed(evt);
            }
        });
        jButtonCreateArr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateArrActionPerformed(evt);
            }
        });

        jButtonRun.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButtonRun.setText("Sắp xếp");
        jButtonRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonRunMouseClicked(evt);
            }
        });

        jLabelBestCase.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n+k)");

        jLabelWorstCase.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAlgo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinnerArrLength, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCreateArr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRun)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWorstCase)
                    .addComponent(jLabelBestCase))
                .addGap(117, 117, 117))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAlgo)
                    .addComponent(jLabelBestCase))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerArrLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreateArr)
                    .addComponent(jButtonRun)
                    .addComponent(jLabelWorstCase))
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 204, 204)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setText("Bubble Sort là thuật toán sắp xếp đơn giản nhất hoạt động bằng cách hoán đổi nhiều lần các phần tử liền kề nếu chúng không đúng thứ tự.");
        jTextAreaDescription.setToolTipText("Mô tả giải thuật sử dụng");
        jTextAreaDescription.setWrapStyleWord(true);
        jTextAreaDescription.setMargin(new java.awt.Insets(8, 8, 8, 8));
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuAlgo.setText("Giải Thuật");
        jMenuAlgo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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
        jRadioSelection.setName("Sắp xếp chọn - Selection sort"); // NOI18N
        jRadioSelection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioSelectionMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioSelection);

        buttonGroup.add(jRadioInsertion);
        jRadioInsertion.setText("Sắp xếp chèn - Insertion sort");
        jRadioInsertion.setName("Sắp xếp chèn - Insertion sort"); // NOI18N
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
        jRadioQuick.setName("Sắp xếp nhanh - Quick sort "); // NOI18N
        jRadioQuick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioQuickMousePressed(evt);
            }
        });
        jMenuAlgo.add(jRadioQuick);

        jMenuMain.add(jMenuAlgo);

        jMenuRun.setText("Chạy");
        jMenuRun.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemRun.setText("Chạy");
        jMenuItemRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemRunMousePressed(evt);
            }
        });
        jMenuRun.add(jMenuItemRun);

        jMenuMain.add(jMenuRun);

        jMenuCreateArr.setText("Tạo mảng");
        jMenuCreateArr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItemRandom.setText("Lấy ngẫu nhiên");
        jMenuItemRandom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemRandomMousePressed(evt);
            }
        });
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
        jMenuGUI.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioSelectionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioSelectionMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioSelection.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n^2)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
        jTextAreaDescription.setText("Thuật toán sắp xếp lựa chọn sắp xếp một mảng bằng cách liên tục tìm phần tử tối thiểu (xét theo thứ tự tăng dần) từ phần chưa được sắp xếp và đặt nó ở đầu. Thuật toán duy trì hai mảng con trong một mảng nhất định.\n" +
            "1) Mảng con đã được sắp xếp. \n" +
            "2) Mảng con còn lại chưa được sắp xếp.");
    }//GEN-LAST:event_jRadioSelectionMousePressed

    private void jRadioBubbleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioBubbleMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioBubble.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n+k)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
        jTextAreaDescription.setText("Bubble Sort là thuật toán sắp xếp đơn giản nhất hoạt động bằng cách hoán đổi nhiều lần các phần tử liền kề nếu chúng không đúng thứ tự.");
    }//GEN-LAST:event_jRadioBubbleMousePressed

    private void jRadioQuickMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioQuickMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioQuick.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(nLogn)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
        jTextAreaDescription.setText("QuickSort là một thuật toán Chia và Chinh phục. Nó chọn một phần tử làm trục và phân vùng mảng đã cho xung quanh trục đã chọn");
    }//GEN-LAST:event_jRadioQuickMousePressed

    private void jRadioInsertionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioInsertionMousePressed
        // TODO add your handling code here:
        jLabelAlgo.setText("Giải thuật sử dụng: "+ jRadioInsertion.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(n)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(n^2)");
        jTextAreaDescription.setText("Sắp xếp chèn là một thuật toán sắp xếp đơn giản hoạt động tương tự như cách bạn sắp xếp các thẻ chơi trong tay của mình. "
                + "Mảng hầu như được chia thành một phần được sắp xếp và một phần chưa được sắp xếp. "
                + "Các giá trị từ phần chưa được sắp xếp được chọn và đặt ở vị trí chính xác trong phần được sắp xếp.");
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
            selectionSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioInsertion.isSelected()) {
            insertionSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioHeap.isSelected()) {
            heapSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioQuick.isSelected()) {
            quickSort(arrValue, 0, arrValue.length-1);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
    }//GEN-LAST:event_jButtonRunMouseClicked

    private void jRadioHeapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioHeapMousePressed
        jLabelAlgo.setText("Giải thuật sử dụng: " + jRadioHeap.getName());
        jLabelBestCase.setText("Trường hợp tốt nhất: θ(nLogn)");
        jLabelWorstCase.setText("Trường hợp xấu nhất: θ(nLogn)");
        jTextAreaDescription.setText("Heap sort là một kỹ thuật sắp xếp dựa trên so sánh dựa trên cấu trúc dữ liệu Binary Heap. Nó tương tự như sắp xếp lựa chọn trong đó trước tiên chúng ta tìm phần tử tối thiểu và đặt phần tử tối thiểu ở đầu. ");
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

    private void jMenuItemRunMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemRunMousePressed
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
            selectionSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioInsertion.isSelected()) {
            insertionSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioHeap.isSelected()) {
            heapSort(arrValue);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
        if(jRadioQuick.isSelected()) {
            quickSort(arrValue, 0, arrValue.length-1);
            printArray(arrValue);
            jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
        }
    }//GEN-LAST:event_jMenuItemRunMousePressed

    private void jMenuItemRandomMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemRandomMousePressed
        createArrayRandom(this);
    }//GEN-LAST:event_jMenuItemRandomMousePressed

    private void jButtonCreateArrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateArrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCreateArrActionPerformed

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
    private static javax.swing.JLabel jLabelCountSwap;
    private javax.swing.JLabel jLabelWorstCase;
    private javax.swing.JMenu jMenuAlgo;
    private javax.swing.JMenu jMenuCreateArr;
    private javax.swing.JMenu jMenuGUI;
    private javax.swing.JMenuItem jMenuItemRandom;
    private javax.swing.JMenuItem jMenuItemReadFile;
    private javax.swing.JMenuItem jMenuItemRun;
    private javax.swing.JMenuBar jMenuMain;
    private javax.swing.JMenu jMenuRun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JRadioButtonMenuItem jRadioBubble;
    private javax.swing.JRadioButtonMenuItem jRadioHeap;
    private javax.swing.JRadioButtonMenuItem jRadioInsertion;
    private javax.swing.JRadioButtonMenuItem jRadioQuick;
    private javax.swing.JRadioButtonMenuItem jRadioSelection;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerArrLength;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
    private static JLabel[] arrLabel;
    private static int arrValue[];
    private static int num = 0;
    private static JLabel jLabelArrEmpty = new JLabel("Chưa tạo mảng", JLabel.CENTER);
    private static Thread[] threads = new Thread[1000];
    private static int time = 50;
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
        jLabelCountSwap.setText("Số lần hoán đổi: " + countSwap);
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
//                    int temp = ( Integer ) arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
                    swap(arr, j+1, j);
                    Swap(arrLabel[j], arrLabel[j+1]);
                }
    }
    
    public void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int indexMin = i;
            for(int j=i+1; j<arr.length; j++)
                if(arr[indexMin]>arr[j])
                    indexMin = j;
            swap(arr, i, indexMin);
            if(i!=indexMin)
                Swap(arrLabel[i], arrLabel[indexMin]);
        }
    }
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                // swap(arr, j+1, j);
                Swap(arrLabel[j], arrLabel[j+1]);
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public void heapSort(int arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            if(i!=0)
                Swap(arrLabel[0], arrLabel[i]);
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            swap(arr, i, largest);
            if(i!=largest)
                Swap(arrLabel[i], arrLabel[largest]);
            // int swap = arr[i];
            // arr[i] = arr[largest];
            // arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    static int partition(int[] arr, int low, int high)
    {
        // pivot
        int pivot = arr[high];
        
        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);
    
        for(int j = low; j <= high - 1; j++)
        {
            
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {
                
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
                if(i!=j)
                    Swap(arrLabel[i], arrLabel[j]);
            }
        }
        swap(arr, i + 1, high);
        if((i+1)!=high)
            Swap(arrLabel[i+1], arrLabel[high]);
        return (i + 1);
    }
    
    /* 
            arr[] --> Array to be sorted,
            low --> Starting index,
            high --> Ending index
    */
    public void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {
            
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);
    
            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
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
    
    // Phuong thuc hoan doi mang label
    	public static void Swap(JLabel lb1, JLabel lb2) {
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
                            e.printStackTrace();
		    	}
		    }
		});
		threads[temp].start();
	}
        
        // Phuong thuc hoan doi mang thuc te
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        // Dung cac luong
        public static void stopThread() {
            try {
                    for( int i = 0; i <= countThread; i++) {
                        threads[i].interrupt(); 
                    }
                    countThread = -1;
                }
            catch(Exception e) {
                e.getStackTrace();
            }
        }
        
        // Truong hop chay
        public void runUse(int use) {
            switch(use) {
                case 0: // Dang sap xep
                    jMenuRun.setEnabled(false);
                    jMenuCreateArr.setEnabled(false);
                    jButtonCreateArr.setEnabled(false);
                    jButtonRun.setEnabled(false);
                case 1: // Chua sap xep
                    jMenuRun.setEnabled(true);
                    jMenuCreateArr.setEnabled(true);
                    jButtonCreateArr.setEnabled(true);
                    jButtonRun.setEnabled(true);
            }
        }
}
