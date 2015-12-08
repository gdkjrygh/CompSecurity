// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            h, r, n

final class d extends h
{

    d(a a1)
    {
        super(a1);
    }

    public final String a()
    {
        if (b().a() < 48)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder stringbuilder = new StringBuilder();
        b(stringbuilder, 8);
        int i = c().a(48, 2);
        stringbuilder.append("(393");
        stringbuilder.append(i);
        stringbuilder.append(')');
        i = c().a(50, 10);
        if (i / 100 == 0)
        {
            stringbuilder.append('0');
        }
        if (i / 10 == 0)
        {
            stringbuilder.append('0');
        }
        stringbuilder.append(i);
        stringbuilder.append(c().a(60, null).a());
        return stringbuilder.toString();
    }
}
