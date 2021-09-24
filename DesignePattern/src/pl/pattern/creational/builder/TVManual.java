package pl.pattern.creational.builder;

public class TVManual {

    private double weight;
    private double height;
    private double width;
    private TVManufacturer tvManufacturer;
    private boolean curved;
    private boolean rgb;
    private int numberOfPages;

    public TVManual(double weight, double height, double width, TVManufacturer tvManufacturer, boolean curved, boolean rgb) {
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.tvManufacturer = tvManufacturer;
        this.numberOfPages = 40;
        this.curved = curved;
        this.rgb = rgb;
        if(curved){
            numberOfPages+=5;
        }
        if(rgb){
            numberOfPages+=10;
        }
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public TVManufacturer getTvManufacturer() {
        return tvManufacturer;
    }

    public boolean isCurved() {
        return curved;
    }

    public boolean isRgb() {
        return rgb;
    }

    public void print(){
        StringBuilder text = new StringBuilder();
        text.append("TV manufacturer: ");
        switch (tvManufacturer){
            case TUMSONG:
                text.append("Tomsong");
                break;
            case HL:
                text.append("HL");
                break;
            case ABC:
                text.append("AbC");
                break;
            default:
                text.append("NoN");
        }
        text.append(" Number of pages "+numberOfPages);
        System.out.println(text);
    }
}
