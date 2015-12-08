// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.a;


// Referenced classes of package com.google.android.apps.youtube.common.a:
//            b, f

final class g
    implements Runnable
{

    private b a;
    private Object b;
    private Object c;
    private Exception d;
    private boolean e;

    private g()
    {
    }

    g(byte byte0)
    {
        this();
    }

    public final void a(b b1, Object obj, Exception exception)
    {
        a = b1;
        b = obj;
        d = exception;
        c = null;
        e = false;
    }

    public final void a(b b1, Object obj, Object obj1)
    {
        a = b1;
        b = obj;
        c = obj1;
        d = null;
        e = true;
    }

    public final void run()
    {
        if (e)
        {
            a.a(b, c);
        } else
        {
            a.a(b, d);
        }
        a = null;
        b = null;
        c = null;
        d = null;
        e = false;
        f.a(this);
    }
}
