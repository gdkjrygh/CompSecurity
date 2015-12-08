// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.widget.DatePicker;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class allback
    implements android.app.SetListener
{

    final HybridPlatformBridge this$0;
    final allback val$bridgeCallback;

    public void onDateSet(DatePicker datepicker, int i, int j, int k)
    {
        datepicker = new kerDialogResponse();
        datepicker.year = i;
        datepicker.month = j;
        datepicker.day = k;
        datepicker.action = "ok";
        val$bridgeCallback.respond(datepicker);
    }

    allback()
    {
        this$0 = final_hybridplatformbridge;
        val$bridgeCallback = allback.this;
        super();
    }
}
