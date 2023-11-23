public class Inscripcion {

    public static void main(String[] args) {
        Alumno alumno1=new Alumno("Juan","12345678");
        Alumno alumno2=new Alumno("Lucía","87654321");
        Materia lengua=new Materia("Lengua");
        Materia matematica=new Materia("Matemática");
        Materia biologia=new Materia("Biología");
        Materia matematica2=new Materia("Matemática 2");
        matematica2.setCorrelativas(matematica);


        alumno1.agregarMateria(lengua);
        alumno2.agregarMateria(matematica);
        alumno2.agregarMateria(biologia);

        System.out.println("El alumno "+alumno1.getNombre()+" cumplen las correlativas?: "+aprobada(alumno1,matematica2));
        System.out.println("El alumno "+alumno2.getNombre()+" cumplen las correlativas?: "+aprobada(alumno2,matematica2));
    }


    public static boolean aprobada(Alumno alumno,Materia materia){
        for(Materia x: materia.getCorrelativas()){
            if(!alumno.getMaterias().contains(x))
                return false;
        }
        return true;
        //return alumno.getMaterias().contains(materia);
    }
}