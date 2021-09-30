package hu.petrik;

public class Main {

    private int simaAdattag = 0;
    private static int statikusAdattag = 0;

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            System.out.print(Veletlen.velEgesz(10,50) + " ");
        }
        System.out.println();

        for (int i = 0; i < 20; i++) {
            System.out.print(Veletlen.velKarakter('a', 'z') + " ");
        }
        System.out.println();





	/*
	Experimental
	// Ez nem kell (állítólag:)

        Main Legfobb = new Main();

        //Ezt pedig nem lehet létrehozni
        //Math matek = new Matek();
        System.out.println(statikusAdattag);
        System.out.println(simaAdattag);-+
        System.out.println(Legfobb.simaAdattag);*/
    }
/*
    public void nemStatikusMetodus(){
        System.out.println(this.simaAdattag);
        // this kulcsszó objektumra utal
        // Statikus adattagot el lehet érni objektumpéldány változójaként
        System.out.println(this.statikusAdattag);
    }
 */
}
