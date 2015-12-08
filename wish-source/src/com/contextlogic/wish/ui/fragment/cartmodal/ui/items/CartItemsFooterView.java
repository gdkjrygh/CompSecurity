// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.product.description.ProductDetailsDescriptionFragment;
import com.contextlogic.wish.util.BitmapUtil;
import java.util.ArrayList;

public class CartItemsFooterView extends LinearLayout
{

    private CartManager cartManager;
    private TextView returnPolicyText;
    private TextView shippingOfferText;
    private TextView shippingOfferTitle;
    private View shippingOfferView;

    public CartItemsFooterView(CartManager cartmanager)
    {
        super(cartmanager.getActivity());
        cartManager = cartmanager;
        init();
    }

    private void init()
    {
        setOrientation(1);
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030022, this);
        shippingOfferView = view.findViewById(0x7f0d00df);
        shippingOfferTitle = (TextView)view.findViewById(0x7f0d00e1);
        shippingOfferText = (TextView)view.findViewById(0x7f0d00e2);
        BitmapUtil.safeSetImageResource((ImageView)view.findViewById(0x7f0d00e0), 0x7f020123);
        returnPolicyText = (TextView)view.findViewById(0x7f0d00e3);
        returnPolicyText.setPaintFlags(returnPolicyText.getPaintFlags() | 8);
        returnPolicyText.setOnClickListener(new android.view.View.OnClickListener() {

            final CartItemsFooterView this$0;

            public void onClick(View view1)
            {
                showReturnPolicy();
            }

            
            {
                this$0 = CartItemsFooterView.this;
                super();
            }
        });
        refreshView();
    }

    private void showReturnPolicy()
    {
        ProductDetailsDescriptionFragment productdetailsdescriptionfragment = new ProductDetailsDescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ArgDescription", ((WishCartItem)cartManager.getCart().getItems().get(0)).getReturnPolicyLongString());
        bundle.putString("ArgTitle", getContext().getString(0x7f060379));
        bundle.putBoolean("ArgFromCart", true);
        productdetailsdescriptionfragment.setArguments(bundle);
        ((RootActivity)getContext()).setContentFragment(productdetailsdescriptionfragment, false);
        cartManager.close();
    }

    public void refreshView()
    {
        WishCart wishcart = cartManager.getCart();
        if (wishcart.getShippingOfferText() != null && wishcart.getShippingOfferTitle() != null)
        {
            shippingOfferTitle.setText(wishcart.getShippingOfferTitle());
            shippingOfferText.setText(wishcart.getShippingOfferText());
            shippingOfferView.setVisibility(0);
            return;
        } else
        {
            shippingOfferView.setVisibility(8);
            return;
        }
    }

}
