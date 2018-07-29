package Interfaz;

import Manejadores.ManejadorCalcuBasica;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author fabricio
 */
public class CalcuBasicaInterfaz extends javax.swing.JInternalFrame {

    
    ManejadorCalcuBasica mcb;
    private String resultadoFinal = " ";
    /**
     * Creates new form CalcuadoraBasica
     */
    public CalcuBasicaInterfaz() {
        initComponents();
        estadoBotones(false);
        mcb = new ManejadorCalcuBasica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        number9 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number0 = new javax.swing.JButton();
        buttonSuma = new javax.swing.JButton();
        buttonIgual = new javax.swing.JButton();
        buttonMultiplicacion = new javax.swing.JButton();
        buttonDivision = new javax.swing.JButton();
        buttonResiduo = new javax.swing.JButton();
        buttonPunto = new javax.swing.JButton();
        buttonANS = new javax.swing.JButton();
        buttonRaiz = new javax.swing.JButton();
        buttonPotencia = new javax.swing.JButton();
        buttonResta = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        labelPrincipal = new javax.swing.JLabel();
        buttonBorrar = new javax.swing.JButton();
        buttonLimpiar = new javax.swing.JButton();
        number10 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Calculadora Basica");

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        buttonSuma.setText("+");
        buttonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSumaActionPerformed(evt);
            }
        });

        buttonIgual.setBackground(new java.awt.Color(2, 30, 183));
        buttonIgual.setForeground(new java.awt.Color(254, 254, 254));
        buttonIgual.setText("=");
        buttonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIgualActionPerformed(evt);
            }
        });

        buttonMultiplicacion.setText("*");
        buttonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicacionActionPerformed(evt);
            }
        });

        buttonDivision.setText("÷");
        buttonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivisionActionPerformed(evt);
            }
        });

        buttonResiduo.setText("%");
        buttonResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResiduoActionPerformed(evt);
            }
        });

        buttonPunto.setText(".");
        buttonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPuntoActionPerformed(evt);
            }
        });

        buttonANS.setText("ANS");
        buttonANS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonANSActionPerformed(evt);
            }
        });

        buttonRaiz.setText("√");
        buttonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRaizActionPerformed(evt);
            }
        });

        buttonPotencia.setText("^");
        buttonPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPotenciaActionPerformed(evt);
            }
        });

        buttonResta.setText("-");
        buttonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestaActionPerformed(evt);
            }
        });

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        labelPrincipal.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        labelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        buttonBorrar.setBackground(new java.awt.Color(222, 0, 0));
        buttonBorrar.setForeground(new java.awt.Color(254, 254, 254));
        buttonBorrar.setText("C");
        buttonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBorrarActionPerformed(evt);
            }
        });

        buttonLimpiar.setBackground(new java.awt.Color(241, 123, 1));
        buttonLimpiar.setForeground(new java.awt.Color(254, 254, 254));
        buttonLimpiar.setText("Del");
        buttonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimpiarActionPerformed(evt);
            }
        });

        number10.setText("00");
        number10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buttonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonANS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(buttonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonANS, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonResiduo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(buttonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(buttonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(number10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(2, 2, 2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "9");
        estadoBotones(true);
        
    }//GEN-LAST:event_number9ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "8");
        estadoBotones(true);
    }//GEN-LAST:event_number8ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "7");
        estadoBotones(true);
    }//GEN-LAST:event_number7ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "6");
        estadoBotones(true);
    }//GEN-LAST:event_number6ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "5");
        estadoBotones(true);
    }//GEN-LAST:event_number5ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "4");
        estadoBotones(true);
    }//GEN-LAST:event_number4ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "3");
        estadoBotones(true);
    }//GEN-LAST:event_number3ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "2");
        estadoBotones(true);
    }//GEN-LAST:event_number2ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "1");
        estadoBotones(true);
    }//GEN-LAST:event_number1ActionPerformed

    private void buttonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSumaActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "+");
        estadoBotones(true);
    }//GEN-LAST:event_buttonSumaActionPerformed

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "0");
        estadoBotones(true);
    }//GEN-LAST:event_number0ActionPerformed

    private void buttonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestaActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "-");
    }//GEN-LAST:event_buttonRestaActionPerformed

    private void buttonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBorrarActionPerformed
        labelPrincipal.setText(mcb.borrar(labelPrincipal.getText(), this));
    }//GEN-LAST:event_buttonBorrarActionPerformed

    private void buttonANSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonANSActionPerformed
        if(this.resultadoFinal.equals(" ")){
            labelPrincipal.setText(labelPrincipal.getText() + "0");
        } else {
            labelPrincipal.setText(labelPrincipal.getText() + this.resultadoFinal);
            estadoBotones(true);
        }
    }//GEN-LAST:event_buttonANSActionPerformed

    private void buttonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPuntoActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + ".");
    }//GEN-LAST:event_buttonPuntoActionPerformed

    private void buttonResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResiduoActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "%");
    }//GEN-LAST:event_buttonResiduoActionPerformed

    private void buttonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicacionActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "*");
    }//GEN-LAST:event_buttonMultiplicacionActionPerformed

    private void buttonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivisionActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "÷");
    }//GEN-LAST:event_buttonDivisionActionPerformed

    private void buttonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRaizActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "√");
    }//GEN-LAST:event_buttonRaizActionPerformed

    private void buttonPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPotenciaActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "^");
    }//GEN-LAST:event_buttonPotenciaActionPerformed

    private void buttonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIgualActionPerformed
        try {
            String resultadoFinal = "";
//            estadoBotones(false);
            if(labelPrincipal.getText().contains(".")){
                resultadoFinal = Double.toString(mcb.resultadoDecimal(labelPrincipal.getText()));
                this.resultadoFinal = resultadoFinal;
            } else {
                resultadoFinal = Integer.toString(mcb.resultadoEntero(labelPrincipal.getText()));
                this.resultadoFinal = resultadoFinal;
            }
            labelPrincipal.setText(resultadoFinal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "No es posible realizar la operacion solicitada", "Error de formato", JOptionPane.ERROR_MESSAGE);
            labelPrincipal.setText("");
            estadoBotones(false);
            e.printStackTrace();
        } catch(ArithmeticException e) {
            JOptionPane.showMessageDialog(rootPane, "No es posible realizar la operacion aritmetica solicitada", "Error aritmetico",JOptionPane.ERROR_MESSAGE);
            labelPrincipal.setText("");
            estadoBotones(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonIgualActionPerformed

    private void buttonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimpiarActionPerformed
        labelPrincipal.setText("");
        estadoBotones(false);
    }//GEN-LAST:event_buttonLimpiarActionPerformed

    private void number10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number10ActionPerformed
        labelPrincipal.setText(labelPrincipal.getText() + "00");
    }//GEN-LAST:event_number10ActionPerformed

    public void estadoBotones(boolean estado){
        buttonSuma.setEnabled(estado);
        buttonResta.setEnabled(estado);
        buttonMultiplicacion.setEnabled(estado);
        buttonDivision.setEnabled(estado);
        buttonPotencia.setEnabled(estado);
        buttonResiduo.setEnabled(estado);
        buttonIgual.setEnabled(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonANS;
    private javax.swing.JButton buttonBorrar;
    private javax.swing.JButton buttonDivision;
    private javax.swing.JButton buttonIgual;
    private javax.swing.JButton buttonLimpiar;
    private javax.swing.JButton buttonMultiplicacion;
    private javax.swing.JButton buttonPotencia;
    private javax.swing.JButton buttonPunto;
    private javax.swing.JButton buttonRaiz;
    private javax.swing.JButton buttonResiduo;
    private javax.swing.JButton buttonResta;
    private javax.swing.JButton buttonSuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number10;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    // End of variables declaration//GEN-END:variables
}
