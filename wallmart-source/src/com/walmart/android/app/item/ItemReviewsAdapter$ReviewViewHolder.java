// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.view.View;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.item:
//            ItemReviewsAdapter

public static class helpful extends BasicViewHolder
{

    public TextView date;
    public TextView description;
    public TextView helpful;
    public StarsView starsView;
    public TextView title;

    public (View view)
    {
        super(view);
        title = (TextView)ViewUtil.findViewById(view, 0x7f10055e);
        date = (TextView)ViewUtil.findViewById(view, 0x7f10054d);
        starsView = (StarsView)ViewUtil.findViewById(view, 0x7f10055f);
        description = (TextView)ViewUtil.findViewById(view, 0x7f100560);
        helpful = (TextView)ViewUtil.findViewById(view, 0x7f100561);
    }
}
