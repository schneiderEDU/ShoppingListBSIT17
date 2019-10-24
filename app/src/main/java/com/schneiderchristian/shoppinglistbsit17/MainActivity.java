package com.schneiderchristian.shoppinglistbsit17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.schneiderchristian.shoppinglistbsit17.adapters.ShoppingListAdapter;
import com.schneiderchristian.shoppinglistbsit17.models.ShoppingItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ShoppingItem> listShoppingItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listShoppingItems = new ArrayList<>();
        listShoppingItems.add(new ShoppingItem("item1", "Butter", "Butter", "500g","supermarket"));
        listShoppingItems.add(new ShoppingItem("item2", "Butter", "Butter", "500g","supermarket"));
        listShoppingItems.add(new ShoppingItem("item3", "Butter", "Butter", "500g","supermarket"));
        listShoppingItems.add(new ShoppingItem("item4", "Butter", "Butter", "500g","supermarket"));

        ListView listViewShoppingList = findViewById(R.id.listViewShoppingList);
        ShoppingListAdapter shoppingListAdapter = new ShoppingListAdapter(this, listShoppingItems);
        listViewShoppingList.setAdapter(shoppingListAdapter);
    }
}
