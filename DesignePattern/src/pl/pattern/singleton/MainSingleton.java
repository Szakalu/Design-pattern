package pl.pattern.singleton;

public class MainSingleton {

    public static void main(String[] args) {
        Singleton firstSingletonInstance = Singleton.getInstance("One");
        Singleton secondSingletonInstance = Singleton.getInstance("Two");

        System.out.println(firstSingletonInstance.getName());
        System.out.println(secondSingletonInstance.getName());
    }
}
