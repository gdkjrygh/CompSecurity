// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmui.Typefaces;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.item:
//            AdditionalSellersActivity, ItemPriceView

private static class mContext extends BasicViewHolder
{

    public Context mContext;
    public ItemPriceView price;
    public LinearLayout priceContainer;
    public TextView priceInCart;
    public RadioButton selected;
    public TextView seller;

    public void updateView(mContext mcontext, String s)
    {
        selected.setChecked(mcontext.id.equals(s));
        seller.setText(mcontext.name);
        if (mcontext.submap)
        {
            priceContainer.setVisibility(8);
            priceInCart.setTypeface(Typefaces.create(mContext, com.walmart.android.wmui.der.mContext));
            priceInCart.setVisibility(0);
            return;
        } else
        {
            priceInCart.setVisibility(8);
            price.setPrice(mcontext.price);
            priceContainer.setVisibility(0);
            return;
        }
    }

    public (View view)
    {
        super(view);
        selected = (RadioButton)ViewUtil.findViewById(view, 0x7f1001ab);
        seller = (TextView)ViewUtil.findViewById(view, 0x7f1001ac);
        price = (ItemPriceView)ViewUtil.findViewById(view, 0x7f1001ae);
        priceInCart = (TextView)ViewUtil.findViewById(view, 0x7f1001b0);
        priceContainer = (LinearLayout)ViewUtil.findViewById(view, 0x7f1001ad);
        mContext = view.getContext();
    }
}
