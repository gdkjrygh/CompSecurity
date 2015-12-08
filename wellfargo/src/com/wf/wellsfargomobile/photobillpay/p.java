// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.photobillpay;

import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.kofax.kmc.kui.uicontrols.captureanimations.CaptureMessage;

// Referenced classes of package com.wf.wellsfargomobile.photobillpay:
//            PhotoBillPayScanActivity

class p
    implements Runnable
{

    final CaptureMessage a;
    final PhotoBillPayScanActivity b;

    p(PhotoBillPayScanActivity photobillpayscanactivity, CaptureMessage capturemessage)
    {
        b = photobillpayscanactivity;
        a = capturemessage;
        super();
    }

    public void run()
    {
        a.setTextPosX(PhotoBillPayScanActivity.b(b).getMeasuredWidth() / 2 - a.getWidth() / 2);
        a.setTextPosY(PhotoBillPayScanActivity.b(b).getMeasuredHeight() / 2 + 100);
    }
}
