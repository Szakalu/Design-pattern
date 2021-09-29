package pl.pattern.behavioral.iterator;

public class WebsiteArray implements WebsiteCollection{

    private Website [] websites;
    private int count;


    public WebsiteArray() {
        websites = new Website[10];
        count = 0;
    }

    @Override
    public void addWebsite(String name, WebsiteType type) {
        Website website = new Website(name, type);
        if(websiteIsInArray(website)){
           return;
        }
        if (count >= websites.length) {
            enlargeArray();
        }
        websites[count] = website;
        count++;
    }

    private void enlargeArray(){
        Website [] enlargedWebsites = new Website[websites.length+10];
        for(int i = 0; i < websites.length; i++){
            enlargedWebsites[i] = websites[i];
        }
        websites = enlargedWebsites;
    }

    @Override
    public void removeWebsite(String name, WebsiteType type) {
        Website website = new Website(name, type);
        if(!websiteIsInArray(website)){
            return;
        }
        int positionOfRemovingWebsite = 0;
        for(int i = 0; i < websites.length; i++){
            if(websites[i].equals(website)){
                websites[i] = null;
                positionOfRemovingWebsite = i;
                count--;
                break;
            }
        }
        if(positionOfRemovingWebsite < count){
            relocateWebsites(positionOfRemovingWebsite);
        }
        if((websites.length > 10) && (websites.length-10 == count)){
            shrinkArray();
        }
    }

    private void relocateWebsites(int positionOfRemovedWebsite){
        Website tempWebsite;
        for(int i = positionOfRemovedWebsite; i < websites.length; i++){
            tempWebsite = websites[i];
            websites[i] = websites[i+1];
            websites[i+1] = tempWebsite;
        }
    }

    private void shrinkArray(){
        Website [] newWebsites = new Website[websites.length-10];
        for(int i = 0; i < newWebsites.length; i++){
            newWebsites[i] = websites[i];
        }
        websites = newWebsites;
    }

    @Override
    public WebsiteIterator iterator() {
        return new WebsiteArrayIterator(websites);
    }

    private boolean websiteIsInArray(Website website){
        for(Website w: websites){
            if(w == null){
                return false;
            }
            if(w.equals(website)){
                return true;
            }
        }
        return false;
    }

    public Website[] getWebsites() {
        return websites;
    }

    public void setWebsites(Website[] websites) {
        this.websites = websites;
    }
}
