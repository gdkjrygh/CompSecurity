// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import android.widget.CheckedTextView;
import com.walmart.android.utils.ViewUtil;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterDialogListAdapter

class val.item
    implements android.view.ogListAdapter._cls1
{

    final ShopFilterDialogListAdapter this$0;
    final com.walmart.android.data.r val$item;

    public void onClick(View view)
    {
        view = (CheckedTextView)ViewUtil.findViewById(view, 0x7f100088);
        boolean flag;
        if (!view.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        if (view.isChecked())
        {
            ShopFilterDialogListAdapter.access$000(ShopFilterDialogListAdapter.this).add(val$item);
            return;
        } else
        {
            ShopFilterDialogListAdapter.access$000(ShopFilterDialogListAdapter.this).remove(val$item);
            return;
        }
    }

    ()
    {
        this$0 = final_shopfilterdialoglistadapter;
        val$item = com.walmart.android.data.r._cls1.val.item.this;
        super();
    }
}
