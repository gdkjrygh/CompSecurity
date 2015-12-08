// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import android.text.TextUtils;
import io.wecloud.message.e.a;
import io.wecloud.message.e.b;
import io.wecloud.message.e.c;
import io.wecloud.message.j;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package io.wecloud.message.g:
//            a, e, k

public class d extends Thread
{

    Queue a;
    boolean b;
    Object c;
    e d;

    public d(e e1)
    {
        a = new LinkedList();
        b = true;
        c = new Object();
        d = e1;
        setName("push-sender");
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

    public void a(io.wecloud.message.g.a a1)
    {
        synchronized (c)
        {
            a.offer(a1);
            c.notifyAll();
        }
        return;
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void run()
    {
_L3:
        if (b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        io.wecloud.message.g.a a1;
        synchronized (c)
        {
            a1 = (io.wecloud.message.g.a)a.poll();
        }
        if (d == null || d.b() == null || a1 == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        d.b().a(a1);
        if (a1.a == 2)
        {
            d.i();
        }
          goto _L3
        obj;
        io.wecloud.message.e.c.b("CSH", (new StringBuilder("command info = ")).append(a1.toString()).toString());
        io.wecloud.message.e.c.b("CSH", ((IOException) (obj)).getMessage());
        ((IOException) (obj)).printStackTrace();
        io.wecloud.message.e.c.b("CSH", "\u53D1\u9001\u6570\u636E\u5931\u8D25\uFF0C\u7B49\u5F85\u91CD\u8BD5");
        d.d();
        obj = ((IOException) (obj)).getMessage();
        if (TextUtils.isEmpty(((CharSequence) (obj)))) goto _L1; else goto _L4
_L4:
        if (((String) (obj)).contains("EPIPE"))
        {
            d.l().a(io.wecloud.message.e.a.a(4, ((String) (obj))));
            d.m();
        } else
        {
            d.l().a(io.wecloud.message.e.a.a(6, ((String) (obj))));
        }
          goto _L3
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        io.wecloud.message.e.c.b("CSH", (new StringBuilder()).append(exception.getMessage()).toString());
        exception.printStackTrace();
        d.l().a(io.wecloud.message.e.a.a(6, exception.getMessage()));
          goto _L3
        j.a();
        io.wecloud.message.e.c.b("CommandSender", "release wake lock --->");
        Object obj1 = c;
        obj1;
        JVM INSTR monitorenter ;
        c.wait();
          goto _L3
        Object obj2;
        obj2;
        obj1;
        JVM INSTR monitorexit ;
        throw obj2;
        obj2;
        ((Exception) (obj2)).printStackTrace();
          goto _L3
    }
}
