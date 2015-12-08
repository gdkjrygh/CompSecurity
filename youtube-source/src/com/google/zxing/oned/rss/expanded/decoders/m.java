// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            p

final class m extends p
{

    private final char a;

    m(int i, char c)
    {
        super(i);
        a = c;
    }

    final char a()
    {
        return a;
    }

    final boolean b()
    {
        return a == '$';
    }
}
