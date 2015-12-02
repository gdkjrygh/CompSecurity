// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.hardware.Camera;
import android.os.Handler;

// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeActivity, i

class m
    implements android.hardware.Camera.PreviewCallback
{

    final QrCodeActivity a;

    m(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        QrCodeActivity.g(a).post(new i(this, abyte0));
    }
}
