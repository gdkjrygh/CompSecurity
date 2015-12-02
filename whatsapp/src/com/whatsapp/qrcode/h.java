// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.content.res.Resources;
import android.hardware.Camera;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeActivity, QrCodeView

class h
    implements android.view.View.OnClickListener
{

    final QrCodeActivity a;

    h(QrCodeActivity qrcodeactivity)
    {
        a = qrcodeactivity;
        super();
    }

    public void onClick(View view)
    {
        a.findViewById(0x7f0b027f).setVisibility(8);
        a.findViewById(0x7f0b027d).setVisibility(8);
        view = new AlphaAnimation(1.0F, 0.0F);
        view.setDuration(a.getResources().getInteger(0x10e0001));
        a.findViewById(0x7f0b027f).startAnimation(view);
        a.findViewById(0x7f0b027d).startAnimation(view);
        a.findViewById(0x7f0b027e).setVisibility(0);
        QrCodeActivity.a(a, false);
        if (QrCodeActivity.d(a))
        {
            QrCodeActivity.e(a).c().setOneShotPreviewCallback(QrCodeActivity.c(a));
        }
    }
}
