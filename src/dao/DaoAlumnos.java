package dao;

import java.util.List;
import dto.Alumnos;

public interface DaoAlumnos {

    //SELECT
    public List<Alumnos> alumnosSet();

    //COMPLEMENTARIO AL UPDATE, YA QUE 1RO SE TIENE QUE CONOCER EL CAMPO AH ACTUALIZAR
    public Alumnos alumnosGet(Integer id);

    //INSERT
    public String alumnosIns(Alumnos alumno);

    //UPDATE
    public String alumnosUpd(Alumnos alumno);

    //DELETE
    public String alumnosDel(List<Integer> ids);

    //FALLAS SE ALMACENARAN AQUI
    public String getMessage();

}



