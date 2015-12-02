// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.accountsync;

import android.app.Service;
import android.content.AbstractThreadedSyncAdapter;
import android.content.Intent;
import android.os.IBinder;

// Referenced classes of package com.whatsapp.accountsync:
//            f

public class ContactsSyncAdapterService extends Service
{

    private final AbstractThreadedSyncAdapter a = new f(this, this, true);

    public ContactsSyncAdapterService()
    {
    }

    public IBinder onBind(Intent intent)
    {
        return a.getSyncAdapterBinder();
    }
}
