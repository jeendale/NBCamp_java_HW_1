import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu=new Menu();
        Scanner sc=new Scanner(System.in);
        int orderNum=sc.nextInt();

        switch (orderNum){
            case 1:
                //burger class이동?
                menu.name="buger";
                System.out.println("dd");
                break;
            case 2:
                //icecream클래스
                System.out.println("아이스크림");
                break;
            case 3:
                //음료 클래스
                System.out.println("음료");
                break;
            case 4:
                //맥주 클래스
                System.out.println("맥주");
            case 5:
                //order클래스
                System.out.println("주문");
                break;
            case 6:
                //취소
                System.out.println("취소");
                break;
        }


    }
}