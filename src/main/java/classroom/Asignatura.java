package classroom;

public class Asignatura {

    String nombre;
    String n = nombre;
    int codigoInterno;
    int codigoExterno;

    Asignatura() {
        this.nombre = "Sin nombre";
        this.codigoExterno = 0;
        this.codigoExterno = 0;
    }

    Asignatura(int codigoInterno, int codigoExterno) {
    	/* Se le agregó un parámetro cualquiera. En el main solo
    	se está llamando esta función con un parámetro que
    	para asignar 882, que más adelante se imprime con código 
    	Externo, por lo cual conviene modificar este*/
        this("Sin nombre", codigoInterno, 0);
    }

    Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, int codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno) {
        this.codigoInterno = codigoInterno;
        /* Se le agrega un parámetro cualquiera a este constructor
         * con el objetivo de que se use directamente el que modifica
         * al código Externo, ya que es lo que se pretende en el main. */
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
