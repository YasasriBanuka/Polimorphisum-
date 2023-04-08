public class Sephian {
    void Status (){
        System.out.println("Sephian is Live Object");
    }
}
class Human extends Sephian {
    @Override
    void Status() {
        System.out.println("Human is Live Object");
    }
}
class man extends Human{
    @Override
    void Status() {
        System.out.println("Man is a Live Object");
    }
}
class Banuka extends  man {
    @Override
    void Status() {
        System.out.println("Banuka is a Live Object ");
    }
}
class runTest{
    public static void main(String[] args) {
        Sephian s = new Sephian ();
        Sephian h = new Human();
        Sephian m = new man();
        Sephian t = new Banuka();
        s.Status();
        h.Status();
        m.Status();
        t.Status();
    }
}