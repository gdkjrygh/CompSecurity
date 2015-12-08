// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import android.content.Context;
import android.content.SharedPreferences;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.e.ah;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.url.i;
import com.jiubang.commerce.b.c;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jiubang.commerce.ad.d:
//            b

public class q extends com.jiubang.commerce.ad.d.b
    implements af, i
{

    private ExecutorService b;
    private Context c;
    private volatile boolean d;
    private List e;
    private List f;
    private boolean g;
    private long h;

    public q(Context context, String s, String s1, boolean flag)
    {
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 2;
        }
        super(k, s, s1);
        b = Executors.newSingleThreadExecutor();
        d = false;
        h = 0L;
        c = context;
        g = flag;
        j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--Mid=").append(a).toString());
    }

    private boolean a(String s)
    {
label0:
        {
            if (f == null)
            {
                break label0;
            }
            Iterator iterator = f.iterator();
            String s1;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                s1 = (String)iterator.next();
            } while (s1 == null || !s1.equals(s));
            return true;
        }
        return false;
    }

    private List b(List list)
    {
        ArrayList arraylist = new ArrayList();
        com.jiubang.commerce.ad.url.j j1 = com.jiubang.commerce.ad.url.j.a(c);
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                a a1 = (a)list.next();
                if (a1 != null && !a(a1.f()) && !j1.c(a1.q()))
                {
                    arraylist.add(a1);
                }
            } while (true);
        }
        return arraylist;
    }

    private void b()
    {
        com.jiubang.commerce.ad.h.a a1;
        if (g)
        {
            com.jiubang.commerce.b.c.a(c, t.a().d(), null, String.valueOf(a), "re_mobvista_normal");
        } else
        {
            com.jiubang.commerce.b.c.a(c, t.a().d(), null, String.valueOf(a), "re_mobvista_timer");
        }
        a1 = (new com.jiubang.commerce.ad.h.c(c, a, "sdk_inner_call", this)).e(true).a();
        ah.a().a(a1);
    }

    public static boolean b(Context context)
    {
        return context.getSharedPreferences("mobvista_business", 0).getBoolean("htimer", false);
    }

    public static void c(Context context)
    {
        context = context.getSharedPreferences("mobvista_business", 0).edit();
        context.putBoolean("htimer", true);
        context.commit();
    }

    private boolean c()
    {
        return d;
    }

    private void d()
    {
        d = true;
    }

    private void e()
    {
        d = false;
    }

    public void a()
    {
        b.shutdownNow();
        b = null;
        c = null;
    }

    public void a(int k)
    {
        j.a("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--onAdFail(").append(k).append(")").toString());
        e();
    }

    public void a(Context context)
    {
        if (e == null || e.isEmpty())
        {
            e();
            return;
        }
        context = com.jiubang.commerce.ad.url.j.a(context);
        Iterator iterator = e.iterator();
        int k = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (context.c(((a)iterator.next()).q()))
            {
                k++;
            }
        } while (true);
        e();
        j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--\u9884\u89E3\u6790\u6210\u529F\u6761\u6570:").append(k).append(" \u603B\u6761\u6570:").append(e.size()).toString());
    }

    public void a(b b1)
    {
        j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--onAdImageFinish").toString());
        e();
    }

    public void a(Object obj)
    {
    }

    public void a(List list)
    {
label0:
        {
            while (a < 0 || c()) 
            {
                return;
            }
            if (!g)
            {
                long l = System.currentTimeMillis();
                if (Math.abs(l - h) <= 0x6ddd00L)
                {
                    break label0;
                }
                h = l;
            }
            d();
            f = list;
            b();
            return;
        }
        com.jiubang.commerce.b.c.a(c, t.a().d(), null, String.valueOf(a), "re_fake_mob_timer");
    }

    public void a(boolean flag, b b1)
    {
        j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--onAdInfoFinish(").append(flag).append(")").toString());
        e();
        if (b1 != null)
        {
            b1 = b1.c();
        } else
        {
            b1 = null;
        }
        if (b1 == null || b1.isEmpty())
        {
            j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--adInfoList is null").toString());
        } else
        {
            j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--\u539F\u59CB\u5E7F\u544A\u6761\u6570=").append(b1.size()).toString());
            if (j.a)
            {
                a a1;
                for (Iterator iterator = b1.iterator(); iterator.hasNext(); j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--").append(a1.g()).append(" ").append(a1.q()).toString()))
                {
                    a1 = (a)iterator.next();
                }

            }
            if (g)
            {
                b1 = b(b1);
                j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--\u51C6\u5907\u8FDB\u884C\u9884\u89E3\u6790\u7684\u5E7F\u544A=").append(b1.size()).toString());
                if (!b1.isEmpty())
                {
                    if (j.a)
                    {
                        a a2;
                        for (Iterator iterator1 = b1.iterator(); iterator1.hasNext(); j.b("IntelligentPreloadService", (new StringBuilder()).append("Mob(").append(g).append(")").append("--").append(a2.g()).append(" ").append(a2.q()).toString()))
                        {
                            a2 = (a)iterator1.next();
                        }

                    }
                    e = b1;
                    d();
                    a(c, e, this);
                    return;
                }
            } else
            {
                e = b1;
                d();
                a(c, e, false, this);
                return;
            }
        }
    }

    public void b(Object obj)
    {
    }

    public void c(Object obj)
    {
    }
}
