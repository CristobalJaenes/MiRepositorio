package personas1;

public class Datos {
    int altura,edad,peso;
    
    String nombre;

    public Datos(String nombre,int edad,int altura, int peso) {
        this.altura = altura;
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    public int getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre: "+nombre+" edad: "+edad+" altura: "+altura+" peso: "+peso;
    }

    
    
    
}
