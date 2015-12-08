// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.transfer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.core.utils.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline.transfer:
//            OfflineTransferService

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if (p.a(context))
        {
            context.startService(OfflineTransferService.a(context));
        }
    }

    public ()
    {
    }
}
