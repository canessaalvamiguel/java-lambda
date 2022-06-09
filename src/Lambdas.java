public class Lambdas {
    public static void main(String[] args) {

        //Normal way
        Cat myCat = new Cat();
        printThing(myCat);

        //Using lambda
        Cat secondCat = new Cat();
        printThing( () -> System.out.println("meow using lambda"));

        //Using lambda
        Cat thirdCat = new Cat();
        Printable p = () -> System.out.println("meow using lambda v2");
        printThing(p);
    }

    public static void printThing(Printable thing){
        thing.print();
    }
}

@FunctionalInterface
interface Printable{
    void print();
}

class Cat implements Printable{

    //This method is not needed using lambda,
    // we can pass the method as a lambda in the main
    @Override
    public void print() {
        System.out.println("meow");
    }
}