// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.c;

import android.content.Context;
import android.content.Intent;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.database.b.d;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jiubang.commerce.ad.c:
//            c, a, f

public class e
    implements c
{

    public static boolean a = false;
    private Context b;
    private d c;
    private ExecutorService d;

    public e(Context context, String s)
    {
        b = context;
        c = com.jiubang.commerce.database.b.d.a(context);
        d = Executors.newSingleThreadExecutor();
    }

    static d a(e e1)
    {
        return e1.c;
    }

    public static List a(Context context, List list)
    {
        if (j.a)
        {
            j.a("InstalledFilter", (new StringBuilder()).append("sHasStarted=").append(a).toString());
        }
        return a(context, list, null);
    }

    public static List a(Context context, List list, List list1)
    {
        if (list != null && !list.isEmpty())
        {
            if (!(context = com.jiubang.commerce.database.b.d.a(context).b()).isEmpty())
            {
                ArrayList arraylist = new ArrayList();
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    a a1 = (a)list.next();
                    if (!a(a1.f(), ((List) (context)), list1))
                    {
                        arraylist.add(a1);
                    }
                } while (true);
                return arraylist;
            }
        }
        return list;
    }

    private static boolean a(String s, List list, List list1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            com.jiubang.commerce.database.a.d d1 = (com.jiubang.commerce.database.a.d)list.next();
            if ((list1 == null || !list1.contains(s)) && d1.b().equals(s))
            {
                return true;
            }
        }

        return false;
    }

    private void c()
    {
        com.jiubang.commerce.ad.c.a.a(b).a(this);
    }

    private void d()
    {
        com.jiubang.commerce.ad.c.a.a(b).b(this);
    }

    public void a()
    {
        if (!a)
        {
            a = true;
            c.a();
            c();
        }
    }

    public void a(String s, Intent intent)
    {
        d.execute(new f(this, s));
    }

    public void b()
    {
        d.shutdownNow();
        d = null;
        d();
        a = false;
    }

}
