package exe;
import entities.*;

/**
 *
 * @author Autopsia
 */
public class Principal extends javax.swing.JFrame {
    PilaChars operadores;
    PilaNums numeros;
    int n;
    
    public Principal() {
        initComponents();
        setTitle("Calculadora Pilas");
        n = 100;
        numeros = new PilaNums(n);
        operadores = new PilaChars(n);
    }
    public boolean siEsOperador(char caracter){
        if(caracter == '(' || caracter == ')' || caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/' || caracter == '^'  || caracter == '%'){
            return true;
        }else{
            return false;
        }
    }
    public int prioridad(char caracter){
                    switch(caracter){
                    case '^':
                        return 3;
                    case '*':
                    case '/':
                    case '%':
                        return 2;
                    case '+':
                    case '-':
                        return 1;
                }
                    return -1;
    }
    public void infijaAPostfija(){
        String postfija, infija;
        char caracter;
        int n, i;
        postfija="";
        infija = txtDisplay.getText();
        n = infija.length();
        for (i = 0; i < n; i++)
        {
            caracter = infija.charAt(i);
            if(caracter == '('){
                operadores.poner(caracter);
            }
            else if(caracter == ')'){
                    while(!operadores.estaVacio() && operadores.verUltimo() != '('){
                        postfija += operadores.sacar()+", ";
                    }
                        operadores.sacar();
                    
                
                    }  
              else if (siEsOperador(caracter)){
                    while(!operadores.estaVacio() && operadores.verUltimo() != '(' && prioridad(caracter) <= prioridad(operadores.verUltimo())){
                        postfija += operadores.sacar()+", ";  
                }operadores.poner(caracter);
              }
            
            else if(!siEsOperador(caracter)){
                if(i+1<n && !siEsOperador(infija.charAt(i+1))  ){
                    postfija = postfija + caracter;
                }
                else{
                    postfija = postfija + caracter;
                    postfija += ", ";
                }
            }
        }
        while(!operadores.estaVacio()){
            postfija += operadores.sacar()+", ";
        }
        
        txtDisplay.setText(postfija.substring(0, postfija.length()-2));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnPare1 = new javax.swing.JButton();
        btnPare2 = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn7.setText("7");
        btn7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn7.setMaximumSize(new java.awt.Dimension(40, 40));
        btn7.setMinimumSize(new java.awt.Dimension(40, 40));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn8.setMaximumSize(new java.awt.Dimension(40, 40));
        btn8.setMinimumSize(new java.awt.Dimension(40, 40));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn9.setMaximumSize(new java.awt.Dimension(40, 40));
        btn9.setMinimumSize(new java.awt.Dimension(40, 40));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn4.setMaximumSize(new java.awt.Dimension(40, 40));
        btn4.setMinimumSize(new java.awt.Dimension(40, 40));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn6.setMaximumSize(new java.awt.Dimension(40, 40));
        btn6.setMinimumSize(new java.awt.Dimension(40, 40));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn5.setMaximumSize(new java.awt.Dimension(40, 40));
        btn5.setMinimumSize(new java.awt.Dimension(40, 40));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn1.setMaximumSize(new java.awt.Dimension(40, 40));
        btn1.setMinimumSize(new java.awt.Dimension(40, 40));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn3.setMaximumSize(new java.awt.Dimension(40, 40));
        btn3.setMinimumSize(new java.awt.Dimension(40, 40));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn2.setMaximumSize(new java.awt.Dimension(40, 40));
        btn2.setMinimumSize(new java.awt.Dimension(40, 40));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn0.setMaximumSize(new java.awt.Dimension(40, 40));
        btn0.setMinimumSize(new java.awt.Dimension(40, 40));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDecimal.setText(".");
        btnDecimal.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDecimal.setMaximumSize(new java.awt.Dimension(40, 40));
        btnDecimal.setMinimumSize(new java.awt.Dimension(40, 40));
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnEquals.setText("=");
        btnEquals.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnEquals.setMaximumSize(new java.awt.Dimension(40, 40));
        btnEquals.setMinimumSize(new java.awt.Dimension(40, 40));
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnCE.setText("CE");
        btnCE.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnCE.setMaximumSize(new java.awt.Dimension(40, 40));
        btnCE.setMinimumSize(new java.awt.Dimension(40, 40));
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnPlus.setText("+");
        btnPlus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPlus.setMaximumSize(new java.awt.Dimension(40, 40));
        btnPlus.setMinimumSize(new java.awt.Dimension(40, 40));
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMinus.setMaximumSize(new java.awt.Dimension(40, 40));
        btnMinus.setMinimumSize(new java.awt.Dimension(40, 40));
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnAC.setText("AC");
        btnAC.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnAC.setMaximumSize(new java.awt.Dimension(40, 40));
        btnAC.setMinimumSize(new java.awt.Dimension(40, 40));
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnMulti.setText("*");
        btnMulti.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnMulti.setMaximumSize(new java.awt.Dimension(40, 40));
        btnMulti.setMinimumSize(new java.awt.Dimension(40, 40));
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnDivision.setText("/");
        btnDivision.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnDivision.setMaximumSize(new java.awt.Dimension(40, 40));
        btnDivision.setMinimumSize(new java.awt.Dimension(40, 40));
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnPare1.setText("(");
        btnPare1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPare1.setMaximumSize(new java.awt.Dimension(40, 40));
        btnPare1.setMinimumSize(new java.awt.Dimension(40, 40));
        btnPare1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPare1ActionPerformed(evt);
            }
        });

        btnPare2.setText(")");
        btnPare2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnPare2.setMaximumSize(new java.awt.Dimension(40, 40));
        btnPare2.setMinimumSize(new java.awt.Dimension(40, 40));
        btnPare2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPare2ActionPerformed(evt);
            }
        });

        txtDisplay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPare1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPare2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPare1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPare2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        txtDisplay.setText(txtDisplay.getText()+".");
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        infijaAPostfija();
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        String aux = txtDisplay.getText();
        if (aux.length() > 0) {
            String neoaux = aux.substring(0, aux.length() - 1);
            txtDisplay.setText(neoaux);
        }
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"+");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        txtDisplay.setText("");
    }//GEN-LAST:event_btnACActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"*");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPare1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPare1ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+"(");
    }//GEN-LAST:event_btnPare1ActionPerformed

    private void btnPare2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPare2ActionPerformed
        txtDisplay.setText(txtDisplay.getText()+")");
    }//GEN-LAST:event_btnPare2ActionPerformed

    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDisplayActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnPare1;
    private javax.swing.JButton btnPare2;
    private javax.swing.JButton btnPlus;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}
