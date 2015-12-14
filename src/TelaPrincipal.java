
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author btd
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private ArrayList<Mesa> mesas;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Produto> produtos;
    private DefaultListModel<Mesa> modeloMesa;
    private DefaultListModel<Pedido> modeloPedido;
    private DefaultListModel<Produto> modeloProduto;
    
    
    
    public TelaPrincipal() {
        initComponents();
        
        mesas = new ArrayList();
        pedidos = new ArrayList();
        produtos = new ArrayList();
        
    }

    public void addProduto(Produto p){
        produtos.add(p);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMesas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMesas = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        lblDescricaoMesa = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDescricaoMesa = new javax.swing.JList();
        tglStatusMesa = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProdutos = new javax.swing.JList();
        btnAdicionaItem1 = new javax.swing.JButton();
        lblQtde = new javax.swing.JLabel();
        spnQtdeDeItens = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        menOpcoes = new javax.swing.JMenu();
        mitemAdicionaMesa = new javax.swing.JMenuItem();
        mitemRemoveMesa = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mitemAdicionaProduto = new javax.swing.JMenuItem();
        mitemRemoveProduto = new javax.swing.JMenuItem();
        menEditar = new javax.swing.JMenu();
        mitemEditaProduto = new javax.swing.JMenuItem();
        menAjuda = new javax.swing.JMenu();
        mitemInstrucoes = new javax.swing.JMenuItem();
        mitemSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 0, 6));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(135, 0, 6));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(204, 204, 204))); // NOI18N

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N

        lblMesas.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblMesas.setForeground(new java.awt.Color(255, 255, 255));
        lblMesas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMesas.setText("MESAS");
        lblMesas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lstMesas.setBackground(new java.awt.Color(255, 255, 255));
        lstMesas.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstMesas.setForeground(new java.awt.Color(51, 51, 51));
        lstMesas.setModel(new DefaultListModel<Mesa>());
        jScrollPane1.setViewportView(lstMesas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMesas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMesas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(135, 0, 6));

        lblDescricaoMesa.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        lblDescricaoMesa.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricaoMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricaoMesa.setText("DESCRIÇÃO DA MESA");

        lstDescricaoMesa.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstDescricaoMesa.setModel(new DefaultListModel<Pedido>());
        jScrollPane2.setViewportView(lstDescricaoMesa);

        tglStatusMesa.setBackground(new java.awt.Color(192, 57, 42));
        tglStatusMesa.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        tglStatusMesa.setText("Status Da Mesa");
        tglStatusMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandlerStatusMesa(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Horário de Entrada:");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Horário de Saída:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescricaoMesa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tglStatusMesa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricaoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tglStatusMesa)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(136, 0, 6));

        lblProdutos.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("PRODUTOS");

        lstProdutos.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lstProdutos.setModel(new DefaultListModel<Produto>());
        jScrollPane3.setViewportView(lstProdutos);

        btnAdicionaItem1.setBackground(new java.awt.Color(192, 57, 42));
        btnAdicionaItem1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnAdicionaItem1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionaItem1.setText("Adicionar Item");
        btnAdicionaItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaItem1ActionPerformed(evt);
            }
        });

        lblQtde.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        lblQtde.setForeground(new java.awt.Color(255, 255, 255));
        lblQtde.setText("Qtde");

        spnQtdeDeItens.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(btnAdicionaItem1)
                        .addGap(15, 15, 15))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionaItem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblQtde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spnQtdeDeItens, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menOpcoes.setText("Opções");

        mitemAdicionaMesa.setText("Adicionar Mesa");
        mitemAdicionaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemAdicionaMesaActionPerformed(evt);
            }
        });
        menOpcoes.add(mitemAdicionaMesa);

        mitemRemoveMesa.setText("Remover Mesa");
        mitemRemoveMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemRemoveMesaActionPerformed(evt);
            }
        });
        menOpcoes.add(mitemRemoveMesa);
        menOpcoes.add(jSeparator1);

        mitemAdicionaProduto.setText("Adicionar Produto");
        mitemAdicionaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemAdicionaProdutoActionPerformed(evt);
            }
        });
        menOpcoes.add(mitemAdicionaProduto);

        mitemRemoveProduto.setText("Remover Produto");
        menOpcoes.add(mitemRemoveProduto);

        jMenuBar1.add(menOpcoes);

        menEditar.setText("Editar");

        mitemEditaProduto.setText("Editar Produto");
        mitemEditaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemEditaProdutoActionPerformed(evt);
            }
        });
        menEditar.add(mitemEditaProduto);

        jMenuBar1.add(menEditar);

        menAjuda.setText("Ajuda");

        mitemInstrucoes.setText("Instruções");
        menAjuda.add(mitemInstrucoes);

        mitemSobre.setText("Sobre");
        menAjuda.add(mitemSobre);

        jMenuBar1.add(menAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HandlerStatusMesa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandlerStatusMesa
        //Implementar
    }//GEN-LAST:event_HandlerStatusMesa

    private void btnAdicionaItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaItem1ActionPerformed
        int index = lstProdutos.getSelectedIndex();
        Pedido pedido = new Pedido((Produto) lstProdutos.getModel().getElementAt(index),
                (Integer)spnQtdeDeItens.getValue());
        DefaultListModel<Pedido> pedidos;
        pedidos = (DefaultListModel<Pedido>)lstDescricaoMesa.getModel();
        pedidos.addElement(pedido);
        
    }//GEN-LAST:event_btnAdicionaItem1ActionPerformed

    private void mitemAdicionaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaMesaActionPerformed
        Mesa novaMesa = new Mesa();
        
        DefaultListModel<Mesa> mesas;
        mesas = (DefaultListModel<Mesa>)lstMesas.getModel();
        mesas.addElement(novaMesa);        
        
    }//GEN-LAST:event_mitemAdicionaMesaActionPerformed

    private void mitemRemoveMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemRemoveMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemRemoveMesaActionPerformed

    private void mitemEditaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemEditaProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mitemEditaProdutoActionPerformed

    private void mitemAdicionaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemAdicionaProdutoActionPerformed
        TelaAddProduto tAddProduto = new TelaAddProduto();    
        tAddProduto.setVisible(true);       
        
        
    }//GEN-LAST:event_mitemAdicionaProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblDescricaoMesa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMesas;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblQtde;
    private javax.swing.JList lstDescricaoMesa;
    private javax.swing.JList lstMesas;
    private javax.swing.JList lstProdutos;
    private javax.swing.JMenu menAjuda;
    private javax.swing.JMenu menEditar;
    private javax.swing.JMenu menOpcoes;
    private javax.swing.JMenuItem mitemAdicionaMesa;
    private javax.swing.JMenuItem mitemAdicionaProduto;
    private javax.swing.JMenuItem mitemEditaProduto;
    private javax.swing.JMenuItem mitemInstrucoes;
    private javax.swing.JMenuItem mitemRemoveMesa;
    private javax.swing.JMenuItem mitemRemoveProduto;
    private javax.swing.JMenuItem mitemSobre;
    private javax.swing.JSpinner spnQtdeDeItens;
    private javax.swing.JToggleButton tglStatusMesa;
    // End of variables declaration//GEN-END:variables

    private class TelaAddProduto extends JFrame{
        
        private JLabel lblNomeProduto;
        private JLabel lblValorProduto;
        private JTextField txtNomeProduto;
        private JTextField txtValorProduto;
        private JButton btnLimpar;
        private JButton btnAdicionar;

        public TelaAddProduto() {
            super("Adicionar Produto");
            //alinhamento à direita
            setLayout(new FlowLayout(FlowLayout.TRAILING,5,15));
            setVisible(false);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setSize(315, 150); 
            setResizable(false);
            setLocationRelativeTo(null);
            
            
            lblNomeProduto = new JLabel("Nome do Produto");
            lblValorProduto = new JLabel("Valor(R$)");
            txtNomeProduto = new JTextField(15);
            txtValorProduto = new JTextField(15);
            btnLimpar = new JButton("Limpar");
            btnAdicionar = new JButton("Adicionar");
            
            add(lblNomeProduto);
            add(txtNomeProduto);
            add(lblValorProduto);
            add(txtValorProduto);
            add(btnLimpar);
            add(btnAdicionar);
            
            BtnLimparHandler btnLimparHandler = new BtnLimparHandler();
            btnLimpar.addActionListener(btnLimparHandler);
            
            BtnAdicionarHandler btnAdicionarHandler = new BtnAdicionarHandler();
            btnAdicionar.addActionListener(btnAdicionarHandler);
        }
        
        private class BtnLimparHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                txtNomeProduto.setText("");
                txtValorProduto.setText("");
            }
            
        }
        
        private class BtnAdicionarHandler implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                
                if("".equals(txtNomeProduto.getText())){
                    JOptionPane.showMessageDialog(null,
                            "O nome do produto não pode estar vázio",
                                "Erro",JOptionPane.ERROR_MESSAGE);               
                }
                else{                                       
                    
                    try {
                        //verifica se valor da caixa de texto é um número
                        double valor = Double.parseDouble(
                                txtValorProduto.getText());
                        //cria produto que será adicionado
                        Produto p = new Produto(
                            txtNomeProduto.getText(),
                            valor);
                        
                        //adiciona a JList de produtos
                        DefaultListModel<Produto> produtos;
                        produtos = (DefaultListModel<Produto>)lstProdutos.getModel();
                        produtos.addElement(p);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null,"Valor inválido!",
                                "Erro",JOptionPane.ERROR_MESSAGE);
                    }                  
                    

                    txtNomeProduto.setText("");
                    txtValorProduto.setText("");
                }
            }
            
        }
    }
}
