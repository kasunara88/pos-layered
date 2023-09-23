/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pos.layered.view;

import javax.swing.JOptionPane;
import pos.layered.controller.CustomerController;
import pos.layered.dto.CustomerDto;

/**
 *
 * @author wmara
 */
public class CustomerPanel extends javax.swing.JPanel {

	private CustomerController customerController;

	/**
	 * Creates new form CustomerPanel
	 */
	public CustomerPanel() {
		customerController = new CustomerController();
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                basePannel = new javax.swing.JPanel();
                headerPannel = new javax.swing.JPanel();
                headerLable = new javax.swing.JLabel();
                formPannel = new javax.swing.JPanel();
                custidLabel = new javax.swing.JLabel();
                custidText = new javax.swing.JTextField();
                custTitleLabel = new javax.swing.JLabel();
                custtitleText = new javax.swing.JTextField();
                custtitleLabel1 = new javax.swing.JLabel();
                custNameText = new javax.swing.JTextField();
                custDOBLabel = new javax.swing.JLabel();
                custDOBText = new javax.swing.JTextField();
                custSalaryLabel = new javax.swing.JLabel();
                custSalaryText = new javax.swing.JTextField();
                custAddressLabel = new javax.swing.JLabel();
                custAddressText = new javax.swing.JTextField();
                custCityLabel = new javax.swing.JLabel();
                custCityText = new javax.swing.JTextField();
                custProvinceLabel = new javax.swing.JLabel();
                custProvinceText = new javax.swing.JTextField();
                custPostalLabel = new javax.swing.JLabel();
                custPostalText = new javax.swing.JTextField();
                saveButton = new javax.swing.JButton();
                updateButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                tablePannel = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                custTable = new javax.swing.JTable();

                headerLable.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
                headerLable.setText("Manage Customer");

                javax.swing.GroupLayout headerPannelLayout = new javax.swing.GroupLayout(headerPannel);
                headerPannel.setLayout(headerPannelLayout);
                headerPannelLayout.setHorizontalGroup(
                        headerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(headerPannelLayout.createSequentialGroup()
                                .addComponent(headerLable, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                headerPannelLayout.setVerticalGroup(
                        headerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPannelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(headerLable)
                                .addGap(16, 16, 16))
                );

                custidLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custidLabel.setText("Customer ID");

                custidText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custTitleLabel.setText("Customer Title");

                custtitleText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custtitleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custtitleLabel1.setText("Customer Name");

                custNameText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custDOBLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custDOBLabel.setText("Customer DOB");

                custDOBText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custSalaryLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custSalaryLabel.setText("Salary");

                custSalaryText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custAddressLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custAddressLabel.setText("Address");

                custAddressText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custCityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custCityLabel.setText("City");

                custCityText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custProvinceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custProvinceLabel.setText("Province");

                custProvinceText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                custPostalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                custPostalLabel.setText("Postal Code");

                custPostalText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

                saveButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                saveButton.setText("Save Customer");
                saveButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                saveButtonActionPerformed(evt);
                        }
                });

                updateButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                updateButton.setText("Update Customer");
                updateButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                updateButtonActionPerformed(evt);
                        }
                });

                deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
                deleteButton.setText("Delete Customer");
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout formPannelLayout = new javax.swing.GroupLayout(formPannel);
                formPannel.setLayout(formPannelLayout);
                formPannelLayout.setHorizontalGroup(
                        formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formPannelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(formPannelLayout.createSequentialGroup()
                                                .addComponent(custAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(24, 24, 24)
                                                .addComponent(custAddressText))
                                        .addGroup(formPannelLayout.createSequentialGroup()
                                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(custidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(custTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(custDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(formPannelLayout.createSequentialGroup()
                                                                .addComponent(custtitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(custtitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(formPannelLayout.createSequentialGroup()
                                                                .addComponent(custDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(custSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(formPannelLayout.createSequentialGroup()
                                                .addComponent(custCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(custProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(formPannelLayout.createSequentialGroup()
                                                .addComponent(custPostalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(custPostalText, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(155, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formPannelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(updateButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton)
                                .addGap(76, 76, 76))
                );
                formPannelLayout.setVerticalGroup(
                        formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(formPannelLayout.createSequentialGroup()
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(custidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custidText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(custTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custtitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custtitleLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(custDOBLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custDOBText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(custAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(custCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(custPostalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(custPostalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(formPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(saveButton)
                                        .addComponent(updateButton)
                                        .addComponent(deleteButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout tablePannelLayout = new javax.swing.GroupLayout(tablePannel);
                tablePannel.setLayout(tablePannelLayout);
                tablePannelLayout.setHorizontalGroup(
                        tablePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                );
                tablePannelLayout.setVerticalGroup(
                        tablePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 155, Short.MAX_VALUE)
                );

                custTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                custTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                custTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(custTable);

                javax.swing.GroupLayout basePannelLayout = new javax.swing.GroupLayout(basePannel);
                basePannel.setLayout(basePannelLayout);
                basePannelLayout.setHorizontalGroup(
                        basePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basePannelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(basePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(formPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tablePannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(basePannelLayout.createSequentialGroup()
                                .addComponent(headerPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );
                basePannelLayout.setVerticalGroup(
                        basePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(basePannelLayout.createSequentialGroup()
                                .addComponent(headerPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(formPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(basePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(basePannelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(tablePannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(basePannelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(464, 464, 464))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(basePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(basePannel, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(11, Short.MAX_VALUE))
                );
        }// </editor-fold>//GEN-END:initComponents

        private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
		addCustomer();
        }//GEN-LAST:event_saveButtonActionPerformed

        private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        }//GEN-LAST:event_updateButtonActionPerformed

        private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        }//GEN-LAST:event_deleteButtonActionPerformed

        private void custTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_custTableMouseClicked

        }//GEN-LAST:event_custTableMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel basePannel;
        private javax.swing.JLabel custAddressLabel;
        private javax.swing.JTextField custAddressText;
        private javax.swing.JLabel custCityLabel;
        private javax.swing.JTextField custCityText;
        private javax.swing.JLabel custDOBLabel;
        private javax.swing.JTextField custDOBText;
        private javax.swing.JTextField custNameText;
        private javax.swing.JLabel custPostalLabel;
        private javax.swing.JTextField custPostalText;
        private javax.swing.JLabel custProvinceLabel;
        private javax.swing.JTextField custProvinceText;
        private javax.swing.JLabel custSalaryLabel;
        private javax.swing.JTextField custSalaryText;
        private javax.swing.JTable custTable;
        private javax.swing.JLabel custTitleLabel;
        private javax.swing.JLabel custidLabel;
        private javax.swing.JTextField custidText;
        private javax.swing.JLabel custtitleLabel1;
        private javax.swing.JTextField custtitleText;
        private javax.swing.JButton deleteButton;
        private javax.swing.JPanel formPannel;
        private javax.swing.JLabel headerLable;
        private javax.swing.JPanel headerPannel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JButton saveButton;
        private javax.swing.JPanel tablePannel;
        private javax.swing.JButton updateButton;
        // End of variables declaration//GEN-END:variables

	private void addCustomer() {
		CustomerDto customerDto = new CustomerDto(custidText.getText(), custtitleText.getText(),
			custNameText.getText(), custDOBText.getText(), Double.parseDouble(custSalaryText.getText()),
			custAddressText.getText(), custCityText.getText(),
			custProvinceText.getText(), custPostalText.getText());

		String result = customerController.addCustomer(customerDto);
		JOptionPane.showMessageDialog(this, result);
		clear();
	}

	private void clear() {
		custidText.setText("");
		custtitleText.setText("");
		custNameText.setText("");
		custDOBText.setText("");
		custSalaryText.setText("");
		custAddressText.setText("");
		custCityText.setText("");
		custProvinceText.setText("");
		custPostalText.setText("");
	}

}
