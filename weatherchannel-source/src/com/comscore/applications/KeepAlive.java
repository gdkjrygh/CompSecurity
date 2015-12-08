// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import android.util.Log;
import com.comscore.analytics.Core;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.Storage;
import com.comscore.utils.task.TaskExecutor;
import java.util.HashMap;

// Referenced classes of package com.comscore.applications:
//            EventType

public class KeepAlive
    implements Runnable
{

    protected final long a;
    protected long b;
    protected long c;
    private Core d;
    private boolean e;
    private boolean f;

    public KeepAlive(Core core, long l)
    {
        b = -1L;
        e = false;
        f = false;
        a = l;
        c = a;
        d = core;
    }

    private long a(Storage storage)
    {
        long l1 = 0L;
        storage = storage.get("lastMeasurementProcessedTimestamp");
        long l = l1;
        if (storage != null)
        {
            l = l1;
            if (storage.length() > 0)
            {
                try
                {
                    l = Long.parseLong(storage);
                }
                // Misplaced declaration of an exception variable
                catch (Storage storage)
                {
                    return 0L;
                }
            }
        }
        return l;
    }

    protected void a()
    {
        if (!d.isEnabled())
        {
            return;
        } else
        {
            d.getTaskExecutor().execute(this, b - System.currentTimeMillis(), true, a);
            f = true;
            return;
        }
    }

    public void cancel()
    {
        Log.d("KeepAlive", "cancel()");
        d.getTaskExecutor().removeEnqueuedTask(this);
        f = false;
    }

    public void processKeepAlive(boolean flag)
    {
        if (d.isEnabled() && d.isKeepAliveEnabled())
        {
            OfflineMeasurementsCache offlinemeasurementscache = d.getOfflineCache();
            long l = a(d.getStorage());
            long l1 = System.currentTimeMillis() - l;
            Log.d("KeepAlive", (new StringBuilder()).append("processKeepAlive(").append(flag).append(") timeSinceLastTransmission=").append(System.currentTimeMillis() - l1).append(" currentTimeout=").append(c).toString());
            if (l != 0L && l1 > c - 1000L)
            {
                Log.d("KeepAlive", "Sending Keep-alive");
                if (!flag)
                {
                    d.notify(EventType.KEEPALIVE, new HashMap(), true);
                } else
                {
                    offlinemeasurementscache.saveApplicationMeasurement(EventType.KEEPALIVE, null, true);
                }
                d.getStorage().set("lastMeasurementProcessedTimestamp", String.valueOf(System.currentTimeMillis()));
                return;
            }
        }
    }

    public void reset()
    {
        reset(a);
    }

    public void reset(long l)
    {
        if (d.isEnabled())
        {
            cancel();
            Log.d("KeepAlive", (new StringBuilder()).append("reset:").append(l).toString());
            b = System.currentTimeMillis() + l;
            c = l;
            if (e)
            {
                start(0);
                return;
            }
        }
    }

    public void run()
    {
        while (!d.isEnabled() || !f) 
        {
            return;
        }
        Log.d("KeepAlive", "run()");
        sendKeepAlive();
    }

    public void sendKeepAlive()
    {
        processKeepAlive(false);
    }

    public void start(int i)
    {
        if (d.isEnabled())
        {
            cancel();
            e = true;
            Log.d("KeepAlive", (new StringBuilder()).append("start(").append(i).append(")").toString());
            if (d.isKeepAliveEnabled())
            {
                long l = System.currentTimeMillis();
                if (b < l)
                {
                    b = l + (long)i;
                }
                a();
                return;
            }
        }
    }

    public void stop()
    {
        Log.d("KeepAlive", "stop");
        e = false;
        cancel();
        processKeepAlive(true);
    }
}
