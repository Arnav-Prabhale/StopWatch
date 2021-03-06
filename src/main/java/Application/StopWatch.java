/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author arnavprabhale
 */
public class StopWatch extends javax.swing.JFrame implements Runnable
{

    /**
     * Creates new form StopWatch
     */
    
    JLabel lbltimeJlabel;
    JButton btnstopButton, btnrefreshButton, btnpauseButton;
    Thread t;
    volatile boolean check = false, refresh = true, lapse = false;
    String s;
    int first = 0;
    StopWatch me;
    int sec = 0;
    int min = 0;
    int millisec = 0;
    String keeplapse;
    String lapsetimeString = "";
    int index = 1;
    
    
    
    public StopWatch()
    {
        initComponents();
        //CommonFunctions.addlabelBackground(lblmainpage, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/stopwatch.jpeg");
        addComponents();
        t = new Thread(this);
        me = this;
    }

    
    @Override
    synchronized public void run()
    {
        
        String s1, s2, s3;
        
        while(check)
        {
            millisec++;
            
            if(sec == 60)
            {
                sec = 0;
                min++;
            }
            if(millisec == 100)
            {
                sec++;
                millisec = 0;
                
            }
            if(millisec < 10)
            {
                s1 = "0" + String.valueOf(millisec);
            }
            else
            {
                s1 = String.valueOf(millisec);
            }
            if(sec < 10)
            {
                s2 = "0" + String.valueOf(sec);
            }
            else
            {
                s2 = String.valueOf(sec);
            }
            if(min < 10)
            {
                s3 = "0" + String.valueOf(min);
            }
            else
            {
                s3 = String.valueOf(min);
            }     
       
            try
            {
                Thread.sleep(10);
                String s = s3 + " : " + s2 + " : " + s1;
                lbltime.setText(s);
            } 
            catch (InterruptedException e)
            {
                JOptionPane.showMessageDialog(mainPanel, "Exception" + e);
            }

        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel = new javax.swing.JPanel();
        btnexit = new javax.swing.JButton();
        lbltime = new javax.swing.JLabel();
        lblstop = new javax.swing.JLabel();
        lblrefresh = new javax.swing.JLabel();
        lblsetlapse = new javax.swing.JLabel();
        lbllapse = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnexit.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnexit.setText("EXIT");
        btnexit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnexitActionPerformed(evt);
            }
        });

        lbltime.setFont(new java.awt.Font("Mshtakan", 0, 48)); // NOI18N
        lbltime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltime.setText("00 : 00 : 00");

        lblstop.setForeground(new java.awt.Color(255, 102, 0));

        lbllapse.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(lbltime, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbllapse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(lblrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lblstop, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblsetlapse, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnexit)
                .addGap(26, 26, 26)
                .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbllapse, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblrefresh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblstop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsetlapse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnexitActionPerformed
    {//GEN-HEADEREND:event_btnexitActionPerformed
        // TODO add your handling code here:
       int result = JOptionPane.showConfirmDialog(mainPanel, "Want To Exit ?", "Are You Sure", JOptionPane.YES_NO_OPTION);

                if(JOptionPane.YES_OPTION == result)
                {
                    System.exit(0);
                }
                else
                {

                }
    }//GEN-LAST:event_btnexitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(StopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(StopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(StopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(StopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StopWatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel lbllapse;
    private javax.swing.JLabel lblrefresh;
    private javax.swing.JLabel lblsetlapse;
    private javax.swing.JLabel lblstop;
    private javax.swing.JLabel lbltime;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    private void addComponents()
    {

        
        CommonFunctions.addlabelBackground(lblstop, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/pause.jpeg");

        CommonFunctions.addlabelBackground(lblsetlapse, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/lapsecancel5.png");
        
        CommonFunctions.addlabelBackground(lblrefresh, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/refreshcancel.png");
        
        lblrefresh.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        lblsetlapse.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        lblstop.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lblstop.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                if(first == 0)
                {
                    t.start();
                    first++;
                    //lblrefresh.setVisible(false);
                    refresh = false;
                    lapse = false;
                    CommonFunctions.addlabelBackground(lblrefresh, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/refreshcancel.png");
                    lblrefresh.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    System.out.println("in if first ");
                    CommonFunctions.addlabelBackground(lblsetlapse, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/lapse2.png");
                    lblsetlapse.setCursor(new Cursor(Cursor.HAND_CURSOR));

                }
                

                if(check == false)
                {
                    t = new Thread(me);
                    check = true;
                    //lblrefresh.setVisible(false);
                    t.start();
                    lapse = true;
                    System.out.println("in if block of check");
                    CommonFunctions.addlabelBackground(lblrefresh, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/refreshcancel.png");
                    lblrefresh.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    CommonFunctions.addlabelBackground(lblsetlapse, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/lapse2.png");
                    lblsetlapse.setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
                else
                {
                    check = false;
                    refresh = true;
                    lapse = false;
                    CommonFunctions.addlabelBackground(lblrefresh, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/refresh5.png");
                    lblrefresh.setCursor(new Cursor(Cursor.HAND_CURSOR));
                    CommonFunctions.addlabelBackground(lblsetlapse, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/lapsecancel5.png");
                    lblsetlapse.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    System.out.println("in else block of check");
                }
                
                
            }
        });
        
        
        lblrefresh.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("refesh button clicked ");
                if(refresh)
                {
                    check = false;
                    //t = new Thread(me);
                    first = 0;
                    sec = 0;
                    min = 0;
                    millisec = 0;
                    String s1 = "00";
                    String s2 = "00";
                    String s3 = "00";
                    String s = s3 + " : " + s2 + " : " + s1;
                    lbltime.setText(s);
                    t = new Thread(me);
                    CommonFunctions.addlabelBackground(lblrefresh, "/Users/arnavprabhale/NetBeansProjects/RealApplications/src/main/java/images2/refreshcancel.png");
                    lblrefresh.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    lapsetimeString = "";
                    index = 1;
                    lbllapse.setText(lapsetimeString);
                }
            }
        });
        
        
        lblsetlapse.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked(MouseEvent e)
            {
                System.out.println("lapse button clicked ");
                System.out.println(min + "  " + sec + "  " + millisec);
                if(lapse)
                {
                    System.out.println("Lapse true and count taken");
                    System.out.println(min + "  " + sec + "  " + millisec);
                   
                    String s1 = String.valueOf(min);
                    String s2 = String.valueOf(sec);
                    String s3 = String.valueOf(millisec);
                    String s4 = "Lap " + index + ") " + s1 + " : " + s2 + " : " + s3;
                    lapsetimeString =  s4 + "<br/>" + lapsetimeString;
                    keeplapse = "<html>" + lapsetimeString + "</html>";
                    System.out.println(keeplapse);
                    lbllapse.setText(keeplapse);
                    index++;
                }
            }
        });
        
        
    }
    
    
}
