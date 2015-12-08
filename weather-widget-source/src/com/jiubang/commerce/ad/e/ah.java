// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.jiubang.commerce.ad.a;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            a, ai

public class ah
{

    private static ah a;
    private boolean b;
    private Context c;

    private ah(Context context)
    {
        b = true;
        c = context.getApplicationContext();
    }

    static Context a(ah ah1)
    {
        return ah1.c;
    }

    public static ah a()
    {
        com/jiubang/commerce/ad/e/ah;
        JVM INSTR monitorenter ;
        ah ah1 = a;
        com/jiubang/commerce/ad/e/ah;
        JVM INSTR monitorexit ;
        return ah1;
        Exception exception;
        exception;
        throw exception;
    }

    public static ah a(Context context)
    {
        com/jiubang/commerce/ad/e/ah;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new ah(context);
        }
        context = a;
        com/jiubang/commerce/ad/e/ah;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void b(com.jiubang.commerce.ad.h.a a1)
    {
        com.jiubang.commerce.ad.a.a(a1);
    }

    private void c(com.jiubang.commerce.ad.h.a a1)
    {
        int i = a1.b;
        com.jiubang.commerce.ad.e.a.a(a1.a).a(a1.a, i, new ai(this, a1));
    }

    public void a(com.jiubang.commerce.ad.h.a a1)
    {
        if (b)
        {
            j.b("IntelligentPreloadService", "Use new protocol");
            c(a1);
            return;
        } else
        {
            j.b("IntelligentPreloadService", "Use old protocol");
            b(a1);
            return;
        }
    }

    public boolean b()
    {
        return b;
    }
}
