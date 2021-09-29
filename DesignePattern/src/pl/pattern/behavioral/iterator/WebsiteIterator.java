package pl.pattern.behavioral.iterator;

public interface WebsiteIterator {
    boolean hasNext();
    Website getNext();
    void reset();
}
