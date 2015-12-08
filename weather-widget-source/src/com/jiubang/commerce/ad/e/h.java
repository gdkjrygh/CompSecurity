// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.jiubang.commerce.ad.a.b;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            af, t, a

class h
    implements af
{

    final int a;
    final Context b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    final af g;
    final a h;

    h(a a1, int i, Context context, boolean flag, boolean flag1, boolean flag2, boolean flag3, 
            af af1)
    {
        h = a1;
        a = i;
        b = context;
        c = flag;
        d = flag1;
        e = flag2;
        f = flag3;
        g = af1;
        super();
    }

    public void a(int i)
    {
        if (g != null)
        {
            g.a(i);
        }
        if (j.a)
        {
            j.c("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]onAdFail(return, statusCode:").append(i).append(")").toString());
        }
    }

    public void a(b b1)
    {
    }

    public void a(Object obj)
    {
        g.a(obj);
    }

    public void a(boolean flag, b b1)
    {
        if (j.a)
        {
            f f1;
            if (b1 != null)
            {
                f1 = b1.g();
            } else
            {
                f1 = null;
            }
            if (f1 != null)
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]onAdInfoFinish(return, virtualModuleId:").append(a).append(", ModuleId:").append(f1.b()).append(", ").append(b1.b()).append(", AdvDataSource:").append(f1.d()).append(", Onlineadvtype:").append(f1.n()).append(")").toString());
            } else
            {
                j.b("Ad_SDK", (new StringBuilder()).append("[vmId:").append(a).append("]onAdInfoFinish(return, virtualModuleId:").append(a).append(", adModuleInfoBean or ModuleDataItemBean is null)").toString());
            }
        }
        t.a(b, flag, b1, c, d, e, f, g);
    }

    public void b(Object obj)
    {
        g.b(obj);
    }

    public void c(Object obj)
    {
        g.c(obj);
    }
}
