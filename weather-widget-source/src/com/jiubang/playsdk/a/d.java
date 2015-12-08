// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.a;

import android.content.Context;
import com.android.a.aa;
import com.android.a.p;
import com.android.a.s;
import com.jiubang.playsdk.a.a.a;
import com.jiubang.playsdk.d.f;
import com.jiubang.playsdk.d.h;
import com.jiubang.playsdk.f.b;
import com.jiubang.playsdk.f.e;
import com.jiubang.playsdk.f.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.jiubang.playsdk.a:
//            b, c, o, e, 
//            f, s, h, l, 
//            k, i, g, j, 
//            m, t, p, v

public class d
{

    public Random a;
    private final s b;
    private final com.jiubang.playsdk.a.s c = new com.jiubang.playsdk.a.b(new c());
    private t d;
    private Context e;
    private final HashMap f = new HashMap();
    private final Set g = new HashSet();
    private final LinkedList h = new LinkedList();
    private a i;

    public d(Context context, s s1, t t)
    {
        a = new Random(System.currentTimeMillis());
        i = null;
        e = context;
        b = s1;
        d = t;
    }

    private p a(String s1, String s2, com.jiubang.playsdk.a.p p1)
    {
        s1 = new o(s1, p1, new com.jiubang.playsdk.a.e(this, s2), new com.jiubang.playsdk.a.f(this, s2));
        s1.a(false);
        return s1;
    }

    static t a(d d1)
    {
        return d1.d;
    }

    public static String a(Context context)
    {
        String s1 = b.a;
        if (!com.jiubang.playsdk.f.e.a(context))
        {
            s1 = b.c;
        }
        return s1;
    }

    static void a(d d1, String s1, aa aa)
    {
        d1.a(s1, aa);
    }

    static void a(d d1, String s1, Object obj)
    {
        d1.a(s1, obj);
    }

    private void a(String s1, aa aa)
    {
        c.a(s1, false);
        s1 = (com.jiubang.playsdk.a.h)f.remove(s1);
        if (s1 != null)
        {
            h.remove(s1);
            s1 = com.jiubang.playsdk.a.h.a(s1).iterator();
            while (s1.hasNext()) 
            {
                l l1 = (l)s1.next();
                if (l1.a != null)
                {
                    l1.a.a(aa);
                }
            }
        }
    }

    private void a(String s1, Object obj)
    {
        s1 = (com.jiubang.playsdk.a.h)f.remove(s1);
        if (s1 != null)
        {
            h.remove(s1);
            s1 = com.jiubang.playsdk.a.h.a(s1).iterator();
            while (s1.hasNext()) 
            {
                l l1 = (l)s1.next();
                if (l1.a != null)
                {
                    l1.a.a(obj);
                }
            }
        }
    }

    static com.jiubang.playsdk.a.s b(d d1)
    {
        return d1.c;
    }

    private String b(Context context)
    {
        context = a(context);
        return (new StringBuilder()).append(context).append("/recommendedapp/remdinfo.do?rd=").append(a.nextLong()).toString();
    }

    static Context c(d d1)
    {
        return d1.e;
    }

    public com.jiubang.playsdk.d.d a(String s1)
    {
        return (com.jiubang.playsdk.d.d)c.e(s1);
    }

    public void a()
    {
        c.a();
    }

    public void a(long l1, int i1, int j1, int k1, k k2)
    {
        String s1 = com.jiubang.playsdk.d.f.b(l1, i1, j1, k1);
        if (c.a(s1))
        {
            k2.a(c.c(s1));
            return;
        }
        k2 = new l(this, k2);
        com.jiubang.playsdk.a.h h1 = (com.jiubang.playsdk.a.h)f.get(s1);
        if (h1 != null)
        {
            h1.a(k2);
            return;
        } else
        {
            p p1 = a(b(e), s1, ((com.jiubang.playsdk.a.p) (new i(this, s1, new h(l1, i1, j1, k1)))));
            p1.a(s1);
            a(new com.jiubang.playsdk.a.h(this, p1, k2));
            return;
        }
    }

    public void a(long l1, k k1)
    {
        k1 = new l(this, k1);
        com.jiubang.playsdk.a.h h1 = (com.jiubang.playsdk.a.h)f.get("appinfo_detail");
        if (h1 != null)
        {
            h1.a(k1);
            return;
        } else
        {
            p p1 = a(m.c(e), "appinfo_detail", ((com.jiubang.playsdk.a.p) (new g(this, l1))));
            p1.a("appinfo_detail");
            a(new com.jiubang.playsdk.a.h(this, p1, k1));
            return;
        }
    }

    public void a(com.jiubang.playsdk.a.h h1)
    {
        com.jiubang.playsdk.f.d.a("DataLoader", (new StringBuilder()).append("addDownQueue:").append(h1).toString());
        b.a(com.jiubang.playsdk.a.h.b(h1));
        f.put(h1.a(), h1);
        h.add(h1);
    }

    public void a(k k1)
    {
        k1 = new l(this, k1);
        com.jiubang.playsdk.a.h h1 = (com.jiubang.playsdk.a.h)f.get("has_new_state");
        if (h1 != null)
        {
            h1.a(k1);
            return;
        } else
        {
            p p1 = a(m.b(e), "has_new_state", ((com.jiubang.playsdk.a.p) (new j(this))));
            p1.a("has_new_state");
            a(new com.jiubang.playsdk.a.h(this, p1, k1));
            return;
        }
    }

    void a(Object obj)
    {
        Iterator iterator = g.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((com.jiubang.playsdk.a.h)iterator.next()).a(obj))
            {
                iterator.remove();
            }
        } while (true);
        Iterator iterator1 = h.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.jiubang.playsdk.a.h h1 = (com.jiubang.playsdk.a.h)iterator1.next();
            if (h1.a(obj))
            {
                iterator.remove();
                f.remove(h1.a());
            }
        } while (true);
        iterator = f.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((com.jiubang.playsdk.a.h)iterator.next()).a(obj))
            {
                iterator.remove();
            }
        } while (true);
    }

    public void a(String s1, int i1, int j1, k k1)
    {
        a("other_themes_of_the_suit");
        k1 = new l(this, k1);
        com.jiubang.playsdk.a.h h1 = (com.jiubang.playsdk.a.h)f.get("other_themes_of_the_suit");
        if (h1 != null)
        {
            h1.a(k1);
            return;
        } else
        {
            s1 = a(m.a(e), "other_themes_of_the_suit", ((com.jiubang.playsdk.a.p) (new com.jiubang.playsdk.a.m(this, s1, i1, j1))));
            s1.a("other_themes_of_the_suit");
            a(new com.jiubang.playsdk.a.h(this, s1, k1));
            return;
        }
    }

    public void a(String s1, boolean flag)
    {
        c.a(s1, flag);
    }

    public v b(String s1)
    {
        return c.c(s1);
    }

    public boolean c(String s1)
    {
        return c.d(s1);
    }
}
