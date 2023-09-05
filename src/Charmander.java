public class Charmander {

    private String nombre = "Charmi";
    private String tipo="Fuego";
    private double altura;
    private double peso;
    private String sexo;
    private String habilidad;
    private String[] debilidades = {"Agua", "Tierra", "Roca"};

    private int puntosVida =100;

    //Constructor
    public Charmander(double altura,double peso,String sexo, String habilidad){
        this.altura = altura;
        this.peso = peso;
        this.sexo=sexo;
        this.habilidad = habilidad;
    }
    public Charmander(String nombre, String tipo, double altura,double peso,String sexo, String habilidad){
        this.tipo = tipo;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.sexo=sexo;
        this.habilidad = habilidad;
    }

    public Charmander(){

    }

    //Getter y Setter


    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades(String[] debilidades) {
        this.debilidades = debilidades;
    }
}
