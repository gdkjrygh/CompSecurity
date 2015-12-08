// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.b;
import com.google.zxing.common.a;
import com.google.zxing.f;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            p, e

public final class l extends p
{

    private final p a = new e();

    public l()
    {
    }

    private static f a(f f1)
    {
        String s = f1.a();
        if (s.charAt(0) == '0')
        {
            return new f(s.substring(1), null, f1.c(), BarcodeFormat.UPC_A);
        } else
        {
            throw FormatException.getFormatInstance();
        }
    }

    protected final int a(a a1, int ai[], StringBuilder stringbuilder)
    {
        return a.a(a1, ai, stringbuilder);
    }

    public final f a(int i, a a1, Map map)
    {
        return a(a.a(i, a1, map));
    }

    public final f a(int i, a a1, int ai[], Map map)
    {
        return a(a.a(i, a1, ai, map));
    }

    public final f a(b b1, Map map)
    {
        return a(a.a(b1, map));
    }

    final BarcodeFormat b()
    {
        return BarcodeFormat.UPC_A;
    }
}
