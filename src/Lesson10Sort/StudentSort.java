package Lesson10Sort;

import Lesson10Search.ISSStudent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.DefaultListModel;

public class StudentSort extends javax.swing.JFrame {

    DefaultListModel model;
    ISSStudent iss[] = new ISSStudent[100];

    public StudentSort() {
        initComponents();
        //connect mode to list
        model = new DefaultListModel();
        nameList.setModel(model);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnop = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nameList = new javax.swing.JList<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnop.setText("OPEN");
        btnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopActionPerformed(evt);
            }
        });

        btnsort.setText("SORT");
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(nameList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnop)
                    .addComponent(btnsort))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsort)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopActionPerformed
        Scanner input = new Scanner(System.in);
        String n, a;
        int id;
        try {
            Scanner scan = new Scanner(new File("studata.txt"));
            for (int i = 0; i < 100; i++) {
                n = scan.nextLine();
                a = scan.nextLine();
                id = Integer.parseInt(scan.nextLine());
                iss[i] = new ISSStudent(n, a, id);
                model.addElement(iss[i].getName());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnopActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        model.clear();
        //sort the students
        selectionSort(iss);
        //print them in the list
        for (ISSStudent x : iss) {
            model.addElement(x.getName());
        }
    }//GEN-LAST:event_btnsortActionPerformed

    public static void selectionSort(ISSStudent[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

    //supporting findMinimum method
    public static int findMinimum(ISSStudent[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i].compareTo(a[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    //supporting swap method (same as bubble sort swap)
    public static void swap(ISSStudent[] a, int x, int y) {
        ISSStudent temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

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
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnop;
    private javax.swing.JButton btnsort;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> nameList;
    // End of variables declaration//GEN-END:variables
}
