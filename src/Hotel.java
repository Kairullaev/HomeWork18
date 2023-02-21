public class Hotel extends Person implements Liveable{

    private int nomber;

    public int getNomber() {
        return nomber;
    }

    public void setNomber(int nomber) {
        this.nomber = nomber;
    }

    public Hotel(int person,int nomber) {
        super(person,nomber);
        System.out.println(nomber+" chygym ");

    }

    @Override
    public void lives() {
        System.out.println("Hotel in lives...");
    }


}
