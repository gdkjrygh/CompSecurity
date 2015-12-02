// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.hardware.Camera;

// Referenced classes of package com.whatsapp.qrcode:
//            d, QrCodeView

class g
    implements Runnable
{

    final d a;

    g(d d1)
    {
        a = d1;
        super();
    }

    public void run()
    {
        if (QrCodeView.a(a.a) != null)
        {
            QrCodeView.a(a.a).autoFocus(a.a.b);
        }
    }
}
