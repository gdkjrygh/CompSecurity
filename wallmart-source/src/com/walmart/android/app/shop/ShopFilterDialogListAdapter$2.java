// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.view.View;
import android.widget.CheckBox;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterDialogListAdapter

class val.refinement
    implements android.view.ogListAdapter._cls2
{

    final ShopFilterDialogListAdapter this$0;
    final com.walmart.android.data.r val$refinement;

    public void onClick(View view)
    {
        if (((CheckBox)view).isChecked())
        {
            ShopFilterDialogListAdapter.access$000(ShopFilterDialogListAdapter.this).add(val$refinement);
            return;
        } else
        {
            ShopFilterDialogListAdapter.access$000(ShopFilterDialogListAdapter.this).remove(val$refinement);
            return;
        }
    }

    ()
    {
        this$0 = final_shopfilterdialoglistadapter;
        val$refinement = com.walmart.android.data.r._cls2.val.refinement.this;
        super();
    }
}
