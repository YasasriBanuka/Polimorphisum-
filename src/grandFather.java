public class grandFather {
    void swim (){
        System.out.println("swimming");
    }
}
class father extends grandFather{
    @Override
    void swim() {
        System.out.println("Swimming in river ");
    }
}
class son extends father {
    @Override
    void swim() {
        System.out.println("swimming in Pool");
    }

    public static void main(String[] args) { // create   main  method in  class son
        grandFather gf, f, s ;
        gf= new grandFather();
        f = new father();
        s = new son();
        gf.swim();
        f.swim();
        s.swim();
    }
}
