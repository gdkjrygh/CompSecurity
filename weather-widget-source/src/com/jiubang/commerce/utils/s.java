// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.utils;

import java.util.Timer;

// Referenced classes of package com.jiubang.commerce.utils:
//            t

public class s
{

    private Timer a;
    private boolean b;
    private byte c[];

    public s()
    {
        b = false;
        c = new byte[0];
    }

    static void a(s s1, boolean flag)
    {
        s1.a(flag);
    }

    private void a(boolean flag)
    {
        synchronized (c)
        {
            b = flag;
        }
        return;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a()
    {
        if (a != null)
        {
            a.cancel();
            a.purge();
            a = null;
        }
    }

    public void a(long l, t t1)
    {
        a();
        a(false);
        t1.a(this);
        a = new Timer(com/jiubang/commerce/utils/s.getName(), true);
        a.schedule(t1, l);
    }

    public boolean b()
    {
        boolean flag;
        synchronized (c)
        {
            flag = b;
        }
        return flag;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
