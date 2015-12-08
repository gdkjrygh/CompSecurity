// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.ui.StarsView;
import com.walmartlabs.ui.recycler.BasicViewHolder;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverMerchandiseController

public static class rating extends BasicViewHolder
{

    public final ImageView image;
    public final TextView price;
    public final StarsView rating;
    public final TextView text;

    public (View view)
    {
        super(view);
        image = (ImageView)ViewUtil.findViewById(view, 0x7f100468);
        price = (TextView)ViewUtil.findViewById(view, 0x7f100469);
        text = (TextView)ViewUtil.findViewById(view, 0x7f10046a);
        rating = (StarsView)ViewUtil.findViewById(view, 0x7f10046b);
    }
}
