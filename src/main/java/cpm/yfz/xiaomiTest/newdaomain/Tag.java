package cpm.yfz.xiaomiTest.newdaomain;

public class Tag {
    private String name;
    private int id;
    private double start_time;
    private double end_time;
    private boolean isUsed;
    private int score;

    public Tag() {
        this.isUsed = false;
    }

    public Tag(String name, int id, double start_time, double end_time, int score) {
        this.name = name;
        this.id = id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.score = score;
    }

    public Tag(String name, int id, double start_time, double end_time) {
        this.name = name;
        this.id = id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.isUsed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getStart_time() {
        return start_time;
    }

    public void setStart_time(double start_time) {
        this.start_time = start_time;
    }

    public double getEnd_time() {
        return end_time;
    }

    public void setEnd_time(double end_time) {
        this.end_time = end_time;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", isUsed=" + isUsed +
                ", score=" + score +
                '}';
    }
}
