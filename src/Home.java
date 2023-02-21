public class Home extends Person implements Liveable{


     public Home(int person, int energy, int musor, int watter) {
          super(person, energy, musor, watter);
          System.out.println(energy + musor + watter + " Chygym chykty ");
     }

     @Override
     public void lives() {
          System.out.println("Lives in Home...");
     }

}
