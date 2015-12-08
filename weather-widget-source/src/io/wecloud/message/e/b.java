// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.e;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateUtils;
import io.wecloud.message.bean.c;
import io.wecloud.message.bean.d;
import io.wecloud.message.c.a;
import java.util.ArrayList;

// Referenced classes of package io.wecloud.message.e:
//            c

public class b
{

    private static b a;
    private Context b;
    private io.wecloud.message.c.b c;
    private boolean d;
    private ArrayList e;
    private int f;
    private int g;

    public b(Context context)
    {
        d = false;
        e = new ArrayList();
        f = -1;
        g = -1;
        b = context;
        c = new io.wecloud.message.c.b(context);
        d = io.wecloud.message.c.a.c(context);
    }

    public static b a(Context context)
    {
        io/wecloud/message/e/b;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new b(context);
        }
        context = a;
        io/wecloud/message/e/b;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void a(d d1)
    {
        if (d1 != null)
        {
            if (d1 instanceof c)
            {
                c.a(d1);
            } else
            if (d)
            {
                c.a(d1);
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        io.wecloud.message.c.a.b(b, System.currentTimeMillis());
        d = flag;
        io.wecloud.message.c.a.b(b, flag);
    }

    public boolean a()
    {
        if (!TextUtils.isEmpty(io.wecloud.message.c.a.h(b, 0)))
        {
            g = 2;
            io.wecloud.message.e.c.b("LogManager", "todo:[LOG_TYPE_FG]");
            return true;
        }
        if (!DateUtils.isToday(io.wecloud.message.c.a.b(b)))
        {
            g = 3;
            io.wecloud.message.e.c.b("LogManager", "todo:[LOG_TYPE_USAGE]");
            return true;
        }
        long l = io.wecloud.message.c.a.a(b);
        if (l == 0L || System.currentTimeMillis() - l > 0xdbba00L)
        {
            g = 1;
            io.wecloud.message.e.c.b("LogManager", "todo:[LOG_TYPE_BG]");
            return true;
        } else
        {
            f = -1;
            g = -1;
            io.wecloud.message.e.c.b("LogManager", "todo:[NONE]");
            return false;
        }
    }

    public boolean a(ArrayList arraylist, int i)
    {
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = false;
        if (i != 2 && (i != 4 || g != 2)) goto _L2; else goto _L1
_L1:
        boolean flag;
        ArrayList arraylist1 = c.b();
        arraylist.addAll(arraylist1);
        e.clear();
        e.addAll(arraylist1);
        g = -1;
        f = 2;
        flag = flag1;
_L4:
        io.wecloud.message.e.c.b("LogManager", (new StringBuilder("has more logs, value = ")).append(flag).toString());
        return flag;
_L2:
        if (i == 1 || i == 4 && g == 1)
        {
            if (!e.isEmpty())
            {
                arraylist.addAll(e);
                g = 1;
                flag = true;
            } else
            {
                ArrayList arraylist2 = c.b();
                if (!arraylist2.isEmpty())
                {
                    arraylist.addAll(arraylist2);
                    e.clear();
                    e.addAll(arraylist2);
                    g = 1;
                    f = 2;
                    flag = true;
                } else
                {
                    ArrayList arraylist3 = c.a();
                    arraylist.addAll(arraylist3);
                    arraylist = io.wecloud.message.c.a.B(b);
                    flag = flag2;
                    if (!TextUtils.isEmpty(arraylist))
                    {
                        flag = flag2;
                        if (arraylist.split("&&").length > 0)
                        {
                            flag = true;
                        }
                    }
                    e.clear();
                    e.addAll(arraylist3);
                    f = 1;
                    if (flag)
                    {
                        g = 1;
                    } else
                    {
                        g = -1;
                    }
                }
            }
        } else
        {
            flag = flag1;
            if (i == 4)
            {
                flag = flag1;
                if (g == 3)
                {
                    ArrayList arraylist4 = io.wecloud.message.f.a.a(b).d();
                    if (!arraylist4.isEmpty())
                    {
                        arraylist.addAll(arraylist4);
                        e.clear();
                        e.addAll(arraylist4);
                    }
                    f = 3;
                    g = -1;
                    flag = flag1;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        e.clear();
        if (f == 3)
        {
            io.wecloud.message.f.a.a(b).e();
            io.wecloud.message.c.a.c(b, System.currentTimeMillis());
            io.wecloud.message.e.c.b("LogManager", "record send usage timestamp...");
        } else
        if (f == 1 && g == -1)
        {
            io.wecloud.message.c.a.b(b, System.currentTimeMillis());
            io.wecloud.message.e.c.b("LogManager", "record send bg logs timestamp...");
            return;
        }
    }
}
