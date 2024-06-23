package Project_zad2;

public class Item {
    protected String name;
    protected int itemId;
    private static int count = 0;

    public Item(String name){
        this.name = name;
        setItemId(++count);
    }

    public String show() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


    
}

