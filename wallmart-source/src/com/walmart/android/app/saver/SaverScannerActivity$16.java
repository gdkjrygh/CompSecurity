// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.DialogInterface;
import android.os.Handler;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverScannerActivity

class val.hasTimeoutMessage
    implements android.content.sListener
{

    final SaverScannerActivity this$0;
    final boolean val$hasTimeoutMessage;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (!isFinishing())
        {
            SaverScannerActivity.access$1300(SaverScannerActivity.this);
            if (SaverScannerActivity.access$1400(SaverScannerActivity.this) == 1 && val$hasTimeoutMessage)
            {
                SaverScannerActivity.access$1500(SaverScannerActivity.this).sendMessageDelayed(SaverScannerActivity.access$1500(SaverScannerActivity.this).obtainMessage(1), 20000L);
            }
        }
    }

    ()
    {
        this$0 = final_saverscanneractivity;
        val$hasTimeoutMessage = Z.this;
        super();
    }
}
