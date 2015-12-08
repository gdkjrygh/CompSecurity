// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.common.a.a;

public class g
{

    private final float a;
    private final float b;

    public g(float f, float f1)
    {
        a = f;
        b = f1;
    }

    public static float a(g g1, g g2)
    {
        return com.google.zxing.common.a.a.a(g1.a, g1.b, g2.a, g2.b);
    }

    public static void a(g ag[])
    {
        float f = a(ag[0], ag[1]);
        float f1 = a(ag[1], ag[2]);
        float f2 = a(ag[0], ag[2]);
        float f3;
        float f4;
        g g1;
        g g2;
        g g3;
        if (f1 >= f && f1 >= f2)
        {
            g3 = ag[0];
            g2 = ag[1];
            g1 = ag[2];
        } else
        if (f2 >= f1 && f2 >= f)
        {
            g3 = ag[1];
            g2 = ag[0];
            g1 = ag[2];
        } else
        {
            g3 = ag[2];
            g2 = ag[0];
            g1 = ag[1];
        }
        f = g3.a;
        f1 = g3.b;
        f2 = g1.a;
        f3 = g2.b;
        f4 = g1.b;
        if ((f2 - f) * (f3 - f1) - (g2.a - f) * (f4 - f1) >= 0.0F)
        {
            g g4 = g1;
            g1 = g2;
            g2 = g4;
        }
        ag[0] = g1;
        ag[1] = g3;
        ag[2] = g2;
    }

    public final float a()
    {
        return a;
    }

    public final float b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof g)
        {
            obj = (g)obj;
            flag = flag1;
            if (a == ((g) (obj)).a)
            {
                flag = flag1;
                if (b == ((g) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Float.floatToIntBits(a) * 31 + Float.floatToIntBits(b);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(25);
        stringbuilder.append('(');
        stringbuilder.append(a);
        stringbuilder.append(',');
        stringbuilder.append(b);
        stringbuilder.append(')');
        return stringbuilder.toString();
    }
}
