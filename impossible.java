import java.util.Scanner;
public class impossible {
    public static void main(String[] args) {
        Tovari items = new Tovari();
        Korzina Basket = new Korzina();
        Scanner scn = new Scanner(System.in);
        boolean addItemKey = true;
        System.out.println("Добавьте товары аптеки");
        System.out.println("1. Добавить товар \n" + "2. Выйти");
        while (addItemKey) {
            int z = scn.nextInt();
            switch (z) {
                case 1:
                    Scanner scansApteka = new Scanner(System.in);
                    String c = scansApteka.nextLine();
                    items.addItemApteka(c);
                    System.out.println("1. Добавить товар \n" + "2. Выйти");
                    break;
                case 2:
                    addItemKey = false;
            }
        }
        addItemKey = true;
        System.out.println("Добавьте товары магазина Красное и белое");
        System.out.println("1. Добавить товар \n" + "2. Выйти");
        while (addItemKey) {
            int z = scn.nextInt();
            switch (z) {
                case 1:
                    Scanner scansKb = new Scanner(System.in);
                    String c = scansKb.nextLine();
                    items.addItemKB(c);
                    System.out.println("1. Добавить товар \n" + "2. Выйти");
                    break;
                case 2:
                    addItemKey = false;
            }
        }
        addItemKey = true;
        System.out.println("Добавьте товары магазина Мвидео");
        System.out.println("1. Добавить товар \n" + "2. Выйти");
        while (addItemKey) {
            int z = scn.nextInt();
            switch (z) {
                case 1:
                    Scanner scansMvideo = new Scanner(System.in);
                    String c = scansMvideo.nextLine();
                    items.addItemMvideo(c);
                    System.out.println("1. Добавить товар \n" + "2. Выйти");
                    break;
                default:
                    addItemKey = false;
            }
        }
        boolean mainMenuRunning = true;
        while (mainMenuRunning) {
            System.out.println("Список магазинов:");
            items.showShops();
            int mainMenu = scn.nextInt();
            switch (mainMenu) {
                case 1:
                    System.out.println("Выбери товары из магазина Мвидео которые хотели бы купить");
                    items.showMvideoMap();
                    int mvideoList = scn.nextInt();
                    while (mvideoList <= items.getKeyIdMvideo() && mvideoList != 0) {
                        Basket.putBasket(items.vibratTovarMvideo(mvideoList));
                        mvideoList = scn.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Выберите товары из Аптеки которые хотели бы купить");
                    items.showAptekaMap();
                    int aptekaList = scn.nextInt();
                    while (aptekaList <= items.getKeyIdApteka() && aptekaList != 0) {
                        Basket.putBasket(items.vibratTovarApteka(aptekaList));
                        aptekaList = scn.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("Выберите товары из Красного и белого");
                    items.showKBMap();
                    int kbList = scn.nextInt();
                    while (kbList <= items.getKeyIdKb() && kbList != 0) {
                        Basket.putBasket(items.vibratTovarKB(kbList));
                        kbList = scn.nextInt();
                    }
                    break;
                case 4:
                    Basket.showBasket();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}