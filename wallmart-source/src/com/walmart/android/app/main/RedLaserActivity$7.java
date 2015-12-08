// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.main:
//            RedLaserActivity

class this._cls0
    implements android.content.ismissListener
{

    final RedLaserActivity this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!isFinishing())
        {
            enableScanning();
        }
    }

    r()
    {
        this$0 = RedLaserActivity.this;
        super();
    }
}
