package desafios.Bar_OO.entities;

public class Bill {

    public char gender;
    public int beer, barbecue, softDrink;

    public double cover() {
        double coverPrice = 4.0;

        if (feeding() > 30) {
            coverPrice = 0.0;
        }

        return coverPrice;
    }

    public double feeding() {
        return beer * 5.0 + barbecue * 7.0 + softDrink * 3.0;
    }

    public double ticket() {
        double ticketPrice = 0.0;

        if (gender == 'M') {
            ticketPrice = 10.0;
        }

        if (gender == 'F') {
            ticketPrice = 8.0;
        }

        return ticketPrice;
    }

    public double total() {
        return ticket() + feeding() + cover();
    }

}
