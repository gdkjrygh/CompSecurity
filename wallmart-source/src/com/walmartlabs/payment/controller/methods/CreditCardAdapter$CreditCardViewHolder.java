// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.view.CreditCardIconView;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.payment.controller.methods:
//            CreditCardAdapter

public static class radioSelected extends BasicViewHolder
{

    public final ImageView btnSelected;
    public final TextView cardCustomer;
    public final TextView cardDigits;
    public final TextView cardExpiryDate;
    public final CreditCardIconView cardImage;
    public final TextView cardType;
    public final RadioButton radioSelected;

    public (View view)
    {
        super(view);
        cardImage = (CreditCardIconView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardImage);
        cardType = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardType);
        cardDigits = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardDigits);
        cardExpiryDate = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardExpiryDate);
        cardCustomer = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardCustomer);
        btnSelected = (ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.btnSelected);
        radioSelected = (RadioButton)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.radioSelected);
    }
}
