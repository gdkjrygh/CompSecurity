// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            AccountsChangedService

public class AccountsChangedReceiver extends BroadcastReceiver
{

    public AccountsChangedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.startService(new Intent(context, com/google/android/apps/youtube/core/identity/AccountsChangedService));
    }
}
