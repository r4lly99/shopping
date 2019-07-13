package com.bts.shopping.payload;

import com.bts.shopping.model.Shopping;

/**
 * Created by mohdr on 13/07/2019
 */
public class GetShoppingResponse {

    private Shopping shopping;

    public GetShoppingResponse(Shopping shopping) {
        this.shopping = shopping;
    }

    public Shopping getShopping() {
        return shopping;
    }

    public void setShopping(Shopping shopping) {
        this.shopping = shopping;
    }
}
