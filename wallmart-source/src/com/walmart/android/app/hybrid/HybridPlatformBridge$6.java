// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class allback
    implements android.content.Listener
{

    final HybridPlatformBridge this$0;
    final allback val$callback;
    final ata val$data;
    final AtomicInteger val$selectedItem;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$selectedItem.set(i);
        if (TextUtils.isEmpty(val$data.okButton))
        {
            esponse esponse = new esponse("ok", i);
            val$callback.respond(esponse);
            dialoginterface.dismiss();
        }
    }

    allback()
    {
        this$0 = final_hybridplatformbridge;
        val$selectedItem = atomicinteger;
        val$data = ata;
        val$callback = allback.this;
        super();
    }
}
