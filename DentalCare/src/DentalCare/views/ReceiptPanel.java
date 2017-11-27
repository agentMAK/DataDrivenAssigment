/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DentalCare.views;

import DentalCare.model.Patient;
import DentalCare.model.Treatment;
import java.awt.event.ItemEvent;

/**
 *
 * @author Martin
 */
public class ReceiptPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReciptsPanel
     */
    public ReceiptPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        treatmentCol = new javax.swing.JPanel();
        treatmentText = new javax.swing.JLabel();
        costCol = new javax.swing.JPanel();
        costText = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalCost = new javax.swing.JLabel();
        paid = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        patientName = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Past Treatments Due");

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel4.setPreferredSize(new java.awt.Dimension(891, 50));
        jPanel4.setLayout(new java.awt.GridLayout());

        jPanel11.setBackground(new java.awt.Color(245, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Treatments");
        jPanel11.add(jLabel2);

        jPanel4.add(jPanel11);

        jPanel9.setBackground(new java.awt.Color(245, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cost");
        jPanel9.add(jLabel4);

        jPanel4.add(jPanel9);

        jPanel1.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout());

        treatmentCol.setBackground(new java.awt.Color(245, 255, 255));
        treatmentCol.setLayout(new java.awt.BorderLayout());

        treatmentText.setBackground(new java.awt.Color(245, 255, 255));
        treatmentText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        treatmentText.setText("___");
        treatmentText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        treatmentCol.add(treatmentText, java.awt.BorderLayout.CENTER);

        jPanel5.add(treatmentCol);

        costCol.setBackground(new java.awt.Color(245, 255, 255));
        costCol.setLayout(new java.awt.BorderLayout());

        costText.setBackground(new java.awt.Color(255, 255, 255));
        costText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        costText.setText("__");
        costText.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        costCol.add(costText, java.awt.BorderLayout.CENTER);

        jPanel5.add(costCol);

        jPanel1.add(jPanel5, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Total Cost:");

        totalCost.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        totalCost.setText("______");

        paid.setText("Mark as paid");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Patient");

        patientName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                patientNameItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(paid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(totalCost))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(patientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalCost))
                .addGap(41, 41, 41)
                .addComponent(paid)
                .addContainerGap(269, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_patientNameItemStateChanged
        int selectedPatientIndex = patientName.getSelectedIndex();
        
        if(selectedPatientIndex<0)
            selectedPatientIndex = 0;
        
        if (evt.getStateChange() == ItemEvent.SELECTED)
            updatePastTreatmentFields(currentPatients[selectedPatientIndex].getTreatmentsDue());
            setTotalCost(currentPatients[selectedPatientIndex].getOutstandingBalance());
    }//GEN-LAST:event_patientNameItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel costCol;
    private javax.swing.JLabel costText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton paid;
    private javax.swing.JComboBox<String> patientName;
    private javax.swing.JLabel totalCost;
    private javax.swing.JPanel treatmentCol;
    private javax.swing.JLabel treatmentText;
    // End of variables declaration//GEN-END:variables

    private Patient[] currentPatients;
    //Used by controller to update the comboBox of patients
    
    public void addPaidActionListener(java.awt.event.ActionListener l) {
        paid.addActionListener(l);
    }
    
    public void updatePatientNames(Patient[] patients) {
        currentPatients = patients;
        
        for (Patient p: currentPatients) {
            patientName.addItem(p.getForename()+" "+p.getSurname());
        }
        
        updatePastTreatmentFields(currentPatients[0].getTreatmentsDue());
        setTotalCost(currentPatients[0].getOutstandingBalance());
        
        this.revalidate();
        this.repaint();
    }
    
    public void updatePastTreatmentFields(Treatment[] treatments) {
        String treatmentString = "";
        String costString = "";
        if(treatments != null) {
            
            for(Treatment t: treatments) {

                treatmentString+= (t.getName()+"\n");

                if(t.getCost() == 0)
                    costString+= ("Pre-Paid \n");
                else
                    costString+= ("£"+t.getCost()+"\n");
            }
        }
            

        treatmentText.setText(treatmentString);
        costText.setText(costString);
        
        this.revalidate();
        this.repaint();
        
    }

    public void setTotalCost(int i) {
        totalCost.setText("£ "+i);
        this.revalidate();
        this.repaint();
    }
    
    public void clearAll() {
        treatmentText.setText("");
        costText.setText("");
        patientName.removeAllItems();
    }

    /**
     * @return the currentPatients
     */
    public Patient getCurrentPatient() {
        return currentPatients[patientName.getSelectedIndex()];
    }
    
    
}