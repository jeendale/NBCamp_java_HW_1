import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu=new Menu();
        Scanner sc=new Scanner(System.in);
        int endPoint=0;

        while(endPoint==0) {
            menu.print();
            int orderNum=sc.nextInt();
            switch (orderNum) {
                case 1:
                    //burger class이동?
                    Buger buger = new Buger();//객체 생성
                    for (int i = 0; i < buger.bExplain.size(); i++) {
                        System.out.println((i + 1) + ". " + buger.bName.get(i + 1) + " | W " + buger.bPrice.get(i + 1) + " | " + buger.bExplain.get(i + 1));
                    }//메뉴판 출력
                    int bugerNum = sc.nextInt();//번호 입력
                    if (bugerNum > 5) {
                        System.out.println("잘못된 주문번호 입니다.");
                        break;
                    }
                    String[] selectBuger = buger.choiceBuger(bugerNum);//버거 내용 배열로 받음
                    Check checkBurger = new Check(selectBuger);//버거 내용 order클래스로 보냄
                    break;
                case 2:
                    IceCream iceCream=new IceCream();
                    for (int i = 0; i < iceCream.IExplain.size(); i++) {
                        System.out.println((i + 1) + ". " + iceCream.IName.get(i + 1) + " | W " +iceCream.IPrice.get(i + 1) + " | " +iceCream.IExplain.get(i + 1));
                    }
                    int iceCreamNum = sc.nextInt();
                    if ( iceCreamNum   > 3) {
                        System.out.println("잘못된 주문번호 입니다.");
                        break;
                    }
                    String[] selectIceCream =iceCream.choiceIceCream(iceCreamNum);
                    Check checkIce = new Check(selectIceCream);
                    break;
                case 3:
                    Drinks drinks=new Drinks();
                    for (int i = 0; i < drinks.DExplain.size(); i++) {
                        System.out.println((i + 1) + ". " + drinks.DName.get(i + 1) + " | W " + drinks.DPrice.get(i + 1) + " | " +drinks.DExplain.get(i + 1));
                    }
                    int drinksNum = sc.nextInt();
                    if ( drinksNum  > 3) {
                        System.out.println("잘못된 주문번호 입니다.");
                        break;
                    }
                    String[] selectDrinks =drinks.choiceDrinks(drinksNum);
                    Check checkDrinks = new Check(selectDrinks);
                    break;
                case 4:
                    Beer beer=new Beer();
                    for (int i = 0; i < beer.BExplain.size(); i++) {
                        System.out.println((i + 1) + ". " + beer.BName.get(i + 1) + " | W " + beer.BPrice.get(i + 1) + " | " +beer.BExplain.get(i + 1));
                    }
                    int beerNum = sc.nextInt();
                    if ( beerNum  > 3) {
                        System.out.println("잘못된 주문번호 입니다.");
                        break;
                    }
                    String[] selectBeer =beer.choiceBeer(beerNum);
                    Check checkBeer = new Check(selectBeer);
                    break;
                case 5:
                    Order order=new Order(orderNum);
                    break;
                case 6:
                    System.out.println("진행하던 주문을 취소하시겠습니까?");
                    System.out.println("1. 확인        2.취소");
                    String result=sc.next();
                    while (true){
                        if(result.equals("1.확인")){
                            Order order1=new Order(orderNum);
                            System.out.println("진행하던 주문이 취소되었습니다.");
                            break;
                        } else if (result.equals("2.취소")) {
                            break;
                        }else{
                            System.out.println("잘못 입력하였습니다.");
                        }
                    }
                    break;
                default:
                    System.out.println("잘못된 주문 번호 입니다.");
            }
        }

    }
}