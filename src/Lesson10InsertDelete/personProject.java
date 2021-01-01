
package Lesson10InsertDelete;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class personProject extends javax.swing.JFrame {

    ArrayList<Person> people = new ArrayList();
    DefaultListModel model = new DefaultListModel();

    public personProject() {
        initComponents();
        people.add(new Person("BOB", "M", 25));
        people.add(new Person("FRAN", "F", 55));
        people.add(new Person("MIKE", "M", 15));
        people.add(new Person("SUE", "F", 30));
        //add people to the list
        lst.setModel(model);
        for (Person p : people) {
            model.addElement(p.getName());
        }

    }

    public void show(Person p) {
        txtname.setText(p.getName());
        txtage.setText("" + p.getAge());
        if (p.getGender() == "M") {
            optmale.setSelected(true);
        } else {
            optfemale.setSelected(true);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        optmale = new javax.swing.JRadioButton();
        optfemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lst = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuadd = new javax.swing.JMenuItem();
        mnudel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuall = new javax.swing.JMenuItem();
        mnufemale = new javax.swing.JMenuItem();
        mnumale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonGroup1.add(optmale);
        optmale.setText("Male");
        optmale.setActionCommand("M");

        buttonGroup1.add(optfemale);
        optfemale.setText("Female");
        optfemale.setActionCommand("F");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(optmale, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(optfemale, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optmale)
                    .addComponent(optfemale))
                .addGap(16, 16, 16))
        );

        lst.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lst);

        jMenuBar1.setBackground(new java.awt.Color(210, 240, 240));

        jMenu1.setText("File");

        mnuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/exit.png"))); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/exit.png"))); // NOI18N
        mnuclear.setText("Clear");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        mnuadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/all.png"))); // NOI18N
        mnuadd.setText("Add");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuadd);

        mnudel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnudel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/delete.png"))); // NOI18N
        mnudel.setText("Delete");
        mnudel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudelActionPerformed(evt);
            }
        });
        jMenu2.add(mnudel);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/all.png"))); // NOI18N
        mnuall.setText("Show All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        jMenu3.add(mnuall);

        mnufemale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnufemale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/female.png"))); // NOI18N
        mnufemale.setText("Female");
        mnufemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufemaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnufemale);

        mnumale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnumale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson10InsertDelete/male.png"))); // NOI18N
        mnumale.setText("Male");
        mnumale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnumale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void mnufemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufemaleActionPerformed
        model.clear();
        for (Person person : people) {
            if(person.getGender()=="F"){
                model.addElement(person.getName());
            }
        }
        mnuclear.setEnabled(false);
        mnudel.setEnabled(false);
        mnuadd.setEnabled(false);
        
    }//GEN-LAST:event_mnufemaleActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        model.clear();
        for (Person person : people) {
            model.addElement(person.getName());
        }
        mnuclear.setEnabled(true);
        mnudel.setEnabled(true);
        mnuadd.setEnabled(true);
    }//GEN-LAST:event_mnuallActionPerformed

    private void mnumaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumaleActionPerformed
        model.clear();
        for (Person person : people) {
            if(person.getGender()=="M"){
                model.addElement(person.getName());
            }
        }
        mnuclear.setEnabled(false);
        mnudel.setEnabled(false);
        mnuadd.setEnabled(false);
    }//GEN-LAST:event_mnumaleActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        clearForm();
    }//GEN-LAST:event_mnuclearActionPerformed
 public void clearForm(){
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lst.clearSelection();
 }
    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        String gender = "";
        String name = "";
        int age = 0;
        int loc=0;
        Person p;
        boolean ageisok = age <= 100 && age >= 0;
        boolean genderisok = gender == "M" || gender == "F";
        
        try {
            gender = buttonGroup1.getSelection().getActionCommand();
            age = Integer.parseInt(txtage.getText());
            name = txtname.getText();
            name =name.toUpperCase();   
            p = new Person(name, gender, age);
            if(people.isEmpty()){
                loc=0;
            }
            else{
                loc = findInsertPoint(people, p);
            }
            
            people.add(loc,p);
            model.add(loc, p.getName());
            clearForm();
        } catch (Exception e) {
            if (!genderisok || !ageisok) {
                JOptionPane.showMessageDialog(this,"ERROR INCORRECT INFORMATION");
                
            }
        }
        
            
        

    }//GEN-LAST:event_mnuaddActionPerformed

    private void mnudelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudelActionPerformed
            int loc =-1; //shape, employee, search, person list
            try{
                loc = lst.getSelectedIndex();
            }catch(Exception e){
                
            }
            if(loc<0){
                    JOptionPane.showMessageDialog(this,"PLEASE SELECT A PERSON TO DELETE");
                }
            if(loc>=0){
                people.remove(loc);
                model.remove(loc);
                clearForm();
            }
            
    }//GEN-LAST:event_mnudelActionPerformed

    private void lstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMouseClicked
        String name = "" + lst.getSelectedValue();
        int loc = search(people, new Person(name, "", 0));
        show(people.get(loc));
    }//GEN-LAST:event_lstMouseClicked

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size();
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }

    public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size();
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;

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
            java.util.logging.Logger.getLogger(personProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lst;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnudel;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufemale;
    private javax.swing.JMenuItem mnumale;
    private javax.swing.JRadioButton optfemale;
    private javax.swing.JRadioButton optmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
