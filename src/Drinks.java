import java.util.*;

public class Drinks {    Map<Integer,String> DName=new HashMap<Integer,String>();
    Map<Integer,Double> DPrice=new HashMap<Integer,Double>();
    Map<Integer,String>DExplain=new HashMap<Integer,String>();
    int cnt=1;
    public Drinks(){
        addDrinksName();
        addDrinksPrice();
        addDrinksExplain();
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Drinks MENU ]");

    }

    void addDrinksName(){
        DName.put(cnt,"Coke");
        cnt++;
        DName.put(cnt,"SevenStarCider");
        cnt++;
        DName.put(cnt,"Water");
        cnt=1;


    }
    void addDrinksPrice(){
        DPrice.put(cnt,2.0);
        cnt++;
        DPrice.put(cnt,2.0);
        cnt++;
        DPrice.put(cnt,0.5);
        cnt=1;
    }
    void addDrinksExplain(){
        DExplain.put(cnt,"코카콜라");
        cnt++;
        DExplain.put(cnt,"칠성사이다");
        cnt++;
        DExplain.put(cnt,"물");
        cnt=1;

    }

    String[] choiceDrinks(int num){
        String[] choice=new String[3];
        choice[0]=DName.get(num);
        String val=Double.toString(DPrice.get(num));
        choice[1]=val;
        choice[2]=DExplain.get(num);

        return choice;
    }
}
