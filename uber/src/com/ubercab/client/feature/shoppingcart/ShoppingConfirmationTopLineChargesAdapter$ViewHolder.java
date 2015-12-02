// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart;

import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.ubercab.client.core.model.ShoppingCartTopLineCharge;

class 
{

    TextView mTextView;

    final void a(ShoppingCartTopLineCharge shoppingcarttoplinecharge, boolean flag)
    {
        if (shoppingcarttoplinecharge != null)
        {
            TextView textview = mTextView;
            if (flag)
            {
                shoppingcarttoplinecharge = shoppingcarttoplinecharge.getLabel();
            } else
            {
                shoppingcarttoplinecharge = shoppingcarttoplinecharge.getValue();
            }
            textview.setText(shoppingcarttoplinecharge);
        }
    }

    (View view)
    {
        ButterKnife.inject(this, view);
    }
}
