public class Jugadores {
    private int edad;
    private String Nombre, posicion;

    public Jugadores() {
    }

    public Jugadores(int edad, String Nombre, String posicion) {
        this.edad = edad;
        this.Nombre = Nombre;
        this.posicion = posicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
