// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.statistics;

import com.gau.go.launcherex.gowidget.c.g;
import com.gtp.a.a.a.a;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.statistics:
//            b, o, h, n

class p
    implements Runnable
{

    final o a;
    private n b;

    public p(o o1, n n)
    {
        a = o1;
        super();
        b = n;
    }

    private void a(String s)
    {
        com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u5F00\u59CB\u4E0A\u4F20!(").append(s).append(")").toString(), "payment_log.txt");
        if (com.gau.go.launcherex.gowidget.statistics.h.a(com.gau.go.launcherex.gowidget.statistics.b.a(s, "lvsiqiaoil611230"), com.gau.go.launcherex.gowidget.statistics.o.a(a)))
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u4E0A\u4F20\u6210\u529F!(").append(s).append(")").toString(), "payment_log.txt");
            return;
        } else
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u4E0A\u4F20\u5931\u8D25\uFF0C\u4FDD\u5B58\u5230\u6587\u4EF6!(").append(s).append(")").toString(), "payment_log.txt");
            com.gau.go.launcherex.gowidget.statistics.o.a(a, s);
            return;
        }
    }

    public void run()
    {
        Object obj = com.gau.go.launcherex.gowidget.statistics.o.a(a, b);
        if (g.a(com.gau.go.launcherex.gowidget.statistics.o.a(a)))
        {
            List list = a.a();
            if (list != null && !list.isEmpty())
            {
                list.add(obj);
                for (obj = list.iterator(); ((Iterator) (obj)).hasNext(); a((String)((Iterator) (obj)).next())) { }
            } else
            {
                a(((String) (obj)));
            }
            return;
        } else
        {
            com.gtp.a.a.a.a.a().a((new StringBuilder()).append("\u6CA1\u6709\u7F51\u7EDC\uFF0C\u4FDD\u5B58\u5230\u6587\u4EF6!(").append(((String) (obj))).append(")").toString(), "payment_log.txt");
            com.gau.go.launcherex.gowidget.statistics.o.a(a, ((String) (obj)));
            return;
        }
    }
}
