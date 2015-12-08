// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            d

final class e
{

    private d a[];

    public e()
    {
        a = new d[50];
    }

    private static void d(int i)
    {
        if (i <= 0 || i > 50)
        {
            throw new IllegalArgumentException("Index must be between 1 and 50, inclusive.");
        } else
        {
            return;
        }
    }

    public final void a(d d1)
    {
        d(d1.d());
        a[d1.d() - 1] = d1;
    }

    public final boolean a(int i)
    {
        d(i);
        return a[i - 1] == null;
    }

    public final d[] a()
    {
        return (d[])a.clone();
    }

    public final d b(int i)
    {
        d(i);
        return a[i - 1];
    }

    public final boolean b()
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < a.length)
                {
                    if (a[i] == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final void c(int i)
    {
        d(i);
        a[i - 1] = null;
    }
}
