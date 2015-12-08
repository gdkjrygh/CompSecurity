// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.a;

import android.content.Context;
import com.jiubang.commerce.ad.b.a.e;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.b.a.i;
import com.jiubang.commerce.ad.i.a.a;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.a:
//            a

public class b
{

    private int a;
    private f b;
    private List c;
    private a d;
    private List e;
    private List f;
    private i g;
    private e h;
    private boolean i;

    public b()
    {
        i = false;
    }

    public static boolean a(f f1, int ai[])
    {
        if (com.jiubang.commerce.ad.b.a.f.a(f1))
        {
            return a(ai, 1);
        }
        if (com.jiubang.commerce.ad.b.a.f.b(f1))
        {
            return a(ai, 2);
        } else
        {
            return a(ai, 3);
        }
    }

    public static boolean a(List list)
    {
        return list != null && (list.contains(Integer.valueOf(2)) || list.contains(Integer.valueOf(11)));
    }

    private static boolean a(int ai[], int j)
    {
        if (ai != null)
        {
            int l = ai.length;
            int k = 0;
            while (k < l) 
            {
                if (ai[k] == j)
                {
                    return true;
                }
                k++;
            }
        }
        return false;
    }

    public static boolean b(f f1)
    {
        return f1 != null && (f1.d() == 2 || f1.d() == 11);
    }

    public static boolean b(f f1, int ai[])
    {
        if (com.jiubang.commerce.ad.b.a.f.a(f1))
        {
            return a(ai, 4);
        }
        if (com.jiubang.commerce.ad.b.a.f.b(f1))
        {
            return a(ai, 5);
        } else
        {
            return a(ai, 6);
        }
    }

    public static boolean b(List list)
    {
        return list != null && list.contains(Integer.valueOf(8));
    }

    public static boolean c(f f1)
    {
        return f1 != null && f1.d() == 8;
    }

    public static boolean c(f f1, int ai[])
    {
        if (com.jiubang.commerce.ad.b.a.f.a(f1))
        {
            return a(ai, 7);
        }
        if (com.jiubang.commerce.ad.b.a.f.b(f1))
        {
            return a(ai, 8);
        } else
        {
            return false;
        }
    }

    public static boolean c(List list)
    {
        return list != null && (list.contains(Integer.valueOf(9)) || list.contains(Integer.valueOf(10)));
    }

    public static boolean d(f f1)
    {
        return f1 != null && (f1.d() == 9 || f1.d() == 10);
    }

    public static boolean d(f f1, int ai[])
    {
        return a(ai, 9);
    }

    public static boolean d(List list)
    {
        return list != null && list.contains(Integer.valueOf(16));
    }

    public static boolean e(f f1)
    {
        return f1 != null && f1.d() == 16;
    }

    public static boolean e(f f1, int ai[])
    {
        return a(ai, 0);
    }

    private void f(f f1)
    {
        if (c != null && f1 != null)
        {
            for (int j = 0; j < c.size(); j++)
            {
                ((com.jiubang.commerce.ad.a.a)c.get(j)).c(f1.n());
            }

        }
    }

    public int a()
    {
        if (b != null)
        {
            return b.a();
        } else
        {
            return -1;
        }
    }

    public void a(Context context, e e1)
    {
        a = 3;
        h = e1;
        c = com.jiubang.commerce.ad.c.e.a(context, com.jiubang.commerce.ad.a.a.c(e1.d()));
    }

    public void a(Context context, f f1, i j, List list, List list1)
    {
        a = 1;
        b = f1;
        g = j;
        f = list;
        c = com.jiubang.commerce.ad.c.e.a(context, com.jiubang.commerce.ad.a.a.a(f), list1);
        f(f1);
    }

    public void a(Context context, f f1, List list)
    {
        a = 0;
        b = f1;
        e = list;
        c = com.jiubang.commerce.ad.c.e.a(context, com.jiubang.commerce.ad.a.a.b(e));
        f(f1);
    }

    public void a(f f1)
    {
        a = 2;
        b = f1;
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public int b()
    {
        return a;
    }

    public List c()
    {
        return c;
    }

    public a d()
    {
        return d;
    }

    public List e()
    {
        return e;
    }

    public List f()
    {
        return f;
    }

    public f g()
    {
        return b;
    }

    public i h()
    {
        return g;
    }

    public e i()
    {
        return h;
    }
}
