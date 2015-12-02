// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dud
{

    public static float a(float f)
    {
        return (float)((double)f * 3.1415926535897931D) / 180F;
    }

    public static float a(float f, float f1, float f2, float f3)
    {
        return (float)Math.sqrt(Math.pow(f - f2, 2D) + Math.pow(f1 - f3, 2D));
    }

    public static boolean a(float f, float f1)
    {
        return (double)Math.abs(f - f1) < 1.0000000000000001E-05D;
    }

    public static float b(float f)
    {
        return (180F * f) / 3.141593F;
    }

    public static float c(float f)
    {
        float f1;
label0:
        {
            if (f >= 0.0F)
            {
                f1 = f;
                if ((double)f <= 6.2831853071795862D)
                {
                    break label0;
                }
            }
            f1 = (float)Math.abs(6.2831853071795862D) - Math.abs(f);
        }
        return f1;
    }
}
