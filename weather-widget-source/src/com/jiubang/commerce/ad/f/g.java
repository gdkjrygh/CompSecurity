// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.jiubang.commerce.ad.a.a;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.c.e;
import com.jiubang.commerce.ad.d.p;
import com.jiubang.commerce.ad.d.q;
import com.jiubang.commerce.ad.e.af;
import com.jiubang.commerce.ad.e.t;
import com.jiubang.commerce.ad.url.i;
import com.jiubang.commerce.b.c;
import com.jiubang.commerce.utils.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.jiubang.commerce.ad.f:
//            b, h

public class g
    implements af, com.jiubang.commerce.ad.f.b, i
{

    private Context a;
    private volatile boolean b;
    private int c;
    private List d;
    private boolean e;
    private int f;
    private q g;
    private h h;

    private void a(List list)
    {
        if (h != null)
        {
            h.a(list);
        }
    }

    private void b(int k)
    {
        if (k < 0)
        {
            return;
        }
        int l = c - k;
        c = l;
        k = l;
        if (l < 0)
        {
            k = 0;
        }
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("new_intelligent_business", 0).edit();
        editor.putLong("time", System.currentTimeMillis());
        editor.putInt("num", k);
        editor.commit();
    }

    private void c()
    {
        a(((List) (null)));
    }

    private void d()
    {
        b = true;
    }

    private void e()
    {
        b = false;
    }

    public void a()
    {
        String s;
        if (j.a)
        {
            j.b("NewIntelligentBusiness", "GPOpen");
        }
        s = "";
        String s1 = t.a().g();
        s = s1;
_L1:
        Throwable throwable;
        if (t.i() && "1".equals(s))
        {
            s = "GoKeyboard";
        } else
        {
            s = null;
        }
        com.jiubang.commerce.b.c.c(a, String.valueOf(f), s);
        return;
        throwable;
        throwable.printStackTrace();
          goto _L1
    }

    public void a(int k)
    {
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("[vmId:").append(f).append("]onAdFail(").append(k).append(")").toString());
        }
        com.jiubang.commerce.b.c.b(a, null, String.valueOf(f), (new StringBuilder()).append("statusCode:").append(k).toString());
        e();
        c();
        e = true;
    }

    public void a(Context context)
    {
        if (d == null || d.isEmpty())
        {
            e();
            c();
            return;
        }
        context = new ArrayList();
        int k = d.size();
        for (Iterator iterator = d.iterator(); iterator.hasNext(); context.add(((a)iterator.next()).f())) { }
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("[vmId:").append(f).append("]\u9884\u89E3\u6790\u6210\u529F\u6761\u6570:").append(k).append(" \u603B\u6761\u6570:").append(d.size()).toString());
        }
        if (k > 0)
        {
            b(k);
        }
        e();
        a(((List) (context)));
    }

    public void a(b b1)
    {
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("[vmId:").append(f).append("]onAdImageFinish").toString());
        }
        e();
    }

    public void a(Object obj)
    {
    }

    public void a(boolean flag, b b1)
    {
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("[vmId:").append(f).append("]onAdInfoFinish(").append(flag).append(")").toString());
        }
        e();
        int k = p.b(a, b1);
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("[vmId:").append(f).append("]\u5269\u4F59\u6570\u91CF=").append(k).toString());
        }
        com.jiubang.commerce.b.c.b(a, null, String.valueOf(f), (new StringBuilder()).append("num:").append(k).toString());
        if (k < 1)
        {
            e = true;
            c();
            return;
        }
        c = k;
        if (b1 != null)
        {
            b1 = b1.c();
        } else
        {
            b1 = null;
        }
        if (b1 == null || b1.isEmpty())
        {
            j.b("NewIntelligentBusiness", "adInfoList is null");
            e = true;
            c();
            return;
        }
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("\u539F\u59CB\u5E7F\u544A\u6761\u6570=").append(b1.size()).toString());
            a a3;
            for (Iterator iterator = b1.iterator(); iterator.hasNext(); j.a("NewIntelligentBusiness", (new StringBuilder()).append(a3.g()).append(" ").append(a3.v()).append(" ").append(a3.f()).toString()))
            {
                a3 = (a)iterator.next();
            }

        }
        com.jiubang.commerce.ad.url.j j1 = com.jiubang.commerce.ad.url.j.a(a);
        ArrayList arraylist = new ArrayList();
        b1 = b1.iterator();
        do
        {
            if (!b1.hasNext())
            {
                break;
            }
            a a5 = (a)b1.next();
            if (!j1.c(a5.q()))
            {
                a5.a(1);
                a5.b(1);
                arraylist.add(a5);
            }
        } while (true);
        b1 = com.jiubang.commerce.ad.c.e.a(a, arraylist);
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("\u8FC7\u6EE4\u5DF2\u7ECF\u9884\u52A0\u8F7D\u548C\u5B89\u88C5\u8FC7\u540E\u7684\u5E7F\u544A=").append(b1.size()).toString());
            a a4;
            for (Iterator iterator1 = b1.iterator(); iterator1.hasNext(); j.a("NewIntelligentBusiness", (new StringBuilder()).append(a4.g()).append(" ").append(a4.v()).append(" ").append(a4.q()).toString()))
            {
                a4 = (a)iterator1.next();
            }

        }
        if (b1.isEmpty())
        {
            e = true;
            c();
            return;
        }
        d.clear();
        d = b1;
        e = true;
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("\u5C0F\u5305\u4F53\u5E7F\u544A=").append(d.size()).toString());
            a a1;
            for (b1 = d.iterator(); b1.hasNext(); j.a("NewIntelligentBusiness", (new StringBuilder()).append(a1.g()).append(" ").append(a1.v()).append(" ").append(a1.q()).toString()))
            {
                a1 = (a)b1.next();
            }

        }
        if (d.size() > 10)
        {
            d = d.subList(0, 10);
        }
        if (d.size() > c)
        {
            d = d.subList(0, c);
        }
        if (j.a)
        {
            j.b("NewIntelligentBusiness", (new StringBuilder()).append("\u9650\u5B9A\u6570\u76EE\u540E,\u51C6\u5907\u8FDB\u884C\u9884\u52A0\u8F7D\u7684\u5C0F\u5305\u4F53\u5E7F\u544A=").append(d.size()).toString());
            a a2;
            for (b1 = d.iterator(); b1.hasNext(); j.a("NewIntelligentBusiness", (new StringBuilder()).append(a2.g()).append(" ").append(a2.v()).append(" ").append(a2.q()).toString()))
            {
                a2 = (a)b1.next();
            }

        }
        d();
        a(a, d, this);
    }

    public void b()
    {
        a = null;
        g.a();
        g = null;
    }

    public void b(Object obj)
    {
    }

    public void c(Object obj)
    {
    }
}
