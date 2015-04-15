package ninja.bryansills.twain.model;

/**
 * Created by bsills on 4/15/15.
 */
public class Entry {

    private String name;
    private int votes;

    public Entry(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
