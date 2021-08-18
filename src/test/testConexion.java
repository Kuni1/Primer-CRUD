package test;

import conectando.ConectaBD;
import dao.DaoAlumnos;
import dao.implement.DaoAlumnosImp;
import dto.Alumnos;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class testConexion {

    public static void main(String[] args) {

        COMPROBAR SU LA BASE DE DATOS ESTA VINCULADO
        ConectaBD bd = new ConectaBD();
        try (Connection c = bd.conexionBD()) {
            System.out.println("CONEXION EXITOSA¡¡¡");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

/**********************************************************************************/
        //SELECT
//        DaoAlumnos daoalumnos = new DaoAlumnosImp();
//        List<Alumnos> alumnos = null;
//        try {
//            alumnos = daoalumnos.alumnosSet();
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//            System.out.println("ERROR: " + daoalumnos.getMessage());
//        }
//
//        if (alumnos != null) {
//            alumnos.forEach((t -> {
//                System.out.println("Nombre: " + t.getNombre());
//            }));
//        }

/**********************************************************************************/
        //CONSULTA 
//        DaoAlumnos daoalumnos = new DaoAlumnosImp();
//        Alumnos alumno = null;
//        try {
//            alumno = daoalumnos.alumnosGet(2);
//        } catch (Exception e) {
//            System.out.println("ERROR: " + e);
//            System.out.println("ERROR: " + daoalumnos.getMessage());
//        }
//
//        if (alumno != null) {
//            System.out.println("Nombre: " + alumno.getNombre());
//        }

/**********************************************************************************/
        //INSERT
//        DaoAlumnos daoalumnos = new DaoAlumnosImp();
//        Alumnos a = new Alumnos();
//        a.setNombre("JESUS");
//        a.setApellido("LUKAKU");
//        a.setFecha_nac(LocalDate.now());
//        a.setDireccion("CHOSICA");
//
//        try {
//            if (daoalumnos.alumnosIns(a) == null) {
//                System.out.println("REGISTRO EXITOSO");
//            };
//        } catch (Exception e) {
//            System.out.println("ERROR " + e.getMessage());
//        }

/**********************************************************************************/
        //UPDATE
//        DaoAlumnos daoalumnos = new DaoAlumnosImp();
//        Alumnos i = new Alumnos();
//        i.setId_alumno(4);
//        i.setNombre("Marco");
//        i.setApellido("PERALES");
//        i.setFecha_nac(LocalDate.now());
//        i.setDireccion("ATE VITARTE");
//        
//        try {
//            if (daoalumnos.alumnosUpd(i) == null) {
//                System.out.println("Registro agregado");
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            System.out.println(daoalumnos.getMessage());
//        }

/**********************************************************************************/
//          //DELETE
//        DaoAlumnos daoalumnos = new DaoAlumnosImp();
//        List<Integer> ids = new ArrayList<>();
//        ids.add(3);
//        ids.add(4);
//        ids.add(5);
//
//        try {
//            String msje = daoalumnos.alumnosDel(ids);
//            if (msje == null) {
//                System.out.println("Registros ELIMINADOS");
//            }else{
//                System.out.println(msje);
//            }
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//            System.out.println(daoalumnos.getMessage());
//        }
        
    }

}
