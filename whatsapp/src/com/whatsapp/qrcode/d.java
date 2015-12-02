// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.hardware.Camera;

// Referenced classes of package com.whatsapp.qrcode:
//            g, QrCodeView

class d
    implements android.hardware.Camera.AutoFocusCallback
{

    final QrCodeView a;

    d(QrCodeView qrcodeview)
    {
        a = qrcodeview;
        super();
    }

    public void onAutoFocus(boolean flag, Camera camera)
    {
        a.postDelayed(new g(this), 2000L);
    }
}
