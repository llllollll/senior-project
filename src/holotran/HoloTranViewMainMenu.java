package holotran;

//package holotran2;
//
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JButton;
//
//public class HoloTranViewMainMenu {
//    private JPanel jPanel1 = new JPanel();
//    private JPanel jPanel2 = new JPanel();
//    private JLabel jLabel1 = new JLabel();
//    private JButton jButton1 = new JButton();
//    private JButton jButton2 = new JButton();
//    public HoloTranViewMainMenu() {
//        initComponents();
//    }
//
//    private void initComponents() {
//
//        // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        // setForeground(new java.awt.Color(0, 0, 0));
//        // setResizable(false);
//        // setSize(new java.awt.Dimension(500, 400));
//
//        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
//
//        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
//        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
//        jLabel1.setText("HOLOTRAN");
//
//        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
//        jPanel1.setLayout(jPanel1Layout);
//        jPanel1Layout.setHorizontalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel1Layout.createSequentialGroup()
//                .addGap(177, 177, 177)
//                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(154, Short.MAX_VALUE))
//        );
//        jPanel1Layout.setVerticalGroup(
//            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
//                .addContainerGap(24, Short.MAX_VALUE)
//                .addComponent(jLabel1)
//                .addGap(29, 29, 29))
//        );
//
//        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
//
//        jButton1.setBackground(new java.awt.Color(255, 255, 255));
//        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//        jButton1.setForeground(new java.awt.Color(0, 102, 102));
//        jButton1.setText("Convert Video");
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                //jButton1ActionPerformed(evt);
//            }
//        });
//
//        jButton2.setBackground(new java.awt.Color(255, 255, 255));
//        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
//        jButton2.setForeground(new java.awt.Color(0, 102, 102));
//        jButton2.setText("Upload To HOLOTUBE");
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                //jButton2ActionPerformed(evt);
//            }
//        });
//
//        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
//        jPanel2.setLayout(jPanel2Layout);
//        jPanel2Layout.setHorizontalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addGap(164, 164, 164)
//                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
//                    .addGroup(jPanel2Layout.createSequentialGroup()
//                        .addGap(148, 148, 148)
//                        .addComponent(jButton2)))
//                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//        );
//        jPanel2Layout.setVerticalGroup(
//            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(jPanel2Layout.createSequentialGroup()
//                .addGap(65, 65, 65)
//                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addGap(28, 28, 28)
//                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(82, Short.MAX_VALUE))
//        );
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
//                .addContainerGap()
//                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
//                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
//                .addContainerGap())
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addContainerGap()
//                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
//                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
//                .addContainerGap())
//        );
//
//    }
//    
//}