package pl.pattern.behavioral.iterator;

import java.util.List;

public class WebsiteListIterator implements WebsiteIterator{

    private List<Website> websites;
    private int position;

    public WebsiteListIterator(List<Website> websites) {
        this.websites = websites;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position < websites.size() && websites.get(position) != null){
            return true;
        }
        return false;
    }

    @Override
    public Website getNext() {
        Website website = websites.get(this.position);
        this.position++;
        return website;
    }

    @Override
    public void reset() {
        this.position = 0;
    }
}
