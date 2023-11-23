import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private String dni;
    private ArrayList<Materia> materiasAprobadas=new ArrayList<>();

    public Alumno(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void agregarMateria(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Materia> getMaterias(){
        return materiasAprobadas;
    }
}
