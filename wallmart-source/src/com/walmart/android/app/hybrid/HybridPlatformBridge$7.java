// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class allback
    implements android.content.lListener
{

    final HybridPlatformBridge this$0;
    final allback val$callback;
    final AtomicInteger val$selectedItem;

    public void onCancel(DialogInterface dialoginterface)
    {
        HybridPlatformBridge.access$000(val$selectedItem, val$callback, "cancel");
    }

    allback()
    {
        this$0 = final_hybridplatformbridge;
        val$selectedItem = atomicinteger;
        val$callback = allback.this;
        super();
    }
}
