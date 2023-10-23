import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    Scanner sc=new Scanner(System.in);
    List<String> orderName=new ArrayList<String>();
    List<Double> orderPrice=new ArrayList<Double>();
    List<String> orderExplain=new ArrayList<String>();
    public Order(String[] orders){
       orderPlus(orders);
       System.out.println(orders[0]+" 가 장바구니에 추가되었습니다.\n"+orders[1]+orders[2]);
    }
    public Order(int num){
        if(num==6){
            orderClear();
            return;
        }
        System.out.println("아래와 같이 주문하시겠습니까?\n");
        System.out.println("[ Orders ]");
        double total=0.0;
        for(int i=0;i<orderName.size();i++){
            System.out.println(orderName.get(i)+" | W "+orderPrice.get(i)+" | "+orderExplain.get(i));
            total+=orderPrice.get(i);
        }
        System.out.println("[ Total ]");
        System.out.println("W "+total);
        System.out.println("1. 주문      2. 메뉴판");

        String result=sc.next();
        if(result.equals("1.주문")){
            orderClear();
            LastPrint lastPrint=new LastPrint();
        }else if(result.equals("2.메뉴판")){
            return;
        }


    }
    void orderPlus(String[] orders) {
        String name=orders[0];
        orderName.add(name);
        double val = Double.parseDouble(orders[1]);
        orderPrice.add(val);
        String explain=orders[2];
        orderExplain.add(explain);

    }
    void orderClear(){
        orderExplain.clear();
        orderName.clear();
        orderPrice.clear();
    }
}
