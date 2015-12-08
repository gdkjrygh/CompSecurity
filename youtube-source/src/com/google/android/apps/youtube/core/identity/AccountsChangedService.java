// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.a;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            ak

public class AccountsChangedService extends Service
{

    public AccountsChangedService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        ((BaseApplication)getApplication()).y().aV().a();
        stopSelf();
        return 2;
    }
}
