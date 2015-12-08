// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            h, r

final class g extends h
{

    g(a a1)
    {
        super(a1);
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("(01)");
        int i = stringbuilder.length();
        stringbuilder.append(c().a(4, 4));
        a(stringbuilder, 8, i);
        return c().a(stringbuilder, 48);
    }
}
