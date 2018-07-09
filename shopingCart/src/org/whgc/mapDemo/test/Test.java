package org.whgc.mapDemo.test;
import org.whgc.mapDemo.model.Product;
import org.whgc.mapDemo.util.Item;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String arg[]){

        float num=0f;

        Map<String,Item>map=new HashMap<String,Item>();
        Product p1=new Product("001","icecream",5.0f);
        Product p2=new Product("002","apple",10.0f);
        Product p3=new Product("003","cookie",15.0f);
        Product p4=new Product("004","water",20.0f);
        Product p5=new Product("005","books",25.0f);

       Item item1=new Item(10,p1);
       Item item2=new Item(20,p2);
       Item item3=new Item(30,p3);
       Item item4=new Item(40,p4);
       Item item5=new Item(50,p5);

       System.out.println("把数据放入map");
       map.put(p1.getPid(),item1);
       map.put(p2.getPid(),item2);
       map.put(p3.getPid(),item3);
       map.put(p4.getPid(),item4);
       map.put(p5.getPid(),item5);

       System.out.println("输出篮子里面的信息");
        Set<Map.Entry<String,Item>> keyvalues=map.entrySet();
        Iterator<Map.Entry<String,Item>> ite=keyvalues.iterator();
        while (ite.hasNext()){
            Map.Entry<String,Item> kv=ite.next();
            System.out.println("key="+kv.getKey()+" "+"name="+kv.getValue().getProduct().getName()+" "+
                    "价格"+kv.getValue().getProduct().getPrice()+"num="+kv.getValue().getNum());

        }

        System.out.println("打印订单");
        System.out.println("欢迎光临");
        System.out.println("---------------------------------------------");
        Iterator<Map.Entry<String,Item>> ite1=keyvalues.iterator();
        while (ite1.hasNext()){
            Map.Entry<String ,Item> kv=ite1.next();
            System.out.println(kv.getValue().getProduct().getName()+"的总价："+" "
                    +kv.getValue().getNum()+ "*"+kv.getValue().getProduct().getPrice()+" ="
                    +kv.getValue().getNum()*kv.getValue().getProduct().getPrice());
            num+=kv.getValue().getProduct().getPrice()*kv.getValue().getNum();
        }
        System.out.println("总账单价格");
        System.out.println(num);




    }
}
