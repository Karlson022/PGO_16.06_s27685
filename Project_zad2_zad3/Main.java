package Project_zad2_zad3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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

        ArrayList <Item> itemList2 = new ArrayList<>();

        itemList2.add(new Item("Item 1"));
        itemList2.add(new Item("Item 2"));
        itemList2.add(new Item("Item 3"));
        itemList2.add(new Item("Item 4"));
        itemList2.add(new Item("Item 5"));
        itemList2.add(new Item("Item 6"));
        itemList2.add(new Item("Item 7"));
        itemList2.add(new Item("Item 8"));
        itemList2.add(new Item("Item 9"));
        itemList2.add(new Item("Item 10"));

        List <Item> subList = itemList2.subList(0, 5);

        HashSet <Item> items = new HashSet<Item>();
        items.addAll(subList);

        for (Item item : items) {
            System.out.println(item);
        }

    }
}
