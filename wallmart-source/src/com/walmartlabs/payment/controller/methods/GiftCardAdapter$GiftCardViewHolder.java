// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.methods;

import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmartlabs.payment.controller.methods:
//            GiftCardAdapter

public static class cardSwitch extends BasicViewHolder
{

    public final TextView cardBalance;
    public final TextView cardDigits;
    public final ImageView cardImage;
    public final TextView cardName;
    public final SwitchCompat cardSwitch;

    public (View view)
    {
        super(view);
        cardImage = (ImageView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardImage);
        cardDigits = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardDigits);
        cardName = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardName);
        cardBalance = (TextView)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardBalance);
        cardSwitch = (SwitchCompat)ViewUtil.findViewById(view, com.walmartlabs.android.payment.ViewHolder.cardSwitch);
    }
}
