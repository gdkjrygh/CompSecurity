// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import cgh;
import cgt;
import com.ubercab.client.feature.shoppingcart.model.Item;
import java.text.NumberFormat;

// Referenced classes of package com.ubercab.client.feature.shoppingcart:
//            ShoppingConfirmationItemsAdapter

class b
{

    String a;
    final ShoppingConfirmationItemsAdapter b;
    View mDivider;
    ImageView mIcon;
    TextView mQuantityText;
    TextView mTitleText;
    TextView mTotalText;

    private void a(String s)
    {
        ShoppingConfirmationItemsAdapter.c(b).a(s).a(mIcon);
    }

    final void a(int i, Item item)
    {
        if (item != null)
        {
            a = item.getItemId();
            a(item.getImageUrlOriginal());
            mTitleText.setText(item.getTitle());
            int j = item.getCount().intValue();
            mQuantityText.setText(String.format("%s%d", new Object[] {
                ShoppingConfirmationItemsAdapter.a(b).getString(0x7f0707ac), Integer.valueOf(j)
            }));
            if (ShoppingConfirmationItemsAdapter.b(b) != null)
            {
                mTotalText.setText(ShoppingConfirmationItemsAdapter.b(b).format(item.getPrice().doubleValue() * (double)j));
            }
            if (i == 0)
            {
                mDivider.setVisibility(8);
            }
        }
    }

    Y(ShoppingConfirmationItemsAdapter shoppingconfirmationitemsadapter, View view)
    {
        b = shoppingconfirmationitemsadapter;
        super();
        ButterKnife.inject(this, view);
    }
}
