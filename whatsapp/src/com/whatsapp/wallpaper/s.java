// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class s
{

    private Matrix a;
    private Bitmap b;

    public s(Bitmap bitmap)
    {
        b = bitmap;
    }

    public Bitmap a()
    {
        return b;
    }

    public void a(Bitmap bitmap)
    {
        b = bitmap;
    }

    public void a(Matrix matrix)
    {
        a = matrix;
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            float af[] = new float[2];
            float[] _tmp = af;
            af[0] = 0.0F;
            af[1] = 1.0F;
            a.mapVectors(af);
            flag = flag1;
            if (af[0] != 0.0F)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int c()
    {
        if (b())
        {
            return b.getHeight();
        } else
        {
            return b.getWidth();
        }
    }

    public Matrix d()
    {
        return a;
    }

    public Matrix e()
    {
        Matrix matrix = new Matrix();
        if (a != null)
        {
            int i = b.getWidth() / 2;
            int j = b.getHeight() / 2;
            matrix.preTranslate(-i, -j);
            matrix.postConcat(a);
            matrix.postTranslate(c() / 2, f() / 2);
        }
        return matrix;
    }

    public int f()
    {
        if (b())
        {
            return b.getWidth();
        } else
        {
            return b.getHeight();
        }
    }
}
