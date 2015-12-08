// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.c:
//            d, c

public class a
{

    private static a a;
    private Context b;
    private d c;
    private List d;

    private a(Context context)
    {
        b = context;
        d = new ArrayList();
    }

    public static a a(Context context)
    {
        com/jiubang/commerce/ad/c/a;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new a(context);
        }
        context = a;
        com/jiubang/commerce/ad/c/a;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a()
    {
        if (c == null)
        {
            c = new d(this, null);
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentfilter.addDataScheme("package");
        b.registerReceiver(c, intentfilter);
    }

    static void a(a a1, String s, Intent intent)
    {
        a1.a(s, intent);
    }

    private void a(String s, Intent intent)
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            c c1 = (c)iterator.next();
            if (c1 != null)
            {
                c1.a(s, intent);
            }
        } while (true);
    }

    private void b()
    {
        if (c != null)
        {
            b.unregisterReceiver(c);
            c = null;
        }
    }

    public void a(c c1)
    {
        if (c1 != null && !d.contains(c1))
        {
            if (d.isEmpty())
            {
                a();
            }
            d.add(c1);
        }
    }

    public void b(c c1)
    {
        if (d.contains(c1))
        {
            d.remove(c1);
            if (d.isEmpty())
            {
                b();
            }
        }
    }
}
