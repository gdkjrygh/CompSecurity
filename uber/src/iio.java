// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iio extends ici
{

    private static final iio a = new iio();

    iio()
    {
    }

    static int a(int i, int j)
    {
        return b(i, j);
    }

    private static int b(int i, int j)
    {
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }

    static iio c()
    {
        return a;
    }

    public final icj a()
    {
        return new iip((byte)0);
    }

}
