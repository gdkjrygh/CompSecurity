// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qx, qp

public abstract class qw
{

    public static boolean a;
    protected volatile int azh;

    public qw()
    {
        azh = -1;
    }

    public void a(qp qp)
    {
    }

    protected int c()
    {
        return 0;
    }

    public int rY()
    {
        if (azh < 0)
        {
            rZ();
        }
        return azh;
    }

    public int rZ()
    {
        int i = c();
        azh = i;
        return i;
    }

    public String toString()
    {
        return qx.g(this);
    }
}
