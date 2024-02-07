package practisePrograms;

public class SingletonClass {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMsg();
    }
}
class Singleton{
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public static void showMsg(){
        System.out.println("this is singleton class!!!");
    }
}
