// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.a;


// Referenced classes of package com.android.a:
//            x, aa

public class f
    implements x
{

    private int a;
    private int b;
    private final int c;
    private final float d;

    public f()
    {
        this(2500, 1, 1.0F);
    }

    public f(int i, int j, float f1)
    {
        a = i;
        c = j;
        d = f1;
    }

    public int a()
    {
        return a;
    }

    public void a(aa aa)
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        if (!c())
        {
            throw aa;
        } else
        {
            return;
        }
    }

    public int b()
    {
        return b;
    }

    protected boolean c()
    {
        return b <= c;
    }
}
