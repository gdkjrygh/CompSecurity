// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.youtube.app.system:
//            LocaleUpdatedService

public class LocaleUpdatedReceiver extends BroadcastReceiver
{

    public LocaleUpdatedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.startService(new Intent(context, com/google/android/apps/youtube/app/system/LocaleUpdatedService));
    }
}
