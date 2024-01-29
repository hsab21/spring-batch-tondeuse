package fr.hsabek.tondeuse.TraitementBatch;

import fr.hsabek.tondeuse.domain.entites.Coordonnees;
import fr.hsabek.tondeuse.domain.entites.Orientation;
import fr.hsabek.tondeuse.domain.entites.PositionTondeuse;

public class TraitementLigne {

    private static final String ESPACE = " ";
    public static PositionTondeuse formaterLigneTondeuse(String ligneTondeuse){
        String[] elts = ligneTondeuse.split(ESPACE);
        Coordonnees pCoordonneesTondeuse = new Coordonnees(Integer.valueOf(elts[0]), Integer.valueOf(elts[1]));
        Orientation orientationTondeuse = getOrientation(elts[2].charAt(0));
        return new PositionTondeuse(pCoordonneesTondeuse, orientationTondeuse);
    }

    public static Orientation getOrientation(char cOrientation){
        for(Orientation orientation : Orientation.values()) {
            if (orientation.getCodeOrientation() == cOrientation){
                return orientation;
            }
        }
        return null;
    }
}
