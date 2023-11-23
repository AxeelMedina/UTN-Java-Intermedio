import java.util.ArrayList;

public class Materia {
    private String nombreMateria;
    private ArrayList<Materia> materiasCorrelativas=new ArrayList<Materia>();

    public Materia(String nombreMateria){
        this.nombreMateria=nombreMateria;
    }

    public void setCorrelativas(Materia materia){
        materiasCorrelativas.add(materia);
    }

    public ArrayList<Materia> getCorrelativas(){
        return materiasCorrelativas;
    }
}
