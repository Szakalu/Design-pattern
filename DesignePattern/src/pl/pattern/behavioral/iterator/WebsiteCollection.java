package pl.pattern.behavioral.iterator;

public interface WebsiteCollection {

    void addWebsite(String name, WebsiteType type);
    void removeWebsite(String name, WebsiteType type);
    WebsiteIterator iterator();
}
