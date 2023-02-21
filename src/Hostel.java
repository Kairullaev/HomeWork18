public class Hostel extends Person implements Liveable{


    public Hostel(int person, int energy, int musor, int watter, int comUsluga) {
        super(person, energy, musor, watter, comUsluga);
    System.out.println(energy+musor+watter+" = chygym chykty  :"+comUsluga+" = Kvarplat  ");
       int[] hostels={energy+musor+watter};
        for (int h:hostels
             ) {
            System.out.println(h+comUsluga +"  obshiy rashod ");

        }
    }


    @Override
    public void lives() {
        System.out.println("Lives in hostel...");
    }
}
