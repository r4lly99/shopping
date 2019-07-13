package com.bts.shopping.payload;

import com.bts.shopping.model.Shopping;

import java.util.List;

/**
 * Created by mohdr on 13/07/2019
 */
public class GetAllShoppingResponse {

    private List<Shopping> shoppingList;

    public List<Shopping> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(List<Shopping> shoppingList) {
        this.shoppingList = shoppingList;
    }
}
