// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class this._cls0
    implements android.content.ener
{

    final SaverDashboardPresenter this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        SaverDashboardPresenter.access$400(SaverDashboardPresenter.this).submitUnconfirmedReceipts();
    }

    ionCallbacks()
    {
        this$0 = SaverDashboardPresenter.this;
        super();
    }
}
