// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import com.walmart.android.service.saver.SaverManager;
import java.util.List;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class val.receipts
    implements android.content.ener
{

    final SaverDashboardPresenter this$0;
    final List val$receipts;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SaverManager.get().markAsNotified(val$receipts);
    }

    ()
    {
        this$0 = final_saverdashboardpresenter;
        val$receipts = List.this;
        super();
    }
}
