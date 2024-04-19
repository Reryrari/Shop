import java.util.HashMap;
public class Korzina {
    HashMap<Integer,Tovari1> Basket = new HashMap();
    Integer imp = 0;
    Tovari1 x;
    public void putBasket(Tovari1 x){
        this.x = x;
        imp++;
        Basket.put(imp,new Tovari1(x.nazvanie));
    }
    // Basket.putBasket(AptekaTovari.vibratTovarApteka(1));
    //        Basket.chooseitem();
    public void showBasket(){
        System.out.println(Basket);
    }


    }




