package DesignPatterns;

class Instagram {
        static Instagram instance = null;
    
        private Instagram(){
            System.out.println("Instagram instance created");
        }

    public static Instagram getInstance(){
        if (instance == null){
            instance = new Instagram();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        if (Instagram.instance != null) {
            System.out.println("1 - Instagram instance is not null");
        }
        Instagram instagram1 = Instagram.getInstance();
        if (Instagram.instance != null) {
            System.out.println("2 - Instagram instance is not null");
        }
        Instagram instagram2 = Instagram.getInstance();
        if (Instagram.instance != null) {
            System.out.println("3 - Instagram instance is not null");
        }
        System.out.println(instagram1 == instagram2);
    }
}


