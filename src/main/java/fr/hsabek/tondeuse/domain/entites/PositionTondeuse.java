package fr.hsabek.tondeuse.domain.entites;




public class PositionTondeuse {
    private Coordonnees coordonneesTondeuse;
    private Orientation orientationTondeuse;

    public PositionTondeuse() {
    }

    public PositionTondeuse(Coordonnees coordonneesTondeuse, Orientation orientationTondeuse) {
        this.coordonneesTondeuse = coordonneesTondeuse;
        this.orientationTondeuse = orientationTondeuse;
    }

    public Coordonnees getCoordonneesTondeuse() {
        return coordonneesTondeuse;
    }

    public void setCoordonneesTondeuse(Coordonnees coordonneesTondeuse) {
        this.coordonneesTondeuse = coordonneesTondeuse;
    }

    public Orientation getOrientationTondeuse() {
        return orientationTondeuse;
    }

    public void setOrientationTondeuse(Orientation orientationTondeuse) {
        this.orientationTondeuse = orientationTondeuse;
    }




}
