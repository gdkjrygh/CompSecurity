// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class iiq
    implements Comparable
{

    final idd a;
    final Long b;
    final int c;

    private iiq(idd idd, Long long1, int i)
    {
        a = idd;
        b = long1;
        c = i;
    }

    iiq(idd idd, Long long1, int i, byte byte0)
    {
        this(idd, long1, i);
    }

    private int a(iiq iiq1)
    {
        int j = b.compareTo(iiq1.b);
        int i = j;
        if (j == 0)
        {
            i = iio.a(c, iiq1.c);
        }
        return i;
    }

    public final int compareTo(Object obj)
    {
        return a((iiq)obj);
    }
}
