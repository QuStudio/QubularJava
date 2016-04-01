package Proposals;

import General.User;
import Morpheme.Morpheme;

import java.util.Date;

/**
 * Created by sentosh1ne on 01.04.2016.
 */

public class ClientProposal {
    public User author;
    public Morpheme foreign;
    public NativeProposal proposal;
    public String rationale;
    public Date postedAt;

    public ClientProposal(User author,Morpheme foreign, NativeProposal proposal, String rationale, Date postedAt) {
        this.author = author;
        this.foreign = foreign;
        this.proposal = proposal;
        this.rationale = rationale;
        this.postedAt = postedAt;
    }
}
