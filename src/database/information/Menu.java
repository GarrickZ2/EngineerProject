package database.information;

public class Menu {
    private double noodle;
    private double nori;
    private double egg;
    private double shoot;
    private double chashu;

    private boolean noriAvailable;
    private boolean eggAvailable;
    private boolean shootAvailable;
    private boolean chashuAvailable;

    public Menu(double noodle, double nori, double egg, double shoot, double chashu,
                boolean noriAvailable, boolean eggAvailable, boolean shootAvailable, boolean chashuAvailable) {
        this.noodle = noodle;
        this.nori = nori;
        this.egg = egg;
        this.shoot = shoot;
        this.chashu = chashu;
        this.noriAvailable = noriAvailable;
        this.eggAvailable = eggAvailable;
        this.shootAvailable = shootAvailable;
        this.chashuAvailable = chashuAvailable;
    }

    public double getNoodle() {
        return noodle;
    }

    public void setNoodle(double noodle) {
        this.noodle = noodle;
    }

    public double getNori() {
        return nori;
    }

    public void setNori(double nori) {
        this.nori = nori;
    }

    public double getEgg() {
        return egg;
    }

    public void setEgg(double egg) {
        this.egg = egg;
    }

    public double getShoot() {
        return shoot;
    }

    public void setShoot(double shoot) {
        this.shoot = shoot;
    }

    public double getChashu() {
        return chashu;
    }

    public void setChashu(double chashu) {
        this.chashu = chashu;
    }

    public boolean isNoriAvailable() {
        return noriAvailable;
    }

    public void setNoriAvailable(boolean noriAvailable) {
        this.noriAvailable = noriAvailable;
    }

    public boolean isEggAvailable() {
        return eggAvailable;
    }

    public void setEggAvailable(boolean eggAvailable) {
        this.eggAvailable = eggAvailable;
    }

    public boolean isShootAvailable() {
        return shootAvailable;
    }

    public void setShootAvailable(boolean shootAvailable) {
        this.shootAvailable = shootAvailable;
    }

    public boolean isChashuAvailable() {
        return chashuAvailable;
    }

    public void setChashuAvailable(boolean chashuAvailable) {
        this.chashuAvailable = chashuAvailable;
    }
}
