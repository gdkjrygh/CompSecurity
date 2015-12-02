// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.content.Context;
import android.os.Looper;
import com.ubercab.client.feature.notification.model.NotificationData;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class eky
{

    private static final Map a = (new gkh()).a(Integer.valueOf(7), "trip").a(Integer.valueOf(5), "fare_split_accepted").a(Integer.valueOf(6), "message").a(Integer.valueOf(3), "surge").a(Integer.valueOf(1), "trip").a(Integer.valueOf(4), "fare_split_invite").a(Integer.valueOf(2), "receipt").a();
    private final Map b;
    private boolean c;

    public eky(chp chp, drc drc, cev cev, Context context, hkr hkr, hku hku, ExecutorService executorservice, 
            gmg gmg, bjw bjw, NotificationManager notificationmanager, eku eku, dpg dpg, czf czf, dal dal)
    {
        b = (new gkh()).a("fare_split_accepted", new ekz(context, cev, eku, notificationmanager)).a("fare_split_invite", new ela(cev, context, hku, gmg, notificationmanager, eku, dpg)).a("message", new elc(context, cev, eku, notificationmanager, gmg)).a("surge", new elf(context, cev, chp, notificationmanager)).a("trip", new elg(drc, cev, context, hkr, hku, executorservice, gmg, bjw, notificationmanager, eku, dpg, czf, dal)).a("receipt", new ele(context, cev, eku, dal, notificationmanager)).a();
    }

    public final void a()
    {
        if (c)
        {
            return;
        }
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); ((eld)iterator.next()).b()) { }
        c = true;
    }

    public final void a(int i)
    {
        Object obj = (String)a.get(Integer.valueOf(i));
        if (obj != null)
        {
            if ((obj = (eld)b.get(obj)) != null)
            {
                ((eld) (obj)).a();
                return;
            }
        }
    }

    public final void a(NotificationData notificationdata)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            throw new IllegalStateException("Must be called on background thread.");
        }
        while (!c || !b.containsKey(notificationdata.getType())) 
        {
            return;
        }
        try
        {
            ((eld)b.get(notificationdata.getType())).a(notificationdata);
            return;
        }
        catch (Exception exception)
        {
            ijg.a("RiderNotificationManager").b(exception, "Failed to handle notification: %s", new Object[] {
                notificationdata
            });
        }
    }

    public final void b()
    {
        if (!c)
        {
            return;
        }
        for (Iterator iterator = b.values().iterator(); iterator.hasNext(); ((eld)iterator.next()).c()) { }
        c = false;
    }

}
