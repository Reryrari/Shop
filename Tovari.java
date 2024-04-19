import java.util.HashMap;

public class Tovari {
 HashMap<Integer,Tovari1> AptekaID = new HashMap<>();
 Integer keyIDapteka=0;
 HashMap<Integer,Tovari1> mvideoID = new HashMap<>();
 Integer keyIDmvideo=0;
 HashMap<Integer,Tovari1> KrasnoeIBeloeID = new HashMap<>();
 Integer keyIDkb=0;
  public void showAptekaMap(){
  System.out.println(AptekaID);
  }
  public void showMvideoMap(){
   System.out.println(mvideoID);
  }
  public void showKBMap(){
   System.out.println(KrasnoeIBeloeID);
  }
  public Tovari1 vibratTovarApteka(Integer v) {
   return AptekaID.get(v);
  }
  public Tovari1 vibratTovarMvideo(Integer c){
   return mvideoID.get(c);
  }

  public Tovari1 vibratTovarKB(Integer b){
   return KrasnoeIBeloeID.get(b);
  }
  public void addItemApteka(String addPiece){
  keyIDapteka++;
  AptekaID.put(keyIDapteka,new Tovari1(addPiece));
  }
  public void addItemKB(String addPiece){
   keyIDkb++;
   KrasnoeIBeloeID.put(keyIDkb,new Tovari1(addPiece));
  }
  public void addItemMvideo(String addPiece){
   keyIDmvideo++;
   mvideoID.put(keyIDmvideo,new Tovari1(addPiece));
  }
  public void showShops(){
   System.out.println("1. Мвидео\n" + "2. Аптека\n" + "3. Красное и белое\n"+"4. Корзина\n"+"5. Выйти из программы");
  }
  public int getKeyIdMvideo(){
   return keyIDmvideo;
  }
  public int getKeyIdApteka(){
   return keyIDapteka;
  }
  public int getKeyIdKb(){
   return keyIDkb;
  }
 static void exit() {
  System.exit(0);
 }
}




