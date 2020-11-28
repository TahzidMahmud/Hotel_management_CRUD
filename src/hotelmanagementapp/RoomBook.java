
package hotelmanagementapp;

import java.awt.Dimension;
import java.awt.Toolkit;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class RoomBook extends javax.swing.JFrame{

   
      BookingInfo booking_obj=new BookingInfo();
    private String Day;
    Connection conn=null;
  
    ResultSet rs=null;
    PreparedStatement pst=null;
   
    public RoomBook() {
        initComponents();
      
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
         setIcon();
          
         
         
         
        
        
    }
private void update_table(){ 
    try{
         conn=DBconnection.GetConnection();
    String query="select * from availableroom";//for specific data query="select field name,field nem from tablename
    pst=conn.prepareStatement(query );
    rs=pst.executeQuery();
    table.setModel(DbUtils.resultSetToTableModel(rs));
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Checkin2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Book = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Checkin1 = new javax.swing.JButton();
        Checkin3 = new javax.swing.JButton();
        bookroom = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Date2 = new com.toedter.calendar.JDateChooser();
        Date1 = new com.toedter.calendar.JDateChooser();

        Checkin2.setBackground(new java.awt.Color(255, 255, 255));
        Checkin2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Checkin2.setText("Check Room");
        Checkin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkin2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(980, 571));
        setMinimumSize(new java.awt.Dimension(980, 571));
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmanagementapp/dhon.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 970, 120);

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel2.setText("Booking For :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(640, 130, 150, 40);

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel3.setText("Check In :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 120, 40);

        Book.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        Book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookMouseClicked(evt);
            }
        });
        jPanel1.add(Book);
        Book.setBounds(790, 130, 130, 40);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Checkin1.setBackground(new java.awt.Color(255, 255, 255));
        Checkin1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Checkin1.setText("Back");
        Checkin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkin1ActionPerformed(evt);
            }
        });

        Checkin3.setBackground(new java.awt.Color(255, 255, 255));
        Checkin3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        Checkin3.setText("Check Room");
        Checkin3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Checkin3ActionPerformed(evt);
            }
        });

        bookroom.setBackground(new java.awt.Color(255, 255, 255));
        bookroom.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        bookroom.setText("Book Room");
        bookroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookroomMouseClicked(evt);
            }
        });
        bookroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookroomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Checkin1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookroom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addComponent(Checkin3, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(bookroom, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Checkin1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(Checkin3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(138, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(790, 230, 170, 210);

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        jLabel5.setText("Check Out:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 90, 130, 110);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel4.setText("List Of Available Rooms");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 180, 250, 30);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RoomNumber", "RoomTyoe", "Cost", "BedType"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 223, 740, 290);
        jPanel1.add(Date2);
        Date2.setBounds(450, 130, 170, 30);
        jPanel1.add(Date1);
        Date1.setBounds(120, 130, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Checkin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkin1ActionPerformed
        Reservation obj = new Reservation ();
        obj.show();
        this.hide();
    }//GEN-LAST:event_Checkin1ActionPerformed
//table row click
    
    
    

   
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // BookingInfo booking_obj=new BookingInfo();
        
        try{
            int  row=table.getSelectedRow();
             String table_click=(table.getModel().getValueAt(row, 0).toString());
           String query="select * from availableroom where RoomNumber='"+table_click+"'";
         
           pst=conn.prepareStatement(query );
    rs=pst.executeQuery();
    if(rs.next()){
        
       
        String ad1=rs.getString("RoomNumber");
        booking_obj.setroomno( ad1);
         String ad2=rs.getString("RoomType");
        booking_obj.setroomtype( ad2);
        String ad3=rs.getString("BedType");
        booking_obj.setbedtype( ad3);
        
         String ad4=rs.getString("RoomCost");
        booking_obj.setcost( ad4);
        
     
         
          
       
          
    }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void BookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BookMouseClicked

    private void Checkin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Checkin2ActionPerformed

    private void Checkin3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Checkin3ActionPerformed
        // TODO add your handling code here:
         conn=DBconnection.GetConnection();
     //  update_table(); 
         SimpleDateFormat formate = new SimpleDateFormat ("d MMM , yyyy");
        Date d1 = null;
        Date d2 = null;
         String in;
         String out;
        try
        {
           d1 = formate.parse(formate.format(Date1.getDate()));
           d2 = formate.parse(formate.format(Date2.getDate()));
           
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        long diff = d2.getTime() - d1.getTime();
        long sec = diff / 1000 % 60;
        long min = diff / (60*1000) % 60;
        long hours = diff / (60*60*1000);
       
        long days =hours/24;
         Day=Long.toString(days);
        booking_obj.setdays(Day);
        if(days<=0){
             Book.setText("Invalid.. ");
        }else{
        Book.setText("Days "+Long.toString(days));
        update_table();
        }
         
        
         in=formate.format(d1);
         out=formate.format(d2);
        
          booking_obj.setchechin(in);
     booking_obj.setcheckout(out);
    }//GEN-LAST:event_Checkin3ActionPerformed

    private void bookroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookroomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookroomActionPerformed

    private void bookroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookroomMouseClicked
        // TODO add your handling code here:
         conn=DBconnection.GetConnection();
        try{
           String query="delete from availableroom where RoomNumber=?";
           pst=conn.prepareStatement(query );
           pst.setString(1,  booking_obj. getrno());
          
            pst.execute();
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);   
        }
        
        update_table(); 
        
        booking_obj.show();
       this.hide();
    }//GEN-LAST:event_bookroomMouseClicked

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
            java.util.logging.Logger.getLogger(RoomBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomBook().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LOG.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Book;
    private javax.swing.JButton Checkin1;
    private javax.swing.JButton Checkin2;
    private javax.swing.JButton Checkin3;
    private com.toedter.calendar.JDateChooser Date1;
    private com.toedter.calendar.JDateChooser Date2;
    private javax.swing.JButton bookroom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}