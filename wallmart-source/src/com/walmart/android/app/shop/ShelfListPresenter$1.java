// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.widget.TextView;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop:
//            ShelfListPresenter, ShopFilterManager

class erChangedListener extends erChangedListener
{

    final ShelfListPresenter this$0;

    public void onFilterChanged()
    {
        super.onFilterChanged();
        TextView textview = (TextView)ViewUtil.findViewById(mListContainer, 0x7f1002de);
        ArrayList arraylist = mFilterManager.getRefinements();
        String s = mFilterManager.getStoreID();
        if (arraylist != null && !arraylist.isEmpty() || s != null)
        {
            textview.setSelected(true);
            return;
        } else
        {
            textview.setSelected(false);
            return;
        }
    }

    erChangedListener()
    {
        this$0 = ShelfListPresenter.this;
        super(ShelfListPresenter.this);
    }
}
