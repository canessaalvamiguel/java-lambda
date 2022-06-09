public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.makeNoise();

        //This is an anonymous inner class, child from Animal
        Animal bigFoot = new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("YeppGWruauuaua");
            }
        };
        bigFoot.makeNoise();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm an anonymous runnable");
            }
        };
        runnable.run();
    }
}

class Animal{
    public void makeNoise(){
        System.out.println("Yap yap yap");
    }
}
