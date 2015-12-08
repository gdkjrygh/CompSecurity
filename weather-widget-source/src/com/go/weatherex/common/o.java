// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;


// Referenced classes of package com.go.weatherex.common:
//            n

class o
    implements Runnable
{

    final Runnable a;
    final n b;

    o(n n1, Runnable runnable)
    {
        b = n1;
        a = runnable;
        super();
    }

    public void run()
    {
        a.run();
        b.a();
        return;
        Exception exception;
        exception;
        b.a();
        throw exception;
    }
}
