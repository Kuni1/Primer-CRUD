package view;

import dao.DaoAlumnos;
import dao.implement.DaoAlumnosImp;
import java.util.List;
import dto.Alumnos;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlumnosView extends javax.swing.JFrame {

    private final DaoAlumnos daoAlumnos;
    private List<Alumnos> list;
    private final DefaultTableModel dtm;
    private boolean opt;
    private LocalDate fecha;
    private int idAlumno;

    public AlumnosView() {
        daoAlumnos = new DaoAlumnosImp();
        opt = true;
        initComponents();
        dtm = (DefaultTableModel) table.getModel();
        alumnosSEL();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ALUMNOS");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_alumno", "nombre", "apellido", "fecha_nac", "direccion"
            }
        ));
        jScrollPane1.setViewportView(table);

        lblTitulo.setText("AGREGAR");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel6.setText("Dirección: ");

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (opt) {
            try {
                Alumnos a = new Alumnos();
                a.setNombre(txtNombre.getText());
                a.setApellido(txtApellido.getText());
                a.setFecha_nac(LocalDate.now());
                a.setDireccion(txtDireccion.getText());
//          a.setSueldo(Double.parseDouble(txtSueldo.getText()));

                if (daoAlumnos.alumnosIns(a) == null) {
                    alumnosSEL();
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresar un valor numérico",
                        e.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        } else {
            try {
                Alumnos a = new Alumnos();
                a.setId_alumno(idAlumno);
                a.setNombre(txtNombre.getText());
                a.setApellido(txtApellido.getText());
                a.setDireccion(txtDireccion.getText());
//          a.setSueldo(Double.parseDouble(txtSueldo.getText()));
                a.setFecha_nac(fecha);

                if (daoAlumnos.alumnosUpd(a) == null) {
                    alumnosSEL();
                    opt = true;
                    lblTitulo.setText("Agregar");
                    btnAgregar.setText("Agregar");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingresar un valor numérico",
                        e.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int id = table.getSelectedRow();
        if (id == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una celda",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            Alumnos alumno = daoAlumnos.alumnosGet((Integer) dtm.getValueAt(id, 0));
            lblTitulo.setText("MODIFICAR");
            txtNombre.setText(alumno.getNombre());
            txtApellido.setText(alumno.getApellido());
            txtDireccion.setText(alumno.getDireccion());
//          txtDeuda.setText(String.valueOf(inquilino.getDeuda()));
            btnAgregar.setText("MODIFICAR");
            fecha = alumno.getFecha_nac(); // No altera la fecha
            idAlumno = alumno.getId_alumno(); // Captura el ID
            opt = false;
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int[] ids = table.getSelectedRows();
        if (ids.length == 0) {
            JOptionPane.showMessageDialog(null, "Seleccione al menos una celda",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            List<Integer> idElim = new ArrayList<>();
            for (int i = 0; i < ids.length; i++) {
                idElim.add((Integer) dtm.getValueAt(ids[i], 0));
            }
            try {
                daoAlumnos.alumnosDel(idElim);
                alumnosSEL();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, daoAlumnos.getMessage(),
                        e.getMessage(), JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlumnosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void alumnosSEL() {

        for (int i = dtm.getRowCount() - 1; i >= 0; i--) {
            dtm.removeRow(i);
        }

        try {
            list = daoAlumnos.alumnosSet();
            list.forEach((t) -> {
                Object[] ob = new Object[5];
                ob[0] = t.getId_alumno();
                ob[1] = t.getNombre();
                ob[2] = t.getApellido();
                ob[3] = t.getFecha_nac().toString();
                ob[4] = t.getDireccion();
                dtm.addRow(ob);
            });
            limpiar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, daoAlumnos.getMessage(),
                    e.getMessage(), JOptionPane.WARNING_MESSAGE);
        }

    }

    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtNombre.grabFocus();
    }
}
