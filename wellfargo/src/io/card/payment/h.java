// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;


// Referenced classes of package io.card.payment:
//            CreditCard

class h
{

    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public int f[];
    public CreditCard g;

    public h()
    {
        f = new int[16];
        f[0] = -1;
        f[15] = -1;
        g = new CreditCard();
    }

    final boolean a()
    {
        return a && b && d && c;
    }

    final boolean a(h h1)
    {
        return h1.a == a && h1.b == b && h1.c == c && h1.d == d;
    }

    final boolean b()
    {
        boolean flag = false;
        if (f[0] >= 0)
        {
            flag = true;
        }
        return flag;
    }

    final CreditCard c()
    {
        String s = new String();
        for (int i = 0; i < 16 && f[i] >= 0 && f[i] < 10; i++)
        {
            s = (new StringBuilder()).append(s).append(String.valueOf(f[i])).toString();
        }

        g.a = s;
        return g;
    }

    final int d()
    {
        int l = 1;
        int i;
        int j;
        int k;
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (b)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (c)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (!d)
        {
            l = 0;
        }
        return k + (j + i) + l;
    }
}
