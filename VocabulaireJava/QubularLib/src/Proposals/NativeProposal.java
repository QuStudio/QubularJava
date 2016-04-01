package Proposals;

import Morpheme.Morpheme;

import java.util.List;

/**
 * Created by sentosh1ne on 01.04.2016.
 */
public class NativeProposal {

    public Morpheme main;
    public List<Morpheme> alternatives;

    public NativeProposal(Morpheme main, List<Morpheme> alternatives){
        this.main = main;
        this.alternatives = alternatives;
    }
}
