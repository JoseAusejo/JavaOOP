public class Pelicula {
     String nombre;

     int fechaDeLanzamiento;
     int duracionEnMinutos;

     boolean incluidoEnElPlan;
     private  double sumaDeLasEvaluaciones;
     private int totalDelasEvaluaciones;

     int getTotalDelasEvaluaciones(){
          return totalDelasEvaluaciones;
     }
     void  muestraFichaTecnica() {
          System.out.println("El nombre de la pelicula es : " + nombre);
          System.out.println("Su fecha de lanzamiento es : " + fechaDeLanzamiento);
          System.out.println("Duracion en minutos: " + duracionEnMinutos);
     }
     void  evalua(double nota){
          sumaDeLasEvaluaciones += nota;
          totalDelasEvaluaciones ++;
     }
     double calculaMedia(){
          return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
     }

}
