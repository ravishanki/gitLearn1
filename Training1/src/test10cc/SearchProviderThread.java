package test10cc;

import java.util.ArrayList;
import java.util.List;

public class SearchProviderThread extends Thread
{
	private String itemName;
	private List<Item> itemList;  
	private List<Item> filteredItems;
    
    public SearchProviderThread(String itemName,List<Item> itemList) {
        this.itemName = itemName;
        this.itemList = itemList;
    }
    
    public void run() {
        
       //fill in your code here
        
    }

    public List<Item> getFilteredItems() {
        return filteredItems;
    }

    public void setFilteredItems(List<Item> filteredItems) {
        this.filteredItems = filteredItems;
    }
    
    
}

