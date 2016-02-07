/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventory;

/**
 *
 * @author System Partners
 */
public class StoreAllocation extends javax.swing.JInternalFrame {

    /**
     * Creates new form StoreAllocation
     */
    public StoreAllocation() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel59 = new javax.swing.JPanel();
        userTxt = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        storeCmbx = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        activityChbx = new javax.swing.JCheckBox();
        centralStoresCmbx = new javax.swing.JCheckBox();
        substoreCmbx = new javax.swing.JCheckBox();
        superUserCmbx = new javax.swing.JCheckBox();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane23 = new javax.swing.JScrollPane();
        moduleTbl = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        try {
            java.lang.Class.forName("org.postgresql.Driver");
        }catch (java.lang.ClassNotFoundException sl){
            System.out.println(sl.getMessage());
        }

        jButton13 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Store Allocation");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel3.setText("User Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel3, gridBagConstraints);

        jPanel59.setLayout(new java.awt.GridBagLayout());

        userTxt.setEditable(false);
        userTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        userTxt.setForeground(new java.awt.Color(102, 102, 102));
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel59.add(userTxt, gridBagConstraints);

        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        jPanel59.add(jButton23, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(jPanel59, gridBagConstraints);

        storeCmbx.setModel(dbadmin.ComboBoxModel.ComboBoxModel(connectDB, "SELECT '-' UNION SELECT distinct  upper(store_name) as store_name from st_main_stores ORDER BY 1"));
        storeCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storeCmbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 10);
        jPanel2.add(storeCmbx, gridBagConstraints);

        jLabel5.setText("Store Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel2.add(jLabel5, gridBagConstraints);

        activityChbx.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        activityChbx.setForeground(new java.awt.Color(0, 0, 204));
        activityChbx.setText("Select all");
        activityChbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityChbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        jPanel2.add(activityChbx, gridBagConstraints);

        centralStoresCmbx.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        centralStoresCmbx.setForeground(new java.awt.Color(255, 0, 51));
        centralStoresCmbx.setSelected(true);
        centralStoresCmbx.setText("Warehouse");
        centralStoresCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centralStoresCmbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(centralStoresCmbx, gridBagConstraints);

        substoreCmbx.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        substoreCmbx.setForeground(new java.awt.Color(255, 0, 51));
        substoreCmbx.setText("SubStore");
        substoreCmbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substoreCmbxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel2.add(substoreCmbx, gridBagConstraints);

        superUserCmbx.setText("SuperUser?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(superUserCmbx, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 2.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tick to allocate Store Privilleges Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel13.setLayout(new java.awt.GridBagLayout());

        moduleTbl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        moduleTbl.setForeground(new java.awt.Color(102, 102, 102));
        moduleTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Module", "Assign"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        moduleTbl.setShowHorizontalLines(false);
        moduleTbl.getTableHeader().setResizingAllowed(false);
        moduleTbl.getTableHeader().setReorderingAllowed(false);
        //cmbox = new javax.swing.JComboBox();
        /*try {

            crset2.setConnectionSource(pConnDB);
            crset2.execute("select payment_code from pb_paymentmodes order by payment_code");
            cmbox.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset2, "payment_code", null, null, null));
            javax.swing.table.TableColumn s = this.jTable11.getColumn("Payment Mode");
            s.setCellEditor(new javax.swing.DefaultCellEditor(cmbox));
            cmbox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cmboxActionPerformed(evt);
                }
            });

            /*     cmbox1.setModel(new org.netbeans.lib.sql.models.ComboBoxModel (crset4, "item", null, null, null));
            javax.swing.table.TableColumn m = this.jTable1.getColumn("Drug Prescribed");
            m.setCellEditor(new javax.swing.DefaultCellEditor(cmbox1));
            cmbox.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    cmboxActionPerformed(evt);
                }
            });

        } catch(java.sql.SQLException sqlExec) {

            javax.swing.JOptionPane.showMessageDialog(this, sqlExec.getMessage());

        }
        */
        moduleTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moduleTblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                moduleTblMouseEntered(evt);
            }
        });
        jScrollPane23.setViewportView(moduleTbl);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1000.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 10);
        jPanel13.add(jScrollPane23, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        jPanel13.add(jSeparator3, gridBagConstraints);

        jButton13.setBackground(new java.awt.Color(0, 255, 204));
        jButton13.setMnemonic('O');
        jButton13.setText("Allocate staff to store");
        jButton13.setToolTipText("Click here enter data");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jButton13, gridBagConstraints);

        jButton63.setBackground(new java.awt.Color(0, 255, 204));
        jButton63.setMnemonic('r');
        jButton63.setText("Remove Row");
        jButton63.setPreferredSize(new java.awt.Dimension(189, 25));
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        jPanel13.add(jButton63, gridBagConstraints);

        jButton53.setBackground(new java.awt.Color(0, 255, 204));
        jButton53.setMnemonic('d');
        jButton53.setText("Delete");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jButton53, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1000.0;
        gridBagConstraints.weighty = 1.0;
        jPanel13.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel13, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
//        System.out.println("Showing dialog");
//        java.awt.Point point = userTxt.getLocationOnScreen();
//        userdialog.setSize(400, 200);
//        userdialog.setLocation(point);
//        userdialog.setVisible(true);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void storeCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storeCmbxActionPerformed
        // TODO add your handling code here:
