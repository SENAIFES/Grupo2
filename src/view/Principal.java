/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ListaDAO;
import entity.Lista;
import java.util.Enumeration;
import javafx.scene.control.RadioMenuItem;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author janaina_ramildes
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        atualizarMenu();

    }

    private void atualizarMenu() {

        Enumeration<AbstractButton> botoes = buttonGroup2.getElements();
        while (botoes.hasMoreElements()) {
            AbstractButton b = botoes.nextElement();
            buttonGroup2.remove(b);
            System.out.println(b.getActionCommand());
        }
        ListaDAO listaDAO = new ListaDAO();

        for (Lista listaDeListas : listaDAO.listarTodos()) {
            JMenuItem menuItem = new JMenuItem(listaDeListas.toString());
            
            buttonGroup2.add(menuItem);
            
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnNovaTarefa = new javax.swing.JButton();
        rbtConcluidos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarefa = new javax.swing.JTable();
        btnFeito = new javax.swing.JButton();
        btnExcluirTarefa = new javax.swing.JButton();
        btnAlterarTarefa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rbtTodos = new javax.swing.JRadioButton();
        rbtHoje = new javax.swing.JRadioButton();
        rbtSemana = new javax.swing.JRadioButton();
        rbtMes = new javax.swing.JRadioButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        MenuListas = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        NovaLista = new javax.swing.JMenuItem();
        ExcluirLista = new javax.swing.JMenuItem();
        AlterarLista = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tarefas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        btnNovaTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Create.png"))); // NOI18N
        btnNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaTarefaActionPerformed(evt);
            }
        });

        rbtConcluidos.setText("Mostrar concluidas");

        tblTarefa.setAutoCreateRowSorter(true);
        tblTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Descrição", "Prazo", "Feito"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTarefa.setEnabled(false);
        jScrollPane1.setViewportView(tblTarefa);

        btnFeito.setText("Feito");
        btnFeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeitoActionPerformed(evt);
            }
        });

        btnExcluirTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Trash.png"))); // NOI18N

        btnAlterarTarefa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Modify.png"))); // NOI18N
        btnAlterarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTarefaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNovaTarefa)
                        .addGap(27, 27, 27)
                        .addComponent(btnAlterarTarefa))
                    .addComponent(rbtConcluidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnExcluirTarefa)
                .addGap(99, 99, 99)
                .addComponent(btnFeito)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtConcluidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovaTarefa)
                            .addComponent(btnExcluirTarefa)
                            .addComponent(btnAlterarTarefa)))
                    .addComponent(btnFeito, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("To Do List");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        buttonGroup1.add(rbtTodos);
        rbtTodos.setSelected(true);
        rbtTodos.setText("Todos");

        buttonGroup1.add(rbtHoje);
        rbtHoje.setText("Hoje");

        buttonGroup1.add(rbtSemana);
        rbtSemana.setText("Semana");

        buttonGroup1.add(rbtMes);
        rbtMes.setText("Mês");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtHoje)
                .addGap(18, 18, 18)
                .addComponent(rbtSemana)
                .addGap(22, 22, 22)
                .addComponent(rbtMes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTodos)
                    .addComponent(rbtMes)
                    .addComponent(rbtHoje)
                    .addComponent(rbtSemana))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuListas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/List.png"))); // NOI18N
        MenuListas.setText("Listas");
        MenuListas.add(jSeparator1);

        NovaLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Create.png"))); // NOI18N
        NovaLista.setText("Nova Lista");
        NovaLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovaListaActionPerformed(evt);
            }
        });
        MenuListas.add(NovaLista);

        ExcluirLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Trash.png"))); // NOI18N
        ExcluirLista.setText("Excluir Lista");
        ExcluirLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirListaActionPerformed(evt);
            }
        });
        MenuListas.add(ExcluirLista);

        AlterarLista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Modify.png"))); // NOI18N
        AlterarLista.setText("Alterar Lista ");
        AlterarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarListaActionPerformed(evt);
            }
        });
        MenuListas.add(AlterarLista);

        jMenuBar2.add(MenuListas);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaTarefaActionPerformed
        CadastrarTarefa cadastrarTarefa = new CadastrarTarefa(this, true);
    }//GEN-LAST:event_btnNovaTarefaActionPerformed

    private void NovaListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovaListaActionPerformed

        Lista lista = new Lista();
        ListaDAO listaDAO = new ListaDAO();
        lista.setNome(JOptionPane.showInputDialog("Nova Lista: "));
        listaDAO.salvar(lista);

        atualizarMenu();


    }//GEN-LAST:event_NovaListaActionPerformed

    private void ExcluirListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirListaActionPerformed
        JOptionPane.showConfirmDialog(this, "Excluir permanentemente a lista?");
    }//GEN-LAST:event_ExcluirListaActionPerformed

    private void AlterarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarListaActionPerformed
        JOptionPane.showInputDialog("Lista: ");
    }//GEN-LAST:event_AlterarListaActionPerformed

    private void btnFeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFeitoActionPerformed

    private void btnAlterarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTarefaActionPerformed
        CadastrarTarefa tela = new CadastrarTarefa(this, true);
    }//GEN-LAST:event_btnAlterarTarefaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    public JButton getBtnAlterarTarefa() {
        return btnAlterarTarefa;
    }

    public JButton getBtnExcluirTarefa() {
        return btnExcluirTarefa;
    }

    public JButton getBtnNovaTarefa() {
        return btnNovaTarefa;
    }

    public JTable getTblTarefa() {
        return tblTarefa;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlterarLista;
    private javax.swing.JMenuItem ExcluirLista;
    private javax.swing.JMenu MenuListas;
    private javax.swing.JMenuItem NovaLista;
    private javax.swing.JButton btnAlterarTarefa;
    private javax.swing.JButton btnExcluirTarefa;
    private javax.swing.JButton btnFeito;
    private javax.swing.JButton btnNovaTarefa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JRadioButton rbtConcluidos;
    private javax.swing.JRadioButton rbtHoje;
    private javax.swing.JRadioButton rbtMes;
    private javax.swing.JRadioButton rbtSemana;
    private javax.swing.JRadioButton rbtTodos;
    private javax.swing.JTable tblTarefa;
    // End of variables declaration//GEN-END:variables
}
