// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.c.e;
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
//            b, h, q, o, 
//            p, m

public class l extends com.jiubang.commerce.ad.d.b
    implements h, af, i
{

    protected Context b;
    protected q c;
    protected Handler d;
    private ExecutorService e;
    private volatile boolean f;
    private int g;
    private List h;
    private o i;

    public l(Context context, String s, String s1)
    {
        super(0, s, s1);
        e = Executors.newSingleThreadExecutor();
        f = false;
        d = new Handler();
        b = context;
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("] IntelligentBusiness\u6784\u9020\u88AB\u8C03\u7528").toString());
        }
        c = new q(context, s, s1, true);
    }

    private void a(List list)
    {
        if (i != null)
        {
            i.a(list);
        }
    }

    private void b(int k)
    {
        if (k < 0)
        {
            return;
        }
        int i1 = g - k;
        k = i1;
        if (i1 < 0)
        {
            k = 0;
        }
        android.content.SharedPreferences.Editor editor = b.getSharedPreferences("intelligent_business", 0).edit();
        editor.putLong("time", System.currentTimeMillis());
        editor.putInt("num", k);
        editor.commit();
    }

    private void f()
    {
        com.jiubang.commerce.b.c.a(b, t.a().d(), null, String.valueOf(a), "re_intelligent_normal");
        com.jiubang.commerce.ad.h.a a1 = (new com.jiubang.commerce.ad.h.c(b, a, "sdk_inner_call", this)).e(true).a();
        ah.a().a(a1);
    }

    private void g()
    {
        a(((List) (null)));
    }

    private boolean h()
    {
        return f;
    }

    private void i()
    {
        f = true;
    }

    private void j()
    {
        f = false;
    }

    public long a()
    {
        return 5000L;
    }

    public void a(int k)
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("]onAdFail(").append(k).append(")").toString());
        }
        com.jiubang.commerce.b.c.b(b, null, String.valueOf(a), (new StringBuilder()).append("statusCode:").append(k).toString());
        j();
        g();
    }

    public void a(Context context)
    {
        if (h == null || h.isEmpty())
        {
            j();
            g();
            return;
        }
        context = new ArrayList();
        int k = h.size();
        for (Iterator iterator = h.iterator(); iterator.hasNext(); context.add(((a)iterator.next()).f())) { }
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("]\u9884\u89E3\u6790\u6210\u529F\u6761\u6570:").append(k).append(" \u603B\u6761\u6570:").append(h.size()).toString());
        }
        if (k > 0)
        {
            b(k);
        }
        j();
        a(((List) (context)));
    }

    public void a(b b1)
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("]onAdImageFinish").toString());
        }
        j();
    }

    public void a(o o1)
    {
        if (h())
        {
            return;
        }
        i();
        i = o1;
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("]\u5F00\u59CB\u8BF7\u6C42\u5E7F\u544A").toString());
        }
        f();
    }

    public void a(Object obj)
    {
    }

    public void a(boolean flag, b b1)
    {
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("]onAdInfoFinish(").append(flag).append(")").toString());
        }
        j();
        int k = com.jiubang.commerce.ad.d.p.a(b, b1);
        if (j.a)
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("[vmId:").append(a).append("]\u5269\u4F59\u6570\u91CF=").append(k).toString());
        }
        com.jiubang.commerce.b.c.b(b, null, String.valueOf(a), (new StringBuilder()).append("num:").append(k).toString());
        if (k < 1)
        {
            g();
            return;
        }
        g = k;
        if (b1 != null)
        {
            b1 = b1.c();
        } else
        {
            b1 = null;
        }
        if (b1 == null || b1.isEmpty())
        {
            com.jiubang.commerce.utils.j.b("IntelligentPreloadService", "adInfoList is null");
            g();
            return;
        }
        com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("\u539F\u59CB\u5E7F\u544A\u6761\u6570=").append(b1.size()).toString());
        if (j.a)
        {
            a a1;
            for (Iterator iterator = b1.iterator(); iterator.hasNext(); com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append(a1.g()).append(" ").append(a1.q()).toString()))
            {
                a1 = (a)iterator.next();
            }

        }
        Object obj = com.jiubang.commerce.ad.url.j.a(b);
        ArrayList arraylist = new ArrayList();
        b1 = b1.iterator();
        do
        {
            if (!b1.hasNext())
            {
                break;
            }
            a a3 = (a)b1.next();
            if (!((com.jiubang.commerce.ad.url.j) (obj)).c(a3.q()))
            {
                a3.a(1);
                a3.b(1);
                arraylist.add(a3);
            }
        } while (true);
        obj = com.jiubang.commerce.ad.c.e.a(b, arraylist);
        com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append("\u51C6\u5907\u8FDB\u884C\u9884\u89E3\u6790\u7684\u5E7F\u544A=").append(((List) (obj)).size()).toString());
        if (((List) (obj)).isEmpty())
        {
            g();
            return;
        }
        b1 = ((b) (obj));
        if (((List) (obj)).size() > 10)
        {
            b1 = ((List) (obj)).subList(0, 10);
        }
        if (b1.size() > g)
        {
            b1 = b1.subList(0, g);
        }
        if (j.a)
        {
            a a2;
            for (Iterator iterator1 = b1.iterator(); iterator1.hasNext(); com.jiubang.commerce.utils.j.b("IntelligentPreloadService", (new StringBuilder()).append(a2.g()).append(" ").append(a2.q()).toString()))
            {
                a2 = (a)iterator1.next();
            }

        }
        h = b1;
        i();
        a(b, h, this);
    }

    public void b()
    {
        String s;
        com.jiubang.commerce.utils.j.b("IntelligentPreloadService", "GP open");
        if (a < 0)
        {
            return;
        }
        s = "";
        String s1 = t.a().g();
        s = s1;
_L1:
        Throwable throwable;
        if (t.i() && "1".equals(s))
        {
            com.jiubang.commerce.b.c.a(b, "com.android.vending", String.valueOf(a), "GoKeyboard");
        } else
        {
            com.jiubang.commerce.b.c.a(b, "com.android.vending", String.valueOf(a), null);
        }
        if (!d())
        {
            com.jiubang.commerce.b.c.a(b, t.a().d(), null, String.valueOf(a), "re_fake_gp");
            return;
        } else
        {
            d.postDelayed(new m(this), a());
            return;
        }
        throwable;
        throwable.printStackTrace();
          goto _L1
    }

    public void b(Object obj)
    {
    }

    public void c()
    {
    }

    public void c(Object obj)
    {
    }

    protected boolean d()
    {
        boolean flag = false;
        Object obj = b.getSharedPreferences("intelligent_business", 0);
        long l1 = ((SharedPreferences) (obj)).getLong("last_req_time", 0L);
        long l2 = System.currentTimeMillis();
        if (Math.abs(l2 - l1) > 0x6ddd00L)
        {
            flag = true;
        }
        if (flag)
        {
            obj = ((SharedPreferences) (obj)).edit();
            ((android.content.SharedPreferences.Editor) (obj)).putLong("last_req_time", l2);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
        }
        return flag;
    }

    public void e()
    {
        e.shutdownNow();
        e = null;
        b = null;
        c.a();
        c = null;
    }
}
