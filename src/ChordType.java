/**
 * Created by Jake on 8/11/2016.
 */
//TODO: implement MAJOR, MINOR, AUGMENTED, DIMINISHED for triads and sevenths
public enum ChordType
{
    MAJOR_TRIAD (new int[] {0, 4, 7}),
    MINOR_TRIAD (new int[] {0, 3, 7});

    //describes the distance of each note in the chord from the root (INCLUDES the root itself)
    private final int[] structure;

    ChordType(int[] structure)
    {
        this.structure = structure;
    }

    int[] structure()
    {
        return structure;
    }
}