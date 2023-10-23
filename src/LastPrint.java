public class LastPrint {
    int cnt=1;

    public LastPrint(){
        okPrint();
    }
    void okPrint(){
        System.out.println("주문이 완료되었습니다!\n");
        System.out.println("대기번호는 [ "+cnt+" ] 번 입니다.");
        System.out.println("(3초후 메뉴판으로 돌아갑니다.)");
        cnt++;
    }
}
