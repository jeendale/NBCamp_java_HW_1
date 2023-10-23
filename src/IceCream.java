import java.util.*;

public class IceCream {
    Map<Integer,String> IName=new HashMap<Integer,String>();
    Map<Integer,Double>IPrice=new HashMap<Integer,Double>();
    Map<Integer,String>IExplain=new HashMap<Integer,String>();
    int cnt=1;
    public IceCream(){
        addIceCreamName();
        addIceCreamPrice();
        addIceCreamExplain();
        System.out.println(" \"SHAKESHACK BURGER 에 오신걸 환영합니다.\"");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.\n");
        System.out.println("[ Forzen Custard MENU ]");

    }

    void addIceCreamName(){
        IName.put(cnt,"SoftMilk");
        cnt++;
        IName.put(cnt,"SweetHoney");
        cnt++;
        IName.put(cnt,"Nuts");
        cnt=1;


    }
    void addIceCreamPrice(){
        IPrice.put(cnt,3.0);
        cnt++;
        IPrice.put(cnt,3.5);
        cnt++;
        IPrice.put(cnt,4.0);
        cnt=1;
    }
    void addIceCreamExplain(){
        IExplain.put(cnt,"가벼운 기본 아이스크림");
        cnt++;
        IExplain.put(cnt,"기본+허니 추가!");
        cnt++;
        IExplain.put(cnt,"기본+허니+견과류!");
        cnt=1;

    }

    String[] choiceIceCream(int num){
        String[] choice=new String[3];
        choice[0]=IName.get(num);
        String val=Double.toString(IPrice.get(num));
        choice[1]=val;
        choice[2]=IExplain.get(num);

        return choice;
    }
}
