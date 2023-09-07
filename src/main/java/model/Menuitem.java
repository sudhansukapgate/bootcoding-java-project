package model;

public class Menuitem {
    int id;
    String menuname;
    double price;
    boolean isVeg;
    String Flavour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public void setVeg(boolean veg) {
        isVeg = veg;
    }

    public String getFlavour() {
        return Flavour;
    }

    public void setFlavour(String flavour) {
        Flavour = flavour;
    }
}
