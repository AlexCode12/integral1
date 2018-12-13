// Läs in A och B
// Deklarera f

// 4.  Beräkna integralen. Detta görs via en loop som börjar vid det minsta värdet och avslutas vid det största.


public class integral {
    public static double k = 250;

    public static double integral (double a, double b) {
        int n = 1000;
        double deltax = (b-a)/n;
        double resultat = 0;

        for (int k = 0 ; k < n ; k++) {
            resultat += f(a+k * deltax)*deltax;
        }

        return resultat;
    }
    public static double f(double x) {
        double k = 250;
        return k*x;
    }

    public static void main(String[] args) {
        System.out.println(integral(2, 5));
    }
}
