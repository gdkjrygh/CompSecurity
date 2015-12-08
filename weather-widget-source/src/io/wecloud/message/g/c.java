// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import android.text.TextUtils;
import io.wecloud.message.c.a;
import io.wecloud.message.e.b;
import io.wecloud.message.h.g;
import io.wecloud.message.j;
import java.io.IOException;

// Referenced classes of package io.wecloud.message.g:
//            e, k

public class c extends Thread
{

    e a;
    boolean b;
    Object c;
    private boolean d;

    public c(e e1)
    {
        b = true;
        c = new Object();
        d = false;
        a = e1;
        setName("push-receiver");
    }

    public void a()
    {
        b = false;
        synchronized (c)
        {
            c.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b()
    {
        synchronized (c)
        {
            c.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void c()
    {
        d = true;
    }

    public void run()
    {
_L3:
        if (b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (a == null || a.b() == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        a.b().b();
_L5:
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        c.wait();
          goto _L3
        Object obj2;
        obj2;
        obj;
        JVM INSTR monitorexit ;
        throw obj2;
        Object obj1;
        obj1;
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("\u975E\u6B63\u5E38\u505C\u6B62\uFF0C\u7B49\u5F85\u91CD\u8FDE  \u8BFB\u53D6\u7EBF\u7A0B\u7ED3\u675F ")).append(((IOException) (obj1)).getMessage()).toString());
        ((IOException) (obj1)).printStackTrace();
        a.d();
        if (a.m())
        {
            j.a(a.g(), 111);
        }
        obj1 = ((IOException) (obj1)).getMessage();
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L1; else goto _L4
_L4:
        if (((String) (obj1)).contains("ETIMEDOUT"))
        {
            if (!g.b(a.g()).equals(io.wecloud.message.c.a.h(a.g())))
            {
                io.wecloud.message.e.c.b("CSH", "\u7F51\u7EDC\u53D8\u5316\u5BFC\u81F4\u5F02\u5E38\uFF0C\u5FFD\u7565");
            } else
            {
                io.wecloud.message.e.c.b("CSH", "\u771F\u6B63\u7684\u8BFB\u8D85\u65F6");
                a.l().a(io.wecloud.message.e.a.a(3, ((String) (obj1))));
                j.a(a.g(), 113);
            }
        } else
        if (((String) (obj1)).contains("ECONNRESET"))
        {
            a.l().a(io.wecloud.message.e.a.a(1, ((String) (obj1))));
            j.a(a.g(), 113);
        }
          goto _L5
        obj1;
        ((Exception) (obj1)).printStackTrace();
          goto _L5
        obj2;
        ((Exception) (obj2)).printStackTrace();
          goto _L3
    }
}
