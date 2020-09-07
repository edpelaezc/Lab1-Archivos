/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edanP
 */

import java.io.*;
import javax.swing.*;  

public class Lab1UI extends javax.swing.JFrame {

    /**
     * Creates new form Lab1UI
     */
    public Lab1UI() {
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

        ruta = new javax.swing.JTextField();
        rutaButton = new javax.swing.JButton();
        grabar = new javax.swing.JTextField();
        grabarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nombresList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        apellidosList = new javax.swing.JList<>();
        obtenerButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rutaButton.setText("Ruta archivo");
        rutaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutaButtonMouseClicked(evt);
            }
        });

        grabarButton.setText("Grabar");
        grabarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grabarButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombres:");

        nombresList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(nombresList);

        jLabel2.setText("Apellidos:");

        apellidosList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(apellidosList);

        obtenerButton.setText("Obtener");
        obtenerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obtenerButtonMouseClicked(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(grabar, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                        .addComponent(ruta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rutaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grabarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(obtenerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rutaButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grabarButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(obtenerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirButton)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rutaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutaButtonMouseClicked
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        
        File ficheroImagen; 
        String path; 
        int valor = dialog.showOpenDialog(this);
        
        if (valor == JFileChooser.APPROVE_OPTION) {
            ficheroImagen = dialog.getSelectedFile();
            path = ficheroImagen.getPath();
            
            ruta.setText(path);
        }
    }//GEN-LAST:event_rutaButtonMouseClicked

    
    public boolean LlenarArchivo(String path, String value, String strError){
        File obj = new File(path);
        
        try{
            FileWriter writer = new FileWriter(obj, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(value + System.getProperty("line.separator"));
            bw.close();
            writer.close();
            return true;
        }
        catch (IOException ex){
            strError = ex.getMessage();
            return false;
        }
    }
    
    private void grabarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grabarButtonMouseClicked
        // TODO add your handling code here:
        if (!"".equals(ruta.getText())) {
            String error = "";
            if (LlenarArchivo(ruta.getText(), grabar.getText(), error)) {
                JOptionPane.showMessageDialog(null, "Se insertó correctamente el registro: " + grabar.getText());
                grabar.setText("");
            }else {
                JOptionPane.showMessageDialog(null, "ERROR: " + error);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No hay ningún archivo seleccionado");
        }
    }//GEN-LAST:event_grabarButtonMouseClicked

    
    public boolean LeerArchivo(String path, String error){
        File obj = new File(path);
        
        if (obj.exists()) {
            FileReader Lectura; 
            
            try
            {
                Lectura = new FileReader(obj);
                BufferedReader reader = new BufferedReader(Lectura);
                String linea = "";
                
                try
                {
                    linea = reader.readLine();
                    String[] split; 
                    DefaultListModel modeloNombre = new DefaultListModel();
                    DefaultListModel modeloApellido = new DefaultListModel();
                    
                    while (linea != null) {                        
                        if (!"".equals(linea)) {
                            split = linea.split(",");
                            modeloNombre.addElement(split[0]);
                            modeloApellido.addElement(split[1]);                           
                        }
                        linea = reader.readLine();
                    }
                    
                    Lectura.close();
                    reader.close();
                    
                    nombresList.setModel(modeloNombre);
                    apellidosList.setModel(modeloApellido);
                    error = "";
                    return true; 
                }
                catch (IOException ex) {
                    error = ex.getMessage();
                    return false; 
                }                               
            }
            catch (FileNotFoundException ex){
                error = ex.getMessage();                
                return false; 
            }
        }
        else {
            error = "No existe el archivo";
            return false; 
        }
    }
    
    private void obtenerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obtenerButtonMouseClicked
        // TODO add your handling code here:
        if (!"".equals(ruta.getText())) {
            String strError = "";
            if (!LeerArchivo(ruta.getText(), strError)) {
                JOptionPane.showMessageDialog(null, "ERROR: " + strError);
            } 
        }
        else {
            JOptionPane.showMessageDialog(null, "ERROR, Debe seleccionar un archivo para obtener registros.");
        }        
    }//GEN-LAST:event_obtenerButtonMouseClicked

    private void salirButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirButtonMouseClicked
        // TODO add your handling code here:
        int iRespuesta = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir? ", "¿Salir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (iRespuesta == 0) 
            {            
                System.exit(0);
            }    
    }//GEN-LAST:event_salirButtonMouseClicked

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
            java.util.logging.Logger.getLogger(Lab1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab1UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab1UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> apellidosList;
    private javax.swing.JTextField grabar;
    private javax.swing.JButton grabarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> nombresList;
    private javax.swing.JButton obtenerButton;
    private javax.swing.JTextField ruta;
    private javax.swing.JButton rutaButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
