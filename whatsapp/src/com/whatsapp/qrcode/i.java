// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;


// Referenced classes of package com.whatsapp.qrcode:
//            m, QrCodeActivity

class i
    implements Runnable
{

    final m a;
    final byte b[];

    i(m m1, byte abyte0[])
    {
        a = m1;
        b = abyte0;
        super();
    }

    public void run()
    {
        QrCodeActivity.a(a.a, b);
    }
}
