package Project_zad2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList <Item> itemList = new ArrayList<>();

        itemList.add(new Item("Item 1"));
        itemList.add(new Item("Item 2"));
        itemList.add(new Item("Item 3"));
        itemList.add(new Item("Item 4"));
        itemList.add(new Item("Item 5"));

        for(Item items : itemList){
            System.out.println(items.show());
        }

        Map <String, Integer> itemMap = new HashMap<>();
        
        for (Item item : itemList) {
            itemMap.put(item.show(), item.getItemId());
        }

        Set<Map.Entry<String, Integer>> entrySet = itemMap.entrySet();

        for(Map.Entry<String, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
