// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;


// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeActivity

class f
    implements Runnable
{

    final QrCodeActivity a;

    f(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void run()
    {
        a.a(0x7f0e0446);
        a.setSupportProgressBarIndeterminateVisibility(false);
        QrCodeActivity.a(a, null);
        QrCodeActivity.b(a);
    }
}
