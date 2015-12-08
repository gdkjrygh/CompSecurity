// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.ReaderException;
import com.google.zxing.common.a;
import com.google.zxing.f;

// Referenced classes of package com.google.zxing.oned:
//            m, n, p

final class o
{

    private static final int a[] = {
        1, 1, 2
    };
    private final m b = new m();
    private final n c = new n();

    o()
    {
    }

    final f a(int i, a a1, int j)
    {
        int ai[] = com.google.zxing.oned.p.a(a1, j, false, a);
        f f;
        try
        {
            f = c.a(i, a1, ai);
        }
        catch (ReaderException readerexception)
        {
            return b.a(i, a1, ai);
        }
        return f;
    }

}
