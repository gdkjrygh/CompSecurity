// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Calendar;

// Referenced classes of package com.jiubang.commerce.utils:
//            a

public class AdTimer
{

    private AlarmManager a;
    private AMReceiver b;
    private String c;
    private Context d;
    private a e;

    public AdTimer(Context context, String s)
    {
        d = context;
        c = s;
        a = (AlarmManager)context.getSystemService("alarm");
        b = new AMReceiver();
    }

    static void a(AdTimer adtimer)
    {
        adtimer.d();
    }

    public static long b()
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    static a b(AdTimer adtimer)
    {
        return adtimer.e;
    }

    private void c()
    {
        try
        {
            IntentFilter intentfilter = new IntentFilter(c);
            d.registerReceiver(b, intentfilter);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    private void d()
    {
        try
        {
            d.unregisterReceiver(b);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void a()
    {
        Object obj = new Intent(c);
        obj = PendingIntent.getBroadcast(d, 0, ((Intent) (obj)), 0x8000000);
        a.cancel(((PendingIntent) (obj)));
        d();
    }

    public void a(long l, a a1)
    {
        e = a1;
        c();
        a1 = new Intent(c);
        a1 = PendingIntent.getBroadcast(d, 0, a1, 0x8000000);
        a.set(0, l, a1);
    }

    private class AMReceiver extends BroadcastReceiver
    {

        final AdTimer a;

        public void onReceive(Context context, Intent intent)
        {
            j.a("wbq", (new StringBuilder()).append("Time is up!action:").append(intent.getAction()).toString());
            AdTimer.a(a);
            if (AdTimer.b(a) != null)
            {
                AdTimer.b(a).a();
            }
        }

        public AMReceiver()
        {
            a = AdTimer.this;
            super();
        }
    }

}
