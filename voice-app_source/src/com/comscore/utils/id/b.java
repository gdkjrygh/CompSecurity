// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.id;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.comscore.utils.id:
//            a

final class b
    implements ServiceConnection
{

    boolean a;
    private final LinkedBlockingQueue b;

    private b()
    {
        a = false;
        b = new LinkedBlockingQueue(1);
    }

    b(a a1)
    {
        this();
    }

    public IBinder getBinder()
    {
        if (a)
        {
            throw new IllegalStateException();
        } else
        {
            a = true;
            return (IBinder)b.take();
        }
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            b.put(ibinder);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
    }
}
