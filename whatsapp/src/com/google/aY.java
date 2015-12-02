// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            ah, k, bQ, gV

final class aY extends ah
{

    private final String d;
    private final String e;

    aY(bQ bq, String s, String s1)
    {
        super(bq);
        e = s1;
        d = s;
    }

    private void d(StringBuilder stringbuilder, int i)
    {
        int j = a().a(i, 16);
        if (j == 38400)
        {
            return;
        }
        stringbuilder.append('(');
        stringbuilder.append(e);
        stringbuilder.append(')');
        i = j % 32;
        int l = j / 32;
        j = l % 12 + 1;
        l /= 12;
        if (l / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(l);
        if (j / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(j);
        if (i / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(i);
    }

    protected int a(int i)
    {
        return i % 0x186a0;
    }

    public String c()
    {
        if (b().b() != 84)
        {
            throw gV.a();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            b(stringbuilder, 8);
            b(stringbuilder, 48, 20);
            d(stringbuilder, 68);
            return stringbuilder.toString();
        }
    }

    protected void c(StringBuilder stringbuilder, int i)
    {
        i /= 0x186a0;
        stringbuilder.append('(');
        stringbuilder.append(d);
        stringbuilder.append(i);
        stringbuilder.append(')');
    }
}
