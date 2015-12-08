// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.j.c;


// Referenced classes of package com.go.weatherex.j.c:
//            e

class g
    implements Runnable
{

    final int a;
    final int b;
    final e c;

    g(e e1, int i, int j)
    {
        c = e1;
        a = i;
        b = j;
        super();
    }

    public void run()
    {
        try
        {
            e.b(c, a, b);
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
