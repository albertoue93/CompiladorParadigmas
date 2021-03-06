/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.net.Socket;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Fer
 */
public class Ventana extends javax.swing.JFrame {

    int cont = 0;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        compejecutar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        Error = new javax.swing.JEditorPane();
        Compilar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtATexto1 = new javax.swing.JEditorPane();
        Lineas = new javax.swing.JEditorPane();
        LineaError = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Compilador");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        compejecutar.setBackground(new java.awt.Color(204, 204, 204));
        compejecutar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        compejecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Table.png"))); // NOI18N
        compejecutar.setText("Compilar y Ejecutar");
        compejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compejecutarActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Brush.png"))); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Error.setEditable(false);
        Error.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Error.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Error.setForeground(java.awt.Color.blue);
        jScrollPane5.setViewportView(Error);

        Compilar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Compilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Component.png"))); // NOI18N
        Compilar.setText("Compilar");
        Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompilarActionPerformed(evt);
            }
        });

        txtATexto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtATexto1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtATexto1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtATexto1KeyReleased(evt);
            }
        });

        Lineas.setEditable(false);
        Lineas.setText("1");
        Lineas.setOpaque(false);

        LineaError.setEditable(false);
        LineaError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LineaError.setForeground(java.awt.Color.red);
        LineaError.setToolTipText("");
        LineaError.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LineaError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtATexto1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lineas)
            .addComponent(LineaError)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jLabel1.setText("Proyecto I - Paradigmas de Programación");

        jLabel3.setText(" Integrantes: Priscilla Moraga Ibarra - Alberto Urbina Espinoza");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(Compilar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Limpiar))
                                .addComponent(compejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jLabel2)
                    .addGap(597, 682, Short.MAX_VALUE)))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Compilar)
                            .addComponent(Limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(compejecutar)
                        .addGap(72, 72, 72))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap())))
            .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(554, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compejecutarActionPerformed

        String hostName = "192.168.43.236";
        int portNumber = 80;

        String palabras[] = {"ENCENDER = LED", "APAGAR = LED", "ACTIVAR = SERVO", "OBTENER = TEMP", "INTENSIDAD = LUZ"};

        String texto = this.txtATexto1.getText();

        StringTokenizer tokens = new StringTokenizer(texto, ";\n\r");

        while (tokens.hasMoreTokens()) {
            String sentencia = tokens.nextToken();

            boolean r = true;

            for (int a = 0; a < palabras.length; a++) {
                String ps = palabras[a];
                boolean resultado = ps.equals(sentencia);
                if (resultado) {
                    a = palabras.length;
                    r = true;
                } else {
                    r = false;
                }
            }

            if (!r) {
                this.Error.setText("Error de sintaxis. '" + texto + "' no ha sido encontrada");
            }

            switch (sentencia) {
                case "ENCENDER = LED":
                    try (Socket clientSocket = new Socket(hostName, portNumber)) {
                        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

                        String slash = "/";
                        String peticion = "LED=ON";
                        String txt = slash + peticion;
                        System.out.println("enviando msj: " + txt + "\n");
                        outToServer.writeChars(txt);
                        System.out.println("enviado");
                        Error.setText("Compilado Exitosamente\nLED Encendida");
                        clientSocket.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "APAGAR = LED":
                    try (Socket clientSocket = new Socket(hostName, portNumber)) {
                        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

                        String slash = "/";
                        String peticion = "LED=OFF";
                        String txt = slash + peticion;
                        System.out.println("enviando msj: " + txt + "\n");
                        outToServer.writeChars(txt);
                        System.out.println("enviado");
                        Error.setText("Compilado Exitosamente\nLED Apagada");
                        clientSocket.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "ACTIVAR = SERVO":
                    try (Socket clientSocket = new Socket(hostName, portNumber)) {
                        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

                        String slash = "/";
                        String peticion = "Req=90";
                        String txt = slash + peticion;
                        System.out.println("enviando msj: " + txt + "\n");
                        outToServer.writeChars(txt);
                        System.out.println("enviado");
                        Error.setText("Compilado con Exito");
                        clientSocket.close();
                    } catch (IOException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "OBTENER = TEMP":
                    try (Socket clientSocket = new Socket(hostName, portNumber)) {

                        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

                        String slash = "/";
                        String peticion = "TEMP=ON";
                        String txt = slash + peticion;
                        System.out.println("enviando msj: " + txt + "\n");
                        outToServer.writeChars(txt);
                        System.out.println("enviado");

                        try {
                            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                            System.out.print("Recibido");
                            while (!in.ready()) {

                                Error.setText("Compilado Exitosamente\nLa Temperatura es: " + in.readLine() + " Grados");

                                System.out.print("\n");
                                in.close();
                            }
                        } catch (Exception e) {
                        }
                        clientSocket.close();

                    } catch (IOException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case "INTENSIDAD = LUZ":
                    try (Socket clientSocket = new Socket(hostName, portNumber)) {

                        DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

                        String slash = "/";
                        String peticion = "LIGHT=ON";
                        String txt = slash + peticion;
                        System.out.println("enviando msj: " + txt + "\n");
                        outToServer.writeChars(txt);
                        System.out.println("enviado");
                        Error.setText("Compilado con Exito");

                        try {
                            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                            System.out.print("Recibido");
                            while (!in.ready()) {

                                Error.setText("Compilado Exitosamente\nLa Intensidad de la Luz es: " + in.readLine() + " ohmios");

                                System.out.print("\n");
                                in.close();
                            }
                        } catch (IOException e) {
                        }
                        clientSocket.close();

                    } catch (IOException ex) {
                        Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                default:
                    this.Error.setText("Error de sintaxis. '" + texto + "' no ha sido encontrada");
                    break;
            }

            try {
                //Ponemos a "Dormir" el programa durante los ms que queremos
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_compejecutarActionPerformed

    private void CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompilarActionPerformed
        String palabras[] = {"ENCENDER = LED", "APAGAR = LED", "ACTIVAR = SERVO", "OBTENER = TEMP", "INTENSIDAD = LUZ"};
        String sent = this.txtATexto1.getText();

        StringTokenizer tokens = new StringTokenizer(sent, ";\n\r");

        while (tokens.hasMoreTokens()) {
            String sentencia = tokens.nextToken();

            boolean r = true;

            for (int a = 0; a < palabras.length; a++) {
                String ps = palabras[a];
                boolean resultado = ps.equals(sentencia);
                if (resultado) {
                    a = palabras.length;
                    r = true;
                    Error.setText("Compilado Exitosamente!");
                } else {
                    r = false;
                    this.Error.setText("Error de sintaxis. '" + sent + "' no ha sido encontrada");
                }
            }

            if (!r || r == false) {
                this.Error.setText("Error de sintaxis. '" + sent + "' no ha sido encontrada");
            }

        }

    }//GEN-LAST:event_CompilarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        txtATexto1.setText("");
        LineaError.setText("");
        Error.setText("");

    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtATexto1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATexto1KeyPressed
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), "\n", true);
        String txt = "", token;
        LineaError.setText("");
        Error.setText("");
        cont = 1;

        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if ("\n".equals(token)) {
                cont++;
            }
        }

        for (int i = 1; i <= cont; i++) {
            txt += i + "\n";
        }
        Lineas.setText(txt);
    }//GEN-LAST:event_txtATexto1KeyPressed

    private void txtATexto1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtATexto1KeyReleased
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(), "\n", true);
        String txt = "", token;
        cont = 1;

        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if ("\n".equals(token)) {
                cont++;
            }
        }

        for (int i = 1; i <= cont; i++) {
            txt += i + "\n";
        }
        Lineas.setText(txt);
    }//GEN-LAST:event_txtATexto1KeyReleased

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Compilar;
    private javax.swing.JEditorPane Error;
    private javax.swing.JButton Limpiar;
    private javax.swing.JEditorPane LineaError;
    private javax.swing.JEditorPane Lineas;
    private javax.swing.JButton compejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panel1;
    private javax.swing.JEditorPane txtATexto1;
    // End of variables declaration//GEN-END:variables
}
