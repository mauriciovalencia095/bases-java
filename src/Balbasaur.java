public class Balbasaur {

    private String nombre = "Balbasaur";
    private String [] tipo= {"Planta","veneno"} ;
    private double altura;
    private double peso;
    private String sexo;
    private String habilidad;
    private String[] debilidades = {"Fuego", "Psquico", "Volador","Hielo"};

    private int puntosVida =100;

    //Constructor
    public Balbasaur(double altura, double peso, String sexo, String habilidad){
        this.altura = altura;
        this.peso = peso;
        this.sexo=sexo;
        this.habilidad = habilidad;
    }
    public Balbasaur(String nombre, String[] tipo, double altura, double peso, String sexo, String habilidad){
        this.tipo = tipo;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.sexo=sexo;
        this.habilidad = habilidad;
    }

    public Balbasaur(){

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

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
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
