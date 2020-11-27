/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119056.irfanginanjar;

/**
 *
 * @author ACER
 */
public class ServicePrice implements ServiceItem {
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    

    @Override
    public void displayService() {
        System.out.println("#********************#");
        System.out.println("#***Rock n Roll Haircut**#");
        System.out.println("#*******Service Liist*******#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash : IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.print("Chose (1/2/3)");
    }

    @Override
    public float getPrice(int serviceItem) {
        if(1==serviceItem){
            priceService=45;
        }else if(2==serviceItem){
            priceService=55;
        }else if(3==serviceItem){
            priceService=15;
        }
        return priceService;
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public float getTotalPay(float priceService, float discount){
        return 0;
    }
}
