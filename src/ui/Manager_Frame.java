package ui;

import controller.SecurityPersonController;
import entity.SecurityPerson;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tableModel.ManagerTableModel;

public class Manager_Frame extends javax.swing.JFrame {

    private SecurityPersonController mySecurity;

    public Manager_Frame() {
        initComponents();
        this.mySecurity = new SecurityPersonController();
        this.refreshTable();
        doRestore();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGroup = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManager = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cmbxSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnSortID = new javax.swing.JButton();
        btnRestore = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vehicle Parking");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 204)));

        jScrollPane1.setMaximumSize(new java.awt.Dimension(22767, 32767));

        tblManager.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 2, 2));
        tblManager.setForeground(new java.awt.Color(0, 153, 153));
        tblManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Place", "Start Time", "End Time", "Date", "Leaves Taken", "Remaining Leaves"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManagerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblManager);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));

        cmbxSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Place", "Date" }));
        jPanel5.add(cmbxSearch);

        txtSearch.setColumns(20);
        jPanel5.add(txtSearch);

        btnSearch.setBackground(new java.awt.Color(255, 204, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel5.add(btnSearch);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 102))));

        jLabel1.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("\"Customer satisfaction\n is our top\n priority.\"");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Copyright");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("2023");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 0));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCreate.setBackground(new java.awt.Color(255, 204, 255));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/add-picture.png"))); // NOI18N
        btnCreate.setText("Create schedule");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreate);

        btnSortID.setBackground(new java.awt.Color(255, 204, 255));
        btnSortID.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSortID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backup-picture.png"))); // NOI18N
        btnSortID.setText("Sort ID");
        btnSortID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortIDActionPerformed(evt);
            }
        });
        jPanel1.add(btnSortID);

        btnRestore.setBackground(new java.awt.Color(255, 204, 255));
        btnRestore.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/restore-picture.png"))); // NOI18N
        btnRestore.setText("Restore");
        jPanel1.add(btnRestore);

        btnRefresh.setBackground(new java.awt.Color(255, 204, 255));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh-picture.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(btnRefresh);

        btnDelete.setBackground(new java.awt.Color(255, 204, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete-picture.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        btnExit.setBackground(new java.awt.Color(255, 204, 255));
        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        doBackup();
    }//GEN-LAST:event_formWindowClosing

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        doSearch();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (tblManager.getSelectedRow() != -1) {
            int n = JOptionPane.showConfirmDialog(tblManager, "Do you really want to delete this", "Delete Option", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doDelete();
                refreshTable();
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        showCreateDialog();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void tblManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManagerMouseClicked
        if (evt.getClickCount() == 2) {
            showUpdateSchedule();
        }
    }//GEN-LAST:event_tblManagerMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        doExit();
        doBackup();
        logOut();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSortIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortIDActionPerformed
        doShowSortById();
    }//GEN-LAST:event_btnSortIDActionPerformed

    void refreshTable() {
        ArrayList<SecurityPerson> listSecurity = this.mySecurity.getListSecurity();
        ManagerTableModel tblModel = new ManagerTableModel(listSecurity);
        this.tblManager.setModel(tblModel);
    }

    private void showUpdateSchedule() {
        int row = this.tblManager.getSelectedRow();
        ManagerTableModel tblModel = (ManagerTableModel) this.tblManager.getModel();
        SecurityPerson selectedSecurity = (SecurityPerson) tblModel.getObjectAtRow(row);

        UpdateRoutine updateDialog = new UpdateRoutine(this, true, this.mySecurity, selectedSecurity);
        updateDialog.setVisible(true);
    }

    public void doShowSortById() {
        this.tblManager.setModel(this.mySecurity.sortVehicleByID());
    }

    private void doBackup() {
        int count = this.mySecurity.saveByteData();
        JOptionPane.showMessageDialog(this, "Backup " + count + " guards");
    }

    private void doSearch() {
        ArrayList<SecurityPerson> list = new ArrayList<>();

        if (this.cmbxSearch.getSelectedIndex() == 0) {
            String searchStr = this.txtSearch.getText();
            list = this.mySecurity.getSecurityByID(searchStr);
        }
        if (this.cmbxSearch.getSelectedIndex() == 1) {
            String searchStr = this.txtSearch.getText();
            list = this.mySecurity.getSecurityByName(searchStr);
        }
        if (this.cmbxSearch.getSelectedIndex() == 2) {
            String searchStr = this.txtSearch.getText();
            list = this.mySecurity.getSecurityByPlace(searchStr);
        }

        if (this.cmbxSearch.getSelectedIndex() == 3) {
            String searchStr = this.txtSearch.getText();
            list = this.mySecurity.getSecurityByDate(searchStr);
        }

        ManagerTableModel tblModel = new ManagerTableModel(list);
        this.tblManager.setModel(tblModel);
    }

    private void doRestore() {
        int count = this.mySecurity.getByteData();
        JOptionPane.showMessageDialog(this, "Restore " + count + " guards");
        this.refreshTable();
    }

    private void showCreateDialog() {
        CreateRoutineDialog addDialog = new CreateRoutineDialog(this, true, mySecurity);
        addDialog.setVisible(true);
    }

    private void doDelete() {
        int row = this.tblManager.getSelectedRow();
        ManagerTableModel model = (ManagerTableModel) this.tblManager.getModel();
        SecurityPerson selectedVehicle = (SecurityPerson) model.getObjectAtRow(row);

        if (this.mySecurity.deleteSecurityByID(selectedVehicle.getIdentityNumber())) {
            JOptionPane.showMessageDialog(this, "Delete Successfully");
        } else {
            JOptionPane.showMessageDialog(this, "Delete Unseccessfully");
        }
    }

    private void doExit() {
        this.dispose();
    }

    private void logOut() {
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRestore;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSortID;
    private javax.swing.JComboBox<String> cmbxSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManager;
    private javax.swing.JTextField txtSearch;
    private javax.swing.ButtonGroup typeGroup;
    // End of variables declaration//GEN-END:variables
}
