// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hzs
{

    final byte a[];
    int b;
    int c;
    boolean d;
    boolean e;
    hzs f;
    hzs g;

    hzs()
    {
        a = new byte[2048];
        e = true;
        d = false;
    }

    hzs(hzs hzs1)
    {
        this(hzs1.a, hzs1.b, hzs1.c);
        hzs1.d = true;
    }

    hzs(byte abyte0[], int i, int j)
    {
        a = abyte0;
        b = i;
        c = j;
        e = false;
        d = true;
    }

    public final hzs a()
    {
        hzs hzs1;
        if (f != this)
        {
            hzs1 = f;
        } else
        {
            hzs1 = null;
        }
        g.f = f;
        f.g = g;
        f = null;
        g = null;
        return hzs1;
    }

    public final hzs a(int i)
    {
        if (i <= 0 || i > c - b)
        {
            throw new IllegalArgumentException();
        } else
        {
            hzs hzs1 = new hzs(this);
            hzs1.c = hzs1.b + i;
            b = b + i;
            g.a(hzs1);
            return hzs1;
        }
    }

    public final hzs a(hzs hzs1)
    {
        hzs1.g = this;
        hzs1.f = f;
        f.g = hzs1;
        f = hzs1;
        return hzs1;
    }

    public final void a(hzs hzs1, int i)
    {
        if (!hzs1.e)
        {
            throw new IllegalArgumentException();
        }
        if (hzs1.c + i > 2048)
        {
            if (hzs1.d)
            {
                throw new IllegalArgumentException();
            }
            if ((hzs1.c + i) - hzs1.b > 2048)
            {
                throw new IllegalArgumentException();
            }
            System.arraycopy(hzs1.a, hzs1.b, hzs1.a, 0, hzs1.c - hzs1.b);
            hzs1.c = hzs1.c - hzs1.b;
            hzs1.b = 0;
        }
        System.arraycopy(a, b, hzs1.a, hzs1.c, i);
        hzs1.c = hzs1.c + i;
        b = b + i;
    }

    public final void b()
    {
        if (g == this)
        {
            throw new IllegalStateException();
        }
        if (g.e)
        {
            int j = c - b;
            int k = g.c;
            int i;
            if (g.d)
            {
                i = 0;
            } else
            {
                i = g.b;
            }
            if (j <= i + (2048 - k))
            {
                a(g, j);
                a();
                hzt.a(this);
                return;
            }
        }
    }
}
