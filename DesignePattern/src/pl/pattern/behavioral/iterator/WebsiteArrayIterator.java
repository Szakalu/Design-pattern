package pl.pattern.behavioral.iterator;

public class WebsiteArrayIterator implements WebsiteIterator{

    private Website [] websites;
    private int position;

    public WebsiteArrayIterator(Website[] websites) {
        this.websites = websites;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if( this.position < websites.length && websites[ this.position] != null){
            return true;
        }
        return false;
    }

    @Override
    public Website getNext() {
        Website website = websites[ this.position];
        this.position++;
        return website;
    }

    @Override
    public void reset() {
        this.position = 0;
    }
}
