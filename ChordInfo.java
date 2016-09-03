/**
 * Created by Jake on 8/11/2016.
 */
public class ChordInfo
{
    private ChordType type;
    private ChordClass chordClass;
    //private int key;
    private int inversion;

    public ChordInfo(ChordType type, ChordClass chordClass, int inversion)
    {
        this.type = type;
        this.chordClass = chordClass;
        //this.key = key;
        this.inversion = inversion;
    }

    public ChordType getType()
    {
        return type;
    }

    public ChordClass getChordClass()
    {
        return chordClass;
    }

//    public int getKey()
//    {
//        return key;
//    }

    public int getInversion()
    {
        return inversion;
    }
}
