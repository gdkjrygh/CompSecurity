// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            h, r

abstract class i extends h
{

    i(a a1)
    {
        super(a1);
    }

    protected abstract int a(int j);

    protected abstract void a(StringBuilder stringbuilder, int j);

    protected final void b(StringBuilder stringbuilder, int j, int k)
    {
        j = c().a(j, k);
        a(stringbuilder, j);
        int l = a(j);
        k = 0x186a0;
        for (j = 0; j < 5; j++)
        {
            if (l / k == 0)
            {
                stringbuilder.append('0');
            }
            k /= 10;
        }

        stringbuilder.append(l);
    }
}
