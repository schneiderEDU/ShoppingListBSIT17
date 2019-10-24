package com.schneiderchristian.shoppinglistbsit17.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.schneiderchristian.shoppinglistbsit17.R;
import com.schneiderchristian.shoppinglistbsit17.models.ShoppingItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListAdapter extends ArrayAdapter {
    private Activity activity;
    private ArrayList<ShoppingItem> shoppingList;

    public ShoppingListAdapter(@NonNull Activity activity, @NonNull ArrayList<ShoppingItem> shoppingList) {
        super(activity, R.layout.shopping_item, shoppingList);
        this.activity = activity;
        this.shoppingList = shoppingList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView;
        if(rowView == null) {
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            rowView = layoutInflater.inflate(R.layout.shopping_item, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.imgShoppingItem = rowView.findViewById(R.id.imgShoppingItem);
            viewHolder.txtShoppingItemTitle = rowView.findViewById(R.id.txtShoppingItemName);
            viewHolder.txtShoppingItemDescription = rowView.findViewById(R.id.txtShoppingItemDescription);
            viewHolder.txtShoppingItemAmount = rowView.findViewById(R.id.txtShoppingItemAmount);
            rowView.setTag(viewHolder);
        }
        ViewHolder viewHolder = (ViewHolder) rowView.getTag();
        viewHolder.txtShoppingItemTitle.setText(shoppingList.get(position).getName());
        viewHolder.txtShoppingItemDescription.setText(shoppingList.get(position).getDescription());
        viewHolder.txtShoppingItemAmount.setText(shoppingList.get(position).getAmount());

        return rowView;
    }

    static class ViewHolder {
        ImageView imgShoppingItem;
        TextView txtShoppingItemTitle;
        TextView txtShoppingItemDescription;
        TextView txtShoppingItemAmount;
    }
}
