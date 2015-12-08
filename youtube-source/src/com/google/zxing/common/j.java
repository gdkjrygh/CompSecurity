// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


public final class j
{

    private final float a;
    private final float b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;

    private j(float f1, float f2, float f3, float f4, float f5, float f6, float f7, 
            float f8, float f9)
    {
        a = f1;
        b = f4;
        c = f7;
        d = f2;
        e = f5;
        f = f8;
        g = f3;
        h = f6;
        i = f9;
    }

    private static j a(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8)
    {
        float f9 = ((f1 - f3) + f5) - f7;
        float f10 = ((f2 - f4) + f6) - f8;
        if (f9 == 0.0F && f10 == 0.0F)
        {
            return new j(f3 - f1, f5 - f3, f1, f4 - f2, f6 - f4, f2, 0.0F, 0.0F, 1.0F);
        } else
        {
            float f11 = f3 - f5;
            float f12 = f7 - f5;
            f5 = f4 - f6;
            float f13 = f8 - f6;
            f6 = f11 * f13 - f12 * f5;
            f12 = (f13 * f9 - f12 * f10) / f6;
            f5 = (f10 * f11 - f9 * f5) / f6;
            return new j((f3 - f1) + f12 * f3, (f7 - f1) + f5 * f7, f1, f12 * f4 + (f4 - f2), f5 * f8 + (f8 - f2), f2, f12, f5, 1.0F);
        }
    }

    public static j a(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, 
            float f9, float f10, float f11, float f12, float f13, float f14, float f15, 
            float f16)
    {
        j j1 = a(f1, f2, f3, f4, f5, f6, f7, f8);
        f1 = j1.e;
        f2 = j1.i;
        f3 = j1.f;
        f4 = j1.h;
        f5 = j1.f;
        f6 = j1.g;
        f7 = j1.d;
        f8 = j1.i;
        float f17 = j1.d;
        float f18 = j1.h;
        float f19 = j1.e;
        float f20 = j1.g;
        float f21 = j1.c;
        float f22 = j1.h;
        float f23 = j1.b;
        float f24 = j1.i;
        float f25 = j1.a;
        float f26 = j1.i;
        float f27 = j1.c;
        float f28 = j1.g;
        float f29 = j1.b;
        float f30 = j1.g;
        float f31 = j1.a;
        float f32 = j1.h;
        float f33 = j1.b;
        float f34 = j1.f;
        float f35 = j1.c;
        float f36 = j1.e;
        float f37 = j1.c;
        float f38 = j1.d;
        float f39 = j1.a;
        float f40 = j1.f;
        float f41 = j1.a;
        float f42 = j1.e;
        float f43 = j1.b;
        j1 = new j(f1 * f2 - f3 * f4, f5 * f6 - f7 * f8, f17 * f18 - f19 * f20, f21 * f22 - f23 * f24, f25 * f26 - f27 * f28, f29 * f30 - f31 * f32, f33 * f34 - f35 * f36, f37 * f38 - f39 * f40, f41 * f42 - j1.d * f43);
        j j2 = a(f9, f10, f11, f12, f13, f14, f15, f16);
        f1 = j2.a;
        f2 = j1.a;
        f3 = j2.d;
        f4 = j1.b;
        f5 = j2.g;
        f6 = j1.c;
        f7 = j2.a;
        f8 = j1.d;
        f9 = j2.d;
        f10 = j1.e;
        f11 = j2.g;
        f12 = j1.f;
        f13 = j2.a;
        f14 = j1.g;
        f15 = j2.d;
        f16 = j1.h;
        f17 = j2.g;
        f18 = j1.i;
        f19 = j2.b;
        f20 = j1.a;
        f21 = j2.e;
        f22 = j1.b;
        f23 = j2.h;
        f24 = j1.c;
        f25 = j2.b;
        f26 = j1.d;
        f27 = j2.e;
        f28 = j1.e;
        f29 = j2.h;
        f30 = j1.f;
        f31 = j2.b;
        f32 = j1.g;
        f33 = j2.e;
        f34 = j1.h;
        f35 = j2.h;
        f36 = j1.i;
        f37 = j2.c;
        f38 = j1.a;
        f39 = j2.f;
        f40 = j1.b;
        f41 = j2.i;
        f42 = j1.c;
        f43 = j2.c;
        float f44 = j1.d;
        float f45 = j2.f;
        float f46 = j1.e;
        float f47 = j2.i;
        float f48 = j1.f;
        float f49 = j2.c;
        float f50 = j1.g;
        float f51 = j2.f;
        float f52 = j1.h;
        float f53 = j2.i;
        return new j(f1 * f2 + f3 * f4 + f5 * f6, f7 * f8 + f9 * f10 + f11 * f12, f13 * f14 + f15 * f16 + f17 * f18, f19 * f20 + f21 * f22 + f23 * f24, f25 * f26 + f27 * f28 + f29 * f30, f31 * f32 + f33 * f34 + f35 * f36, f37 * f38 + f39 * f40 + f41 * f42, f43 * f44 + f45 * f46 + f47 * f48, f49 * f50 + f51 * f52 + j1.i * f53);
    }

    public final void a(float af[])
    {
        int l = af.length;
        float f1 = a;
        float f2 = b;
        float f3 = c;
        float f4 = d;
        float f5 = e;
        float f6 = f;
        float f7 = g;
        float f8 = h;
        float f9 = i;
        for (int k = 0; k < l; k += 2)
        {
            float f10 = af[k];
            float f11 = af[k + 1];
            float f12 = f3 * f10 + f6 * f11 + f9;
            af[k] = (f1 * f10 + f4 * f11 + f7) / f12;
            af[k + 1] = (f10 * f2 + f11 * f5 + f8) / f12;
        }

    }
}
