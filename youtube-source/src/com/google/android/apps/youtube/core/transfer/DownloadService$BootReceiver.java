// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            DownloadService

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        L.e("boot completed, starting download service");
        context.startService(DownloadService.a(context));
    }

    public ()
    {
    }
}
