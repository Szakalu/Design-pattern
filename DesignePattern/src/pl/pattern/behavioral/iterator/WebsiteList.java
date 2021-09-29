package pl.pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class WebsiteList implements WebsiteCollection {

    List<Website> websites;

    public WebsiteList() {
        websites = new ArrayList<>();
    }

    @Override
    public void addWebsite(String name, WebsiteType type) {
        Website website = new Website(name, type);
        if(!websites.contains(website)){
            websites.add(website);
        }
    }

    @Override
    public void removeWebsite(String name, WebsiteType type) {
        Website website = new Website(name, type);
        if(websites.contains(website)){
            websites.remove(website);
        }
    }

    @Override
    public WebsiteIterator iterator() {
        return new WebsiteListIterator(websites);
    }

    public List<Website> getWebsites() {
        return websites;
    }

    public void setWebsites(List<Website> websites) {
        this.websites = websites;
    }
}
