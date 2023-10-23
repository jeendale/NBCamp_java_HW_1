import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


public class Buger {

    Map<Integer,String> bName=new HashMap<Integer,String>();
    Map<Integer,Double>bPrice=new HashMap<Integer,Double>();
    Map<Integer,String>bExplain=new HashMap<Integer,String>();
    int cnt=1;
    public Buger(){
        addBugerName();
        addBugerPrice();
        addBugerExplain();
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Burgers MENU ]");

    }

    void addBugerName(){
        bName.put(cnt,"ShackBurger");
        cnt++;
        bName.put(cnt,"SmokeShack");
        cnt++;
        bName.put(cnt,"Shroom Burger");
        cnt++;
        bName.put(cnt,"Cheeseburger");
        cnt++;
        bName.put(cnt,"Hamburger");
        cnt=1;

    }
    void addBugerPrice(){
        bPrice.put(cnt,6.9);
        cnt++;
        bPrice.put(cnt,8.9);
        cnt++;
        bPrice.put(cnt,9.4);
        cnt++;
        bPrice.put(cnt,6.9);
        cnt++;
        bPrice.put(cnt,5.4);
        cnt=1;
    }
    void addBugerExplain(){
        bExplain.put(cnt,"토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        cnt++;
        bExplain.put(cnt,"베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        cnt++;
        bExplain.put(cnt,"몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        cnt++;
        bExplain.put(cnt,"포테이토 번과 비프패티, 치즈가 토핑된 치즈버거");
        cnt++;
        bExplain.put(cnt,"비프패티를 기반으로 야채가 들어간 기본버거");
        cnt=1;

    }

    String[] choiceBuger(int num){
        String[] choice=new String[3];
        choice[0]=bName.get(num);
        String val=Double.toString(bPrice.get(num));
        choice[1]=val;
        choice[2]=bExplain.get(num);

        return choice;
    }

}
