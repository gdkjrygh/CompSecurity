// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            i, r

final class e extends i
{

    private final String a;
    private final String b;

    e(a a1, String s, String s1)
    {
        super(a1);
        a = s1;
        b = s;
    }

    protected final int a(int j)
    {
        return j % 0x186a0;
    }

    public final String a()
    {
        if (b().a() != 84)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringbuilder = new StringBuilder();
        b(stringbuilder, 8);
        b(stringbuilder, 48, 20);
        int k = c().a(68, 16);
        if (k != 38400)
        {
            stringbuilder.append('(');
            stringbuilder.append(a);
            stringbuilder.append(')');
            int j = k % 32;
            int l = k / 32;
            k = l % 12 + 1;
            l /= 12;
            if (l / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(l);
            if (k / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(k);
            if (j / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(j);
        }
        return stringbuilder.toString();
    }

    protected final void a(StringBuilder stringbuilder, int j)
    {
        j /= 0x186a0;
        stringbuilder.append('(');
        stringbuilder.append(b);
        stringbuilder.append(j);
        stringbuilder.append(')');
    }
}
