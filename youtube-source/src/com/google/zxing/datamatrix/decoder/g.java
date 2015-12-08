// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;


// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            f

final class g
{

    private final int a;
    private final f b[];

    private g(int i, f f1)
    {
        a = i;
        b = (new f[] {
            f1
        });
    }

    g(int i, f f1, byte byte0)
    {
        this(i, f1);
    }

    private g(int i, f f1, f f2)
    {
        a = i;
        b = (new f[] {
            f1, f2
        });
    }

    g(int i, f f1, f f2, byte byte0)
    {
        this(62, f1, f2);
    }

    final int a()
    {
        return a;
    }

    final f[] b()
    {
        return b;
    }
}
