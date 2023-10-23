import java.util.*;

public class Beer {
    Map<Integer,String> BName=new HashMap<Integer,String>();
    Map<Integer,Double>BPrice=new HashMap<Integer,Double>();
    Map<Integer,String>BExplain=new HashMap<Integer,String>();
    int cnt=1;
    public Beer(){
        addBeerName();
        addBeerPrice();
        addBeerExplain();
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Drinks MENU ]");

    }

    void addBeerName(){
        BName.put(cnt,"Cass");
        cnt++;
        BName.put(cnt,"Tera");
        cnt++;
        BName.put(cnt,"Cally");
        cnt=1;


    }
    void addBeerPrice(){
        BPrice.put(cnt,5.0);
        cnt++;
        BPrice.put(cnt,5.0);
        cnt++;
        BPrice.put(cnt,5.0);
        cnt=1;
    }
    void addBeerExplain(){
        BExplain.put(cnt,"카스이다");
        cnt++;
        BExplain.put(cnt,"테라이다");
        cnt++;
        BExplain.put(cnt,"캘리이다");
        cnt=1;

    }

    String[] choiceBeer(int num){
        String[] choice=new String[3];
        choice[0]=BName.get(num);
        String val=Double.toString(BPrice.get(num));
        choice[1]=val;
        choice[2]=BExplain.get(num);

        return choice;
    }
}
