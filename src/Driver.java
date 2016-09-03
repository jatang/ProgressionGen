/**
 * Created by Jake on 8/11/2016.
 */
//FOR NOW: define notes like so: C = 0, (C# = 0.5,) Db = 1, D = 2, (D# = 2.5,)
//Eb = 3, E = 4, F = 5, (F# = 5.5,) Gb = 6, G = 7, (G# = 7.5, ) Ab = 8, A = 9, (A# = 9.5, ) Bb = 10, B = 11
//This way, enharmonic notes will have equivalent values ONCE ROUNDED TO THE NEAREST 1, but will be otherwise distinguishable
//NOTE: all progression-generating operations should work under the assugmption of a single key; chords can then be transposed by directly modifying Hz values
public class Driver
{
    public static void main(String[] args)
    {
        return;
    }

    //Precondition: info.getSize == ChordSize.TRIAD && (info.getType == ChordType.MAJOR || info.getType == ChordType.MINOR)
    //TODO: implement this method for other types, like diminished and augmented
    //TODO: implement this method for other chords, like sevenths
    Chord genValidChord(ChordInfo info, Chord previous) {
        int[] pitchClasses = info.getType().structure();
//        int key = info.getKey();
//        for(int i = 0; i < pitchClasses.length; i++) {
//            pitchClasses[i] = (pitchClasses[i] + key) % 12; //We want all C's to have value 0, etc; there are 12 possible pitches, so we perform all pitch class operations mod 12
//        }
        //(1) Find lowest possible pitches each note from previous chord can jump to; then, find the highest
        //(2) Thankfully, the pitch class of the bass note is simple to calculate: pitchClasses[info.getInversion()]
        //(3) Assemble list of candidate pitches for the bass note (select all pitches of correct class within the interval found in (1)), then randomize order.
        //(4) For each candidate bass pitch:
        // (A) Randomize the order of all pitch classes except for the pitch class of the bass note, which is placed at the end of the list
        // (B) For each pitch class in our shuffled list:
        // (I) Assemble list of candidate pitches (of class determined in (B)) for the tenor note, within interval found in (1), then randomize order.
        // (II) For each candidate tenor pitch:
        // (a) Randomize the order of all pitch class except for the pitch class of the bass note, which is placed at the end of the list
        // (b) For each pitch class in out shuffled list:
        // (i) Assemble list of candidate pitches (of class determined in (b)) for the alto note, within interval found in (1), then randomize order.
        //TODO

        // ^ probably a way to do (4) recursively, because the problem is similar to solving a maze; check all possible ways and select the first one that works
        //REFACTOR INTERVAL PSEUDOCODE; determine intervals dynamically, within the for loops, taking into account the previous note and range limits (though allow alto and tenor to cross)
        // ^ refactor the way remaining candidate pitch classes are ordered (current system doesn't account for inversions or seventh chords, and only tries to not double the BASS (not root!) )
        return new Chord(new ChordInfo(ChordType.MAJOR_TRIAD, ChordClass.DOMINANT, 1), new int[0]);
    }
}