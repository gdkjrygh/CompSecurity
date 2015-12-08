// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a.e;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.gau.go.a.f.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.gau.go.a.e:
//            e, f, g

public class d
{

    private static d a;
    private Context b;
    private AlarmManager c;
    private BroadcastReceiver d;
    private HashMap e;

    private d(Context context)
    {
        if (context != null)
        {
            b = context;
            c = (AlarmManager)context.getSystemService("alarm");
            e = new HashMap();
            b(context);
        }
    }

    public static d a(Context context)
    {
        com/gau/go/a/e/d;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new d(context);
        }
        context = a;
        com/gau/go/a/e/d;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    static HashMap a(d d1)
    {
        return d1.e;
    }

    private void b(Context context)
    {
        d = new com.gau.go.a.e.e(this);
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.action.broadreceiver.scheduler.manager");
        intentfilter.addDataScheme("download");
        context.registerReceiver(d, intentfilter);
    }

    public void a()
    {
        if (e == null) goto _L2; else goto _L1
_L1:
        HashMap hashmap = e;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = e.keySet().iterator();
_L4:
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_113;
            }
            obj = (String)iterator.next();
            obj = (f)e.get(obj);
        } while (obj == null);
        if (!(obj instanceof g)) goto _L4; else goto _L3
_L3:
        PendingIntent pendingintent;
        ((f) (obj)).a(true);
        pendingintent = ((f) (obj)).f();
        if (pendingintent == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        if (c != null)
        {
            c.cancel(pendingintent);
        }
        ((f) (obj)).g();
          goto _L4
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        hashmap;
        JVM INSTR monitorexit ;
_L2:
    }

    public void a(f f1)
    {
        if (b == null || c == null || f1 == null || e == null)
        {
            com.gau.go.a.f.e.a("task null out");
            return;
        }
        synchronized (e)
        {
            if (e.get(f1.d()) != null)
            {
                e.remove(f1.d());
            }
            e.put(f1.d(), f1);
        }
        try
        {
            obj = new Intent("com.action.broadreceiver.scheduler.manager");
            ((Intent) (obj)).setData(Uri.parse((new StringBuilder()).append("download://").append(f1.d()).toString()));
            ((Intent) (obj)).putExtra("scheduler_task_key", f1.d());
            ((Intent) (obj)).setPackage(b.getPackageName());
            obj = PendingIntent.getBroadcast(b, 0, ((Intent) (obj)), 0x8000000);
            f1.a(((PendingIntent) (obj)));
            c.set(0, f1.b(), ((PendingIntent) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            return;
        }
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
    }
}
