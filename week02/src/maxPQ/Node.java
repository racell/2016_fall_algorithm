package maxPQ;

/**
 * Created by SeongJung on 2016-09-27.
 */
public class Node {
    private int priority;
    private String subject;

    public Node(int priority, String subject) {
        this.priority = priority;
        this.subject = subject;
    }

    public String toString() {
        return this.priority + "," + this.subject;
    }

    public int getPriority() {
        return this.priority;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
