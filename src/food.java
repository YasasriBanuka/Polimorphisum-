public class food {
    void rice(){
        System.out.println("Rice contain so many vitamins");
    }
}
class fruit extends food{
    void  min(){
        System.out.println("lemon contain citrus flavor  ");
    }
    @Override
    void rice() {
        System.out.println("most fruits are contain vitamin C");
    }
}
 class vegetable extends  fruit{
     @Override
     void rice() {
         System.out.println("most vegetables containing iron more than rice");
     }
 }
 class seed  extends fruit  {
     @Override
     void min() {
         System.out.println("most seeds contains calcium");
     }

     @Override
     void rice() {
         System.out.println("most seeds containing calcium more than vegetable");
     }
 }
 class dhal extends seed {
     @Override
     void rice() {
         System.out.println("so many different flavor  in the World" );
     }
 }
 class beans extends fruit {
     @Override
     void min() {
         System.out.println("beans contain so many fibers");
     }
     @Override
     void rice() {
         System.out.println("so many beans in the world ");
     }
 }

 class runTaste {
     public static void main(String[] args) {
         food f = new food();
         food f1 = new vegetable();
         food f2 = new seed();
         food f3 = new dhal();
         food f4= new beans();
         food f5 = new fruit();
         f.rice();
         f1.rice();
         f2.rice();
         f3.rice();
         f4.rice();
         f5.rice();
         fruit f2r,f4r,f5r;
         f2r= new seed ();
         f4r =new beans();
         f5r=new fruit ();
         f2r.min();
         f4r.min();
         f5r.min();
     }
 }