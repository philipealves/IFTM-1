/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemaEcommerce.view;
 
import br.com.sistemaEcommerce.controller.ClienteController;
import br.com.sistemaEcommerce.util.BusinessException;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author ggarcia
 */
public class ClienteView extends javax.swing.JInternalFrame {
    
    private ClienteController clienteController;

    /**
     * Creates new form ClienteView
     */
    public ClienteView() throws RemoteException {
        clienteController = new ClienteController();            
        initComponents();        
    }

    public ClienteController getClienteController() {
        return clienteController;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        pnlBotoes = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        pnlCampos = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        scrDados = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cliente");

        pnlBotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)))
        );

        pnlCampos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCodigo.setText("Código:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${clienteController.cliente.codigo}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setConverter(new br.com.sistemaEcommerce.view.converter.IntegerConverter());
        bindingGroup.addBinding(binding);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${clienteController.cliente.nome}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${clienteController.cliente.email}"), txtEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblEmail.setText("E-mail:");

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCamposLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblNome)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamposLayout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addGap(281, 281, 281))))
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCodigo))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${clienteController.tblClientes}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tblDados);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${clienteController.clienteSelecionado}"), tblDados, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${clienteController.clientesSelecionados}"), tblDados, org.jdesktop.beansbinding.BeanProperty.create("selectedElements"));
        bindingGroup.addBinding(binding);

        scrDados.setViewportView(tblDados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCampos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrDados))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrDados, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        try {
            clienteController.pesquisar();
        } catch(RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro" + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        try {
            clienteController.novo();
            clienteController.pesquisar();
        } catch(RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro" + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try {
            
            clienteController.salvar();
            clienteController.novo();
            clienteController.pesquisar();
                        
            JOptionPane.showMessageDialog(this, "Inserido com sucesso!", 
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            
        } catch(BusinessException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Atenção", 
                    JOptionPane.WARNING_MESSAGE);
        } catch(RemoteException e) {
            JOptionPane.showMessageDialog(this, "Erro" + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    
        if(JOptionPane.showConfirmDialog(this, "Deseja excluir este cliente?", 
                "Atenção", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            
            try {
                
                clienteController.excluir();
                clienteController.novo();
                clienteController.pesquisar();
                
            } catch(RemoteException e) {
                JOptionPane.showMessageDialog(this, "Erro" + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
            
            JOptionPane.showMessageDialog(this, "Excluído com sucesso!", 
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNome;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JScrollPane scrDados;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
