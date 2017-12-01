package DentalCare.views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionListener;
import DentalCare.model.Appointment;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Martin
 */
public class CalendarPanel extends javax.swing.JPanel {

    
    /**
     * Creates new form calendarPanel
     */
    public CalendarPanel() {
        initComponents();
        this.weekPanels = new JPanel[]{monday, tuesday, wednesday, thursday, friday};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calendar2 = new javax.swing.JPanel();
        weekDayNames2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        weekElements2 = new javax.swing.JPanel();
        monday = new javax.swing.JPanel();
        tuesday = new javax.swing.JPanel();
        wednesday = new javax.swing.JPanel();
        thursday = new javax.swing.JPanel();
        friday = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        previousWeek = new javax.swing.JButton();
        nextWeek = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        calendar2.setBackground(new java.awt.Color(255, 255, 255));
        calendar2.setToolTipText("");

        weekDayNames2.setBackground(new java.awt.Color(255, 255, 255));
        weekDayNames2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel15.setText("Monday");
        weekDayNames2.add(jLabel15);

        jLabel16.setText("Tuesday");
        weekDayNames2.add(jLabel16);

        jLabel17.setText("Wedeneday");
        weekDayNames2.add(jLabel17);

        jLabel18.setText("Thursday");
        weekDayNames2.add(jLabel18);

        jLabel19.setText("Friday");
        weekDayNames2.add(jLabel19);

        weekElements2.setMaximumSize(new java.awt.Dimension(1755, 569));
        weekElements2.setLayout(new java.awt.GridLayout(1, 7));

        monday.setBackground(new java.awt.Color(255, 255, 255));
        monday.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        monday.setMaximumSize(new java.awt.Dimension(300, 200));
        monday.setMinimumSize(new java.awt.Dimension(210, 56));
        monday.setPreferredSize(new java.awt.Dimension(300, 200));
        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout();
        flowLayout2.setAlignOnBaseline(true);
        monday.setLayout(flowLayout2);
        weekElements2.add(monday);

        tuesday.setBackground(new java.awt.Color(255, 255, 255));
        tuesday.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        tuesday.setMaximumSize(new java.awt.Dimension(300, 200));
        tuesday.setMinimumSize(new java.awt.Dimension(210, 56));
        tuesday.setPreferredSize(new java.awt.Dimension(300, 200));
        weekElements2.add(tuesday);

        wednesday.setBackground(new java.awt.Color(255, 255, 255));
        wednesday.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        wednesday.setMaximumSize(new java.awt.Dimension(300, 200));
        wednesday.setMinimumSize(new java.awt.Dimension(210, 56));
        wednesday.setPreferredSize(new java.awt.Dimension(300, 200));
        weekElements2.add(wednesday);

        thursday.setBackground(new java.awt.Color(255, 255, 255));
        thursday.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)));
        thursday.setMaximumSize(new java.awt.Dimension(300, 200));
        thursday.setMinimumSize(new java.awt.Dimension(210, 56));
        thursday.setPreferredSize(new java.awt.Dimension(300, 200));
        weekElements2.add(thursday);

        friday.setBackground(new java.awt.Color(255, 255, 255));
        friday.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        friday.setMaximumSize(new java.awt.Dimension(300, 200));
        friday.setMinimumSize(new java.awt.Dimension(210, 56));
        friday.setName(""); // NOI18N
        friday.setPreferredSize(new java.awt.Dimension(300, 200));
        weekElements2.add(friday);

        javax.swing.GroupLayout calendar2Layout = new javax.swing.GroupLayout(calendar2);
        calendar2.setLayout(calendar2Layout);
        calendar2Layout.setHorizontalGroup(
            calendar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(weekDayNames2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(weekElements2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        calendar2Layout.setVerticalGroup(
            calendar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(calendar2Layout.createSequentialGroup()
                .addComponent(weekDayNames2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekElements2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(calendar2, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        previousWeek.setText("Previous Week");
        previousWeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousWeekActionPerformed(evt);
            }
        });
        jPanel1.add(previousWeek);

        nextWeek.setText("Next Week");
        jPanel1.add(nextWeek);

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void previousWeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousWeekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previousWeekActionPerformed

    public void addChangeWeekListener(ActionListener previous, ActionListener next) {
        previousWeek.addActionListener(previous);
        nextWeek.addActionListener(next);
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel calendar2;
    private javax.swing.JPanel friday;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel monday;
    private javax.swing.JButton nextWeek;
    private javax.swing.JButton previousWeek;
    private javax.swing.JPanel thursday;
    private javax.swing.JPanel tuesday;
    private javax.swing.JPanel wednesday;
    private javax.swing.JPanel weekDayNames2;
    private javax.swing.JPanel weekElements2;
    // End of variables declaration//GEN-END:variables
    
    //More variables
    private JPanel[] weekPanels = {monday,tuesday,wednesday,thursday,friday};
    
     public void addAppointmentArray(Appointment[] appointments) {
        
        clearAll();
        
        for(Appointment app : appointments) {
            javax.swing.JPanel appointment = new javax.swing.JPanel();
            javax.swing.JLabel time =  new javax.swing.JLabel();
            javax.swing.JLabel patient = new javax.swing.JLabel();
            javax.swing.JPanel patientPanel = new javax.swing.JPanel();

            appointment.setBackground(new java.awt.Color(237, 250, 250));
            appointment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            appointment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
            appointment.setEnabled(false);
            appointment.setPreferredSize(new java.awt.Dimension(200, 100));
            appointment.setLayout(new java.awt.BorderLayout());

            DateTimeFormatter formatterTime = DateTimeFormatter.ofPattern("HH:mm");
            String startTime = app.getStartTime().format(formatterTime);
            String endTime = app.getEndTime().format(formatterTime);
            
            time.setText(startTime+" - "+endTime);
            time.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 7, 1, 1));
            appointment.add(time, java.awt.BorderLayout.PAGE_START);

            patientPanel.setBackground(new java.awt.Color(237, 250, 250));
            patientPanel.setLayout(new java.awt.BorderLayout());

            patient.setText(app.getFullName());
            patient.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 7, 1, 1));
            patientPanel.add(patient, java.awt.BorderLayout.PAGE_START);

            appointment.add(patientPanel, java.awt.BorderLayout.CENTER);

            weekPanels[app.getDate().getDayOfWeek().getValue() -1].add(appointment);
        }
        
        for(JPanel panel: weekPanels) {
            panel.revalidate();
            panel.repaint();
        }
    }
     
    public void clearAll() {
        for(JPanel panel: weekPanels) {
            panel.removeAll();
            panel.revalidate();
            panel.repaint();
        }
    }
            

}