//        storeGLtxt.setText(GetItemInfo.getStoreGL(storeCmbx.getSelectedItem().toString(), connectDB));
//        activityChbx.doClick();
    }//GEN-LAST:event_storeCmbxActionPerformed

    private void activityChbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityChbxActionPerformed

       

    }//GEN-LAST:event_activityChbxActionPerformed

    private void centralStoresCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centralStoresCmbxActionPerformed
        // TODO add your handling code here:
//        storeGLtxt.setText(null);
//        ClearTable.clearthisTable(moduleTbl);
//        storeCmbx.setModel(lib.ComboBoxModel.ComboBoxModel(connectDB, "SELECT '-' UNION SELECT distinct  upper(store_name) as store_name from st_main_stores ORDER BY 1"));
//        activityChbx.doClick();
    }//GEN-LAST:event_centralStoresCmbxActionPerformed

    private void substoreCmbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_substoreCmbxActionPerformed
        // TODO add your handling code here:
//        storeGLtxt.setText(null);
//        ClearTable.clearthisTable(moduleTbl);
//        // storeCmbx.setModel(lib.ComboBoxModel.ComboBoxModel(connectDB, "SELECT  '-' UNION SELECT  distinct  initcap(department_name) from pb_departments WHERE department_name IN(select store_name from st_stores) and department_name not IN(select store_name from st_main_stores)  ORDER BY 1"));
//        storeCmbx.setModel(lib.ComboBoxModel.ComboBoxModel(connectDB, "SELECT  '-' UNION SELECT  distinct  initcap(department_name) from pb_departments WHERE department_name not IN(select store_name from st_main_stores) UNION SELECT distinct initcap(store_name) from st_stores ORDER BY 1"));
//        activityChbx.doClick();
    }//GEN-LAST:event_substoreCmbxActionPerformed

    private void moduleTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moduleTblMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleTblMouseClicked

    private void moduleTblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moduleTblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleTblMouseEntered

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

//        try {
//            // TODO add your handling code here:
//            if (superUserCmbx.isSelected()) {
//
//                PreparedStatement pst = connectDB.prepareStatement("DELETE  FROM store_allocation WHERE user_name ='" + userTxt.getText() + "' and stores ilike '" + storeCmbx.getSelectedItem() + "' ");
//                pst.executeUpdate();
//
//                for (int i = 0; i < moduleTbl.getRowCount(); i++) {
//                    if (moduleTbl.getValueAt(i, 1) == java.lang.Boolean.TRUE) {
//                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into store_allocation values(?,?,?,?)");
//
//                        pstmt.setObject(1, storeCmbx.getSelectedItem().toString());
//                        pstmt.setObject(2, userTxt.getText().toString());
//                        pstmt.setObject(3, storeGLtxt.getText().toString());
//                        pstmt.setObject(4, moduleTbl.getValueAt(i, 0).toString());
//
//                        pstmt.executeUpdate();
//                        GetItemInfo.updateTrail("Store Allocation to " + userTxt.getText() + " in " + storeCmbx.getSelectedItem().toString() + " right " + moduleTbl.getValueAt(i, 0).toString(), connectDB);
//
//                        // connectDB.commit();
//
//                    }
//                }
//
//                JOptionPane.showMessageDialog(this, userTxt.getText() + "'s Rights Have Been Inserted Succesfully", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
//
//                activityChbx.doClick();
//
//            } else {
//                PreparedStatement pst = connectDB.prepareStatement("DELETE  FROM store_allocation WHERE user_name ='" + userTxt.getText() + "' ");
//                pst.executeUpdate();
//
//                for (int i = 0; i < moduleTbl.getRowCount(); i++) {
//                    if (moduleTbl.getValueAt(i, 1) == java.lang.Boolean.TRUE) {
//                        java.sql.PreparedStatement pstmt = connectDB.prepareStatement("insert into store_allocation values(?,?,?,?)");
//
//                        pstmt.setObject(1, storeCmbx.getSelectedItem().toString());
//                        pstmt.setObject(2, userTxt.getText().toString());
//                        pstmt.setObject(3, storeGLtxt.getText().toString());
//                        pstmt.setObject(4, moduleTbl.getValueAt(i, 0).toString());
//
//                        pstmt.executeUpdate();
//                        GetItemInfo.updateTrail("Store Allocation to " + userTxt.getText() + " in " + storeCmbx.getSelectedItem().toString() + " right " + moduleTbl.getValueAt(i, 0).toString(), connectDB);
//
//                        // connectDB.commit();
//                    }
//                }
//                JOptionPane.showMessageDialog(this, userTxt.getText() + "'s Rights Have Been Updated Succesfully", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
//
//                activityChbx.doClick();
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            Logger.getLogger(PharmacyPointsIntfr.class.getName()).log(Level.SEVERE, null, ex);
//            javax.swing.JOptionPane.showMessageDialog(this, "Transaction Error,Recheck Your Entries", "Error", JOptionPane.ERROR_MESSAGE);
//
//            try {
//                connectDB.rollback();
//            } catch (SQLException ex1) {
//            }
//
//        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton53ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activityChbx;
    private javax.swing.JCheckBox centralStoresCmbx;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton63;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable moduleTbl;
    private javax.swing.JComboBox storeCmbx;
    private javax.swing.JCheckBox substoreCmbx;
    private javax.swing.JCheckBox superUserCmbx;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables
}
