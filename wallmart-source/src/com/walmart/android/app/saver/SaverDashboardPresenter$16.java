// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Dialog;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverDashboardPresenter

class val.d
    implements Runnable
{

    final SaverDashboardPresenter this$0;
    final Dialog val$d;

    public void run()
    {
        val$d.setCancelable(true);
    }

    ()
    {
        this$0 = final_saverdashboardpresenter;
        val$d = Dialog.this;
        super();
    }
}
