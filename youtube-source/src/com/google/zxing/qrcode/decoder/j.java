// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;


// Referenced classes of package com.google.zxing.qrcode.decoder:
//            c

final class j extends c
{

    private j()
    {
        super((byte)0);
    }

    j(byte byte0)
    {
        this();
    }

    final boolean a(int i, int k)
    {
        i *= k;
        return (i % 3 + (i & 1) & 1) == 0;
    }
}
