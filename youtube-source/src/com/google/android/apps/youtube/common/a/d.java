// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.a;


// Referenced classes of package com.google.android.apps.youtube.common.a:
//            b

public final class d
    implements b
{

    private final b a;
    private volatile boolean b;

    private d(b b1)
    {
        a = b1;
    }

    public static d a(b b1)
    {
        return new d(b1);
    }

    public final void a()
    {
        b = true;
    }

    public final void a(Object obj, Exception exception)
    {
        if (!b)
        {
            a.a(obj, exception);
        }
    }

    public final void a(Object obj, Object obj1)
    {
        if (!b)
        {
            a.a(obj, obj1);
        }
    }

    public final boolean b()
    {
        return b;
    }
}
