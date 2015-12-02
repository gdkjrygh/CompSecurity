// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.ubercab.sms.InternalSmsReceiver;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class hoc
{

    private final Context a;
    private final gju b;
    private final hod c;
    private final Map d;

    public hoc(Context context)
    {
        this(context, new gju(), new hod(context), ((Map) (new ConcurrentHashMap())));
    }

    private hoc(Context context, gju gju1, hod hod1, Map map)
    {
        a = context;
        b = gju1;
        c = hod1;
        d = map;
        c();
    }

    private long b(Class class1, long l)
    {
        l = gju.a() + l;
        if (d.containsKey(class1))
        {
            return Math.max(l, ((Long)d.get(class1)).longValue());
        } else
        {
            return l;
        }
    }

    private void b()
    {
        c.a(d);
    }

    private void b(Class class1)
    {
        try
        {
            a.getPackageManager().setComponentEnabledSetting(new ComponentName(a, class1), 1, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return;
        }
    }

    private void c()
    {
        d.clear();
        Map map = c.a();
        d.putAll(map);
    }

    private void c(Class class1)
    {
        try
        {
            a.getPackageManager().setComponentEnabledSetting(new ComponentName(a, class1), 2, 1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return;
        }
    }

    public final void a()
    {
        Iterator iterator = d.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Class class1 = (Class)iterator.next();
            if (((Long)d.get(class1)).longValue() < gju.a())
            {
                c(class1);
                iterator.remove();
            }
        } while (true);
        if (d.isEmpty())
        {
            c(com/ubercab/sms/InternalSmsReceiver);
        } else
        {
            b(com/ubercab/sms/InternalSmsReceiver);
        }
        b();
    }

    public final void a(Class class1)
    {
        c(class1);
        d.remove(class1);
        a();
    }

    public final void a(Class class1, long l)
    {
        b(class1);
        d.put(class1, Long.valueOf(b(class1, l)));
        a();
    }
}
