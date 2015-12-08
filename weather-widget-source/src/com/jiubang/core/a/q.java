// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.graphics.Matrix;

public class q
{

    private Matrix a;
    private float b;

    public q()
    {
        a = new Matrix();
        b = 1.0F;
    }

    public Matrix a()
    {
        return a;
    }

    public void a(float f)
    {
        b = f;
    }

    public float b()
    {
        return b;
    }

    public void c()
    {
        a.reset();
        b = 1.0F;
    }
}
