// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

static final class val.callback
    implements android.content.istener
{

    final llback val$callback;
    final AtomicInteger val$selectedItem;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        HybridPlatformBridge.access$000(val$selectedItem, val$callback, "cancel");
    }

    llback(AtomicInteger atomicinteger, llback llback)
    {
        val$selectedItem = atomicinteger;
        val$callback = llback;
        super();
    }
}
