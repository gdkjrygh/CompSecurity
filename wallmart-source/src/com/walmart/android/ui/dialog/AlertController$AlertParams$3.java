// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui.dialog;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.walmart.android.ui.dialog:
//            AlertController

class val.dialog
    implements android.widget.r
{

    final val.dialog this$0;
    final AlertController val$dialog;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        nClickListener.onClick(AlertController.access$600(val$dialog), i);
        if (!sSingleChoice)
        {
            AlertController.access$600(val$dialog).dismiss();
        }
    }

    A()
    {
        this$0 = final_a;
        val$dialog = AlertController.this;
        super();
    }
}
