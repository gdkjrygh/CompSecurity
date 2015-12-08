// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui.dialog;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.ui.dialog:
//            AlertController

class val.dialog
    implements android.widget.r
{

    final w.isItemChecked this$0;
    final AlertController val$dialog;
    final w val$listView;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (heckedItems != null)
        {
            heckedItems[i] = val$listView.isItemChecked(i);
        }
        nCheckboxClickListener.onClick(AlertController.access$600(val$dialog), i, val$listView.isItemChecked(i));
    }

    w()
    {
        this$0 = final_w;
        val$listView = w1;
        val$dialog = AlertController.this;
        super();
    }
}
