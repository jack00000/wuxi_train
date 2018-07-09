package org.whgc.mapDemo.util;

import org.whgc.mapDemo.model.Product;
import org.whgc.mapDemo.util.Item;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ShoppingCard {

    private Map<String,Item> map=new HashMap<String,Item>();
    public ShoppingCard(){
        return;
    }


    public void addItem(Item item) {

        int num=map.size();

        if(num==0) {
            map.put(item.getProduct().getPid(),item);
        }

        else if(!map.containsKey(item.getProduct().getPid())) {
            map.put(item.getProduct().getPid(), item);
        }
        else if(map.containsKey(item.getProduct().getPid())){
             //通过map获取并改变num
             Object o=map.get(item.getProduct().getPid());
             int num1=((Item) o).getNum()+item.getNum();
             Product p=new Product(item.getProduct().getPid(),item.getProduct().getName(),item.getProduct().getPrice());
             Item s=new Item(num1,p);
             map.put(item.getProduct().getPid(),s);

             return;





        }





    }

    public void removeItem(String pid) {
         map.remove(pid);


    }

    public Map<String, Item> getMap() {
        return map;
    }

    public void  print() {
        // 欢迎  来到 好买多 超市
        //-----------------
        // 序号  商品的名称 数量 单价 总价

        //--------------------
        //                 678.90
        //


    }



}