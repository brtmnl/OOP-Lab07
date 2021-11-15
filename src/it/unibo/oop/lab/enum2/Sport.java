/**
 * 
 */
package it.unibo.oop.lab.enum2;
import static it.unibo.oop.lab.enum2.Place.*;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    BASKET("Basket", INDOOR, 5),
    VOLLEY("Volley", INDOOR, 5),
    TENNIS("Tennis", INDOOR, 1),
    BIKE("Bike", OUTDOOR, 1),
    F1("Formula 1", OUTDOOR, 1),
    MOTOGP("Moto GP", OUTDOOR, 1),
    SOCCER("Soccer", OUTDOOR, 11);
	
	private int noTeamMembers;
	private final String actualName;
    private final Place place;
    
    private Sport(final String actualName, final Place place, final int noTeamMembers) {
    	this.place = place;
    	this.actualName = actualName;
    	this.noTeamMembers = noTeamMembers;
    }
    
    public boolean isIndividualSport() {
    	return (this.noTeamMembers == 1) ? true : false;
    }
    
    public boolean isIndoorSport() {
    	return (this.place == INDOOR) ? true : false;
    }
    
    public Place getPlace() {
    	return this.place;
    }
    
    public String toSring() {
    	return "[SPORT] " + this.name() + ", with " + this.noTeamMembers + " players in each team that play " + ((this.place == INDOOR) ? "inside" : "outdoor");
    }
}
