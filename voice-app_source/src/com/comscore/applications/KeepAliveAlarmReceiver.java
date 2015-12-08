// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.comscore.analytics.Core;
import com.comscore.utils.Date;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.Storage;
import java.util.Calendar;
import java.util.HashMap;

// Referenced classes of package com.comscore.applications:
//            EventType

public class KeepAliveAlarmReceiver extends BroadcastReceiver
{

    final String a;
    protected final long b;
    protected long c;
    protected long d;
    private Core e;
    private boolean f;
    private boolean g;

    public KeepAliveAlarmReceiver(Core core, long l)
    {
        c = -1L;
        f = false;
        g = false;
        b = l;
        d = b;
        e = core;
        a = (new StringBuilder()).append(getClass().getName()).append(".").append(core.getAppName()).toString();
        IntentFilter intentfilter = new IntentFilter(a);
        core.getAppContext().registerReceiver(this, intentfilter);
    }

    private long a(Storage storage)
    {
        long l1 = 0L;
        storage = storage.get("lastTransmission");
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

    private PendingIntent a()
    {
        return PendingIntent.getBroadcast(e.getAppContext(), 0, new Intent(a), 0x10000000);
    }

    protected void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(c);
        ((AlarmManager)context.getSystemService("alarm")).setRepeating(0, calendar.getTimeInMillis(), b, a());
        g = true;
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void cancel()
    {
        this;
        JVM INSTR monitorenter ;
        Context context;
        Log.d("KeepAlive", "cancel()");
        context = e.getAppContext();
        if (context != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ((AlarmManager)context.getSystemService("alarm")).cancel(a());
        g = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onReceive(Context context, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (g)
        {
            Log.d("KeepAlive", "onReceive()");
            sendKeepAlive();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public void processKeepAlive(boolean flag)
    {
        if (e.isKeepAliveEnabled())
        {
            OfflineMeasurementsCache offlinemeasurementscache = e.getOfflineCache();
            long l = a(e.getStorage());
            l = Date.unixTime() - l;
            Log.d("KeepAlive", (new StringBuilder()).append("processKeepAlive(").append(flag).append(") timeSinceLastTransmission=").append(l).append(" currentTimeout=").append(d).toString());
            if (l > d - 1000L)
            {
                Log.d("KeepAlive", "Sending Keep-alive");
                if (!flag)
                {
                    e.notify(EventType.KEEPALIVE, new HashMap(), true);
                } else
                {
                    offlinemeasurementscache.saveApplicationMeasurement(EventType.KEEPALIVE, null, true);
                }
                e.getStorage().set("lastTransmission", String.valueOf(System.currentTimeMillis()));
            }
        }
    }

    public void reset()
    {
        reset(b);
    }

    public void reset(long l)
    {
        cancel();
        Log.d("KeepAlive", (new StringBuilder()).append("reset:").append(l).toString());
        c = System.currentTimeMillis() + l;
        d = l;
        if (f)
        {
            start(0);
        }
    }

    public void sendKeepAlive()
    {
        processKeepAlive(false);
    }

    public void start(int i)
    {
        Context context;
label0:
        {
            cancel();
            f = true;
            Log.d("KeepAlive", (new StringBuilder()).append("start(").append(i).append(")").toString());
            if (e.isKeepAliveEnabled())
            {
                context = e.getAppContext();
                if (context != null)
                {
                    break label0;
                }
            }
            return;
        }
        long l = System.currentTimeMillis();
        if (c < l)
        {
            c = l + (long)i;
        }
        a(context);
    }

    public void stop()
    {
        Log.d("KeepAlive", "stop");
        f = false;
        cancel();
        processKeepAlive(true);
    }
}
