package pl.pattern.behavioral.iterator;

public class IteratorMain {

    public static void main(String[] args) {
        System.out.println("Websites List");
        WebsiteCollection websiteCollection = new WebsiteList();
        fillWebsiteCollection(websiteCollection);
        printWebsites(websiteCollection.iterator());

        System.out.println("Websites Array");
        websiteCollection = new WebsiteArray();
        fillWebsiteCollection(websiteCollection);
        printWebsites(websiteCollection.iterator());
    }

    public static void fillWebsiteCollection(WebsiteCollection websiteCollection){
        websiteCollection.addWebsite("onet.pl", WebsiteType.INFORMATIONAL);
        websiteCollection.addWebsite("wp.pl", WebsiteType.INFORMATIONAL);
        websiteCollection.addWebsite("tvn24.pl", WebsiteType.INFORMATIONAL);
        websiteCollection.addWebsite("youtube.com", WebsiteType.ENTERTAINMENT);
        websiteCollection.addWebsite("twitch.com", WebsiteType.ENTERTAINMENT);
    }

    public static void printWebsites(WebsiteIterator iterator){
        Website website;
        while(iterator.hasNext()){
            website = iterator.getNext();
            System.out.println(website.getName() + " " + websiteTypeToString(website.getType()));
        }
    }

    public static String websiteTypeToString(WebsiteType type){
        switch (type){
            case ENTERTAINMENT:
                return "ENTERTAINMENT";
            case INFORMATIONAL:
                return "INFORMATIONAL";
        }
        return "NONE";
    }
}
