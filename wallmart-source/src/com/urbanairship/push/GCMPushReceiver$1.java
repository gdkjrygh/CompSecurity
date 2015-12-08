// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.Context;
import android.content.Intent;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.push:
//            GCMPushReceiver

class gResult
    implements com.urbanairship.llback
{

    final GCMPushReceiver this$0;
    final Context val$context;
    final Intent val$intent;
    final android.content.PendingResult val$pendingResult;

    public void onAirshipReady(UAirship uairship)
    {
        GCMPushReceiver.access$000(GCMPushReceiver.this, val$context, val$intent, uairship.getAirshipConfigOptions());
        val$pendingResult.finish();
    }

    gResult()
    {
        this$0 = final_gcmpushreceiver;
        val$context = context1;
        val$intent = intent1;
        val$pendingResult = android.content.PendingResult.this;
        super();
    }
}
