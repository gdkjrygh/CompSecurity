// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.hardware.Camera;

// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeActivity, QrCodeView

class l
    implements Runnable
{

    final QrCodeActivity a;

    l(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void run()
    {
        Camera camera = QrCodeActivity.e(a).c();
        if (camera != null)
        {
            camera.setOneShotPreviewCallback(QrCodeActivity.c(a));
        }
    }
}
