// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

// Referenced classes of package com.google.zxing:
//            ResultMetadataType, g, BarcodeFormat

public final class f
{

    private final String a;
    private final byte b[];
    private g c[];
    private final BarcodeFormat d;
    private Map e;
    private final long f;

    public f(String s, byte abyte0[], g ag[], BarcodeFormat barcodeformat)
    {
        this(s, abyte0, ag, barcodeformat, System.currentTimeMillis());
    }

    private f(String s, byte abyte0[], g ag[], BarcodeFormat barcodeformat, long l)
    {
        a = s;
        b = abyte0;
        c = ag;
        d = barcodeformat;
        e = null;
        f = l;
    }

    public final String a()
    {
        return a;
    }

    public final void a(ResultMetadataType resultmetadatatype, Object obj)
    {
        if (e == null)
        {
            e = new EnumMap(com/google/zxing/ResultMetadataType);
        }
        e.put(resultmetadatatype, obj);
    }

    public final void a(Map map)
    {
label0:
        {
            if (map != null)
            {
                if (e != null)
                {
                    break label0;
                }
                e = map;
            }
            return;
        }
        e.putAll(map);
    }

    public final void a(g ag[])
    {
        g ag1[] = c;
        if (ag1 == null)
        {
            c = ag;
        } else
        if (ag != null && ag.length > 0)
        {
            g ag2[] = new g[ag1.length + ag.length];
            System.arraycopy(ag1, 0, ag2, 0, ag1.length);
            System.arraycopy(ag, 0, ag2, ag1.length, ag.length);
            c = ag2;
            return;
        }
    }

    public final byte[] b()
    {
        return b;
    }

    public final g[] c()
    {
        return c;
    }

    public final BarcodeFormat d()
    {
        return d;
    }

    public final Map e()
    {
        return e;
    }

    public final String toString()
    {
        return a;
    }
}
