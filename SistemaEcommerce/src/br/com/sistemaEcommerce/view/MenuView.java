/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaEcommerce.view;

/**
 *
 * @author ggarcia
 */
public class MenuView extends javax.swing.JFrame {

    /**
     * Creates new form MenuView
     */
    public MenuView() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuView = new javax.swing.JMenu();
        mniCliente = new javax.swing.JMenuItem();
        mniProduto = new javax.swing.JMenuItem();
        mniFornecedor = new javax.swing.JMenuItem();
        mniPedido = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(null);

        menuView.setMnemonic('f');
        menuView.setText("Cadastro");

        mniCliente.setMnemonic('s');
        mniCliente.setText("Cliente");
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        menuView.add(mniCliente);

        mniProduto.setMnemonic('x');
        mniProduto.setText("Produto");
        mniProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProdutoActionPerformed(evt);
            }
        });
        menuView.add(mniProduto);

        mniFornecedor.setMnemonic('a');
        mniFornecedor.setText("Fornecedor");
        mniFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFornecedorActionPerformed(evt);
            }
        });
        menuView.add(mniFornecedor);

        mniPedido.setMnemonic('o');
        mniPedido.setText("Pedido");
        mniPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPedidoActionPerformed(evt);
            }
        });
        menuView.add(mniPedido);

        menuBar.add(menuView);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProdutoActionPerformed
        //System.exit(0);
    }//GEN-LAST:event_mniProdutoActionPerformed

    private void mniPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniPedidoActionPerformed

    private void mniFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniFornecedorActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        ClienteView view = new ClienteView();
        this.desktopPane.add(view);
        
        try {            
            view.setMaximum(true);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        view.setVisible(true);
    }//GEN-LAST:event_mniClienteActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuView menu = new MenuView();
                menu.setSize(1024, 600);
                menu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniFornecedor;
    private javax.swing.JMenuItem mniPedido;
    private javax.swing.JMenuItem mniProduto;
    // End of variables declaration//GEN-END:variables

}
