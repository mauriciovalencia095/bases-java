public class Main {


    public static void main(String[] args) {

        Charmander charmander = new Charmander(0.6,8.5,"Macho","Mar llamas");
        Charmander charmander2 = new Charmander(0.8,9.5,"Hembra","Mar llamas");
        Charmander charmander3 = new Charmander();
        Charmander charmander4 = new Charmander("Charmiss","Fuego",0.8,9.5,"Hembra","Mar llamas");


        charmander.setTipo("Electrico");
        System.out.println(charmander.getTipo());
    }


}