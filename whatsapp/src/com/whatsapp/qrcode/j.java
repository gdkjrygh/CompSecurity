// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;


// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeActivity

class j
    implements Runnable
{

    final QrCodeActivity a;

    j(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void run()
    {
        a.setSupportProgressBarIndeterminateVisibility(true);
    }
}
