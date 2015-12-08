// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.b;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            d, e, f, g, 
//            h, i, j, k

abstract class c
{

    private static final c a[] = {
        new d((byte)0), new e((byte)0), new f((byte)0), new g((byte)0), new h((byte)0), new i((byte)0), new j((byte)0), new k((byte)0)
    };

    private c()
    {
    }

    c(byte byte0)
    {
        this();
    }

    static c a(int l)
    {
        if (l < 0 || l > 7)
        {
            throw new IllegalArgumentException();
        } else
        {
            return a[l];
        }
    }

    final void a(b b1, int l)
    {
        for (int i1 = 0; i1 < l; i1++)
        {
            for (int j1 = 0; j1 < l; j1++)
            {
                if (a(i1, j1))
                {
                    b1.c(j1, i1);
                }
            }

        }

    }

    abstract boolean a(int l, int i1);

}
