// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.platform;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package io.theholygrail.dingo.platform:
//            PlatformBridge

class val.message
    implements Runnable
{

    final PlatformBridge this$0;
    final String val$message;
    final Intent val$share;

    public void run()
    {
        PlatformBridge.access$000(PlatformBridge.this).startActivity(Intent.createChooser(val$share, val$message));
    }

    ()
    {
        this$0 = final_platformbridge;
        val$share = intent;
        val$message = String.this;
        super();
    }
}
