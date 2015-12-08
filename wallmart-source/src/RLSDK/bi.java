// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            v

public final class bi
{
    static final class a
    {

        private final int a;
        private final int b;

        final int a()
        {
            return a;
        }

        final int b()
        {
            return b;
        }

        private a(int i, int j)
        {
            a = i;
            b = j;
        }

        a(int i, int j, byte byte0)
        {
            this(i, j);
        }
    }

    static final class b
    {

        private final int a;
        private final a b[];

        final int a()
        {
            return a;
        }

        final a[] b()
        {
            return b;
        }

        private b(int i, a a1)
        {
            a = i;
            b = (new a[] {
                a1
            });
        }

        b(int i, a a1, byte byte0)
        {
            this(i, a1);
        }

        private b(int i, a a1, a a2)
        {
            a = 62;
            b = (new a[] {
                a1, a2
            });
        }

        b(a a1, a a2)
        {
            this(62, a1, a2);
        }
    }


    private static final bi a[] = {
        new bi(1, 10, 10, 8, 8, new b(5, new a(1, 3, (byte)0), (byte)0)), new bi(2, 12, 12, 10, 10, new b(7, new a(1, 5, (byte)0), (byte)0)), new bi(3, 14, 14, 12, 12, new b(10, new a(1, 8, (byte)0), (byte)0)), new bi(4, 16, 16, 14, 14, new b(12, new a(1, 12, (byte)0), (byte)0)), new bi(5, 18, 18, 16, 16, new b(14, new a(1, 18, (byte)0), (byte)0)), new bi(6, 20, 20, 18, 18, new b(18, new a(1, 22, (byte)0), (byte)0)), new bi(7, 22, 22, 20, 20, new b(20, new a(1, 30, (byte)0), (byte)0)), new bi(8, 24, 24, 22, 22, new b(24, new a(1, 36, (byte)0), (byte)0)), new bi(9, 26, 26, 24, 24, new b(28, new a(1, 44, (byte)0), (byte)0)), new bi(10, 32, 32, 14, 14, new b(36, new a(1, 62, (byte)0), (byte)0)), 
        new bi(11, 36, 36, 16, 16, new b(42, new a(1, 86, (byte)0), (byte)0)), new bi(12, 40, 40, 18, 18, new b(48, new a(1, 114, (byte)0), (byte)0)), new bi(13, 44, 44, 20, 20, new b(56, new a(1, 144, (byte)0), (byte)0)), new bi(14, 48, 48, 22, 22, new b(68, new a(1, 174, (byte)0), (byte)0)), new bi(15, 52, 52, 24, 24, new b(42, new a(2, 102, (byte)0), (byte)0)), new bi(16, 64, 64, 14, 14, new b(56, new a(2, 140, (byte)0), (byte)0)), new bi(17, 72, 72, 16, 16, new b(36, new a(4, 92, (byte)0), (byte)0)), new bi(18, 80, 80, 18, 18, new b(48, new a(4, 114, (byte)0), (byte)0)), new bi(19, 88, 88, 20, 20, new b(56, new a(4, 144, (byte)0), (byte)0)), new bi(20, 96, 96, 22, 22, new b(68, new a(4, 174, (byte)0), (byte)0)), 
        new bi(21, 104, 104, 24, 24, new b(56, new a(6, 136, (byte)0), (byte)0)), new bi(22, 120, 120, 18, 18, new b(68, new a(6, 175, (byte)0), (byte)0)), new bi(23, 132, 132, 20, 20, new b(62, new a(8, 163, (byte)0), (byte)0)), new bi(24, 144, 144, 22, 22, new b(new a(8, 156, (byte)0), new a(2, 155, (byte)0))), new bi(25, 8, 18, 6, 16, new b(7, new a(1, 5, (byte)0), (byte)0)), new bi(26, 8, 32, 6, 14, new b(11, new a(1, 10, (byte)0), (byte)0)), new bi(27, 12, 26, 10, 24, new b(14, new a(1, 16, (byte)0), (byte)0)), new bi(28, 12, 36, 10, 16, new b(18, new a(1, 22, (byte)0), (byte)0)), new bi(29, 16, 36, 14, 16, new b(24, new a(1, 32, (byte)0), (byte)0)), new bi(30, 16, 48, 14, 22, new b(28, new a(1, 49, (byte)0), (byte)0))
    };
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final b g;
    private final int h;

    private bi(int i, int j, int k, int l, int i1, b b1)
    {
        boolean flag = false;
        super();
        b = i;
        c = j;
        d = k;
        e = l;
        f = i1;
        g = b1;
        k = b1.a();
        b1 = b1.b();
        j = 0;
        for (i = ((flag) ? 1 : 0); i < b1.length; i++)
        {
            a a1 = b1[i];
            l = a1.a();
            j += (a1.b() + k) * l;
        }

        h = j;
    }

    public static bi a(int i, int j)
        throws v
    {
        if ((i & 1) != 0 || (j & 1) != 0)
        {
            throw v.a();
        }
        int l = a.length;
        for (int k = 0; k < l; k++)
        {
            bi bi1 = a[k];
            if (bi1.c == i && bi1.d == j)
            {
                return bi1;
            }
        }

        throw v.a();
    }

    public final int a()
    {
        return b;
    }

    public final int b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final int d()
    {
        return e;
    }

    public final int e()
    {
        return f;
    }

    public final int f()
    {
        return h;
    }

    final b g()
    {
        return g;
    }

    public final String toString()
    {
        return String.valueOf(b);
    }

}
