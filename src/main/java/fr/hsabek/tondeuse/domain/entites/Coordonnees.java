package fr.hsabek.tondeuse.domain.entites;



import java.util.Objects;


public class Coordonnees {
    private int x;
    private int y;

    public boolean positionHorsPelouse(Coordonnees coordonnees){
        return  coordonnees.getX() >=0
                && coordonnees.getX() <= this.x
                && coordonnees.getY() >=0
                && coordonnees.getY() <= this.y ;

    }
    public Coordonnees(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordonnees)) return false;
        Coordonnees that = (Coordonnees) o;
        return getX() == that.getX() && getY() == that.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
