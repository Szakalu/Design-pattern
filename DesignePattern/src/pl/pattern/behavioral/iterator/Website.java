package pl.pattern.behavioral.iterator;

public class Website {

    private String name;
    private WebsiteType type;

    public Website(String name, WebsiteType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebsiteType getType() {
        return type;
    }

    public void setType(WebsiteType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(obj instanceof Website){
            Website website = (Website) obj;
            return this.name.equals(website.getName()) && this.type.equals(website.getType());
        }
        return false;
    }
}

