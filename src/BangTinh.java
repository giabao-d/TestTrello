
public class BangTinh extends javax.swing.JFrame {

    int x, y, kq;
    int TT;

    public BangTinh() {
        initComponents();
        setPreferredSize(new java.awt.Dimension(500, 280));
        pack();
        setLocationRelativeTo(null);
        //Khung cửa sổ
    }

    public static void main(String[] args) {
        new BangTinh().setVisible(true);
    }

    void HienThiTT() {
        switch (TT) {
            case 1:
                PhepTinhText.setText("+");
                break;
            case 2:
                PhepTinhText.setText("-");
                break;
            case 3:
                PhepTinhText.setText("*");
                break;
            case 4:
                PhepTinhText.setText("/");
                break;
            default:
                PhepTinhText.setText("");
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TieuDe = new javax.swing.JLabel();
        Sox = new javax.swing.JLabel();
        Soy = new javax.swing.JLabel();
        Ketqua = new javax.swing.JLabel();
        Text2 = new javax.swing.JTextField();
        Bang = new javax.swing.JButton();
        Nut4 = new javax.swing.JButton();
        Nut2 = new javax.swing.JButton();
        Nut3 = new javax.swing.JButton();
        Nut1 = new javax.swing.JButton();
        Pheptinh = new javax.swing.JLabel();
        KetQuaText = new javax.swing.JTextField();
        Text1 = new javax.swing.JTextField();
        PhepTinhText = new javax.swing.JLabel();
        ThoatButton = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TieuDe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TieuDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TieuDe.setText("Bảng Tính");
        getContentPane().add(TieuDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 6, -1, -1));

        Sox.setText("Số x:");
        getContentPane().add(Sox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 31, -1));

        Soy.setText("Số y:");
        getContentPane().add(Soy, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 31, -1));

        Ketqua.setText("Kết quả:");
        getContentPane().add(Ketqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, -1));

        Text2.addActionListener(this::Text2ActionPerformed);
        getContentPane().add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 100, -1));

        Bang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bang.setText("=");
        Bang.addActionListener(this::BangActionPerformed);
        getContentPane().add(Bang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 70, 20));

        Nut4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nut4.setText("/");
        Nut4.addActionListener(this::Nut4ActionPerformed);
        getContentPane().add(Nut4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, 20));

        Nut2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nut2.setText("-");
        Nut2.addActionListener(this::Nut2ActionPerformed);
        getContentPane().add(Nut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 70, 30));

        Nut3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Nut3.setText("*");
        Nut3.addActionListener(this::Nut3ActionPerformed);
        getContentPane().add(Nut3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 70, 20));

        Nut1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Nut1.setText("+");
        Nut1.addActionListener(this::Nut1ActionPerformed);
        getContentPane().add(Nut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, -1));

        Pheptinh.setText("Phép tính:");
        getContentPane().add(Pheptinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        KetQuaText.addActionListener(this::KetQuaTextActionPerformed);
        getContentPane().add(KetQuaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 100, -1));

        Text1.addActionListener(this::Text1ActionPerformed);
        getContentPane().add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, -1));

        PhepTinhText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(PhepTinhText, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 50, 20));

        ThoatButton.setText("Thoát");
        ThoatButton.addActionListener(this::ThoatButtonActionPerformed);
        getContentPane().add(ThoatButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text2ActionPerformed

    }//GEN-LAST:event_Text2ActionPerformed

    private void Nut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nut2ActionPerformed
        TT = 2;
        HienThiTT();
    }//GEN-LAST:event_Nut2ActionPerformed

    private void BangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BangActionPerformed
        x = Integer.parseInt(Text1.getText());
        y = Integer.parseInt(Text2.getText());
        switch (TT) {
            case 1:
                kq = x + y;
                break;
            case 2:
                kq = x - y;
                break;
            case 3:
                kq = x * y;
                break;
            case 4:
                kq = x / y;
                break;
            default:
                break;
        }

        KetQuaText.setText(String.valueOf(kq));

    }//GEN-LAST:event_BangActionPerformed

    private void Nut4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nut4ActionPerformed
        TT = 4;
        HienThiTT();
    }//GEN-LAST:event_Nut4ActionPerformed

    private void Nut3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nut3ActionPerformed
        TT = 3;
        HienThiTT();
    }//GEN-LAST:event_Nut3ActionPerformed

    private void Nut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nut1ActionPerformed
        TT = 1;
        HienThiTT();
    }//GEN-LAST:event_Nut1ActionPerformed

    private void KetQuaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KetQuaTextActionPerformed

    }//GEN-LAST:event_KetQuaTextActionPerformed

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text1ActionPerformed

    }//GEN-LAST:event_Text1ActionPerformed

    private void ThoatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ThoatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bang;
    private javax.swing.JTextField KetQuaText;
    private javax.swing.JLabel Ketqua;
    private javax.swing.JButton Nut1;
    private javax.swing.JButton Nut2;
    private javax.swing.JButton Nut3;
    private javax.swing.JButton Nut4;
    private javax.swing.JLabel PhepTinhText;
    private javax.swing.JLabel Pheptinh;
    private javax.swing.JLabel Sox;
    private javax.swing.JLabel Soy;
    private javax.swing.JTextField Text1;
    private javax.swing.JTextField Text2;
    private javax.swing.JButton ThoatButton;
    private javax.swing.JLabel TieuDe;
    // End of variables declaration//GEN-END:variables
}
