public class school {
    void Total(){
        System.out.println("garde 7-A high marks goes to 98%" );
    }
}
class student  extends school{
    void agreeGate(){
        System.out.println("1st Term best agreeGate goes to 7-B class ");
    }
    @Override
    void Total() {
        System.out.println("Garde 7-C Maths top marks are 89% | 99% and 100%  ");
    }
}
class section extends student{
    @Override
    void Total() {
        System.out.println("best Science Total Marks goes t Garde 7-D");
    }
}
class room extends student {
    @Override
    void agreeGate() {
        System.out.println("1st Term best performance award goes to 7-G class");
    }

    @Override
    void Total() {
        System.out.println("best English Total Marks goes t Garde 7-F ");
    }
}

class finaleResult{
    public static void main(String[] args) {
        school s= new school();
        school se = new section();
        school r= new room();
        school st = new student();
        s.Total();
        se.Total();
        r.Total();
        st.Total();
        student stu,ro;
        stu = new student();
        ro = new room();
        stu.agreeGate();
        ro.agreeGate();
    }
}

