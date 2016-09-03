/**
 * Created by Jake on 8/11/2016.
 */
public enum ChordClass
{
    TONIC(0),
    SUPERTONIC(2),
    MEDIANT(4),
    SUBDOMINANT(5),
    DOMINANT(7),
    SUBMEDIANT(9),
    LEADINGTONE(11);

    private final int distFromTonic;

    ChordClass(int distFromTonic)
    {
        this.distFromTonic = distFromTonic;
    }

    int distFromTonic()
    {
        return distFromTonic;
    }
}