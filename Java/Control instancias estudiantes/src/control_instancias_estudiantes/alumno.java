package control_instancias_estudiantes;



public class alumno {
int CC; byte edad ; 
String apellido,nombre, programa; 
  
  public alumno() {
        this.CC = 0;
        this.edad = 0;
        this.apellido = null;
        this.nombre = null;
        this.programa = null;
    }

    @Override
    public String toString() {
        return "alumno{" + "CC=" + CC + ", edad=" + edad + ", apellido=" + apellido + ", nombre=" + nombre + ", programa=" + programa + '}';
    }
  
    public int getCC() {
        return CC;
    }

    public void setCC(int CC) {
        this.CC = CC;
         ; 
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
        ; 
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }




}
