// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public final class aw
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

    private aw(float f1, float f2, float f3, float f4, float f5, float f6, float f7, 
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

    private static aw a(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8)
    {
        float f11 = f8 - f6;
        float f9 = ((f2 - f4) + f6) - f8;
        if (f11 == 0.0F && f9 == 0.0F)
        {
            return new aw(f3 - f1, f5 - f3, f1, f4 - f2, f6 - f4, f2, 0.0F, 0.0F, 1.0F);
        } else
        {
            float f10 = f3 - f5;
            float f12 = f7 - f5;
            f5 = ((f1 - f3) + f5) - f7;
            f6 = f4 - f6;
            float f13 = f10 * f11 - f12 * f6;
            f11 = (f11 * f5 - f12 * f9) / f13;
            f5 = (f10 * f9 - f5 * f6) / f13;
            return new aw((f3 - f1) + f11 * f3, (f7 - f1) + f5 * f7, f1, f11 * f4 + (f4 - f2), f5 * f8 + (f8 - f2), f2, f11, f5, 1.0F);
        }
    }

    public static aw a(float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, 
            float f9, float f10, float f11, float f12, float f13, float f14, float f15, 
            float f16)
    {
        aw aw1 = a(f1, f2, f3, f4, f5, f6, f7, f8);
        f1 = aw1.e;
        f2 = aw1.i;
        f3 = aw1.f;
        f4 = aw1.h;
        f5 = aw1.f;
        f6 = aw1.g;
        f7 = aw1.d;
        f8 = aw1.i;
        float f17 = aw1.d;
        float f18 = aw1.h;
        float f19 = aw1.e;
        float f20 = aw1.g;
        float f21 = aw1.c;
        float f22 = aw1.h;
        float f23 = aw1.b;
        float f24 = aw1.i;
        float f25 = aw1.a;
        float f26 = aw1.i;
        float f27 = aw1.c;
        float f28 = aw1.g;
        float f29 = aw1.b;
        float f30 = aw1.g;
        float f31 = aw1.a;
        float f32 = aw1.h;
        float f33 = aw1.b;
        float f34 = aw1.f;
        float f35 = aw1.c;
        float f36 = aw1.e;
        float f37 = aw1.c;
        float f38 = aw1.d;
        float f39 = aw1.a;
        float f40 = aw1.f;
        float f41 = aw1.a;
        float f42 = aw1.e;
        float f43 = aw1.b;
        aw1 = new aw(f1 * f2 - f3 * f4, f5 * f6 - f7 * f8, f17 * f18 - f19 * f20, f21 * f22 - f23 * f24, f25 * f26 - f27 * f28, f29 * f30 - f31 * f32, f33 * f34 - f35 * f36, f37 * f38 - f39 * f40, f41 * f42 - aw1.d * f43);
        aw aw2 = a(f9, f10, f11, f12, f13, f14, f15, f16);
        f1 = aw2.a;
        f2 = aw1.a;
        f3 = aw2.d;
        f4 = aw1.b;
        f5 = aw2.g;
        f6 = aw1.c;
        f7 = aw2.a;
        f8 = aw1.d;
        f9 = aw2.d;
        f10 = aw1.e;
        f11 = aw2.g;
        f12 = aw1.f;
        f13 = aw2.a;
        f14 = aw1.g;
        f15 = aw2.d;
        f16 = aw1.h;
        f17 = aw2.g;
        f18 = aw1.i;
        f19 = aw2.b;
        f20 = aw1.a;
        f21 = aw2.e;
        f22 = aw1.b;
        f23 = aw2.h;
        f24 = aw1.c;
        f25 = aw2.b;
        f26 = aw1.d;
        f27 = aw2.e;
        f28 = aw1.e;
        f29 = aw2.h;
        f30 = aw1.f;
        f31 = aw2.b;
        f32 = aw1.g;
        f33 = aw2.e;
        f34 = aw1.h;
        f35 = aw2.h;
        f36 = aw1.i;
        f37 = aw2.c;
        f38 = aw1.a;
        f39 = aw2.f;
        f40 = aw1.b;
        f41 = aw2.i;
        f42 = aw1.c;
        f43 = aw2.c;
        float f44 = aw1.d;
        float f45 = aw2.f;
        float f46 = aw1.e;
        float f47 = aw2.i;
        float f48 = aw1.f;
        float f49 = aw2.c;
        float f50 = aw1.g;
        float f51 = aw2.f;
        float f52 = aw1.h;
        float f53 = aw2.i;
        return new aw(f1 * f2 + f3 * f4 + f5 * f6, f7 * f8 + f9 * f10 + f11 * f12, f13 * f14 + f15 * f16 + f17 * f18, f19 * f20 + f21 * f22 + f23 * f24, f25 * f26 + f27 * f28 + f29 * f30, f31 * f32 + f33 * f34 + f35 * f36, f37 * f38 + f39 * f40 + f41 * f42, f43 * f44 + f45 * f46 + f47 * f48, f49 * f50 + f51 * f52 + aw1.i * f53);
    }

    public final void a(float af[])
    {
        int k = af.length;
        float f1 = a;
        float f2 = b;
        float f3 = c;
        float f4 = d;
        float f5 = e;
        float f6 = f;
        float f7 = g;
        float f8 = h;
        float f9 = i;
        for (int j = 0; j < k; j += 2)
        {
            float f10 = af[j];
            float f11 = af[j + 1];
            float f12 = f3 * f10 + f6 * f11 + f9;
            af[j] = (f1 * f10 + f4 * f11 + f7) / f12;
            af[j + 1] = (f10 * f2 + f11 * f5 + f8) / f12;
        }

    }
}
