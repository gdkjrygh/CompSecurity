// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


public class ad
{

    private final float a;
    private final float b;

    public ad(float f, float f1)
    {
        a = f;
        b = f1;
    }

    public static float a(ad ad1, ad ad2)
    {
        float f = ad1.a - ad2.a;
        float f1 = ad1.b - ad2.b;
        return (float)Math.sqrt(f * f + f1 * f1);
    }

    public static void a(ad aad[])
    {
        float f = a(aad[0], aad[1]);
        float f1 = a(aad[1], aad[2]);
        float f2 = a(aad[0], aad[2]);
        float f3;
        float f4;
        ad ad1;
        ad ad2;
        ad ad3;
        if (f1 >= f && f1 >= f2)
        {
            ad3 = aad[0];
            ad2 = aad[1];
            ad1 = aad[2];
        } else
        if (f2 >= f1 && f2 >= f)
        {
            ad3 = aad[1];
            ad2 = aad[0];
            ad1 = aad[2];
        } else
        {
            ad3 = aad[2];
            ad2 = aad[0];
            ad1 = aad[1];
        }
        f = ad3.a;
        f1 = ad3.b;
        f2 = ad1.a;
        f3 = ad2.b;
        f4 = ad1.b;
        if ((f2 - f) * (f3 - f1) - (ad2.a - f) * (f4 - f1) >= 0.0F)
        {
            ad ad4 = ad1;
            ad1 = ad2;
            ad2 = ad4;
        }
        aad[0] = ad1;
        aad[1] = ad3;
        aad[2] = ad2;
    }

    public final float a()
    {
        return a;
    }

    public final float b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof ad)
        {
            obj = (ad)obj;
            flag = flag1;
            if (a == ((ad) (obj)).a)
            {
                flag = flag1;
                if (b == ((ad) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Float.floatToIntBits(a) * 31 + Float.floatToIntBits(b);
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(25);
        stringbuffer.append('(');
        stringbuffer.append(a);
        stringbuffer.append(',');
        stringbuffer.append(b);
        stringbuffer.append(')');
        return stringbuffer.toString();
    }
}
