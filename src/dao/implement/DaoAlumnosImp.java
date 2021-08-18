package dao.implement;

import dao.DaoAlumnos;
import conectando.ConectaBD;
import dto.Alumnos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaoAlumnosImp implements DaoAlumnos {

    //CREAR ESTA PRIMERA PARTE
    private final ConectaBD conectaDb;
    private String mensaje;

    public DaoAlumnosImp() {
        this.conectaDb = new ConectaBD();
    }

/************************************************ SELECT ********************************************/
    @Override
    public List<Alumnos> alumnosSet() {
        List<Alumnos> list = null;
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_alumno,")
                .append("nombre,")
                .append("apellido,")
                .append("fecha_nac,")
                .append("direccion")
                .append(" FROM alumnos");

        try (Connection cn = conectaDb.conexionBD()) {

            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ResultSet rs = ps.executeQuery();
            list = new ArrayList<>();
            while (rs.next()) {
                Alumnos alumnos = new Alumnos();
                alumnos.setId_alumno(rs.getInt(1));
                alumnos.setNombre(rs.getString(2));
                alumnos.setApellido(rs.getString(3));
                alumnos.setFecha_nac(LocalDate.parse(rs.getString(4)));
                alumnos.setDireccion(rs.getString(5));
                list.add(alumnos);
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return list;
    }

/**************************************** COMPLEMENTO DEL UPDATE  *********************************************/   
    @Override
    public Alumnos alumnosGet(Integer id) {

        Alumnos alumno = null;

        StringBuilder sql = new StringBuilder();
        sql.append("SELECT ")
                .append("id_alumno,")
                .append("nombre,")
                .append("apellido,")
                .append("fecha_nac,")
                .append("direccion")
                .append(" FROM alumnos")
                .append(" WHERE id_alumno = ?");

        try (Connection cn = conectaDb.conexionBD()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            alumno = new Alumnos();

            while (rs.next()) {
                alumno.setId_alumno(rs.getInt(1));
                alumno.setNombre(rs.getString(2));
                alumno.setApellido(rs.getString(3));
                alumno.setFecha_nac(LocalDate.parse(rs.getString(4)));
                alumno.setDireccion(rs.getString(5));
            }
        } catch (Exception e) {
            mensaje = e.getMessage();
        }
        return alumno;        
    }

/**************************************** INSERT  *********************************************/
    @Override
    public String alumnosIns(Alumnos alumno) {
        StringBuilder sql = new StringBuilder();
        
        sql.append("INSERT INTO alumnos( ")
                .append("nombre,")
                .append("apellido,")
                .append("fecha_nac,")
                .append("direccion")
                .append(") VALUES (?,?,?,?) ");
        
        try (Connection cn = conectaDb.conexionBD()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getFecha_nac().toString());
            ps.setString(4, alumno.getDireccion());
            
            int ctos = ps.executeUpdate();
            if (ctos == 0) {
                mensaje = "cero filas insertadas";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

/**************************************** UPDATE *********************************************/
    @Override
    public String alumnosUpd(Alumnos alumno) {
        StringBuilder sql = new StringBuilder();
        sql.append("UPDATE alumnos SET ")
                .append("nombre = ?,")
                .append("apellido = ?,")
                .append("fecha_nac = ?,")
                .append("direccion = ?")
                .append(" WHERE id_alumno = ? ");
        try (Connection cn = conectaDb.conexionBD()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getFecha_nac().toString());
            ps.setString(4, alumno.getDireccion());
            ps.setInt(5, alumno.getId_alumno());
            int ctos = ps.executeUpdate();
            if (ctos == 0) {
                mensaje = "No se pudo actualizar";
            }
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

/**************************************** DELETE  *********************************************/
    @Override
    public String alumnosDel(List<Integer> ids) {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM alumnos WHERE ")
                .append("id_alumno = ? ");
        try (Connection cn = conectaDb.conexionBD()) {
            PreparedStatement ps = cn.prepareStatement(sql.toString());
            cn.setAutoCommit(false);
            boolean ok = true;
            for (int id = 0; id < ids.size(); id++) {
                ps.setInt(1, ids.get(id));
                int ctos = ps.executeUpdate();
                if (ctos == 0) {
                    ok = false;
                    mensaje += "\nID: " + ids.get(id) + " no existe";
                }
            }
            if (ok) {
                cn.commit();
            } else {
                cn.rollback();
            }
            cn.setAutoCommit(true);
        } catch (SQLException e) {
            mensaje = e.getMessage();
        }
        return mensaje;
    }

/**************************************** MENSAJE DE ERRORES  *********************************************/
    @Override
    public String getMessage() {
         return mensaje;
    }

}
