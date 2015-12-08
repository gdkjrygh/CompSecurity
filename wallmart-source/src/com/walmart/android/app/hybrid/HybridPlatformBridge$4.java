// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

class allback
    implements android.content.Listener
{

    final HybridPlatformBridge this$0;
    final allback val$callback;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new esponse("ok", i);
        val$callback.respond(dialoginterface);
    }

    allback()
    {
        this$0 = final_hybridplatformbridge;
        val$callback = allback.this;
        super();
    }
}
