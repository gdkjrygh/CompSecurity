// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.animation.Interpolator;

// Referenced classes of package com.a.a:
//            q, p

public abstract class o
    implements Cloneable
{

    float a;
    Class b;
    boolean c;
    private Interpolator d;

    public o()
    {
        d = null;
        c = false;
    }

    public static o a(float f)
    {
        return new q(f);
    }

    public static o a(float f, float f1)
    {
        return new p(f, f1);
    }

    public static o a(float f, int i)
    {
        return new q(f, i);
    }

    public static o b(float f)
    {
        return new p(f);
    }

    public void a(Interpolator interpolator)
    {
        d = interpolator;
    }

    public abstract void a(Object obj);

    public boolean a()
    {
        return c;
    }

    public abstract Object b();

    public float c()
    {
        return a;
    }

    public Object clone()
    {
        return e();
    }

    public Interpolator d()
    {
        return d;
    }

    public abstract o e();
}
