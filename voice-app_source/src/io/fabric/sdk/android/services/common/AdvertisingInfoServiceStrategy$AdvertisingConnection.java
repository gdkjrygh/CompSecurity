// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            AdvertisingInfoServiceStrategy

private static final class <init>
    implements ServiceConnection
{

    private static final int QUEUE_TIMEOUT_IN_MS = 200;
    private final LinkedBlockingQueue queue;
    private boolean retrieved;

    public IBinder getBinder()
    {
        if (retrieved)
        {
            Fabric.getLogger().e("Fabric", "getBinder already called");
        }
        retrieved = true;
        IBinder ibinder;
        try
        {
            ibinder = (IBinder)queue.poll(200L, TimeUnit.MILLISECONDS);
        }
        catch (InterruptedException interruptedexception)
        {
            return null;
        }
        return ibinder;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        try
        {
            queue.put(ibinder);
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
        queue.clear();
    }

    private ()
    {
        retrieved = false;
        queue = new LinkedBlockingQueue(1);
    }

    queue(queue queue1)
    {
        this();
    }
}
