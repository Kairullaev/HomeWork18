public class Main {
    public static void main(String[] args) {

        Liveable home = new Home(5, 120, 345, 664);
        System.out.println(home);
        home.lives();

        System.out.println();
        Liveable hostel = new Hostel(3,145,454,655,3000);
        System.out.println(hostel);
        hostel.lives();

        System.out.println();
        Liveable hotel = new Hotel(2,900);
        System.out.println(hotel);
        hotel.lives();
    }
}