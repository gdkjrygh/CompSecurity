// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.view.View;
import android.widget.TextView;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            RxFourDollarAdapter

public static class qty extends BasicViewHolder
{

    public TextView drugName;
    public TextView qty;

    public Q(View view)
    {
        super(view);
        drugName = (TextView)view.findViewById(0x7f10046d);
        qty = (TextView)view.findViewById(0x7f10046e);
    }
}
