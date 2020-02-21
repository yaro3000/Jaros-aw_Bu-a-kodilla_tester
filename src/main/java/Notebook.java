public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1200) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 1200 && this.weight < 2000) {
            System.out.println("This notebook is not too heavy.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkYear() {
        if (this.price < 900 && this.year <= 2015) {
            System.out.println("This notebook is old and probably useless.");
        } else if (this.price > 1000 && this.price <= 1500 && this.year <= 2017) {
            System.out.println("This notebook should run some new games.");
        } else if (this.price > 1500 && this.year >= 2019) {
            System.out.println("Warning! It's Terminator, not notebook!");
        } else {
            System.out.println("This is normal notebook.");
        }
    }
}
