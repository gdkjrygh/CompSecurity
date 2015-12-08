// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.pharmacy;

import android.view.View;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.pharmacy:
//            PharmacyFourDollarAdapter

public static class prescriptionType extends BasicViewHolder
{

    public TextView prescriptionType;

    public (View view)
    {
        super(view);
        prescriptionType = (TextView)ViewUtil.findViewById(view, 0x7f10046f);
    }
}
