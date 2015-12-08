// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            j, r

abstract class h extends j
{

    h(a a1)
    {
        super(a1);
    }

    protected final void a(StringBuilder stringbuilder, int i, int k)
    {
        for (int l = 0; l < 4; l++)
        {
            int j1 = c().a(l * 10 + i, 10);
            if (j1 / 100 == 0)
            {
                stringbuilder.append('0');
            }
            if (j1 / 10 == 0)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(j1);
        }

        i = 0;
        int i1 = 0;
        for (; i < 13; i++)
        {
            int l1 = stringbuilder.charAt(i + k) - 48;
            int k1 = l1;
            if ((i & 1) == 0)
            {
                k1 = l1 * 3;
            }
            i1 += k1;
        }

        k = 10 - i1 % 10;
        i = k;
        if (k == 10)
        {
            i = 0;
        }
        stringbuilder.append(i);
    }

    protected final void b(StringBuilder stringbuilder, int i)
    {
        stringbuilder.append("(01)");
        int k = stringbuilder.length();
        stringbuilder.append('9');
        a(stringbuilder, i, k);
    }
}
