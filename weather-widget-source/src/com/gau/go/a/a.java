// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;


// Referenced classes of package com.gau.go.a:
//            b

public class a
    implements Runnable
{

    private Runnable a;
    private b b;

    public a()
    {
    }

    public void a(b b1)
    {
        b = b1;
    }

    public void a(Runnable runnable)
    {
        a = runnable;
    }

    public void run()
    {
        if (a != null)
        {
            a.run();
        }
        if (b != null)
        {
            b.a();
        }
    }
}
