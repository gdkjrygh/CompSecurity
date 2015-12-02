// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.ubercab.client.core.sms.SmsReceiver;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class dri
{

    private final gju a;
    private final Context b;
    private final Map c = new HashMap();
    private final cys d;

    dri(Context context, gju gju1, cys cys1)
    {
        b = context;
        a = gju1;
        d = cys1;
    }

    private void a(boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        b.getPackageManager().setComponentEnabledSetting(new ComponentName(b, com/ubercab/client/core/sms/SmsReceiver), i, 1);
    }

    private int b()
    {
        Iterator iterator = c.keySet().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (b((String)iterator.next()))
            {
                i++;
            }
        } while (true);
        return i;
    }

    private SharedPreferences c()
    {
        return b.getSharedPreferences(".sms_receiver_manager", 0);
    }

    public final Collection a()
    {
        return c.values();
    }

    final void a(drh drh1)
    {
        c.put(drh1.a(), drh1);
    }

    public final void a(String s)
    {
        Object obj = (drh)c.get(s);
        if (obj != null)
        {
            ((drh) (obj)).c();
        }
        obj = c().edit();
        ((android.content.SharedPreferences.Editor) (obj)).remove((new StringBuilder("handler.start.")).append(s).toString());
        ((android.content.SharedPreferences.Editor) (obj)).remove((new StringBuilder("handler.duration.")).append(s).toString());
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        if (b() == 0)
        {
            a(false);
        }
    }

    public final void a(String s, long l)
    {
        if (!d.a("android.permission.RECEIVE_SMS"))
        {
            return;
        }
        a(true);
        Object obj = (drh)c.get(s);
        if (obj != null)
        {
            ((drh) (obj)).b();
        }
        obj = c().edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong((new StringBuilder("handler.start.")).append(s).toString(), gju.a());
        ((android.content.SharedPreferences.Editor) (obj)).putLong((new StringBuilder("handler.duration.")).append(s).toString(), l);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
    }

    public final boolean b(String s)
    {
        long l = c().getLong((new StringBuilder("handler.start.")).append(s).toString(), 0L);
        long l1 = c().getLong((new StringBuilder("handler.duration.")).append(s).toString(), 0L);
        long l2 = gju.a();
        if (l == 0L)
        {
            return false;
        }
        if (l2 > l1 + l || l2 < l)
        {
            a(s);
            return false;
        } else
        {
            return true;
        }
    }
}
