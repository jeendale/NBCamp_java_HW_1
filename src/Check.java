import java.util.Scanner;

public class Check {
    Scanner sc=new Scanner(System.in);

    int cnt=1;


    public Check(String[] orders){
        String check=orders[0]+"  | W "+orders[1]+" | "+orders[2];
        System.out.println(" \""+check+"\"");
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까");
        System.out.println("1.확인       2.취소");
        String choice=sc.next();
        while(true&&cnt<3){
         if(choice.equals("1.확인")){
             Order order=new Order(orders);
            break;
            } else if (choice.equals("2.취소")) {
             System.out.println("취소 되었습니다.");
             break;
            }else{
             System.out.println("잘못 입력하엿습니다. 다시 선택 해주세요");
            }
         cnt++;

        }
    }
}
