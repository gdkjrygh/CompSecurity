// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;


// Referenced classes of package de.greenrobot.event.util:
//            g

public class e
    implements g
{

    protected final boolean a;
    protected final Throwable b;
    private Object c;

    public e(Throwable throwable)
    {
        b = throwable;
        a = false;
    }

    public e(Throwable throwable, boolean flag)
    {
        b = throwable;
        a = flag;
    }

    public Object a()
    {
        return c;
    }

    public void a(Object obj)
    {
        c = obj;
    }

    public boolean a()
    {
        return a;
    }

    public Throwable b()
    {
        return b;
    }
}
