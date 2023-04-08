public class CentralBank {
    void leasingRate(){
        System.out.println("30% Below");
    }
}
class commercialBank extends  CentralBank{
    void housingLoanRate (){
        System.out.println("25%");
    }

    @Override
    void leasingRate() {
        System.out.println("25%");
    }
}
class CommercialLeasing extends commercialBank {
    @Override
    void leasingRate() {
        System.out.println("23%");
    }
}
class CommercialCredit extends commercialBank{
    @Override
    void housingLoanRate() {
        System.out.println("20%");
    }

    @Override
    void leasingRate() {
        System.out.println("22%");
    }
}
class RateResult{
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb= new commercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cc = new CommercialCredit();
        c.leasingRate();
        cb.leasingRate();
        cl.leasingRate();
        cc.leasingRate();
        commercialBank cbl, ccl;
        cbl = new commercialBank();
        ccl= new CommercialCredit();
        cbl.housingLoanRate();
        ccl.housingLoanRate();
    }
}