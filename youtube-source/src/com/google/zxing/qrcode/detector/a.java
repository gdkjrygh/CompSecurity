// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.detector;

import com.google.zxing.g;

public final class a extends g
{

    private final float a;

    a(float f, float f1, float f2)
    {
        super(f, f1);
        a = f2;
    }

    final boolean a(float f, float f1, float f2)
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            flag = flag1;
            if (Math.abs(f1 - b()) > f)
            {
                break label0;
            }
            flag = flag1;
            if (Math.abs(f2 - a()) > f)
            {
                break label0;
            }
            f = Math.abs(f - a);
            if (f > 1.0F)
            {
                flag = flag1;
                if (f > a)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    final a b(float f, float f1, float f2)
    {
        return new a((a() + f1) / 2.0F, (b() + f) / 2.0F, (a + f2) / 2.0F);
    }
}
