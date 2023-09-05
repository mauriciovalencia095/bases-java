public class Main {


    public static void main(String[] args) {

        Charmander charmander = new Charmander(0.6,8.5,"Macho","Mar llamas");
       Balbasaur balbasaur = new Balbasaur();


       balbasaur.setAltura(0.7);
       balbasaur.setPeso(6.9);
       balbasaur.setSexo("Macho");
       balbasaur.setHabilidad("Espesura");
       balbasaur.setDebilidades();
       charmander.ataqueMarLlamas(balbasaur, 20);
        System.out.println("Los puntos de vida de " + balbasaur.getNombre() +" son " + balbasaur.getPuntosVida());


    }


}