// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.qrcode;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.whatsapp.qrcode:
//            QrCodeOverlay, e

class n extends Animation
{

    final QrCodeOverlay a;

    private n(QrCodeOverlay qrcodeoverlay)
    {
        a = qrcodeoverlay;
        super();
    }

    n(QrCodeOverlay qrcodeoverlay, e e)
    {
        this(qrcodeoverlay);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        int k = a.getWidth();
        int j = a.getHeight();
        int i = (Math.min(k, j) * 3) / 4;
        k = (k - i) / 2;
        j = (j - i) / 2;
        a.invalidate(k, j, k + i, i + j);
    }
}
