// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;
import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            i

abstract class f extends i
{

    f(a a1)
    {
        super(a1);
    }

    public final String a()
    {
        if (b().a() != 60)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            b(stringbuilder, 5);
            b(stringbuilder, 45, 15);
            return stringbuilder.toString();
        }
    }
}
